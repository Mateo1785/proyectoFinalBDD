package logica;

public class Medicamento {
    private int codigo;
    private String nombre;
    private String descripcion;

    public Medicamento() {
    }

    public Medicamento(int codigo) {
        this.codigo = codigo;
    }

    public Medicamento(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Medicamento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Medicamento(int codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Medicamento that = (Medicamento) obj;
        return codigo == that.codigo; // Comparar por id para la selección
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }
    
}
