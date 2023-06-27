/**
 * @author Yber-M;
 * @author Casas Castillo,Marcia Veronica
 * @author De la Cruz Ocaña, Joseth
 * @author Esquives Zapata, Juan Jesus
 * @author Quispe Olano Marlon Yber
 * @author Navarro Quezada, Samuel Alexis
 */
package app.cursos.techcenter.controller;

import app.cursos.techcenter.model.Alumno;
import app.cursos.techcenter.model.Cursos;
import app.cursos.techcenter.model.Matricula;
import app.cursos.techcenter.service.MatriculaService;
import java.util.List;

public class MatriculaController {

    private MatriculaService cursoService = new MatriculaService();

    public void matricularAlumno(Alumno alumno, Cursos curso, String tipoMatricula, double precio, int numCuotas) {
        cursoService.matricularAlumno(alumno, curso, tipoMatricula, precio, numCuotas);
    }

    public List<Matricula> consultarMatriculasPorCurso(Cursos curso) {
        return cursoService.consultarMatriculasPorCurso(curso);
    }

    public void registrarPago(Matricula matricula, String fechaPago, double importePago) {
        cursoService.registrarPago(matricula, fechaPago, importePago);
    }

    public double calcularDeuda(Matricula matricula) {
        return cursoService.calcularDeuda(matricula);
    }
}
