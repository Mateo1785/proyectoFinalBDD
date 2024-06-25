package logica;

public class RecetaDetalle {
    private int id_receta;
    private int medicamento;
    private String dosis;
    private String dias;
    private String indicaciones;

    public RecetaDetalle() {
    }

    public RecetaDetalle(int id_receta, int medicamento, String dosis, String dias, String indicaciones) {
        this.id_receta = id_receta;
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.dias = dias;
        this.indicaciones = indicaciones;
    }

    public RecetaDetalle(int id_receta) {
        this.id_receta = id_receta;
    }

    public int getId_receta() {
        return id_receta;
    }

    public void setId_receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public int getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(int medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }
    
    
    
}
