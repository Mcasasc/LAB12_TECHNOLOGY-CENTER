package app.cursos.techcenter.model;

public class Matricula {
    String NombreCurso;
    private int idCurso;
    private int idAlumno;
    private int idEmpleado;
    private String tipoMatricula;
    private String fecha;
    private double precio;
    private int numCuotas;
    private int nota;

    public Matricula() {
    }

    public Matricula(int idCurso, int idAlumno, int idEmpleado, String tipoMatricula, String fecha, double precio, int numCuotas, int nota) {
        this.idCurso = idCurso;
        this.idAlumno = idAlumno;
        this.idEmpleado = idEmpleado;
        this.tipoMatricula = tipoMatricula;
        this.fecha = fecha;
        this.precio = precio;
        this.numCuotas = numCuotas;
        this.nota = nota;
    }
    
    // Getters y setters
    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

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

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}