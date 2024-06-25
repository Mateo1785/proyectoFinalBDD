package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import logica.CitaMedica;
import logica.Doctor;
import logica.Paciente;

public class CitaMedicaDAO {
    public static void insertarCitaMedica(CitaMedica cita, JTextField txtID){
        String operacion = "I";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "{ ? = call f_cita_medica("
                    + "i_operacion:=?,"
                    + "i_idpaciente:=?,"
                    + "i_iddoctor:=?,"
                    + "i_idhorario:=?,"
                    + "i_motivo:=?,"
                    + "i_estado:=?)}";
            cs = conn.prepareCall(sql);
            cs.registerOutParameter(1, java.sql.Types.INTEGER);
            cs.setString(2, operacion);
            cs.setInt(3, cita.getId_paciente());
            cs.setInt(4, cita.getId_doctor());
            cs.setInt(5, cita.getId_horario());
            cs.setString(6, cita.getMotivo());
            cs.setString(7, cita.getEstado());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Cita registrada correctamente.");
            int codigo = cs.getInt(1);
            txtID.setText(String.valueOf(codigo));

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try { if (cs != null) cs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }

    public static void actualizarCitaMedica(CitaMedica cita){
        String operacion = "U";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "{ ? = call f_cita_medica("
                    + "i_operacion:=?,"
                    + "i_idcita:=?,"
                    + "i_idhorario:=?,"
                    + "i_estado:=?)}";
            cs = conn.prepareCall(sql);
            cs.registerOutParameter(1, java.sql.Types.INTEGER);
            cs.setString(2, operacion);
            cs.setInt(3, cita.getId_cita());
            cs.setInt(4, cita.getId_horario());
            cs.setString(5, cita.getEstado());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Cita actualizada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try { if (cs != null) cs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
        
    public static void consultarCitasCliente(JTable citas, Paciente paciente){
        String[] datos = new String[7];
        DefaultTableModel modelo = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        modelo.addColumn("Código");
        modelo.addColumn("Doctor");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Fecha de la Cita");
        modelo.addColumn("Motivo");
        modelo.addColumn("Estado");
        modelo.addColumn("Horario");
        
        citas.setModel(modelo);
        
        try{
            conn = Conexion.getConnection();
            String sql = "select id_cita, doctor, especialidad, fecha, motivo, estado, id_horario from v_paciente_citas where cedula = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, paciente.getCedula());
            rs = pst.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                modelo.addRow(datos);
            }
            citas.setModel(modelo);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }finally{
            try { if (rs != null) rs.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (pst != null) pst.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (Exception e) { e.printStackTrace(); }
        }
    }
    
    public static void consultarCitasDoctor(JTable citas, Doctor doctor){
        String[] datos = new String[5];
        DefaultTableModel modelo = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        modelo.addColumn("Código");
        modelo.addColumn("Paciente");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Motivo");
        
        citas.setModel(modelo);
        
        try{
            conn = Conexion.getConnection();
            String sql = "select id_cita, nombre_completo, fecha, hora, motivo from v_citas_ingresadas where id_doctor = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, doctor.getCodigo());
            rs = pst.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            citas.setModel(modelo);
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }finally{
            try { if (rs != null) rs.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (pst != null) pst.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (Exception e) { e.printStackTrace(); }
        }
    }
}
