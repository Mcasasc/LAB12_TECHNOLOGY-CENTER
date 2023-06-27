package app.cursos.techcenter.test;

import app.cursos.techcenter.controller.MatriculaController;
import app.cursos.techcenter.model.Alumno;
import app.cursos.techcenter.model.Cursos;
import app.cursos.techcenter.model.Matricula;

import java.util.List;

public class Test0 {

    public static void main(String[] args) {
        MatriculaController matriculaController = new MatriculaController();

        // Crear objeto Cursos para la prueba
        Cursos curso = new Cursos(1, "Programación Java", 10, 0, "Profesor", 2500);

        // Crear objeto Alumno para la prueba
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(1);
        alumno.setNombre("Juan Perez");
        alumno.setDireccion("Dirección 123");
        alumno.setTelefono("123456789");
        alumno.setEmail("juan@example.com");
        alumno.setCurso(curso);

        // Matricular al alumno en el curso
        matriculaController.matricularAlumno(alumno, curso, "1", 0, 2);

        // Consultar las matriculas por curso
        List<Matricula> matriculas = matriculaController.consultarMatriculasPorCurso(curso);
        for (Matricula matricula : matriculas) {
            System.out.println(matricula.ImprimirTest());
        }

        // Registrar un pago
        Matricula matricula = matriculas.get(0);
        double importe = 1200;
        matriculaController.registrarPago(matricula, "2023-06-26", importe);

        // Calcular deuda
        double deuda = matriculaController.calcularDeuda(matricula);
        System.out.println("Precio: S/ " + matricula.getPrecio() + "\nFecha de pago: " + matricula.getFecha() 
                + "\nImporte: " + importe +"\nDeuda de la matrícula: " + deuda);
    }
}
