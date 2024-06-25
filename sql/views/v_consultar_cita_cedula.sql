drop view if exists v_consultar_cita_cedula;
create view v_consultar_cita_cedula(cita, estado_cita, paciente, cedula,
                                    fecha_generacion, motivo, doctor,
									fecha_cita, hora_cita)
as
select cm.id_cita, cm.estado, pa.nombre || ' ' || pa.apellido, pa.cedula,
       cm.fecha_generacion, cm.motivo, doc.nombre || ' ' || doc.apellido,
	   ho.fecha, ho.hora
from cita_medica as cm, paciente as pa, doctor as doc,
     horario_doctor as hd, horario as ho
where cm.id_paciente = pa.id_paciente
and cm.id_doctor = doc.id_doctor
and cm.id_horario = hd.id_codigo
and hd.id_horario = ho.id_horario
order by pa.cedula;
