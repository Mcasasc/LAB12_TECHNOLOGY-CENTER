package app.cursos.techcenter.controller;

import app.cursos.techcenter.database.AccesoDB;
import app.cursos.techcenter.model.Alumno;
import app.cursos.techcenter.model.Cursos;
import app.cursos.techcenter.model.Empleado;
import app.cursos.techcenter.model.Matricula;
import app.cursos.techcenter.model.Pago;
import app.cursos.techcenter.service.MatriculaService;
import app.cursos.techcenter.service.AlumnoService;
import app.cursos.techcenter.service.CursoService;
import app.cursos.techcenter.service.EmpleadoService;
import app.cursos.techcenter.service.PagoService;
import java.sql.Connection;
import java.sql.SQLException;

public class TechCenterController {

    public MatriculaService matriculaService = new MatriculaService();
    public AlumnoService aluService = new AlumnoService();
    public CursoService cursoService = new CursoService();
    public EmpleadoService empService = new EmpleadoService();
    public PagoService pagoService = new PagoService();

    //Metodos para guardar datos en la BD
    public Alumno procesar(Alumno alumno) throws SQLException {
        return aluService.registrarAlumno(alumno);
    }

    public Cursos procesar(Cursos curso) throws SQLException {
        return cursoService.registrarCurso(curso);
    }

    public Empleado procesar(Empleado empleado) throws SQLException {
        return empService.registrarEmpleado(empleado);
    }

    public Pago procesar(Pago pago) throws SQLException {
        return pagoService.registrarPago(pago);
    }

    public Matricula procesar(Matricula matricula) throws SQLException {
        return matriculaService.registrarMatricula(matricula);
    }

    //Metodos para buscar datos en la BD
    public Alumno buscarAlu(int IdAumno) throws SQLException {
        return aluService.obtenerAlumnoPorId(IdAumno);
    }

    public Cursos buscarCurso(int IdCurso) throws SQLException {
        return cursoService.obtenerCursoPorId(IdCurso);
    }

    public Empleado buscarEmp(int IdEmpleado) throws SQLException {
        return empService.obtenerEmpleadoPorId(IdEmpleado);
    }

    //Metodos para obtener mate y fecha
    public double calcularImporteCurso(String nombreCurso, int numCuotas, String tipoMatricula) throws SQLException {
        Cursos curso = cursoService.obtenerCursoPorNombre(nombreCurso);
        double precioCurso = curso.getPrecio();

        double importe = precioCurso / numCuotas;

        if (tipoMatricula.equalsIgnoreCase("Media beca")) {
            importe /= 2;
        }

        return importe;
    }

    public String obtenerFechaActual() throws SQLException {
        try (Connection cn = AccesoDB.getConnection()) {
            return pagoService.obtenerFechaActual(cn);
        }
    }

    //Metodos para actualizar los datos existentes en la BD
    public Alumno ActAlumno(Alumno alumno) throws SQLException {
        return aluService.actualizarAlumno(alumno);
    }

    public Empleado ActEmpleado(Empleado empleado) throws SQLException {
        return empService.actualizarEmpleado(empleado);
    }

    public Cursos ActCurso(Cursos curso) throws SQLException {
        return cursoService.actualizarCurso(curso);
    }
    
    public int obtIdEmpPorUsuario(){
        return empService.ObtEmpleadoporUsuario();
    }
}
