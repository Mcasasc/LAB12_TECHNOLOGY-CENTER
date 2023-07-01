package app.cursos.techcenter.service;

import app.cursos.techcenter.database.AccesoDB;
import app.cursos.techcenter.model.Empleado;
import app.cursos.techcenter.util.Session;
import java.sql.*;

public class EmpleadoService {

    public Empleado registrarEmpleado(Empleado empleado) throws SQLException {
        try (Connection cn = AccesoDB.getConnection()) {
            // Insertar el nuevo alumno en la base de datos sin proporcionar el ID
            String sql = "INSERT INTO dbo.EMPLEADO (emp_apellido,emp_nombre,emp_direccion,emp_email,emp_usuario,emp_clave) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setString(1, empleado.getApellido());
                pstmt.setString(2, empleado.getNombre());
                pstmt.setString(3, empleado.getDireccion());
                pstmt.setString(4, empleado.getEmail());
                pstmt.setString(5, empleado.getUsuario());
                pstmt.setString(6, empleado.getContraseña());

                // Ejecutar la sentencia de inserción
                pstmt.executeUpdate();

                // Obtener el ID generado para el nuevo alumno
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int nuevoEmpleadoId = generatedKeys.getInt(1);
                        empleado.setIdEmpleado(nuevoEmpleadoId);
                    }
                }
            }
        }
        return empleado;
    }

    public Empleado obtenerEmpleadoPorId(int idEmpleado) {
        Connection cn = null;
        Empleado empleado = null;

        try {
            cn = AccesoDB.getConnection();

            String query = "SELECT * FROM EMPLEADO WHERE emp_id = ?";
            PreparedStatement statement = cn.prepareStatement(query);
            statement.setInt(1, idEmpleado);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("emp_id");
                String apellido = resultSet.getString("emp_apellido");
                String nombre = resultSet.getString("emp_nombre");
                String direccion = resultSet.getString("emp_direccion");
                String email = resultSet.getString("emp_email");
                String usuario = resultSet.getString("emp_usuario");
                String clave = resultSet.getString("emp_clave");

                empleado = new Empleado(id, apellido, nombre, direccion, email, usuario, clave);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }

        return empleado;
    }

    public Empleado actualizarEmpleado(Empleado empleado) throws SQLException {
        try (Connection cn = AccesoDB.getConnection()) {
            // Verificar si el empleado existe en la base de datos
            Empleado empleadoExistente = obtenerEmpleadoPorId(empleado.getIdEmpleado());
            if (empleadoExistente == null) {
                throw new IllegalArgumentException("El empleado con ID " + empleado.getIdEmpleado() + " no existe en la base de datos.");
            }

            // Actualizar los datos del empleado en la base de datos
            String sql = "UPDATE dbo.EMPLEADO SET emp_apellido = ?, emp_nombre = ?, emp_direccion = ?, emp_email = ?, emp_usuario = ?, emp_clave = ? WHERE emp_id = ?";
            try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
                pstmt.setString(1, empleado.getApellido());
                pstmt.setString(2, empleado.getNombre());
                pstmt.setString(3, empleado.getDireccion());
                pstmt.setString(4, empleado.getEmail());
                pstmt.setString(5, empleado.getUsuario());
                pstmt.setString(6, empleado.getContraseña());
                pstmt.setInt(7, empleado.getIdEmpleado());

                // Ejecutar la sentencia de actualización
                int filasActualizadas = pstmt.executeUpdate();
                if (filasActualizadas != 1) {
                    throw new SQLException("Error al actualizar el empleado en la base de datos.");
                }
            }
        }
        return empleado;
    }

    public int ObtEmpleadoporUsuario() {
        Empleado usuario = (Empleado) Session.get("usuario");
        return usuario.getIdEmpleado();
    }
}
