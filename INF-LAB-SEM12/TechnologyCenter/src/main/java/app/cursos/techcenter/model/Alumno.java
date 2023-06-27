package app.cursos.techcenter.model;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private int idAlumno;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private Cursos curso;
    private List<Pago> pagos;

    public Alumno() {
        pagos = new ArrayList<>();
    }

    public Alumno(int idAlumno, String nombre, String direccion, String telefono, String email, Cursos curso) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.curso = curso;
        pagos = new ArrayList<>();
    }

    public void setPagos(List<Pago> pagos) {
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

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public List<Pago> getPagos() {
        return pagos;
    }
}
