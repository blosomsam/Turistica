package guiaturistica.vista;

import guiaturistica.Util.JPAUtil;
import guiaturistica.controlador.SitioJpaControl;
import guiaturistica.controlador.TransporteJpaControl;
import guiaturistica.modelo.Sitio;
import guiaturistica.modelo.Transporte;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author sandrojc
 */
public class M5_TransporteNuevo extends javax.swing.JInternalFrame {
    TransporteJpaControl trajpa;
    Transporte tra;
    /**
     * Creates new form M5_TransporteNuevoo
     */
    public M5_TransporteNuevo() {
        initComponents();
    }
    
    public Transporte cargarDatos(){
        SitioJpaControl sitjpa = new SitioJpaControl(JPAUtil.getEntityManagerFactory());
        Sitio sit;
        sit = sitjpa.buscarSitio(1l);
        
        tra = new Transporte();
        List<Transporte>lista = new ArrayList();
        tra.setCaracteristicaTransporte(JRBtnCalefaccion.getText());
        tra.setHorarioTransporte(JTAHorario.getText());
        tra.setNombreTransporte(JTFCooperativa.getText());
        tra.setTipo_transporte(JCBTipoTransporte.getText());
        
        
        lista.add(tra);
        sit.setTransporte(lista);
      
        trajpa = new TransporteJpaControl(JPAUtil.getEntityManagerFactory());
        trajpa.crear(tra);
        
        return (tra);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JTFCooperativa = new javax.swing.JTextField();
        JCBTipoTransporte1 = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        JSpinNumeroAsientos = new javax.swing.JSpinner();
        BtnSalir = new javax.swing.JButton();
        JRBtnCalefaccion = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JRBtnWifi = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JRBtnTv = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAHorario = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JCBTipoTransporte = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel11.setFont(new java.awt.Font("URW Bookman L", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 102, 255));
        jLabel11.setText("TRASPORTE ");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Características:");

        JTFCooperativa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        JTFCooperativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCooperativaActionPerformed(evt);
            }
        });

        JCBTipoTransporte1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JCBTipoTransporte1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bus", "Furgoneta", "Camioneta", "auto" }));
        JCBTipoTransporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBTipoTransporte1ActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Droid Sans Mono", 0, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/guardar-28x28.png"))); // NOI18N
        btnGuardar.setText("guargar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setRequestFocusEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("Droid Sans Mono", 0, 12)); // NOI18N
        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/cancelar-28x28.png"))); // NOI18N
        BtnSalir.setText("cancelar");
        BtnSalir.setBorderPainted(false);
        BtnSalir.setRequestFocusEnabled(false);
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        JRBtnCalefaccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JRBtnCalefaccion.setText("Calefacción");
        JRBtnCalefaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBtnCalefaccionActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Droid Sans Mono", 0, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/lupa-16x16.png"))); // NOI18N
        jButton6.setText("Examinar");
        jButton6.setBorderPainted(false);
        jButton6.setRequestFocusEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Número asientos");

        jLabel10.setBackground(new java.awt.Color(0, 204, 255));
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JRBtnWifi.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JRBtnWifi.setText("wifi");
        JRBtnWifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBtnWifiActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/engranajes.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Tipo transporte:");

        jLabel13.setFont(new java.awt.Font("URW Bookman L", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 102, 255));
        jLabel13.setText("REGISTRO DE ");

        JRBtnTv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        JRBtnTv.setText("TV");
        JRBtnTv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBtnTvActionPerformed(evt);
            }
        });

        JTAHorario.setColumns(20);
        JTAHorario.setRows(5);
        JTAHorario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setViewportView(JTAHorario);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Horario:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Coopetativa:");

        JCBTipoTransporte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        JCBTipoTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBTipoTransporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(27, 27, 27)
                            .addComponent(JTFCooperativa))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(57, 57, 57)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JCBTipoTransporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JCBTipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JSpinNumeroAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(JRBtnWifi)
                            .addGap(49, 49, 49)
                            .addComponent(JRBtnTv)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JRBtnCalefaccion)
                            .addComponent(btnGuardar))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(110, 110, 110)
                                    .addComponent(jLabel11))
                                .addComponent(jLabel13))
                            .addGap(193, 193, 193))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel6)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTFCooperativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JCBTipoTransporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBTipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JSpinNumeroAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRBtnWifi)
                    .addComponent(JRBtnCalefaccion)
                    .addComponent(JRBtnTv))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(btnGuardar))
                .addGap(9, 9, 9))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel11))
                        .addComponent(jLabel13))
                    .addGap(29, 29, 29)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(166, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFCooperativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCooperativaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFCooperativaActionPerformed

    private void JCBTipoTransporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBTipoTransporte1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBTipoTransporte1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            cargarDatos();
            JOptionPane.showMessageDialog(null, "Guardado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void JRBtnCalefaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBtnCalefaccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBtnCalefaccionActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void JRBtnWifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBtnWifiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBtnWifiActionPerformed

    private void JRBtnTvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBtnTvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBtnTvActionPerformed

    private void JCBTipoTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBTipoTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBTipoTransporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTextField JCBTipoTransporte;
    private javax.swing.JComboBox<String> JCBTipoTransporte1;
    private javax.swing.JRadioButton JRBtnCalefaccion;
    private javax.swing.JRadioButton JRBtnTv;
    private javax.swing.JRadioButton JRBtnWifi;
    private javax.swing.JSpinner JSpinNumeroAsientos;
    private javax.swing.JTextArea JTAHorario;
    private javax.swing.JTextField JTFCooperativa;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
