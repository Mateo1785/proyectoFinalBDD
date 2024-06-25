package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection(){
        Connection conexion = null;
        var baseDatos = "centro_medico";
        var url = "jdbc:postgresql://localhost:5432/" + baseDatos;
        var usuario = "postgres";
        var password = "sybase123";
        // Cargamos la clase del driver en memoria
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en conexión con BDD " + e.getMessage());
        }
        return conexion;
    }
}
