drop view if exists v_paciente_citas;
create view v_paciente_citas(id_cita, doctor, especialidad,
	                         fecha, motivo, estado, cedula, id_horario)
as
select ci.id_cita, doc.apellido || ' ' || doc.nombre, es.nombre,
	   to_char(ho.fecha, 'FMDay, DD "de" FMMonth "de" YYYY') || ' ' || ho.hora,
	   ci.motivo, ci.estado, pa.cedula, hd.id_codigo
from cita_medica as ci, doctor as doc, especialidad as es,
     horario_doctor as hd, horario as ho,
	 paciente as pa
where ci.id_doctor = doc.id_doctor
and doc.id_especialidad = es.id_especialidad
and ci.id_horario = hd.id_codigo
and hd.id_horario = ho.id_horario
and hd.id_doctor = doc.id_doctor
and ci.id_paciente = pa.id_paciente
order by id_cita;
