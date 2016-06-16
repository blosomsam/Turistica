/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaturistica.vista;

import guiaturistica.Util.JPAUtil;
import guiaturistica.controlador.RestaurantJpaControl;
import guiaturistica.controlador.SitioJpaControl;
import guiaturistica.modelo.Restaurant;
import guiaturistica.modelo.Sitio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sandrojc
 */
public class M4_RestaurantNuevo extends javax.swing.JInternalFrame {

 RestaurantJpaControl resjpa;
 Restaurant rest;
   
    public M4_RestaurantNuevo() {
        initComponents();    
    }
    
    public Restaurant cargarDatos() {
        SitioJpaControl stjpa = new SitioJpaControl(JPAUtil.getEntityManagerFactory());
        Sitio sit;
        sit = stjpa.buscarSitio(1l);

        rest = new Restaurant();
        List<Restaurant> lista = new ArrayList();

        rest.setNombreRestaurant(JTFNombreRestaurante.getText());
       // rest.setValorPromedioPlato(JTFValorPromedio.toString().get);
        rest.setDireccionRestaurant(JTFDireccionRestaurant.getText());
        rest.setTelefonoRestaurant(JTFTelefonoRestaurant.getText());

        lista.add(rest);
        sit.setRestaurant(lista);
        
        resjpa = new RestaurantJpaControl(JPAUtil.getEntityManagerFactory());
        resjpa.crear(rest);
       
        return (rest);
    }

    private void limpiar() {
        JTFNombreRestaurante.setText("");
        JTFDireccionRestaurant.setText("");
        JTFTelefonoRestaurant.setText("");
        JTFValorPromedio.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        JTFNombreRestaurante = new javax.swing.JTextField();
        JTFDireccionRestaurant = new javax.swing.JTextField();
        JTFTelefonoRestaurant = new javax.swing.JTextField();
        JTFValorPromedio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jLabel10.setBackground(new java.awt.Color(0, 204, 255));
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        JTFNombreRestaurante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        JTFDireccionRestaurant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        JTFTelefonoRestaurant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        JTFValorPromedio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        JTFValorPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFValorPromedioActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("V. promedio plato:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Telefóno");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Dirección:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel11.setFont(new java.awt.Font("URW Bookman L", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("RESTAURANTS ");

        jLabel13.setFont(new java.awt.Font("URW Bookman L", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("REGISTRO DE ");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/engranajes.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(BtnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(109, 109, 109)
                                    .addComponent(jLabel11)))
                            .addGap(52, 52, 52)
                            .addComponent(jLabel6))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFNombreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTFDireccionRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTFTelefonoRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTFValorPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(btnGuardar))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel11))
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(JTFNombreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(JTFDireccionRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(JTFTelefonoRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(JTFValorPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(52, 52, 52)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void JTFValorPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFValorPromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFValorPromedioActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
            cargarDatos();           
            JOptionPane.showMessageDialog(null, "Guardado");
            limpiar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+ e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BtnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTextField JTFDireccionRestaurant;
    private javax.swing.JTextField JTFNombreRestaurante;
    private javax.swing.JTextField JTFTelefonoRestaurant;
    private javax.swing.JTextField JTFValorPromedio;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
