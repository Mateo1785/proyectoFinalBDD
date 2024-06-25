drop view if exists v_citas_ingresadas;
create view v_citas_ingresadas(id_cita, nombre_completo, fecha, hora, motivo, id_doctor)
as
select cm.id_cita, pa.nombre || ' ' || pa.apellido, fecha_generacion, ho.hora, cm.motivo, cm.id_doctor
from cita_medica as cm, paciente as pa, horario_doctor as hd, horario as ho
where cm.id_paciente = pa.id_paciente
and cm.id_horario = hd.id_codigo
and hd.id_horario = ho.id_horario
and cm.estado = 'INGRESADA'
order by cm.id_horario;
