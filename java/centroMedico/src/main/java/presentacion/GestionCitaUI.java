package presentacion;

import datos.CitaMedicaDAO;
import datos.DoctorDAO;
import static datos.DoctorDAO.cargarComboDoctor;
import datos.MedicamentoDAO;
import datos.RecetaDAO;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.Doctor;
import logica.Medicamento;
import logica.Receta;
import logica.RecetaDetalle;
import utilitarios.HelpTabla;
import static utilitarios.HelpTabla.ajustarAnchoColumnas;

public class GestionCitaUI extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;

    public GestionCitaUI() {
        initComponents();
        DoctorDAO.cargarComboDoctor(cmbDoctor, 0);
        MedicamentoDAO.cargarComboMedicamento(cmbMedicamento);
        limpiar_todo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmbMedicamento = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtDosis = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableReceta = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtIndicaciones = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCitas = new javax.swing.JTable();
        cmbDoctor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDCita = new javax.swing.JTextField();
        txtDiagnostico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnLimpiarTodo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestión de Cita");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Receta"));

        jLabel5.setText("Medicamento:");

        cmbMedicamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMedicamentoItemStateChanged(evt);
            }
        });

        jLabel6.setText("Dosis:");

        jLabel7.setText("Días:");

        tableReceta = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tableReceta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableReceta.setAutoResizeMode(0);
        tableReceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRecetaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableReceta);

        jLabel8.setText("Indicaciones:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtDosis)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIndicaciones))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar)
                    .addComponent(btnIngresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableCitas = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tableCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableCitas.setAutoResizeMode(0);
        tableCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCitas);

        cmbDoctor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDoctorItemStateChanged(evt);
            }
        });

        jLabel1.setText("Doctor:");

        jLabel2.setText("ID Cita:");

        jLabel4.setText("Diagnóstico:");

        txtIDCita.setEnabled(false);

        jLabel3.setText("Paciente:");

        txtPaciente.setEnabled(false);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiarTodo.setText("Limpiar Todo");
        btnLimpiarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTodoActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar Atención");
        btnRegistrar.setEnabled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtIDCita, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPaciente))
                                .addComponent(txtDiagnostico)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnLimpiarTodo)
                    .addComponent(btnRegistrar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDoctorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDoctorItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Doctor doctor = (Doctor) cmbDoctor.getSelectedItem();
            CitaMedicaDAO.consultarCitasDoctor(tableCitas, doctor);
            ajustarAnchoColumnas(tableCitas);
            txtIDCita.setText("");
            txtPaciente.setText("");
        }
    }//GEN-LAST:event_cmbDoctorItemStateChanged

    private void tableCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCitasMouseClicked
        // TODO add your handling code here:
        int fila = tableCitas.getSelectedRow();

        if (fila >= 0) {
            txtIDCita.setText(tableCitas.getValueAt(fila, 0).toString());
            txtPaciente.setText(tableCitas.getValueAt(fila, 1).toString());
            limpiar_receta();
            cmbDoctor.setEnabled(false);
            cmbMedicamento.setEnabled(true);
            txtDosis.setEnabled(true);
            txtDias.setEnabled(true);
            txtIndicaciones.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada.");
        }
    }//GEN-LAST:event_tableCitasMouseClicked

    private void btnLimpiarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTodoActionPerformed
        // TODO add your handling code here:
        limpiar_todo();
    }//GEN-LAST:event_btnLimpiarTodoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar_receta();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        RecetaDetalle detalle = new RecetaDetalle();
        Medicamento medicamento = new Medicamento();

        if (validar_datos() == false) {
            return;
        }

        medicamento = (Medicamento) cmbMedicamento.getSelectedItem();
        detalle.setMedicamento(medicamento.getCodigo());
        detalle.setDosis(txtDosis.getText());
        detalle.setDias(txtDias.getText());
        detalle.setIndicaciones(txtIndicaciones.getText());
        insertar_medicamento_local(detalle, medicamento);
        btnRegistrar.setEnabled(true);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void cmbMedicamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMedicamentoItemStateChanged
        // TODO add your handling code here:
        if (cmbMedicamento.getSelectedIndex() == 0) {
            btnIngresar.setEnabled(false);
            btnEliminar.setEnabled(false);
        } else {
            btnIngresar.setEnabled(true);
            btnEliminar.setEnabled(true);
        }
        txtDosis.setText("");
        txtDias.setText("");
        txtIndicaciones.setText("");
    }//GEN-LAST:event_cmbMedicamentoItemStateChanged

    private void tableRecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRecetaMouseClicked
        // TODO add your handling code here:
        int fila = tableReceta.getSelectedRow();
        Medicamento medicamento = new Medicamento();

        if (fila >= 0) {
            int codigo = Integer.parseInt(tableReceta.getValueAt(fila, 1).toString());
            for (int i = 0; i < cmbMedicamento.getItemCount(); i++) {
                medicamento = cmbMedicamento.getItemAt(i);
                if (medicamento.getCodigo() == codigo) {
                    cmbMedicamento.setSelectedIndex(i);
                    break;
                }
            }
            txtDosis.setText(tableReceta.getValueAt(fila, 2).toString());
            txtDias.setText(tableReceta.getValueAt(fila, 3).toString());
            txtIndicaciones.setText(tableReceta.getValueAt(fila, 4).toString());
        }
    }//GEN-LAST:event_tableRecetaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int fila = tableReceta.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tableReceta.getModel();
        if (fila >= 0 && fila < modelo.getRowCount()) {
            modelo.removeRow(fila);
        } else {
            System.out.println("Índice de fila fuera de rango");
        }
        cmbMedicamento.setSelectedIndex(0);
        txtDosis.setText("");
        txtDias.setText("");
        txtIndicaciones.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        Receta receta = new Receta();
        RecetaDetalle receta_detalle = new RecetaDetalle();
        int codigo;
        
        if(tableReceta.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Debe registrar medicamento.");
        }
        
        receta.setId_cita(Integer.parseInt(txtIDCita.getText()));
        receta.setDiagnostico(txtDiagnostico.getText());
        
        codigo = RecetaDAO.insertarRecetaCabecera(receta);
        
        for (int i = 0; i < tableReceta.getRowCount(); i++) {
            receta_detalle.setId_receta(codigo);
            receta_detalle.setMedicamento(Integer.parseInt(tableReceta.getValueAt(i, 1).toString()));
            receta_detalle.setDosis(tableReceta.getValueAt(i, 3).toString());
            receta_detalle.setDias(tableReceta.getValueAt(i, 4).toString());
            receta_detalle.setIndicaciones(tableReceta.getValueAt(i, 5).toString());
            RecetaDAO.insertarRecetaDetalle(receta_detalle);
        }
        JOptionPane.showMessageDialog(null, "Receta registrada correctamente.");
        limpiar_todo();
        DoctorDAO.cargarComboDoctor(cmbDoctor, 0);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private boolean validar_datos() {
        if (cmbDoctor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un doctor.");
            return false;
        }
        if (txtIDCita.getText().equals("") || txtPaciente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar cita y paciente.");
            return false;
        }
        if (txtDiagnostico.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el diagnóstico.");
            return false;
        }
        if (cmbMedicamento.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un medicamento.");
            return false;
        }
        if (txtDosis.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la dosis.");
            return false;
        }
        if (txtDias.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar los días.");
            return false;
        }
        if (txtIndicaciones.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar las indicaciones.");
            return false;
        }
        return true;
    }

    private void limpiar_receta() {
        cmbMedicamento.setSelectedIndex(0);
        txtDosis.setText("");
        txtDias.setText("");
        txtIndicaciones.setText("");
        btnIngresar.setEnabled(false);
        btnEliminar.setEnabled(false);
        limpiar_tabla_medicamento();
    }

    private void limpiar_todo() {
        cmbDoctor.setSelectedIndex(0);
        cmbDoctor.setEnabled(true);
        txtIDCita.setText("");
        txtPaciente.setText("");
        txtDiagnostico.setText("");
        cmbMedicamento.setEnabled(false);
        txtDosis.setEnabled(false);
        txtDias.setEnabled(false);
        txtIndicaciones.setEnabled(false);
        btnRegistrar.setEnabled(false);
        limpiar_receta();
    }

    private void limpiar_tabla_medicamento() {
        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Medicamento");
        modelo.addColumn("Descripción");
        modelo.addColumn("Dosis");
        modelo.addColumn("Días");
        modelo.addColumn("Indicaciones");
        tableReceta.setModel(modelo);
        ajustarAnchoColumnas(tableReceta);
        HelpTabla.ocultarColumna(tableReceta, 0);
        HelpTabla.ocultarColumna(tableReceta, 1);
    }

    private void insertar_medicamento_local(RecetaDetalle detalle, Medicamento medicamento) {
        String[] datos = new String[6];
        
        for (int i = 0; i < tableReceta.getRowCount(); i++) {
            int codigo = Integer.parseInt(tableReceta.getValueAt(i, 1).toString());
            if (detalle.getMedicamento() == codigo) {
                JOptionPane.showMessageDialog(null, "El medicamento ya se encuentra ingresado.");
                return;
            }
        }
       
        datos[0] = "0";
        datos[1] = String.valueOf(detalle.getMedicamento());
        datos[2] = medicamento.getNombre();
        datos[3] = detalle.getDosis();
        datos[4] = detalle.getDias();
        datos[5] = detalle.getIndicaciones();
        modelo.addRow(datos);
        tableReceta.setModel(modelo);
        ajustarAnchoColumnas(tableReceta);
        HelpTabla.ocultarColumna(tableReceta, 0);
        HelpTabla.ocultarColumna(tableReceta, 1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarTodo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Doctor> cmbDoctor;
    private javax.swing.JComboBox<Medicamento> cmbMedicamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableCitas;
    private javax.swing.JTable tableReceta;
    private javax.swing.JTextField txtDiagnostico;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtDosis;
    private javax.swing.JTextField txtIDCita;
    private javax.swing.JTextField txtIndicaciones;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
