drop view if exists v_citas_doctor;
create view v_citas_doctor(id_doctor, nombre_completo)
as
select doc.id_doctor, doc.apellido || ' ' || doc.nombre
from doctor as doc, cita_medica as cm
where doc.id_doctor = cm.id_doctor
and cm.estado = 'INGRESADA'
group by doc.id_doctor, doc.apellido, doc.nombre
order by doc.apellido, doc.nombre;