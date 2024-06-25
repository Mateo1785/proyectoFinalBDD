drop trigger if exists tgi_auditoria_paciente on paciente;
create trigger tgi_auditoria_paciente
after insert on paciente
for each row
execute function f_auditoria_paciente();
