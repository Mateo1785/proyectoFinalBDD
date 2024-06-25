drop procedure if exists sp_doctor;

create or replace procedure sp_doctor(
	i_operacion     char(1),
	i_cedula        varchar(10) default '',
	i_nombre        varchar(50) default '',
	i_apellido      varchar(50) default '',
	i_telefono      varchar(15) default '',
	i_email         varchar(200) default '',
	i_especialidad  int default 0,
	i_iddoctor      int default 0
)
language plpgsql
as $$

begin

	-- Insertar doctor
	if i_operacion = 'I' then
	   insert into doctor(cedula, nombre, apellido, telefono, email, id_especialidad)
	   values(i_cedula, i_nombre, i_apellido, i_telefono, i_email, i_especialidad);
	end if;

    -- Actualizar doctor
	if i_operacion = 'U' then
	   update doctor
	   set cedula = i_cedula,
		   nombre = i_nombre,
		   apellido = i_apellido,
		   telefono = i_telefono,
		   email = i_email,
		   id_especialidad = i_especialidad
       where id_doctor = i_iddoctor;
	end if;

    -- Eliminar doctor
	if i_operacion = 'D' then
	   delete from doctor
       where id_doctor = i_iddoctor;
	end if;
end;
$$;
