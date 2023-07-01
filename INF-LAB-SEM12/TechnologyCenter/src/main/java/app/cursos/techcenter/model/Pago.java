package app.cursos.techcenter.model;

public class Pago {
    String NombreCurso;
    int IdCurso, IdAlumno, IdEmpleado, numCuotas;
    private String fechaPago;
    private double importePago;

    public Pago() {
    }

    public Pago(int IdCurso, int IdAlumno, int IdEmpleado, int numCuotas, String fechaPago, double importePago) {
        this.IdCurso = IdCurso;
        this.IdAlumno = IdAlumno;
        this.IdEmpleado = IdEmpleado;
        this.numCuotas = numCuotas;
        this.fechaPago = fechaPago;
        this.importePago = importePago;
    }
    
    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }
        
    public int getIdCurso() {
        return IdCurso;
    }

    public void setIdCurso(int IdCurso) {
        this.IdCurso = IdCurso;
    }

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public int getNumCuotas() {
        return numCuotas;
    }

    public void setNumCuotas(int numCuotas) {
        this.numCuotas = numCuotas;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getImportePago() {
        return importePago;
    }

    public void setImportePago(double importePago) {
        this.importePago = importePago;
    }
}
