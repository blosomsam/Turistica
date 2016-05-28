package guiaturistica.vista;

import guiaturistica.modelo.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 * @author sandrojc
 */

public class VentanaPrincipal extends javax.swing.JFrame {
    protected void this_windowOpened(WindowEvent e) {
        centrarVentana();
    }

    private void centrarVentana() {
        // Se obtienen las dimensiones en pixels de la pantalla.
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        // Se obtienen las dimensiones en pixels de la ventana.
        Dimension ventana = getSize();
        // Una cuenta para situar la ventana en el centro de la pantalla.
        setLocation((pantalla.width - ventana.width) / 2,
                (pantalla.height - ventana.height) / 2);
    }

    private Usuario us;

    public VentanaPrincipal() {
        initComponents();
        // Ventana maximizada al ejecutarce
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //la ventana desabilitada la funcion cambiar tamaño ventana
        //this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuInicio = new javax.swing.JMenu();
        MenuAdminHoteles1 = new javax.swing.JMenu();
        MNuevositio = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        MenuItemNuevo18 = new javax.swing.JMenuItem();
        MenuAdminHoteles = new javax.swing.JMenu();
        MenuItemNuevo1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        MenuItemNuevo12 = new javax.swing.JMenuItem();
        MenuAdminTiendas = new javax.swing.JMenu();
        MenuItemNuevo7 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        MenuItemNuevo13 = new javax.swing.JMenuItem();
        MenuAdminTrasporte = new javax.swing.JMenu();
        MenuItemNuevo8 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        MenuItemNuevo14 = new javax.swing.JMenuItem();
        MenuAdminRestaurantes = new javax.swing.JMenu();
        MenuItemNuevo9 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        MenuItemNuevo15 = new javax.swing.JMenuItem();
        MenuAdminUsuarios1 = new javax.swing.JMenu();
        MenuItemNuevo19 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        MenuItemNuevo20 = new javax.swing.JMenuItem();
        MenuAdminUsuarios = new javax.swing.JMenu();
        MenuItemNuevo10 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        MenuItemNuevo16 = new javax.swing.JMenuItem();
        MenuAdminCuentas = new javax.swing.JMenu();
        MenuItemNuevo11 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        MenuItemNuevo17 = new javax.swing.JMenuItem();
        MenuAdminCuentas1 = new javax.swing.JMenu();
        MenuItemNuevo21 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        MenuItemNuevo22 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 864, Short.MAX_VALUE)
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        MenuInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/home-20x20.png"))); // NOI18N
        MenuInicio.setText("Inicio");
        jMenuBar1.add(MenuInicio);

