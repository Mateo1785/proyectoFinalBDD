package logica;

public class Receta {
    private int id_receta;
    private int id_cita;
    private String diagnostico;

    public Receta() {
    }

    public Receta(int id_receta, int id_cita, String diagnostico) {
        this.id_receta = id_receta;
        this.id_cita = id_cita;
        this.diagnostico = diagnostico;
    }

    public int getId_receta() {
        return id_receta;
    }

    public void setId_receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    
    
}
