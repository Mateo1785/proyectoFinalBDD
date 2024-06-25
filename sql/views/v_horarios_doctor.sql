drop view if exists v_horarios_doctor;
create view v_horarios_doctor(id_horario, descripcion, id_doctor, id_especialidad)
as
select hd.id_codigo,
	   to_char(ho.fecha, 'FMDay, DD "de" FMMonth "de" YYYY') || ' ' || ho.hora AS fecha_formateada,
       hd.id_doctor, doc.id_especialidad
from horario_doctor as hd, horario as ho, doctor as doc
where hd.id_horario = ho.id_horario
and hd.id_doctor = doc.id_doctor
and hd.estado = 'DISPONIBLE'
order by hd.id_codigo;
