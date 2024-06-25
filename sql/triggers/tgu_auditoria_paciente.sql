drop trigger if exists tgu_auditoria_paciente on paciente;
create trigger tgu_auditoria_paciente
after update on paciente
for each row
execute function f_auditoria_paciente();
