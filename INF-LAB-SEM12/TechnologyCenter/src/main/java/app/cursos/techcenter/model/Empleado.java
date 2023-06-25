/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.cursos.techcenter.model;

/**
 *
 * @author Marcia
 */
public class Empleado {
    int idEmpleado;
    String apellido;
    String nombre;
    String direccion;
    String email;
    String usuario;
    String contrasena;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String apellido, String nombre, String direccion, String email, String usuario, String contrasena) {
        this.idEmpleado = idEmpleado;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
