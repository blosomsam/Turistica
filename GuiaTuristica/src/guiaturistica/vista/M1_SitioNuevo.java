package guiaturistica.vista;

import guiaturistica.Util.JPAUtil;
import guiaturistica.controlador.SitioJpaControl;
import guiaturistica.modelo.Sitio;
import guiaturistica.modelo.Usuario;
import javax.swing.JOptionPane;

/**
 * @author sandrojc
 */

public class M1_SitioNuevo extends javax.swing.JPanel {

    Sitio sit;
    SitioJpaControl sitjpa;
    private Usuario us;
    
    public M1_SitioNuevo() {
        initComponents();
        
    }
    
    public Sitio cargarDatos(){
        sit = new Sitio();
        sit.setNombreSitio(JTextNombreSitio.getText());
        sit.setDescripcionSitio(JTxtADescripcion.getText());
        sit.setDireccionSitio(JTextDireccion.getText());
        sit.setCaracteristicasSitio(JTxtACaracteristicas.getText());
        sit.setDistanciaSitio(JTextDistancia.getText());
        sit.setClimaSitio(JTextClima.getText());
        sit.setServiciosSitio(ButRadioTV.getText());
        sit.setTelefonoCelularSitio(JTextTelefonoCelular.getText());
        sit.setTelefonoCasaSitio(JTextTelefonoLugar.getText());
        sit.setPersona(this.getUs());   
        return sit;
    }
    
