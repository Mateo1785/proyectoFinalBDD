drop trigger if exists tgd_auditoria_paciente on paciente;
create trigger tgd_auditoria_paciente
after delete on paciente
for each row
execute function f_auditoria_paciente();
