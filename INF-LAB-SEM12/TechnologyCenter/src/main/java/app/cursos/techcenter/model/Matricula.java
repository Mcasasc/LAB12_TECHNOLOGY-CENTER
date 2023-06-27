package app.cursos.techcenter.model;

import java.util.ArrayList;
import java.util.List;

public class Matricula {

    private String tipoMatricula;
    private String fecha;
    private double precio;
    private int numCuotas;
    private double deuda;
    private String estado;
    private List<Pago> pagos;
    private Cursos curso;
    private Alumno alumno;

    public Matricula(String tipoMatricula, String fecha, double precio, int numCuotas, double deuda, String estado, Cursos curso, Alumno alumno) {
        this.tipoMatricula = tipoMatricula;
        this.fecha = fecha;
        this.precio = precio;
        this.numCuotas = numCuotas;
        this.deuda = deuda;
        this.estado = estado;
        this.pagos = new ArrayList<>();
        this.curso = curso;
        this.alumno = alumno;
    }

    // Getters y setters
    public String getTipoMatricula() {
        return tipoMatricula;
    }

    public void setTipoMatricula(String tipoMatricula) {
        this.tipoMatricula = tipoMatricula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String ImprimirTest() {
        return """
               - - - Datos del Estudiante - - -
               Alumno: """ + alumno.getNombre() + "\nCel:" + alumno.getTelefono() +
               "\nEmail:" + alumno.getEmail() + "\nDireccion:" + alumno.getDireccion()
                + "\n- - - Datos del Pago - - - \nCurso: " + curso.getNombre() ;
    }

}
