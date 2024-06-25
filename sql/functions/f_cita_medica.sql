drop function if exists f_cita_medica;

create or replace function f_cita_medica(
	i_operacion     char(1),
	i_idcita        int default 0,
	i_idpaciente    int default 0,
    i_iddoctor      int default 0,
    i_idhorario     int default 0,
    i_motivo        varchar(150) default '',
	i_fecha_gen     date default current_timestamp,
	i_estado        varchar(15) default ''
) returns integer
language plpgsql
as $$

declare w_secuencial integer;

begin

	w_secuencial := 0;

	-- Insertar cita medica
	if i_operacion = 'I' then
	   insert into cita_medica (id_paciente,id_doctor,id_horario,motivo,estado)
	   values(i_idpaciente, i_iddoctor, i_idhorario, i_motivo, 'INGRESADA');

       update horario_doctor
       set estado = 'OCUPADO'
	   where id_codigo = i_idhorario;

       select id_cita into w_secuencial
	   from cita_medica
	   where id_paciente = i_idpaciente
	   and id_doctor = i_iddoctor
	   and id_horario = i_idhorario
	   and estado = 'INGRESADA';
	end if;

    -- Actualizar estado de la cita medica
	if i_operacion = 'U' then
	   update cita_medica
	   set estado = i_estado
       where id_cita = i_idcita;

       update horario_doctor
       set estado = 'DISPONIBLE'
	   where id_codigo = i_idhorario;
	end if;

    return w_secuencial;
end;
$$;