        MenuAdminHoteles1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/montaña-20x20.png"))); // NOI18N
        MenuAdminHoteles1.setText("Sitio");
        MenuAdminHoteles1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        MNuevositio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MNuevositio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/nuevo-16x16.png"))); // NOI18N
        MNuevositio.setText("Nuevo");
        MNuevositio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNuevositioActionPerformed(evt);
            }
        });
        MenuAdminHoteles1.add(MNuevositio);

        jMenuItem6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/modificar-16x16.png"))); // NOI18N
        jMenuItem6.setText("Modificar");
        MenuAdminHoteles1.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/lupa-16x16.png"))); // NOI18N
        jMenuItem7.setText("Buscar");
        MenuAdminHoteles1.add(jMenuItem7);

        MenuItemNuevo18.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/engranaje-16x16.png"))); // NOI18N
        MenuItemNuevo18.setText("Administar");
        MenuItemNuevo18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo18ActionPerformed(evt);
            }
        });
        MenuAdminHoteles1.add(MenuItemNuevo18);

        jMenuBar1.add(MenuAdminHoteles1);

        MenuAdminHoteles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/hotel-20x20.png"))); // NOI18N
        MenuAdminHoteles.setText("Hoteles");
        MenuAdminHoteles.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        MenuItemNuevo1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/nuevo-16x16.png"))); // NOI18N
        MenuItemNuevo1.setText("Nuevo");
        MenuItemNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo1ActionPerformed(evt);
            }
        });
        MenuAdminHoteles.add(MenuItemNuevo1);

        jMenuItem5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/modificar-16x16.png"))); // NOI18N
        jMenuItem5.setText("Modificar");
        MenuAdminHoteles.add(jMenuItem5);

        jMenuItem4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/lupa-16x16.png"))); // NOI18N
        jMenuItem4.setText("Buscar");
        MenuAdminHoteles.add(jMenuItem4);

        MenuItemNuevo12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/engranaje-16x16.png"))); // NOI18N
        MenuItemNuevo12.setText("Administar");
        MenuItemNuevo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo12ActionPerformed(evt);
            }
        });
        MenuAdminHoteles.add(MenuItemNuevo12);

        jMenuBar1.add(MenuAdminHoteles);

        MenuAdminTiendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/bolsa-20x20.png"))); // NOI18N
        MenuAdminTiendas.setText("Tiendas");
        MenuAdminTiendas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        MenuItemNuevo7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/nuevo-16x16.png"))); // NOI18N
        MenuItemNuevo7.setText("Nuevo");
        MenuItemNuevo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo7ActionPerformed(evt);
            }
        });
        MenuAdminTiendas.add(MenuItemNuevo7);

        jMenuItem16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/modificar-16x16.png"))); // NOI18N
        jMenuItem16.setText("Modificar");
        MenuAdminTiendas.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/lupa-16x16.png"))); // NOI18N
        jMenuItem17.setText("Buscar");
        MenuAdminTiendas.add(jMenuItem17);

        MenuItemNuevo13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/engranaje-16x16.png"))); // NOI18N
        MenuItemNuevo13.setText("Administar");
        MenuItemNuevo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo13ActionPerformed(evt);
            }
        });
        MenuAdminTiendas.add(MenuItemNuevo13);

        jMenuBar1.add(MenuAdminTiendas);

        MenuAdminTrasporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/bus-20x20.png"))); // NOI18N
        MenuAdminTrasporte.setText("Transporte");
        MenuAdminTrasporte.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        MenuItemNuevo8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/nuevo-16x16.png"))); // NOI18N
        MenuItemNuevo8.setText("Nuevo");
        MenuItemNuevo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo8ActionPerformed(evt);
            }
        });
        MenuAdminTrasporte.add(MenuItemNuevo8);

        jMenuItem18.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/modificar-16x16.png"))); // NOI18N
        jMenuItem18.setText("Modificar");
        MenuAdminTrasporte.add(jMenuItem18);

        jMenuItem19.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/lupa-16x16.png"))); // NOI18N
        jMenuItem19.setText("Buscar");
        MenuAdminTrasporte.add(jMenuItem19);

        MenuItemNuevo14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/engranaje-16x16.png"))); // NOI18N
        MenuItemNuevo14.setText("Administar");
        MenuItemNuevo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo14ActionPerformed(evt);
            }
        });
        MenuAdminTrasporte.add(MenuItemNuevo14);

        jMenuBar1.add(MenuAdminTrasporte);

        MenuAdminRestaurantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/restaturant-20x20.png"))); // NOI18N
        MenuAdminRestaurantes.setText("Restaurantes");
        MenuAdminRestaurantes.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        MenuItemNuevo9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/nuevo-16x16.png"))); // NOI18N
        MenuItemNuevo9.setText("Nuevo");
        MenuItemNuevo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo9ActionPerformed(evt);
            }
        });
        MenuAdminRestaurantes.add(MenuItemNuevo9);

        jMenuItem20.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/modificar-16x16.png"))); // NOI18N
        jMenuItem20.setText("Modificar");
        MenuAdminRestaurantes.add(jMenuItem20);

        jMenuItem21.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/lupa-16x16.png"))); // NOI18N
        jMenuItem21.setText("Buscar");
        MenuAdminRestaurantes.add(jMenuItem21);

        MenuItemNuevo15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/engranaje-16x16.png"))); // NOI18N
        MenuItemNuevo15.setText("Administar");
        MenuItemNuevo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo15ActionPerformed(evt);
            }
        });
        MenuAdminRestaurantes.add(MenuItemNuevo15);

        jMenuBar1.add(MenuAdminRestaurantes);

        MenuAdminUsuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/turista-20x20.png"))); // NOI18N
        MenuAdminUsuarios1.setText("Turista");
        MenuAdminUsuarios1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        MenuItemNuevo19.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/nuevo-16x16.png"))); // NOI18N
        MenuItemNuevo19.setText("Nuevo");
        MenuItemNuevo19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo19ActionPerformed(evt);
            }
        });
        MenuAdminUsuarios1.add(MenuItemNuevo19);

        jMenuItem26.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/modificar-16x16.png"))); // NOI18N
        jMenuItem26.setText("Modificar");
        MenuAdminUsuarios1.add(jMenuItem26);

        jMenuItem27.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/lupa-16x16.png"))); // NOI18N
        jMenuItem27.setText("Buscar");
        MenuAdminUsuarios1.add(jMenuItem27);

        MenuItemNuevo20.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/engranaje-16x16.png"))); // NOI18N
        MenuItemNuevo20.setText("Administar");
        MenuItemNuevo20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo20ActionPerformed(evt);
            }
        });
        MenuAdminUsuarios1.add(MenuItemNuevo20);

        jMenuBar1.add(MenuAdminUsuarios1);

        MenuAdminUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/usuario-20x20.png"))); // NOI18N
        MenuAdminUsuarios.setText("Usuarios");
        MenuAdminUsuarios.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        MenuItemNuevo10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/nuevo-16x16.png"))); // NOI18N
        MenuItemNuevo10.setText("Nuevo");
        MenuItemNuevo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo10ActionPerformed(evt);
            }
        });
        MenuAdminUsuarios.add(MenuItemNuevo10);

        jMenuItem22.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/modificar-16x16.png"))); // NOI18N
        jMenuItem22.setText("Modificar");
        MenuAdminUsuarios.add(jMenuItem22);

        jMenuItem23.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/lupa-16x16.png"))); // NOI18N
        jMenuItem23.setText("Buscar");
        MenuAdminUsuarios.add(jMenuItem23);

        MenuItemNuevo16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/engranaje-16x16.png"))); // NOI18N
        MenuItemNuevo16.setText("Administar");
        MenuItemNuevo16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo16ActionPerformed(evt);
            }
        });
        MenuAdminUsuarios.add(MenuItemNuevo16);

        jMenuBar1.add(MenuAdminUsuarios);

        MenuAdminCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/candado-20x20-.png"))); // NOI18N
        MenuAdminCuentas.setText("Cuentas");
        MenuAdminCuentas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        MenuItemNuevo11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/nuevo-16x16.png"))); // NOI18N
        MenuItemNuevo11.setText("Nuevo");
        MenuItemNuevo11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo11ActionPerformed(evt);
            }
        });
        MenuAdminCuentas.add(MenuItemNuevo11);

        jMenuItem24.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/modificar-16x16.png"))); // NOI18N
        jMenuItem24.setText("Modificar");
        MenuAdminCuentas.add(jMenuItem24);

        jMenuItem25.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/lupa-16x16.png"))); // NOI18N
        jMenuItem25.setText("Buscar");
        MenuAdminCuentas.add(jMenuItem25);

        MenuItemNuevo17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/engranaje-16x16.png"))); // NOI18N
        MenuItemNuevo17.setText("Administar");
        MenuItemNuevo17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo17ActionPerformed(evt);
            }
        });
        MenuAdminCuentas.add(MenuItemNuevo17);

        jMenuBar1.add(MenuAdminCuentas);

        MenuAdminCuentas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/ruta-20x20.png"))); // NOI18N
        MenuAdminCuentas1.setText("Rutas");
        MenuAdminCuentas1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        MenuItemNuevo21.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/nuevo-16x16.png"))); // NOI18N
        MenuItemNuevo21.setText("Nuevo");
        MenuItemNuevo21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo21ActionPerformed(evt);
            }
        });
        MenuAdminCuentas1.add(MenuItemNuevo21);

        jMenuItem28.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/modificar-16x16.png"))); // NOI18N
        jMenuItem28.setText("Modificar");
        MenuAdminCuentas1.add(jMenuItem28);

        jMenuItem29.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMenuItem29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/lupa-16x16.png"))); // NOI18N
        jMenuItem29.setText("Buscar");
        MenuAdminCuentas1.add(jMenuItem29);

        MenuItemNuevo22.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuItemNuevo22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/engranaje-16x16.png"))); // NOI18N
        MenuItemNuevo22.setText("Administar");
        MenuItemNuevo22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNuevo22ActionPerformed(evt);
            }
        });
        MenuAdminCuentas1.add(MenuItemNuevo22);

        jMenuBar1.add(MenuAdminCuentas1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo1ActionPerformed
       
    }//GEN-LAST:event_MenuItemNuevo1ActionPerformed

    private void MenuItemNuevo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo7ActionPerformed

    private void MenuItemNuevo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo8ActionPerformed

    private void MenuItemNuevo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo9ActionPerformed

    private void MenuItemNuevo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo10ActionPerformed

    private void MenuItemNuevo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo11ActionPerformed

    private void MenuItemNuevo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo12ActionPerformed

    private void MenuItemNuevo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo13ActionPerformed

    private void MenuItemNuevo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo14ActionPerformed

    private void MenuItemNuevo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo15ActionPerformed

    private void MenuItemNuevo16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo16ActionPerformed

    private void MenuItemNuevo17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo17ActionPerformed

    private void MNuevositioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNuevositioActionPerformed
        M1_SitioNuevo sit = new M1_SitioNuevo();
        JInternalFrame iframe = new JInternalFrame();
        sit.setUs(this.getUs());
        iframe.add(sit);
        iframe.pack();
        iframe.setVisible(true);
        iframe.setResizable(false);
        iframe.setClosable(true);
        this.principal.add(iframe);
    }//GEN-LAST:event_MNuevositioActionPerformed

    private void MenuItemNuevo18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo18ActionPerformed

    private void MenuItemNuevo19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo19ActionPerformed

    private void MenuItemNuevo20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo20ActionPerformed

    private void MenuItemNuevo21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo21ActionPerformed

    private void MenuItemNuevo22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNuevo22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemNuevo22ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MNuevositio;
    private javax.swing.JMenu MenuAdminCuentas;
    private javax.swing.JMenu MenuAdminCuentas1;
    private javax.swing.JMenu MenuAdminHoteles;
    private javax.swing.JMenu MenuAdminHoteles1;
    private javax.swing.JMenu MenuAdminRestaurantes;
    private javax.swing.JMenu MenuAdminTiendas;
    private javax.swing.JMenu MenuAdminTrasporte;
    private javax.swing.JMenu MenuAdminUsuarios;
    private javax.swing.JMenu MenuAdminUsuarios1;
    private javax.swing.JMenu MenuInicio;
    private javax.swing.JMenuItem MenuItemNuevo1;
    private javax.swing.JMenuItem MenuItemNuevo10;
    private javax.swing.JMenuItem MenuItemNuevo11;
    private javax.swing.JMenuItem MenuItemNuevo12;
    private javax.swing.JMenuItem MenuItemNuevo13;
    private javax.swing.JMenuItem MenuItemNuevo14;
    private javax.swing.JMenuItem MenuItemNuevo15;
    private javax.swing.JMenuItem MenuItemNuevo16;
    private javax.swing.JMenuItem MenuItemNuevo17;
    private javax.swing.JMenuItem MenuItemNuevo18;
    private javax.swing.JMenuItem MenuItemNuevo19;
    private javax.swing.JMenuItem MenuItemNuevo20;
    private javax.swing.JMenuItem MenuItemNuevo21;
    private javax.swing.JMenuItem MenuItemNuevo22;
    private javax.swing.JMenuItem MenuItemNuevo7;
    private javax.swing.JMenuItem MenuItemNuevo8;
    private javax.swing.JMenuItem MenuItemNuevo9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    public static javax.swing.JDesktopPane principal;
    // End of variables declaration//GEN-END:variables

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }
}
