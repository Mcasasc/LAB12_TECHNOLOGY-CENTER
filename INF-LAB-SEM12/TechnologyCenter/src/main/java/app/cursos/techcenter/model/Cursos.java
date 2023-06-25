/**
 * @author Yber-M;
 * @author Casas Castillo,Marcia Veronica
 * @author De la Cruz Ocaña, Joseth
 * @author Esquives Zapata, Juan Jesus
 * @author Quispe Olano Marlon Yber
 * @author Navarro Quezada, Samuel Alexis
 */
package app.cursos.techcenter.model;

public class Cursos {
    int idCurso;
    String nombre;
    int num_vacantes;
    int num_matriculados;
    String profesor;
    double precio;

    public Cursos() {
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_vacantes() {
        return num_vacantes;
    }

    public void setNum_vacantes(int num_vacantes) {
        this.num_vacantes = num_vacantes;
    }

    public int getNum_matriculados() {
        return num_matriculados;
    }

    public void setNum_matriculados(int num_matriculados) {
        this.num_matriculados = num_matriculados;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    

}
