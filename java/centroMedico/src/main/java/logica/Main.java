package logica;

import datos.Conexion;
import datos.DoctorDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Doctor doc = new Doctor("1234567890","David","Mejia","0984672145","david.mejia@example.com",17);
        DoctorDAO.insertarDoctor(doc);
        
        
    }
}
