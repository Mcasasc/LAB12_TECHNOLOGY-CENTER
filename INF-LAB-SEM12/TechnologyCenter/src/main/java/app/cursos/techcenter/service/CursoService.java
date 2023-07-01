package app.cursos.techcenter.service;

import app.cursos.techcenter.database.AccesoDB;
import app.cursos.techcenter.model.Cursos;
import java.sql.*;

public class CursoService {

    public Cursos registrarCurso(Cursos curso) throws SQLException {
        try (Connection cn = AccesoDB.getConnection()) {
            // Insertar el nuevo alumno en la base de datos sin proporcionar el ID
            String sql = "INSERT INTO dbo.CURSO (cur_nombre, cur_vacantes, cur_matriculados, cur_profesor, cur_precio) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setString(1, curso.getNombre());
                pstmt.setInt(2, curso.getNum_vacantes());
                pstmt.setInt(3, curso.getNum_matriculados());
                pstmt.setString(4, curso.getProfesor());
                pstmt.setDouble(5, curso.getPrecio());

                // Ejecutar la sentencia de inserción
                pstmt.executeUpdate();

                // Obtener el ID generado para el nuevo curso
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int nuevoCursoId = generatedKeys.getInt(1);
                        curso.setIdCurso(nuevoCursoId);
                    }
                }
            }
        }
        return curso;
    }

    public Cursos obtenerCursoPorId(int idCurso) {
        Connection cn = null;
        Cursos curso = null;

        try {
            cn = AccesoDB.getConnection();
            String query = "SELECT * FROM dbo.CURSO WHERE cur_id = ?";
            PreparedStatement statement = cn.prepareStatement(query);
            statement.setInt(1, idCurso);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("cur_id");
                String nombre = resultSet.getString("cur_nombre");
                int num_vacantes = resultSet.getInt("cur_vacantes");
                int num_matriculados = resultSet.getInt("cur_matriculados");
                String profesor = resultSet.getString("cur_profesor");
                double precio = resultSet.getDouble("cur_precio");

                curso = new Cursos(id, nombre, num_vacantes, num_matriculados, profesor, precio);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }

        return curso;
    }

    public Cursos obtenerCursoPorNombre(String nombreCurso) {
        Connection cn = null;
        Cursos curso = null;

        try {
            cn = AccesoDB.getConnection();
            String query = "SELECT * FROM dbo.CURSO WHERE cur_nombre = ?";
            PreparedStatement statement = cn.prepareStatement(query);
            statement.setString(1, nombreCurso);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("cur_id");
                String nombre = resultSet.getString("cur_nombre");
                int num_vacantes = resultSet.getInt("cur_vacantes");
                int num_matriculados = resultSet.getInt("cur_matriculados");
                String profesor = resultSet.getString("cur_profesor");
                double precio = resultSet.getDouble("cur_precio");

                curso = new Cursos(id, nombre, num_vacantes, num_matriculados, profesor, precio);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }

        return curso;
    }

    public Cursos actualizarCurso(Cursos curso) throws SQLException {
        try (Connection cn = AccesoDB.getConnection()) {
            // Verificar si el curso existe en la base de datos
            Cursos cursoExistente = obtenerCursoPorId(curso.getIdCurso());
            if (cursoExistente == null) {
                throw new IllegalArgumentException("El curso con ID " + curso.getIdCurso() + " no existe en la base de datos.");
            }

            // Actualizar los datos del curso en la base de datos
            String sql = "UPDATE dbo.CURSO SET cur_nombre = ?, cur_vacantes = ?, cur_matriculados = ?, cur_profesor = ?, cur_precio = ? WHERE cur_id = ?";
            try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
                pstmt.setString(1, curso.getNombre());
                pstmt.setInt(2, curso.getNum_vacantes());
                pstmt.setInt(3, curso.getNum_matriculados());
                pstmt.setString(4, curso.getProfesor());
                pstmt.setDouble(5, curso.getPrecio());
                pstmt.setInt(6, curso.getIdCurso());

                // Ejecutar la sentencia de actualización
                int filasActualizadas = pstmt.executeUpdate();
                if (filasActualizadas != 1) {
                    throw new SQLException("Error al actualizar el curso en la base de datos.");
                }
            }
        }
        return curso;
    }

}
