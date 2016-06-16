/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaturistica.vista;

import guiaturistica.Util.JPAUtil;
import guiaturistica.controlador.HospedajeJpaControl;
import guiaturistica.controlador.SitioJpaControl;
import guiaturistica.modelo.Sitio;
import guiaturistica.modelo.Hospedaje;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sandrojc
 */
public class M2_HospedajeNuevo extends javax.swing.JInternalFrame {
    
    private HospedajeJpaControl hosjpa;
    private Hospedaje hos;
    
    
    /**
     * Creates new form M2_HotelNuevoo
     */
    public M2_HospedajeNuevo() {
        initComponents();
    }

    public Hospedaje cargarDatos() {
        SitioJpaControl sitjpa = new SitioJpaControl(JPAUtil.getEntityManagerFactory());
        Sitio sit;
        sit = sitjpa.buscarSitio(1l);

        hos = new Hospedaje();
        List<Hospedaje> lista = new ArrayList();

        hos.setCategoriaHospedaje(JCBCategoriaHospedaje.getText());
        hos.setCorreoElectronicoHospedaje(JFTCelularHospedaje.getText());
        hos.setDireccionHospedaje(JTFDireccionHospedaje.getText());
        hos.setNombreHospedaje(JTFNombreHospedaje.getText());
        hos.setServiciosHospedaje(JRBtnBar.getText());
        hos.setTelefonoCelularHospedaje(JFTCelularHospedaje.getText());
        hos.setTelefonoFijoHospedaje(JTFTelefonoHospedaje.getText());
        hos.setTipoHospedaje(JCBTipoHospedaj.getSelectedItem().toString());
        

        hosjpa = new HospedajeJpaControl(JPAUtil.getEntityManagerFactory());
        hosjpa.crear(hos);
        
        lista.add(hos);
        sit.setHospedaje(lista);
        
        
        
        return (hos);
    }

