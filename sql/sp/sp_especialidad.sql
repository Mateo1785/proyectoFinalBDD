drop procedure if exists sp_especialidad;

create or replace procedure sp_especialidad(
	i_operacion     char(1),
	i_nombre        varchar(100) default '',
	i_descripcion   varchar(300) default '',
	i_idespecialidad    int default 0
)
language plpgsql
as $$

begin

	-- Insertar especialidad
	if i_operacion = 'I' then
	   insert into especialidad(nombre, descripcion)
	   values(i_nombre, i_descripcion);
	end if;

    -- Actualizar especialidad
	if i_operacion = 'U' then
	   update especialidad
	   set nombre = i_nombre,
		   descripcion = i_descripcion
       where id_especialidad = i_idespecialidad;
	end if;

    -- Eliminar especialidad
	if i_operacion = 'D' then
	   delete from especialidad
       where id_especialidad = i_idespecialidad;
	end if;
end;
$$;
