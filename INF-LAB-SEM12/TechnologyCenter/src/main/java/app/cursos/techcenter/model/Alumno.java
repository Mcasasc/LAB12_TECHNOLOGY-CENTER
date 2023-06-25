/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.cursos.techcenter.model;

import java.util.ArrayList;

/**
 *
 * @author Marcia
 */
public class Alumno {
    private int idAlumno;
    private String nombre; 
    private String direccion; 
    private String telefono; 
    private String email; 
    private Cursos curso;
    private ArrayList<Pago> pagos = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre, String direccion, String telefono, String email, Cursos curso, ArrayList<Pago> pagos) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.curso = curso;
        this.pagos = pagos;
    }
    

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
