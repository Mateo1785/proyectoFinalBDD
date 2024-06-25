drop view if exists v_doctor;
create view v_doctor(id_doctor, cedula, nombre, apellido, telefono, email, nombre_esp, id_especialidad)
as
select doc.id_doctor, doc.cedula, doc.nombre, doc.apellido, doc.telefono, doc.email, cast(esp.id_especialidad as varchar) || '-' || esp.nombre, doc.id_especialidad
from doctor as doc, especialidad as esp
where doc.id_especialidad = esp.id_especialidad
order by doc.id_doctor;