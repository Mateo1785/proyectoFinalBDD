package logica;

import datos.DoctorDAO;

public class Doctor {
    private int codigo;
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private int especialidad;

    public Doctor() {
    }

    public Doctor(int codigo) {
        this.codigo = codigo;
    }

    public Doctor(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Doctor(String cedula, String nombre, String apellido, String telefono, String email, int especialidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.especialidad = especialidad;
    }

    public Doctor(int codigo, String cedula, String nombre, String apellido, String telefono, String email, int especialidad) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.especialidad = especialidad;
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

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public int getEspecialidad() {
        return especialidad;
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

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
