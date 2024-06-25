package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import logica.Receta;
import logica.RecetaDetalle;

public class RecetaDAO {
    public static int insertarRecetaCabecera(Receta receta){
        String operacion = "I";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "{ ? = call f_receta("
                    + "i_operacion:=?,"
                    + "i_idcita:=?,"
                    + "i_diagnostico:=?)}";
            cs = conn.prepareCall(sql);
            cs.registerOutParameter(1, java.sql.Types.INTEGER);
            cs.setString(2, operacion);
            cs.setInt(3, receta.getId_cita());
            cs.setString(4, receta.getDiagnostico());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            int codigo = cs.getInt(1);
            return codigo;

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try { if (cs != null) cs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
        return 0;
    }
    
    public static void insertarRecetaDetalle(RecetaDetalle receta_det){
        String operacion = "D";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "{ ? = call f_receta("
                    + "i_operacion:=?,"
                    + "i_idreceta:=?,"
                    + "i_idmedicamento:=?,"
                    + "i_dosis:=?,"
                    + "i_dias:=?,"
                    + "i_indicaciones:=?)}";
            cs = conn.prepareCall(sql);
            cs.registerOutParameter(1, java.sql.Types.INTEGER);
            cs.setString(2, operacion);
            cs.setInt(3, receta_det.getId_receta());
            cs.setInt(4, receta_det.getMedicamento());
            cs.setString(5, receta_det.getDosis());
            cs.setString(6, receta_det.getDias());
            cs.setString(7, receta_det.getIndicaciones());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            int codigo = cs.getInt(1);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try { if (cs != null) cs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
}
