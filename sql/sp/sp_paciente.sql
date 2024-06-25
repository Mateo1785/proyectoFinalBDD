drop procedure if exists sp_paciente;

create or replace procedure sp_paciente(
	i_operacion     char(1),
	i_cedula        varchar(10) default '',
	i_nombre        varchar(50) default '',
	i_apellido      varchar(50) default '',
	i_fecha_nac     date default current_timestamp,
	i_sexo          char(1) default '',
	i_direccion     varchar(200) default '',
	i_telefono      varchar(15) default '',
	i_email         varchar(200) default '',
	i_idpaciente    int default 0
)
language plpgsql
as $$

begin

	-- Insertar paciente
	if i_operacion = 'I' then
	   insert into paciente(cedula, nombre, apellido, fecha_nacimiento, sexo,
	                        direccion, telefono, email)
	   values(i_cedula, i_nombre, i_apellido, i_fecha_nac, i_sexo,
	          i_direccion, i_telefono, i_email);
	end if;

    -- Actualizar paciente
	if i_operacion = 'U' then
	   update paciente
	   set cedula = i_cedula,
		   nombre = i_nombre,
		   apellido = i_apellido,
		   fecha_nacimiento = i_fecha_nac,
		   sexo = i_sexo,
		   direccion = i_direccion,
		   telefono = i_telefono,
		   email = i_email
       where id_paciente = i_idpaciente;
	end if;

    -- Eliminar paciente
	if i_operacion = 'D' then
	   delete from paciente
       where id_paciente = i_idpaciente;
	end if;
end;
$$;
