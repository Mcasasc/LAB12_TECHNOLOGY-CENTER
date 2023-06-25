/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.cursos.techcenter.model;

/**
 *
 * @author Marcia
 */
public class Matricula {
    private String tipoMatricula;
    private String fechaMatricula;
    private double precio;
    private int numCuotas;
    private int nota;
    private Empleado empleado;
    private Cursos curso;
    private Alumno alumno;

    public Matricula() {
    }

    public Matricula(String tipoMatricula, String fechaMatricula, double precio, int numCuotas, int nota, Empleado empleado, Cursos curso, Alumno alumno) {
        this.tipoMatricula = tipoMatricula;
        this.fechaMatricula = fechaMatricula;
        this.precio = precio;
        this.numCuotas = numCuotas;
        this.nota = nota;
        this.empleado = empleado;
        this.curso = curso;
        this.alumno = alumno;
    }

    public String getTipoMatricula() {
        return tipoMatricula;
    }

    public void setTipoMatricula(String tipoMatricula) {
        this.tipoMatricula = tipoMatricula;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumCuotas() {
        return numCuotas;
    }

    public void setNumCuotas(int numCuotas) {
        this.numCuotas = numCuotas;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    
}
