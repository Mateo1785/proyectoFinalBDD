package logica;

import java.time.LocalDate;

public class CitaMedica {
    private int id_cita;
    private int id_paciente;
    private int id_doctor;
    private int id_horario;
    private String motivo;
    private LocalDate fecha_generacion;
    private String estado;

    public CitaMedica() {
    }

    public CitaMedica(int id_cita, int id_horario, String estado) {
        this.id_cita = id_cita;
        this.id_horario = id_horario;
        this.estado = estado;
    }

    public CitaMedica(int id_paciente, int id_doctor, int id_horario, String motivo, String estado) {
        this.id_paciente = id_paciente;
        this.id_doctor = id_doctor;
        this.id_horario = id_horario;
        this.motivo = motivo;
        this.estado = estado;
    }

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(int id_doctor) {
        this.id_doctor = id_doctor;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDate getFecha_generacion() {
        return fecha_generacion;
    }

    public void setFecha_generacion(LocalDate fecha_generacion) {
        this.fecha_generacion = fecha_generacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
