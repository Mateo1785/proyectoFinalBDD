drop procedure if exists sp_generar_horarios;

create or replace procedure sp_generar_horarios(
	i_fecha_inicio date default '01/01/2024',
	i_dias         int default 0
)
language plpgsql
as $$
declare
	w_i int := 1;
	w_fecha date := i_fecha_inicio;
    w_hora time := '08:00:00';
	w_hora_inicio time := '08:00:00';
    w_hora_fin time := '20:00:00';

begin
    while w_i <= i_dias loop
	    w_hora := w_hora_inicio;
		while w_hora <= w_hora_fin loop
			insert into horario (fecha, hora)
	    	values (w_fecha, w_hora);
			w_hora := w_hora + INTERVAL '30 minutes';
		end loop;
        w_i := w_i + 1;
		w_fecha = w_fecha + interval '1 day';
    end loop;
	-- Se registran los horarios de trabajo de los especialistas
	insert into horario_doctor (id_horario,id_doctor)
	select id_horario, id_doctor
	from doctor, horario;
end;
$$;
