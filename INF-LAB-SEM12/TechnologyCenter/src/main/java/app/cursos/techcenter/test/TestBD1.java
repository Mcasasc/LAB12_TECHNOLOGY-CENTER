package app.cursos.techcenter.test;
import java.sql.Connection;
import app.cursos.techcenter.database.AccesoDB;

public class TestBD1 {
        public static void main(String[] args) {
        try {
            Connection cn = AccesoDB.getConnection();
            System.out.println("Conexion ok.");
            cn.close(); // Cierra la conexion
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