    private void limpiar() {
        JCBCategoriaHospedaj.toString();
        JFTCelularHospedaje.setText("");
        JTFDireccionHospedaje.setText("");
        JTFNombreHospedaje.setText("");
        hos.setServiciosHospedaje(JRBtnBar.getText());
        JFTCelularHospedaje.setText("");
        JTFTelefonoHospedaje.setText("");
        JCBTipoHospedaj.toString();
    }
        
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        JBtnExaminar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        JTFTelefonoHospedaje = new javax.swing.JTextField();
        JTFDireccionHospedaje = new javax.swing.JTextField();
        JTFNombreHospedaje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JPnlServicios = new javax.swing.JPanel();
        JRBtnInternet = new javax.swing.JRadioButton();
        JRBtnHabitacionDoble = new javax.swing.JRadioButton();
        JRBtnHabitacionSimple = new javax.swing.JRadioButton();
        JRBtnDucha = new javax.swing.JRadioButton();
        JRBtnEstacionamiento = new javax.swing.JRadioButton();
        JRBtnServicioHabitación = new javax.swing.JRadioButton();
        JRBtnTV = new javax.swing.JRadioButton();
        JRBtnSalonEventos = new javax.swing.JRadioButton();
        JRBtnBar = new javax.swing.JRadioButton();
        JRBtnRestaurante = new javax.swing.JRadioButton();
        JRBtnPicina = new javax.swing.JRadioButton();
        JRBtnKaraoke = new javax.swing.JRadioButton();
        JRBtnSauna = new javax.swing.JRadioButton();
        JRBtnTurco = new javax.swing.JRadioButton();
        JRBtnCanchas = new javax.swing.JRadioButton();
        JRBtnBaño = new javax.swing.JRadioButton();
        JCBCategoriaHospedaj = new javax.swing.JComboBox<>();
        jlabel = new javax.swing.JLabel();
        JCBTipoHospedaj = new javax.swing.JComboBox<>();
        jlabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JFTCelularHospedaje = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JTFCorreoHospedaje = new javax.swing.JTextField();
        JCBCategoriaHospedaje = new javax.swing.JTextField();
        JCBTipoHospedaje = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel10.setBackground(new java.awt.Color(0, 204, 255));
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JBtnExaminar.setFont(new java.awt.Font("Droid Sans Mono", 0, 12)); // NOI18N
        JBtnExaminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/lupa-16x16.png"))); // NOI18N
        JBtnExaminar.setText("Examinar");
        JBtnExaminar.setBorderPainted(false);
        JBtnExaminar.setRequestFocusEnabled(false);
        JBtnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnExaminarActionPerformed(evt);
            }
        });

        BtnGuardar.setFont(new java.awt.Font("Droid Sans Mono", 0, 12)); // NOI18N
        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/guardar-28x28.png"))); // NOI18N
        BtnGuardar.setText("guargar");
        BtnGuardar.setBorderPainted(false);
        BtnGuardar.setRequestFocusEnabled(false);
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
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

        JTFTelefonoHospedaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        JTFDireccionHospedaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        JTFNombreHospedaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Dirección:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Telefóno:");

        jLabel13.setFont(new java.awt.Font("URW Bookman L", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("REGISTRO DE ");

        jLabel11.setFont(new java.awt.Font("URW Bookman L", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("HOSPEDAJE ");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guiaturistica/imagenes/engranajes.png"))); // NOI18N

        JPnlServicios.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Servicios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 0, 12))); // NOI18N

        JRBtnInternet.setText("Internet");

        JRBtnHabitacionDoble.setText("Habitación doble");

        JRBtnHabitacionSimple.setText("Habitación simple");

        JRBtnDucha.setText("Ducha");

        JRBtnEstacionamiento.setText("Estacionamiento");

        JRBtnServicioHabitación.setText("Servicio a la habitación");

        JRBtnTV.setText("TV Cable");

        JRBtnSalonEventos.setText("Salón de eventos");

        JRBtnBar.setText("Bar");
        JRBtnBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBtnBarActionPerformed(evt);
            }
        });

        JRBtnRestaurante.setText("Restaurant");

        JRBtnPicina.setText("Picina");
        JRBtnPicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBtnPicinaActionPerformed(evt);
            }
        });

        JRBtnKaraoke.setText("Karaoke");
        JRBtnKaraoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBtnKaraokeActionPerformed(evt);
            }
        });

        JRBtnSauna.setText("Sauna");
        JRBtnSauna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBtnSaunaActionPerformed(evt);
            }
        });

        JRBtnTurco.setText("Turco");
        JRBtnTurco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBtnTurcoActionPerformed(evt);
            }
        });

        JRBtnCanchas.setText("Canchas");
        JRBtnCanchas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBtnCanchasActionPerformed(evt);
            }
        });

        JRBtnBaño.setText("Baño");

        javax.swing.GroupLayout JPnlServiciosLayout = new javax.swing.GroupLayout(JPnlServicios);
        JPnlServicios.setLayout(JPnlServiciosLayout);
        JPnlServiciosLayout.setHorizontalGroup(
            JPnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPnlServiciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRBtnHabitacionSimple)
                    .addComponent(JRBtnInternet)
                    .addComponent(JRBtnEstacionamiento)
                    .addComponent(JRBtnServicioHabitación)
                    .addComponent(JRBtnBar)
                    .addComponent(JRBtnKaraoke)
                    .addComponent(JRBtnSauna)
                    .addComponent(JRBtnCanchas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRBtnPicina)
                    .addComponent(JRBtnHabitacionDoble)
                    .addComponent(JRBtnTV)
                    .addComponent(JRBtnSalonEventos)
                    .addComponent(JRBtnRestaurante)
                    .addComponent(JRBtnTurco)
                    .addComponent(JRBtnDucha)
                    .addComponent(JRBtnBaño))
                .addContainerGap())
        );
        JPnlServiciosLayout.setVerticalGroup(
            JPnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPnlServiciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBtnHabitacionSimple)
                    .addComponent(JRBtnHabitacionDoble))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBtnInternet)
                    .addComponent(JRBtnBaño))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBtnEstacionamiento)
                    .addComponent(JRBtnTV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBtnServicioHabitación)
                    .addComponent(JRBtnSalonEventos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBtnBar)
                    .addComponent(JRBtnRestaurante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRBtnPicina)
                    .addComponent(JRBtnKaraoke))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBtnSauna)
                    .addComponent(JRBtnTurco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRBtnCanchas)
                    .addComponent(JRBtnDucha)))
        );

        JCBCategoriaHospedaj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5" }));

        jlabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlabel.setText("Categoría:");

        JCBTipoHospedaj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hotel", "Hostal", "Posada" }));

        jlabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlabel1.setText("Tipo:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Célular");

        JFTCelularHospedaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        JFTCelularHospedaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFTCelularHospedajeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Correo-e:");

        JTFCorreoHospedaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        JCBCategoriaHospedaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        JCBTipoHospedaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBtnExaminar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BtnSalir)
                                .addGap(18, 18, 18)
                                .addComponent(BtnGuardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlabel)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel3)
                                                .addComponent(jlabel1))
                                            .addGap(47, 47, 47)
                                            .addComponent(JCBTipoHospedaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(JCBTipoHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(109, 109, 109)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(JTFDireccionHospedaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(JTFTelefonoHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addComponent(JCBCategoriaHospedaj, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(JCBCategoriaHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(JTFNombreHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(JFTCelularHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JTFCorreoHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE))))
                    .addComponent(JPnlServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel11))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jlabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBTipoHospedaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCBTipoHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBCategoriaHospedaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCBCategoriaHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNombreHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFDireccionHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(JTFTelefonoHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JFTCelularHospedaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTFCorreoHospedaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBtnExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(JPnlServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(BtnGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnExaminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBtnExaminarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        try {
            cargarDatos();           
            
            
            
            JOptionPane.showMessageDialog(null, "Guardado");
            limpiar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+ e);
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void JRBtnBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBtnBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBtnBarActionPerformed

    private void JRBtnPicinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBtnPicinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBtnPicinaActionPerformed

    private void JRBtnKaraokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBtnKaraokeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBtnKaraokeActionPerformed

    private void JRBtnSaunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBtnSaunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBtnSaunaActionPerformed

    private void JRBtnTurcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBtnTurcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBtnTurcoActionPerformed

    private void JRBtnCanchasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBtnCanchasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBtnCanchasActionPerformed

    private void JFTCelularHospedajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFTCelularHospedajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFTCelularHospedajeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton JBtnExaminar;
    private javax.swing.JComboBox<String> JCBCategoriaHospedaj;
    private javax.swing.JTextField JCBCategoriaHospedaje;
    private javax.swing.JComboBox<String> JCBTipoHospedaj;
    private javax.swing.JTextField JCBTipoHospedaje;
    private javax.swing.JTextField JFTCelularHospedaje;
    private javax.swing.JPanel JPnlServicios;
    private javax.swing.JRadioButton JRBtnBar;
    private javax.swing.JRadioButton JRBtnBaño;
    private javax.swing.JRadioButton JRBtnCanchas;
    private javax.swing.JRadioButton JRBtnDucha;
    private javax.swing.JRadioButton JRBtnEstacionamiento;
    private javax.swing.JRadioButton JRBtnHabitacionDoble;
    private javax.swing.JRadioButton JRBtnHabitacionSimple;
    private javax.swing.JRadioButton JRBtnInternet;
    private javax.swing.JRadioButton JRBtnKaraoke;
    private javax.swing.JRadioButton JRBtnPicina;
    private javax.swing.JRadioButton JRBtnRestaurante;
    private javax.swing.JRadioButton JRBtnSalonEventos;
    private javax.swing.JRadioButton JRBtnSauna;
    private javax.swing.JRadioButton JRBtnServicioHabitación;
    private javax.swing.JRadioButton JRBtnTV;
    private javax.swing.JRadioButton JRBtnTurco;
    private javax.swing.JTextField JTFCorreoHospedaje;
    private javax.swing.JTextField JTFDireccionHospedaje;
    private javax.swing.JTextField JTFNombreHospedaje;
    private javax.swing.JTextField JTFTelefonoHospedaje;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel1;
    // End of variables declaration//GEN-END:variables

}
