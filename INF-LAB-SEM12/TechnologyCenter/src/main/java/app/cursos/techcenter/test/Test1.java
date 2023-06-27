/**
 * @author Yber-M;
 * @email ybermarlon@gmail.com
 * @github https://github.com/Yber-M
 * @facebook https://www.facebook.com/MarlonYber.QO
 */

package app.cursos.techcenter.test;

import app.cursos.techcenter.controller.MatriculaController;
import app.cursos.techcenter.model.Alumno;
import app.cursos.techcenter.model.Cursos;
import app.cursos.techcenter.model.Matricula;
import app.cursos.techcenter.service.MatriculaService;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
       MatriculaController matriculaController = new MatriculaController();

        // Crear objeto Cursos para la prueba
        Cursos curso = new Cursos(1, "Programación Python", 20, 15, "Profesor1", 1500);

        // Crear objeto Alumno para la prueba
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(1);
        alumno.setNombre("Aureliano Buendia");
        alumno.setDireccion("Dir. 230 Pp.");
        alumno.setTelefono("745645623");
        alumno.setEmail("example@dsl.com");
        alumno.setCurso(curso);

        // Matricular al alumno en el curso
        matriculaController.matricularAlumno(alumno, curso, "2", 0, 3);

        // Consultar las matriculas por curso
        List<Matricula> matriculas = matriculaController.consultarMatriculasPorCurso(curso);
        for (Matricula matricula : matriculas) {
            System.out.println(matricula.ImprimirTest());
        }

        // Registrar un pago
        Matricula matricula = matriculas.get(0);
        double importe = 1200;
        matriculaController.registrarPago(matricula, "2021-06-06", importe);

        // Calcular deuda
        double deuda = matriculaController.calcularDeuda(matricula);
        System.out.println("Precio: S/ " + matricula.getPrecio() + "\nFecha de pago: " + matricula.getFecha() 
                + "\nImporte: " + importe +"\nDeuda de la matrícula: " + deuda);

    }

}
