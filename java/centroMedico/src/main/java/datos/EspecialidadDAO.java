package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.Especialidad;

public class EspecialidadDAO {
    
    public static void cargarTablaEspecialidad(JTable datosEspecialidad){
        String[] datos = new String[3];
        DefaultTableModel modelo = new DefaultTableModel();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        
        datosEspecialidad.setModel(modelo);
        
        try{
            conn = Conexion.getConnection();
            st = conn.createStatement();
            String sql = "select * from especialidad order by id_especialidad;";
            rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            datosEspecialidad.setModel(modelo);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }finally{
            try { if (rs != null) rs.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (st != null) st.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (Exception e) { e.printStackTrace(); }
        }
    }
    
    public static void insertarEspecialidad(Especialidad especialidad){
        String operacion = "I";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "call sp_especialidad("
                    + "i_operacion:=?,"
                    + "i_nombre:=?,"
                    + "i_descripcion:=?)";
            cs = conn.prepareCall(sql);
            cs.setString(1, operacion);
            cs.setString(2, especialidad.getNombre());
            cs.setString(3, especialidad.getDescripcion());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Especialidad registrada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try { if (cs != null) cs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }

    public static void actualizarEspecialidad(Especialidad especialidad){
        String operacion = "U";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "call sp_especialidad("
                    + "i_operacion:=?,"
                    + "i_nombre:=?,"
                    + "i_descripcion:=?,"
                    + "i_idespecialidad:=?)";
            cs = conn.prepareCall(sql);
            cs.setString(1, operacion);
            cs.setString(2, especialidad.getNombre());
            cs.setString(3, especialidad.getDescripcion());
            cs.setInt(4, especialidad.getCodigo());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Especialidad actualizada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try { if (cs != null) cs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }

    public static void eliminarEspecialidad(Especialidad especialidad){
        String operacion = "D";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "call sp_especialidad("
                    + "i_operacion:=?,"
                    + "i_idespecialidad:=?)";
            cs = conn.prepareCall(sql);
            cs.setString(1, operacion);
            cs.setInt(2, especialidad.getCodigo());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Especialidad eliminada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try { if (cs != null) cs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    public static void cargarComboEspecialidad(JComboBox<Especialidad> combo){
        DefaultComboBoxModel valores = new DefaultComboBoxModel();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        combo.setModel(valores);
        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            String sql = "select id_especialidad, cast(id_especialidad as varchar) || '-' || nombre from especialidad";
            rs = st.executeQuery(sql);
            valores.addElement(new Especialidad(0, "Selecciona una especialidad"));
            while (rs.next()) {
                int codigo = Integer.parseInt(rs.getString(1));
                String nombre = rs.getString(2);
                valores.addElement(new Especialidad(codigo, nombre));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (st != null) st.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (Exception e) { e.printStackTrace(); }
        }
    }
}
