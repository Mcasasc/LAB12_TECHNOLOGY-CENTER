package app.cursos.techcenter.service;

import app.cursos.techcenter.database.AccesoDB;
import app.cursos.techcenter.model.Alumno;
import java.sql.*;

public class AlumnoService {

    public CursoService cursoService = new CursoService();

    public Alumno registrarAlumno(Alumno alumno) throws SQLException {
        try (Connection cn = AccesoDB.getConnection()) {
            // Insertar el nuevo alumno en la base de datos sin proporcionar el ID
            String sql = "INSERT INTO Alumno (alu_nombre, alu_direccion, alu_telefono, alu_email) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setString(1, alumno.getNombre());
                pstmt.setString(2, alumno.getDireccion());
                pstmt.setString(3, alumno.getTelefono());
                pstmt.setString(4, alumno.getEmail());

                // Ejecutar la sentencia de inserción
                pstmt.executeUpdate();

                // Obtener el ID generado para el nuevo alumno
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int nuevoAlumnoId = generatedKeys.getInt(1);
                        alumno.setIdAlumno(nuevoAlumnoId);
                    }
                }
            }
        }
        return alumno;
    }

    public Alumno obtenerAlumnoPorId(int idAlumno) {
        Connection cn = null;
        Alumno alumno = null;

        try {
            cn = AccesoDB.getConnection();

            String query = "SELECT * FROM Alumno WHERE alu_id = ?";
            PreparedStatement statement = cn.prepareStatement(query);
            statement.setInt(1, idAlumno);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("alu_id");
                String nombre = resultSet.getString("alu_nombre");
                String direccion = resultSet.getString("alu_direccion");
                String telefono = resultSet.getString("alu_telefono");
                String email = resultSet.getString("alu_email");

                alumno = new Alumno(id, nombre, direccion, telefono, email);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }

        return alumno;
    }

    public Alumno actualizarAlumno(Alumno alumno) throws SQLException {
        try (Connection cn = AccesoDB.getConnection()) {
            // Verificar si el alumno existe en la base de datos
            Alumno alumnoExistente = obtenerAlumnoPorId(alumno.getIdAlumno());
            if (alumnoExistente == null) {
                throw new IllegalArgumentException("El alumno con ID " + alumno.getIdAlumno() + " no existe en la base de datos.");
            }

            // Actualizar los datos del alumno en la base de datos
            String sql = "UPDATE Alumno SET alu_nombre = ?, alu_direccion = ?, alu_telefono = ?, alu_email = ? WHERE alu_id = ?";
            try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
                pstmt.setString(1, alumno.getNombre());
                pstmt.setString(2, alumno.getDireccion());
                pstmt.setString(3, alumno.getTelefono());
                pstmt.setString(4, alumno.getEmail());
                pstmt.setInt(5, alumno.getIdAlumno());

                // Ejecutar la sentencia de actualización
                int filasActualizadas = pstmt.executeUpdate();
                if (filasActualizadas != 1) {
                    throw new SQLException("Error al actualizar el alumno en la base de datos.");
                }
            }
        }
        return alumno;
    }
}
