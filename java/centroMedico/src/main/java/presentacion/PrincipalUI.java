package presentacion;

public class PrincipalUI extends javax.swing.JFrame {

    private DoctorUI d1;
    private PacienteUI p1;
    private CitaUI c1;
    private ConsultaCitaUI cc;
    private GestionCitaUI gc;
    private EspecialidadUI e1;
    private MedicamentoUI m1;
    /**
     * Creates new form PrincipalUI
     */
    public PrincipalUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        menuPrincipal = new javax.swing.JMenuBar();
        menuEspecialidad = new javax.swing.JMenu();
        itemEspecialidad = new javax.swing.JMenuItem();
        menuDoctor = new javax.swing.JMenu();
        itemDoctor = new javax.swing.JMenuItem();
        menuPaciente = new javax.swing.JMenu();
        itemPaciente = new javax.swing.JMenuItem();
        menuMedicamento = new javax.swing.JMenu();
        itemMedicamento = new javax.swing.JMenuItem();
        menuCitas = new javax.swing.JMenu();
        itemCita = new javax.swing.JMenuItem();
        ItemConsultarCita = new javax.swing.JMenuItem();
        itemGestionCita = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Citas Médicas");
        setPreferredSize(new java.awt.Dimension(900, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        menuEspecialidad.setText("Especialidad");

        itemEspecialidad.setText("Administrar");
        itemEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEspecialidadActionPerformed(evt);
            }
        });
        menuEspecialidad.add(itemEspecialidad);

        menuPrincipal.add(menuEspecialidad);

        menuDoctor.setText("Doctor");

        itemDoctor.setText("Administrar");
        itemDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDoctorActionPerformed(evt);
            }
        });
        menuDoctor.add(itemDoctor);

        menuPrincipal.add(menuDoctor);

        menuPaciente.setText("Paciente");

        itemPaciente.setText("Administrar");
        itemPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPacienteActionPerformed(evt);
            }
        });
        menuPaciente.add(itemPaciente);

        menuPrincipal.add(menuPaciente);

        menuMedicamento.setText("Medicamento");

        itemMedicamento.setText("Administrar");
        itemMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMedicamentoActionPerformed(evt);
            }
        });
        menuMedicamento.add(itemMedicamento);

        menuPrincipal.add(menuMedicamento);

        menuCitas.setText("Citas");

        itemCita.setText("Agendar");
        itemCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCitaActionPerformed(evt);
            }
        });
        menuCitas.add(itemCita);

        ItemConsultarCita.setText("Consultar");
        ItemConsultarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConsultarCitaActionPerformed(evt);
            }
        });
        menuCitas.add(ItemConsultarCita);

        itemGestionCita.setText("Gestión");
        itemGestionCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGestionCitaActionPerformed(evt);
            }
        });
        menuCitas.add(itemGestionCita);

        menuPrincipal.add(menuCitas);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDoctorActionPerformed
        // TODO add your handling code here:
        if(d1 == null || d1.isClosed()){
            d1 = new DoctorUI();
            escritorio.add(d1);
            d1.setVisible(true);
        }else{
            try{
                d1.setSelected(true);
            }catch(java.beans.PropertyVetoException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_itemDoctorActionPerformed

    private void itemCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCitaActionPerformed
        // TODO add your handling code here:
        if(c1 == null || c1.isClosed()){
            c1 = new CitaUI();
            escritorio.add(c1);
            c1.setVisible(true);
        }else{
            try{
                c1.setSelected(true);
            }catch(java.beans.PropertyVetoException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_itemCitaActionPerformed

    private void ItemConsultarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConsultarCitaActionPerformed
        // TODO add your handling code here:
        if(cc == null || cc.isClosed()){
            cc = new ConsultaCitaUI();
            escritorio.add(cc);
            cc.setVisible(true);
        }else{
            try{
                cc.setSelected(true);
            }catch(java.beans.PropertyVetoException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ItemConsultarCitaActionPerformed

    private void itemGestionCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGestionCitaActionPerformed
        // TODO add your handling code here:
        if(gc == null || gc.isClosed()){
            gc = new GestionCitaUI();
            escritorio.add(gc);
            gc.setVisible(true);
        }else{
            try{
                gc.setSelected(true);
            }catch(java.beans.PropertyVetoException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_itemGestionCitaActionPerformed

    private void itemPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPacienteActionPerformed
        // TODO add your handling code here:
        if(p1 == null || p1.isClosed()){
            p1 = new PacienteUI();
            escritorio.add(p1);
            p1.setVisible(true);
        }else{
            try{
                p1.setSelected(true);
            }catch(java.beans.PropertyVetoException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_itemPacienteActionPerformed

    private void itemEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEspecialidadActionPerformed
        // TODO add your handling code here:
        if(e1 == null || e1.isClosed()){
            e1 = new EspecialidadUI();
            escritorio.add(e1);
            e1.setVisible(true);
        }else{
            try{
                e1.setSelected(true);
            }catch(java.beans.PropertyVetoException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_itemEspecialidadActionPerformed

    private void itemMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMedicamentoActionPerformed
        // TODO add your handling code here:
        if(m1 == null || m1.isClosed()){
            m1 = new MedicamentoUI();
            escritorio.add(m1);
            m1.setVisible(true);
        }else{
            try{
                m1.setSelected(true);
            }catch(java.beans.PropertyVetoException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_itemMedicamentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemConsultarCita;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemCita;
    private javax.swing.JMenuItem itemDoctor;
    private javax.swing.JMenuItem itemEspecialidad;
    private javax.swing.JMenuItem itemGestionCita;
    private javax.swing.JMenuItem itemMedicamento;
    private javax.swing.JMenuItem itemPaciente;
    private javax.swing.JMenu menuCitas;
    private javax.swing.JMenu menuDoctor;
    private javax.swing.JMenu menuEspecialidad;
    private javax.swing.JMenu menuMedicamento;
    private javax.swing.JMenu menuPaciente;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
