package logica;

public class Especialidad {
    private int codigo;
    private String nombre;
    private String descripcion;

    public Especialidad() {
    }

    public Especialidad(int codigo) {
        this.codigo = codigo;
    }

    public Especialidad(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Especialidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Especialidad(int codigo, String nombre, String descripcion) {
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
        Especialidad that = (Especialidad) obj;
        return codigo == that.codigo; // Comparar por id para la selección
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }
    
}
