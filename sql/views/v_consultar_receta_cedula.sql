drop view if exists v_consultar_receta_cedula;
create view v_consultar_receta_cedula(cita, paciente, cedula_paciente,
                                      diagnostico_final, medicamento, dosis_med,
									  dias_med, indicaciones_med)
as
select cm.id_cita, pa.nombre || ' ' || pa.apellido, pa.cedula,
       rc.diagnostico, me.nombre, rd.dosis, rd.dias, rd.indicaciones
from receta_cabecera as rc, receta_detalle as rd, cita_medica as cm,
     paciente as pa, medicamento as me
where rc.id_receta_cab = rd.id_receta_cab
and rc.id_cita = cm.id_cita
and cm.id_paciente = pa.id_paciente
and rd.id_medicamento = me.id_medicamento;
