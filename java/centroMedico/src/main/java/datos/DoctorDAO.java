package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.Doctor;
import logica.Especialidad;
import logica.Horario;

public class DoctorDAO {

    public static void cargarTablaDoctor(JTable datosDoctor) {
        String[] datos = new String[8];
        DefaultTableModel modelo = new DefaultTableModel();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        modelo.addColumn("Código");
        modelo.addColumn("Cédula");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Email");
        modelo.addColumn("Especialidad");
        modelo.addColumn("IdEspecialidad");

        datosDoctor.setModel(modelo);

        try {
            conn = Conexion.getConnection();
            st = conn.createStatement();
            String sql = "select * from v_doctor;";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                modelo.addRow(datos);
            }
            datosDoctor.setModel(modelo);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (st != null) {
                    st.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void insertarDoctor(Doctor d) {
        String operacion = "I";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            //String sql = "CALL sp_doctor(?,?,?,?,?,?,?,null)";
            String sql = "call sp_doctor("
                    + "i_operacion:=?,"
                    + "i_cedula:=?,"
                    + "i_nombre:=?,"
                    + "i_apellido:=?,"
                    + "i_telefono:=?,"
                    + "i_email:=?,"
                    + "i_especialidad:=?)";
            cs = conn.prepareCall(sql);
            cs.setString(1, operacion);
            cs.setString(2, d.getCedula());
            cs.setString(3, d.getNombre());
            cs.setString(4, d.getApellido());
            cs.setString(5, d.getTelefono());
            cs.setString(6, d.getEmail());
            cs.setInt(7, d.getEspecialidad());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Doctor registrado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void actualizarDoctor(Doctor d) {
        String operacion = "U";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "call sp_doctor("
                    + "i_operacion:=?,"
                    + "i_cedula:=?,"
                    + "i_nombre:=?,"
                    + "i_apellido:=?,"
                    + "i_telefono:=?,"
                    + "i_email:=?,"
                    + "i_especialidad:=?,"
                    + "i_iddoctor:=?)";
            cs = conn.prepareCall(sql);
            cs.setString(1, operacion);
            cs.setString(2, d.getCedula());
            cs.setString(3, d.getNombre());
            cs.setString(4, d.getApellido());
            cs.setString(5, d.getTelefono());
            cs.setString(6, d.getEmail());
            cs.setInt(7, d.getEspecialidad());
            cs.setInt(8, d.getCodigo());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Doctor actualizado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void eliminarDoctor(Doctor d) {
        String operacion = "D";
        Connection conn = null;
        CallableStatement cs = null;
        try {
            conn = Conexion.getConnection();
            // Llamar al procedimiento almacenado
            String sql = "call sp_doctor("
                    + "i_operacion:=?,"
                    + "i_iddoctor:=?)";
            cs = conn.prepareCall(sql);
            cs.setString(1, operacion);
            cs.setInt(2, d.getCodigo());

            // Ejecutar el procedimiento almacenado
            cs.execute();
            JOptionPane.showMessageDialog(null, "Doctor eliminado correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } finally {
            try {
                if (cs != null) {
                    cs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void seleccionarDoctor(JTable datos, Doctor d, Especialidad esp) {
        try {
            int fila = datos.getSelectedRow();
            if (fila >= 0) {
                d.setCodigo(Integer.parseInt(datos.getValueAt(fila, 0).toString()));
                d.setCedula(datos.getValueAt(fila, 1).toString());
                d.setNombre(datos.getValueAt(fila, 2).toString());
                d.setApellido(datos.getValueAt(fila, 3).toString());
                d.setTelefono(datos.getValueAt(fila, 4).toString());
                d.setEmail(datos.getValueAt(fila, 5).toString());
                d.setEspecialidad(Integer.parseInt(datos.getValueAt(fila, 7).toString()));
                esp.setNombre(datos.getValueAt(fila, 6).toString());
                esp.setCodigo(Integer.parseInt(datos.getValueAt(fila, 7).toString()));
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

    public static void cargarComboDoctor(JComboBox<Doctor> combo, int idEspecialidad) {
        DefaultComboBoxModel valores = new DefaultComboBoxModel();
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;

        combo.setModel(valores);
        try {
            conn = Conexion.getConnection();
            if (idEspecialidad == 0) {
                sql = "select id_doctor, nombre_completo from v_citas_doctor where 0=?";
            } else {
                sql = "select id_doctor, nombre_completo from v_especialidad_doctor where id_especialidad = ?";
            }
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idEspecialidad);
            rs = pst.executeQuery();
            valores.addElement(new Doctor(0, "Selecciona un doctor"));

            while (rs.next()) {
                int codigo = Integer.parseInt(rs.getString(1));
                String nombre = rs.getString(2);
                valores.addElement(new Doctor(codigo, nombre));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void cargarComboHorario(JComboBox<Horario> combo, int idDoctor, int idEspecialidad) {
        DefaultComboBoxModel valores = new DefaultComboBoxModel();
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        combo.setModel(valores);
        try {
            conn = Conexion.getConnection();
            String sql = "select id_horario, descripcion from v_horarios_doctor where id_doctor = ? and id_especialidad = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idDoctor);
            pst.setInt(2, idEspecialidad);
            rs = pst.executeQuery();
            valores.addElement(new Horario(0, "Selecciona un horario"));

            while (rs.next()) {
                int codigo = Integer.parseInt(rs.getString(1));
                String descripcion = rs.getString(2);
                valores.addElement(new Horario(codigo, descripcion));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
