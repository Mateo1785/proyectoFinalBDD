drop view if exists v_especialidad_doctor;
create view v_especialidad_doctor(id_doctor, nombre_completo, id_especialidad)
as
select doc.id_doctor, doc.apellido || ' ' || doc.nombre, doc.id_especialidad
from doctor as doc, especialidad as esp
where doc.id_especialidad = esp.id_especialidad
order by doc.apellido, doc.nombre;