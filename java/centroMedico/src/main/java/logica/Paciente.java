package logica;

import java.util.Date;

public class Paciente {
    private int codigo;
    private String cedula;
    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;
    private String sexo;
    private String direccion;
    private String telefono;
    private String email;

    public Paciente() {
    }

    public Paciente(String cedula) {
        this.cedula = cedula;
    }

    public Paciente(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Paciente(int codigo) {
        this.codigo = codigo;
    }

    public Paciente(int codigo, String cedula, String nombre, String apellido, Date fecha_nacimiento, String sexo, String direccion, String telefono, String email) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    
    public Paciente(String cedula, String nombre, String apellido, Date fecha_nacimiento, String sexo, String direccion, String telefono, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return this.getNombre();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Paciente that = (Paciente) obj;
        return codigo == that.codigo; // Comparar por id para la selección
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }
}
