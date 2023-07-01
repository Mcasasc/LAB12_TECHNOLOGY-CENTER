package app.cursos.techcenter.service;

import app.cursos.techcenter.database.AccesoDB;
import app.cursos.techcenter.model.Matricula;
import java.sql.*;

public class MatriculaService {

    public CursoService cursoService = new CursoService();
    public AlumnoService alumnoService = new AlumnoService();
    public EmpleadoService empleadoService = new EmpleadoService();

    public Matricula registrarMatricula(Matricula matricula) throws SQLException {
        try (Connection cn = AccesoDB.getConnection()) {
            // Obtener el ID del curso a partir del nombre del curso
            int idCurso = cursoService.obtenerCursoPorNombre(matricula.getNombreCurso()).getIdCurso();

            // Obtener el ID del alumno a partir del ID del alumno
            int idAlumno = alumnoService.obtenerAlumnoPorId(matricula.getIdAlumno()).getIdAlumno();

            // Obtener el ID del empleado a partir del ID del empleado
            int idEmpleado = empleadoService.ObtEmpleadoporUsuario();

            // Obtener la fecha y hora actual utilizando la función de SQL
            String fecha = obtenerFechaActual(cn);

            // Insertar la nueva matrícula en la base de datos
            String sql = "INSERT INTO dbo.MATRICULA (cur_id, alu_id, emp_id, mat_tipo, mat_fecha, mat_precio, mat_cuotas, mat_nota) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
                pstmt.setInt(1, idCurso);
                pstmt.setInt(2, idAlumno);
                pstmt.setInt(3, idEmpleado);
                pstmt.setString(4, matricula.getTipoMatricula());
                pstmt.setString(5, fecha);
                pstmt.setDouble(6, matricula.getPrecio());
                pstmt.setInt(7, matricula.getNumCuotas());
                pstmt.setInt(8, matricula.getNota());

                // Ejecutar la sentencia de inserción
                pstmt.executeUpdate();
            }
        }
        return matricula;
    }

    private String obtenerFechaActual(Connection connection) throws SQLException {
        String fechaActual = null;
        String sql = "SELECT GETDATE() AS fechaActual";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                fechaActual = resultSet.getString("fechaActual");
            }
        }
        return fechaActual;
    }
}
