package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.Paciente;

public class PacienteDAO {
    
    public static void cargarTablaPaciente(JTable datosPaciente){
        String[] datos = new String[9];
        DefaultTableModel modelo = new DefaultTableModel();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        modelo.addColumn("Código");
        modelo.addColumn("Cédula");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Sexo");
        modelo.addColumn("Dirección");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Email");
        
        datosPaciente.setModel(modelo);
        
        try{
            conn = Conexion.getConnection();
            st = conn.createStatement();
            String sql = "select * from paciente order by id_paciente;";
            rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                modelo.addRow(datos);
            }
            datosPaciente.setModel(modelo);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }finally{
            try { if (rs != null) rs.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (st != null) st.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (Exception e) { e.printStackTrace(); }
        }
    }
    
    public static void cargarComboPaciente(JComboBox<Paciente> combo){
        DefaultComboBoxModel valores = new DefaultComboBoxModel();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        combo.setModel(valores);
        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            String sql = "select id_paciente, '(' || cedula || ') ' || apellido || ' ' || nombre as nombre_completo from paciente order by apellido, nombre";
            rs = st.executeQuery(sql);
            valores.addElement(new Paciente(0, "Selecciona un paciente"));

            while (rs.next()) {
                int codigo = Integer.parseInt(rs.getString(1));
                String nombre = rs.getString(2);
                valores.addElement(new Paciente(codigo, nombre));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (st != null) st.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (Exception e) { e.printStackTrace(); }
        }
    }
    
    public static void insertarPaciente(Paciente paciente){
        String operacion = "I";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "call sp_paciente("
                    + "i_operacion:=?,"
                    + "i_cedula:=?,"
                    + "i_nombre:=?,"
                    + "i_apellido:=?,"
                    + "i_fecha_nac:=?,"
                    + "i_sexo:=?,"
                    + "i_direccion:=?,"
                    + "i_telefono:=?,"
                    + "i_email:=?)";
            cs = conn.prepareCall(sql);
            cs.setString(1, operacion);
            cs.setString(2, paciente.getCedula());
            cs.setString(3, paciente.getNombre());
            cs.setString(4, paciente.getApellido());
            cs.setDate(5, new Date(paciente.getFecha_nacimiento().getTime()));
            cs.setString(6, paciente.getSexo());
            cs.setString(7, paciente.getDireccion());
            cs.setString(8, paciente.getTelefono());
            cs.setString(9, paciente.getEmail());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Paciente registrado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try { if (cs != null) cs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    public static void actualizarPaciente(Paciente paciente){
        String operacion = "U";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "call sp_paciente("
                    + "i_operacion:=?,"
                    + "i_cedula:=?,"
                    + "i_nombre:=?,"
                    + "i_apellido:=?,"
                    + "i_fecha_nac:=?,"
                    + "i_sexo:=?,"
                    + "i_direccion:=?,"
                    + "i_telefono:=?,"
                    + "i_email:=?,"
                    + "i_idpaciente:=?)";
            cs = conn.prepareCall(sql);
            cs.setString(1, operacion);
            cs.setString(2, paciente.getCedula());
            cs.setString(3, paciente.getNombre());
            cs.setString(4, paciente.getApellido());
            cs.setDate(5, new Date(paciente.getFecha_nacimiento().getTime()));
            cs.setString(6, paciente.getSexo());
            cs.setString(7, paciente.getDireccion());
            cs.setString(8, paciente.getTelefono());
            cs.setString(9, paciente.getEmail());
            cs.setInt(10, paciente.getCodigo());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Paciente actualizado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try { if (cs != null) cs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    public static void eliminarPaciente(Paciente paciente){
        String operacion = "D";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "call sp_paciente("
                    + "i_operacion:=?,"
                    + "i_idpaciente:=?)";
            cs = conn.prepareCall(sql);
            cs.setString(1, operacion);
            cs.setInt(2, paciente.getCodigo());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Paciente eliminado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try { if (cs != null) cs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
}
