drop function if exists f_receta;

create or replace function f_receta(
	i_operacion     char(1),
	i_idcita        int default 0,
	i_diagnostico   varchar(200) default '',
	i_idreceta      int default 0,
	i_idmedicamento int default 0,
	i_dosis         varchar(50) default '',
	i_dias          varchar(50) default '',
	i_indicaciones  varchar(300) default ''
) returns integer
language plpgsql
as $$

declare w_secuencial integer;

begin

	w_secuencial := 0;

	-- Insertar receta
	if i_operacion = 'I' then
	   insert into receta_cabecera (id_cita, diagnostico)
	   values(i_idcita, i_diagnostico);

       update cita_medica
	   set estado = 'FINALIZADA'
	   where id_cita = i_idcita;

       select id_receta_cab into w_secuencial
	   from receta_cabecera
	   where id_cita = i_idcita;
	end if;

	if i_operacion = 'D' then
	   insert into receta_detalle (id_receta_cab, id_medicamento, dosis, dias, indicaciones)
	   values(i_idreceta, i_idmedicamento, i_dosis, i_dias, i_indicaciones);
	end if;

    return w_secuencial;
end;
$$;