    private void limpiar(){        
        JTextNombreSitio.setText("");
        JTextDistancia.setText("");
        JTxtADescripcion.setText("");
        JTxtACaracteristicas.setText("");
        JTextClima.setText("");
        ButRadioTV.resetKeyboardActions();
        JTextTelefonoCelular.setText("");
        JTextTelefonoLugar.setText("");
        JTextDireccion.setText("");
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelServicios = new javax.swing.JPanel();
        ButRadioEstacionamiento = new javax.swing.JRadioButton();
        ButRadioAparcamiento = new javax.swing.JRadioButton();
        ButRadioInternet = new javax.swing.JRadioButton();
        ButRadioPiscina = new javax.swing.JRadioButton();
        ButRadioBar = new javax.swing.JRadioButton();
        ButRadioJuegos = new javax.swing.JRadioButton();
        ButRadioCalefaccion = new javax.swing.JRadioButton();
        ButRadioCanchas = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        ButRadioTobogan = new javax.swing.JRadioButton();
        ButRadioSalaEventos = new javax.swing.JRadioButton();
        ButRadioTV = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTxtACaracteristicas = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTxtADescripcion = new javax.swing.JTextArea();
        BtnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        PanelDatosGenerales = new javax.swing.JPanel();
        JTextTelefonoCelular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTextTelefonoLugar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTextDistancia = new javax.swing.JTextField();
        JTextNombreSitio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTextDireccion = new javax.swing.JTextField();
        JTextClima = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        PanelServicios.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Servicios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 0, 102))); // NOI18N
        PanelServicios.setForeground(new java.awt.Color(102, 0, 102));

        ButRadioEstacionamiento.setText("restaurant");
        ButRadioEstacionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRadioEstacionamientoActionPerformed(evt);
            }
        });

        ButRadioAparcamiento.setText("aparcamiento");
        ButRadioAparcamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRadioAparcamientoActionPerformed(evt);
            }
        });

        ButRadioInternet.setText("internet");
        ButRadioInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRadioInternetActionPerformed(evt);
            }
        });

        ButRadioPiscina.setText("piscina");
        ButRadioPiscina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRadioPiscinaActionPerformed(evt);
            }
        });

        ButRadioBar.setText("bar");
        ButRadioBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRadioBarActionPerformed(evt);
            }
        });

        ButRadioJuegos.setText("juegos");
        ButRadioJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRadioJuegosActionPerformed(evt);
            }
        });

        ButRadioCalefaccion.setText("calefacción");
        ButRadioCalefaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRadioCalefaccionActionPerformed(evt);
            }
        });

        ButRadioCanchas.setText("canchas");
        ButRadioCanchas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRadioCanchasActionPerformed(evt);
            }
        });

        jRadioButton9.setText("Tobogan");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        ButRadioTobogan.setText("cabañas");
        ButRadioTobogan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRadioToboganActionPerformed(evt);
            }
        });

        ButRadioSalaEventos.setText("sala eventos");
        ButRadioSalaEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRadioSalaEventosActionPerformed(evt);
            }
        });

        ButRadioTV.setText("TV/Cable");
        ButRadioTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRadioTVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelServiciosLayout = new javax.swing.GroupLayout(PanelServicios);
        PanelServicios.setLayout(PanelServiciosLayout);
        PanelServiciosLayout.setHorizontalGroup(
            PanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelServiciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButRadioAparcamiento)
                    .addComponent(ButRadioEstacionamiento)
                    .addComponent(ButRadioInternet)
                    .addComponent(ButRadioPiscina)
                    .addComponent(ButRadioBar)
                    .addComponent(ButRadioSalaEventos))
                .addGap(18, 18, 18)
                .addGroup(PanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButRadioTV)
                    .addComponent(ButRadioTobogan)
                    .addComponent(jRadioButton9)
                    .addComponent(ButRadioCanchas)
                    .addComponent(ButRadioCalefaccion)
                    .addComponent(ButRadioJuegos))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        PanelServiciosLayout.setVerticalGroup(
            PanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelServiciosLayout.createSequentialGroup()
                .addGroup(PanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButRadioAparcamiento)
                    .addComponent(ButRadioJuegos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButRadioEstacionamiento)
                    .addComponent(ButRadioCalefaccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButRadioInternet)
                    .addComponent(ButRadioCanchas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButRadioPiscina)
                    .addComponent(jRadioButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButRadioBar)
                    .addComponent(ButRadioTobogan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButRadioSalaEventos)
                    .addComponent(ButRadioTV))
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Descripción:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Características:");

        JTxtACaracteristicas.setColumns(20);
        JTxtACaracteristicas.setRows(5);
        jScrollPane1.setViewportView(JTxtACaracteristicas);

        jLabel10.setBackground(new java.awt.Color(0, 204, 255));
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("URW Bookman L", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("TURISTICOS");

        JTxtADescripcion.setColumns(20);
        JTxtADescripcion.setRows(5);
        jScrollPane2.setViewportView(JTxtADescripcion);

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

        PanelDatosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Datos generales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 0, 102))); // NOI18N
        PanelDatosGenerales.setForeground(new java.awt.Color(102, 0, 102));

        JTextTelefonoCelular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Distancia");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Dirección:");

        JTextTelefonoLugar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        JTextTelefonoLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextTelefonoLugarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Clima:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        JTextDistancia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        JTextNombreSitio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Telf. Célular:");

        JTextDireccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        JTextDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextDireccionActionPerformed(evt);
            }
        });

        JTextClima.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Telf. Lugar:");

        javax.swing.GroupLayout PanelDatosGeneralesLayout = new javax.swing.GroupLayout(PanelDatosGenerales);
        PanelDatosGenerales.setLayout(PanelDatosGeneralesLayout);
        PanelDatosGeneralesLayout.setHorizontalGroup(
            PanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosGeneralesLayout.createSequentialGroup()
                        .addComponent(JTextNombreSitio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(PanelDatosGeneralesLayout.createSequentialGroup()
                        .addGroup(PanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextTelefonoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextClima, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))))
                .addGap(66, 66, 66)
                .addGroup(PanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTextDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextTelefonoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDatosGeneralesLayout.setVerticalGroup(
            PanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextNombreSitio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(JTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTextTelefonoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(JTextTelefonoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(PanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTextClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(JTextDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/hojas.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("URW Bookman L", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("REGISTRO DE SITIOS ");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(PanelServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelDatosGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel11)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelDatosGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(BtnSalir))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            cargarDatos();
            sitjpa = new SitioJpaControl(JPAUtil.getEntityManagerFactory());
            sit = cargarDatos();
            sitjpa.crear(sit);

            JOptionPane.showMessageDialog(null, " Guardado correctamente");
            limpiar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"); 
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void JTextTelefonoLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextTelefonoLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextTelefonoLugarActionPerformed

    private void JTextDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextDireccionActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void ButRadioTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRadioTVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButRadioTVActionPerformed

    private void ButRadioSalaEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRadioSalaEventosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButRadioSalaEventosActionPerformed

    private void ButRadioToboganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRadioToboganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButRadioToboganActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void ButRadioCanchasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRadioCanchasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButRadioCanchasActionPerformed

    private void ButRadioCalefaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRadioCalefaccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButRadioCalefaccionActionPerformed

    private void ButRadioJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRadioJuegosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButRadioJuegosActionPerformed

    private void ButRadioBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRadioBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButRadioBarActionPerformed

    private void ButRadioPiscinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRadioPiscinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButRadioPiscinaActionPerformed

    private void ButRadioInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRadioInternetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButRadioInternetActionPerformed

    private void ButRadioAparcamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRadioAparcamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButRadioAparcamientoActionPerformed

    private void ButRadioEstacionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRadioEstacionamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButRadioEstacionamientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalir;
    private javax.swing.JRadioButton ButRadioAparcamiento;
    private javax.swing.JRadioButton ButRadioBar;
    private javax.swing.JRadioButton ButRadioCalefaccion;
    private javax.swing.JRadioButton ButRadioCanchas;
    private javax.swing.JRadioButton ButRadioEstacionamiento;
    private javax.swing.JRadioButton ButRadioInternet;
    private javax.swing.JRadioButton ButRadioJuegos;
    private javax.swing.JRadioButton ButRadioPiscina;
    private javax.swing.JRadioButton ButRadioSalaEventos;
    private javax.swing.JRadioButton ButRadioTV;
    private javax.swing.JRadioButton ButRadioTobogan;
    private javax.swing.JTextField JTextClima;
    private javax.swing.JTextField JTextDireccion;
    private javax.swing.JTextField JTextDistancia;
    private javax.swing.JTextField JTextNombreSitio;
    private javax.swing.JTextField JTextTelefonoCelular;
    private javax.swing.JTextField JTextTelefonoLugar;
    private javax.swing.JTextArea JTxtACaracteristicas;
    private javax.swing.JTextArea JTxtADescripcion;
    private javax.swing.JPanel PanelDatosGenerales;
    private javax.swing.JPanel PanelServicios;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }
}
