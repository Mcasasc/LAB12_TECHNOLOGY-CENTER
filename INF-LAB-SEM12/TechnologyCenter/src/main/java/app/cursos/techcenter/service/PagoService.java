package app.cursos.techcenter.service;

import app.cursos.techcenter.database.AccesoDB;
import app.cursos.techcenter.model.Cursos;
import app.cursos.techcenter.model.Matricula;
import app.cursos.techcenter.model.Pago;
import java.sql.*;

public class PagoService {

    public CursoService cursoService = new CursoService();
    public AlumnoService alumnoService = new AlumnoService();
    public EmpleadoService empleadoService = new EmpleadoService();

    public Pago registrarPago(Pago pago) throws SQLException {
        try (Connection cn = AccesoDB.getConnection()) {

            // Obtener el ID del curso a partir del nombre del curso
            int idCurso = cursoService.obtenerCursoPorNombre(pago.getNombreCurso()).getIdCurso();

            // Obtener el ID del alumno a partir del ID del alumno
            int idAlumno = alumnoService.obtenerAlumnoPorId(pago.getIdAlumno()).getIdAlumno();

            // Obtener el ID del empleado a partir del ID del empleado
            int idEmpleado = empleadoService.obtenerEmpleadoPorId(pago.getIdEmpleado()).getIdEmpleado();

            // Calcular el importe a pagar
            double importe = CalculoDeImporte(pago.getNombreCurso(), pago.getNumCuotas());

            // Insertar el nuevo pago en la base de datos sin proporcionar el ID
            String sql = "INSERT INTO dbo.PAGO (cur_id, alu_id, pag_cuota, emp_id, pag_fecha, pag_importe) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
                pstmt.setInt(1, idCurso);
                pstmt.setInt(2, idAlumno);
                pstmt.setInt(3, pago.getNumCuotas());
                pstmt.setInt(4, idEmpleado);
                pstmt.setString(5, obtenerFechaActual(cn));
                pstmt.setDouble(6, importe);

                // Ejecutar la sentencia de inserción
                pstmt.executeUpdate();
            }
        }
        return pago;
    }

    public double CalculoDeImporte(String nombreCurso, int numCuotas) {
        Matricula matricula = new Matricula();
        // Obtener el precio del curso
        CursoService cursoService = new CursoService();
        Cursos curso = cursoService.obtenerCursoPorNombre(nombreCurso);
        double precioCurso = curso.getPrecio();

        // Calcular el importe dividiendo el precio del curso entre el número de cuotas
        double importe = precioCurso / numCuotas;

        // Aplicar descuento si es media beca
        if (matricula.getTipoMatricula().equals("media beca")) {
            importe /= 2;
        }

        return importe;
    }

    public String obtenerFechaActual(Connection cn) throws SQLException {
        String fechaActual = null;
        String sql = "SELECT GETDATE() AS fechaActual";
        try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                fechaActual = resultSet.getString("fechaActual");
            }
        }
        return fechaActual;
    }
}
