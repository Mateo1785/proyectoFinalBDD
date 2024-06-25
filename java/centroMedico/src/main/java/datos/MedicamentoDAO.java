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
import logica.Medicamento;

public class MedicamentoDAO {
    
    public static void cargarTablaMedicamento(JTable datosMedicamento){
        String[] datos = new String[3];
        DefaultTableModel modelo = new DefaultTableModel();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        
        datosMedicamento.setModel(modelo);
        
        try{
            conn = Conexion.getConnection();
            st = conn.createStatement();
            String sql = "select * from medicamento order by id_medicamento;";
            rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            datosMedicamento.setModel(modelo);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }finally{
            try { if (rs != null) rs.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (st != null) st.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (Exception e) { e.printStackTrace(); }
        }
    }
    
    public static void insertarMedicamento(Medicamento medicamento){
        String operacion = "I";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "call sp_medicamento("
                    + "i_operacion:=?,"
                    + "i_nombre:=?,"
                    + "i_descripcion:=?)";
            cs = conn.prepareCall(sql);
            cs.setString(1, operacion);
            cs.setString(2, medicamento.getNombre());
            cs.setString(3, medicamento.getDescripcion());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Medicamento registrado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try { if (cs != null) cs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }

    public static void actualizarMedicamento(Medicamento medicamento){
        String operacion = "U";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "call sp_medicamento("
                    + "i_operacion:=?,"
                    + "i_nombre:=?,"
                    + "i_descripcion:=?,"
                    + "i_idmedicamento:=?)";
            cs = conn.prepareCall(sql);
            cs.setString(1, operacion);
            cs.setString(2, medicamento.getNombre());
            cs.setString(3, medicamento.getDescripcion());
            cs.setInt(4, medicamento.getCodigo());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Medicamento actualizado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try { if (cs != null) cs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }

    public static void eliminarMedicamento(Medicamento medicamento){
        String operacion = "D";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "call sp_medicamento("
                    + "i_operacion:=?,"
                    + "i_idmedicamento:=?)";
            cs = conn.prepareCall(sql);
            cs.setString(1, operacion);
            cs.setInt(2, medicamento.getCodigo());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Medicamento eliminado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try { if (cs != null) cs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    public static void cargarComboMedicamento(JComboBox<Medicamento> combo){
        DefaultComboBoxModel valores = new DefaultComboBoxModel();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        combo.setModel(valores);
        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            String sql = "select id_medicamento, cast(id_medicamento as varchar) || '-' || nombre from medicamento order by nombre;";
            rs = st.executeQuery(sql);
            valores.addElement(new Medicamento(0, "Selecciona un medicamento"));
            while (rs.next()) {
                int codigo = Integer.parseInt(rs.getString(1));
                String nombre = rs.getString(2);
                valores.addElement(new Medicamento(codigo, nombre));
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
