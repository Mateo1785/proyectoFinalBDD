select cast(id_especialidad as varchar) || '-' || nombre from especialidad

select cast(id_especialidad as varchar) || '-' || nombre from especialidad

select * from doctor
select * from especialidad
select * from v_doctor;
select * from v_horarios_doctor
select * from v_especialidad_doctor

select id_horario, descripcion from v_horarios_doctor where id_doctor = 1 and id_especialidad = 1
	
select id_especialidad, count(*)
from v_especialidad_doctor
group by id_especialidad
	
drop view v_doctor;

-- SP Ejecucion Insertar Doctor
call sp_doctor('I','00000000L','Dario Luis','Martinez','098733312','dario.martinez@example.com',17,null);
call sp_doctor(i_operacion:='I',i_cedula:='99000000L',i_nombre:='Marina',i_apellido:='Martinez',i_telefono:='000033312',i_email:='marina.martinez@example.com',i_especialidad:= 17,i_iddoctor:= null);
call sp_doctor(
	i_operacion     := 'I',
	i_cedula        := '99000000L',
	i_nombre        := 'Marina',
	i_apellido      := 'Martinez',
	i_telefono      := '000033312',
	i_email         := 'marina.martinez@example.com',
	i_especialidad  := 17,
	i_iddoctor      := null
);

-- SP ejecucion Actualizar Doctor
call sp_doctor('U','998879999L','Pedro Luis','Martinez','098744412','pedro.martinez@example.com',19,21);

-- Funcion ejecucion insertar cita
select f_cita_medica(
	   i_operacion:='I',
	   i_idpaciente:=1,
	   i_iddoctor:=1,
       i_idhorario:=1,
       i_motivo:='Dolor Garganta',
       i_estado:='INGRESADA')


--------------------------------------------------------------------------------------------------------------
-- Generar horarios disponibles para citas
call sp_generar_horarios(i_fecha_inicio := '06/01/2024', i_dias := 7);

-- Citas
select * from horario where id_horario = 411
select * from cita_medica where estado = 'INGRESADA'
select * from doctor
select * from horario_doctor where estado != 'DISPONIBLE'
select * from horario_doctor where id_codigo = 119
select * from paciente
select * from especialidad
select * from medicamento
select * from receta_cabecera
select * from receta_detalle

select * from paciente
select id_paciente, '(' || cedula || ') ' || apellido || ' ' || nombre  as nombre_completo from paciente order by apellido, nombre

select * from v_paciente_citas
select id_cita, doctor, especialidad, fecha, motivo, estado, id_horario from v_paciente_citas where cedula = '44556677G'


select * from cita_medica
where estado = 'INGRESADA'

select * from receta_cabecera
select * from receta_detalle where id_receta_cab = 17

delete from receta_cabecera
where id_cita = 10;
update cita_medica
set estado = 'INGRESADA'
where id_cita = 10;

--------------------------------------------------------------------------------------------------
-- Consulta de Citas y Recetas (A generar servicios al cliente)

select * from v_consultar_cita_cedula
where cita = 10;

select * from v_consultar_receta_cedula
where cita = 10;

select * from auditoria_paciente