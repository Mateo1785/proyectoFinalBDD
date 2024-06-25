drop procedure if exists sp_medicamento;

create or replace procedure sp_medicamento(
	i_operacion     char(1),
	i_nombre        varchar(100) default '',
	i_descripcion   varchar(300) default '',
	i_idmedicamento int default 0
)
language plpgsql
as $$

begin

	-- Insertar medicamento
	if i_operacion = 'I' then
	   insert into medicamento(nombre, descripcion)
	   values(i_nombre, i_descripcion);
	end if;

    -- Actualizar medicamento
	if i_operacion = 'U' then
	   update medicamento
	   set nombre = i_nombre,
		   descripcion = i_descripcion
       where id_medicamento = i_idmedicamento;
	end if;

    -- Eliminar medicamento
	if i_operacion = 'D' then
	   delete from medicamento
       where id_medicamento = i_idmedicamento;
	end if;
end;
$$;
