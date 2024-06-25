drop function if exists f_auditoria_paciente;

create or replace function f_auditoria_paciente()
returns trigger as $$
begin
	if TG_OP = 'INSERT' then
	   insert into auditoria_paciente(accion,cedula,nombre,apellido,fecha_nacimiento,
                                      sexo,direccion,telefono,email)
	   values(TG_OP,new.cedula,new.nombre,new.apellido,new.fecha_nacimiento,
              new.sexo,new.direccion,new.telefono,new.email);
	   return new;
    end if;

	if TG_OP = 'UPDATE' then
	   insert into auditoria_paciente(accion,cedula,nombre,apellido,fecha_nacimiento,
                                      sexo,direccion,telefono,email)
	   values(TG_OP,old.cedula,old.nombre,old.apellido,old.fecha_nacimiento,
              old.sexo,old.direccion,old.telefono,old.email);
	   return new;
    end if;

	if TG_OP = 'DELETE' then
	   insert into auditoria_paciente(accion,cedula,nombre,apellido,fecha_nacimiento,
                                      sexo,direccion,telefono,email)
	   values(TG_OP,old.cedula,old.nombre,old.apellido,old.fecha_nacimiento,
              old.sexo,old.direccion,old.telefono,old.email);
	   return new;
    end if;
end;
$$ language plpgsql;
