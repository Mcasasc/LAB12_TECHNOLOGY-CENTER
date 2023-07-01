package app.cursos.techcenter.service;

import app.cursos.techcenter.database.AccesoDB;
import app.cursos.techcenter.model.Empleado;
import java.sql.*;

public class LoginService {

    public Empleado validarUsuario(String usuario, String clave) {
        Connection cn = null;
        Empleado empleado = null;
        String sql = "select emp_id codigo, emp_apellido apellido,";
        sql += " emp_nombre nombre, emp_direccion direccion, emp_email email,";
        sql += " emp_usuario usuario, '*****' clave ";
        sql += "from empleado where emp_usuario=? and emp_clave = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            cn = AccesoDB.getConnection();
            pstm = cn.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, clave);
            rs = pstm.executeQuery();
            if (!rs.next()) {
                throw new SQLException("Datos incorrectos.");
            }
            empleado = new Empleado();
            empleado.setIdEmpleado(rs.getInt("codigo"));
            empleado.setApellido(rs.getString("apellido"));
            empleado.setNombre(rs.getString("nombre"));
            empleado.setDireccion(rs.getString("direccion"));
            empleado.setEmail(rs.getString("email"));
            empleado.setUsuario(rs.getString("usuario"));
            empleado.setContraseña(rs.getString("clave"));
            rs.close();
            pstm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Error en el proceso, intentelo nuevmante.");
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return empleado;
    }
}