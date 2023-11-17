/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Entidades.Comandos;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class VentSimulador extends javax.swing.JFrame {

    VentPrincipal padre;
    boolean PanelActivo = true;
    
    /**
     * Creates new form VENT_SIMULADOR
     */
    public VentSimulador(VentPrincipal padre) {
        initComponents();
        this.padre = padre;
    }

    Comandos comand = new Comandos();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        Panel = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        cboPeriodo = new javax.swing.JComboBox<>();
        cboRegimen = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        cboImpuesto = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        cboDeclaracion = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        btnNo = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        lblInfoPeriodo = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        btnSi = new javax.swing.JRadioButton();
        lblInfoRegimen = new javax.swing.JLabel();
        lblInfoDeclaracion = new javax.swing.JLabel();
        lblInfoImpuesto = new javax.swing.JLabel();
        btnCompletar = new javax.swing.JButton();
        lblImpuestoInfo = new javax.swing.JLabel();
        lblRegimenInfo = new javax.swing.JLabel();
        asd = new javax.swing.JLabel();
        lblPeriodoInfo = new javax.swing.JLabel();
        lblDeclaracionInfo = new javax.swing.JLabel();
        lblPreg1Info = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lblInfoVentas = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtVentasIGV = new javax.swing.JTextField();
        txtVentasNeto = new javax.swing.JTextField();
        txtCompras10 = new javax.swing.JTextField();
        lblInfoCompras = new javax.swing.JLabel();
        txtComprasTotal = new javax.swing.JTextField();
        txtVentasTotal = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtComprasNeto = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtComprasIGV = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        btnCompletar1 = new javax.swing.JButton();
        lblComprasInfo = new javax.swing.JLabel();
        lblVentasInfo = new javax.swing.JLabel();
        lblErrorVentas = new javax.swing.JLabel();
        lblErrorCompras = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel50 = new javax.swing.JLabel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel52 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jLabel74 = new javax.swing.JLabel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txtIngresosNetoIGV = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        txtIngresosNeto = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        btnCompletar3 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        lblPorcentajeInfo = new javax.swing.JLabel();
        lblIngresosNetoInfo = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        lblErrorIngresos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Panel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        txtIgvPagar = new javax.swing.JTextField();
        txtRentaPagar = new javax.swing.JTextField();
        txtRentaSaldo = new javax.swing.JTextField();
        txtIgvSaldo = new javax.swing.JTextField();
        txtRentaImpuesto = new javax.swing.JTextField();
        txtIgvImpuesto = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        lblBandejaInfo = new javax.swing.JLabel();
        lblSaldoInfo = new javax.swing.JLabel();
        lblValidarInfo = new javax.swing.JLabel();
        btnCompletar4 = new javax.swing.JButton();
        panelBarra = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        btnVolver.setBackground(new java.awt.Color(100, 50, 100, 00));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setText("VOLVER");
        btnVolver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnVolver.setOpaque(true);
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });

        Panel.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setEditable(false);
        jTextField2.setText("Soles");
        jPanel6.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        cboPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Periodo", "07/2023", "08/2023", "09/2023", "10/2023", "11/2023", "12/2023" }));
        jPanel6.add(cboPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        cboRegimen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Régimen", "Régimen General", "Régimen Especial", "Régimen Tributario MYPE" }));
        jPanel6.add(cboRegimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        jLabel38.setText("Periodo Tributario");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel39.setText("Tipo de moneda");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        cboImpuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IGV - Cuenta propia tasa 18%", "IGV Tasa Especial 10%" }));
        jPanel6.add(cboImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel40.setText("Impuesto a la Renta/Régimen de Renta: ");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel41.setText("Impuesto general a las Ventas:");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        cboDeclaracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Original", "Rectificatoria", "Sustitutoria" }));
        jPanel6.add(cboDeclaracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel42.setText("Tipo de declaracion");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel43.setText("Moneda:");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        btnNo.setSelected(true);
        btnNo.setText("No");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });
        jPanel6.add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        jLabel28.setText("¿Presenta declaración sin movimiento?");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lblInfoPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgInfo.png"))); // NOI18N
        lblInfoPeriodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInfoPeriodoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInfoPeriodoMouseExited(evt);
            }
        });
        jPanel6.add(lblInfoPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel30.setText("Declaración:");
        jLabel30.setToolTipText("");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel44.setText("Periodo:");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        btnSi.setText("Si");
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });
        jPanel6.add(btnSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        lblInfoRegimen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgInfo.png"))); // NOI18N
        lblInfoRegimen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInfoRegimenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInfoRegimenMouseExited(evt);
            }
        });
        jPanel6.add(lblInfoRegimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        lblInfoDeclaracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgInfo.png"))); // NOI18N
        lblInfoDeclaracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInfoDeclaracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInfoDeclaracionMouseExited(evt);
            }
        });
        jPanel6.add(lblInfoDeclaracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        lblInfoImpuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgInfo.png"))); // NOI18N
        lblInfoImpuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInfoImpuestoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInfoImpuestoMouseExited(evt);
            }
        });
        jPanel6.add(lblInfoImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        btnCompletar.setText("Completar");
        btnCompletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletarActionPerformed(evt);
            }
        });
        jPanel6.add(btnCompletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));
        jPanel6.add(lblImpuestoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel6.add(lblRegimenInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        asd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgInfo.png"))); // NOI18N
        asd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                asdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                asdMouseExited(evt);
            }
        });
        jPanel6.add(asd, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, -1));
        jPanel6.add(lblPeriodoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel6.add(lblDeclaracionInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));
        jPanel6.add(lblPreg1Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, -1));

        Panel.addTab("1", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setText("TOTAL COMPRAS: ");
        jPanel7.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        jLabel48.setText("Ventas Netas Gravadas ");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel49.setText("Compras Netas Destinadas a vtas. gravadas ");
        jPanel7.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lblInfoVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgInfo.png"))); // NOI18N
        lblInfoVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInfoVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInfoVentasMouseExited(evt);
            }
        });
        jPanel7.add(lblInfoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        jLabel51.setText("TOTAL VENTAS: ");
        jPanel7.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        txtVentasIGV.setEditable(false);
        jPanel7.add(txtVentasIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 120, -1));

        txtVentasNeto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVentasNetoKeyPressed(evt);
            }
        });
        jPanel7.add(txtVentasNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 140, -1));
        jPanel7.add(txtCompras10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 140, -1));

        lblInfoCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgInfo.png"))); // NOI18N
        lblInfoCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInfoComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInfoComprasMouseExited(evt);
            }
        });
        jPanel7.add(lblInfoCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

        txtComprasTotal.setEditable(false);
        jPanel7.add(txtComprasTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 120, -1));

        txtVentasTotal.setEditable(false);
        jPanel7.add(txtVentasTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 120, -1));

        jLabel53.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel53.setText("Ventas");
        jPanel7.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtComprasNeto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComprasNetoKeyPressed(evt);
            }
        });
        jPanel7.add(txtComprasNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 140, -1));

        jLabel71.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel71.setText("Compras");
        jPanel7.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel72.setText("Compras Netas tasa 10% Ley N° 31556 \n");
        jPanel7.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 210, 20));

        txtComprasIGV.setEditable(false);
        jPanel7.add(txtComprasIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 120, -1));

        jTextField9.setEditable(false);
        jPanel7.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 120, -1));

        jLabel73.setText("(8% IGV + 2% IPM) destinadas a Vtas Gravadas ");
        jPanel7.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        btnCompletar1.setText("Completar");
        btnCompletar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletar1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnCompletar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));
        jPanel7.add(lblComprasInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));
        jPanel7.add(lblVentasInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));
        jPanel7.add(lblErrorVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));
        jPanel7.add(lblErrorCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        Panel.addTab("2", jPanel7);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel46.setText("Estado de Ganancia y Pérdida");
        jPanel9.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel47.setText("¿Ha presentado un Formulario PDT 625 con estado de Ganacias y Pérdidas actualizada al 31 de julio de este ejercicio?");
        jPanel9.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jRadioButton11.setText("No");
        jRadioButton11.setEnabled(false);
        jPanel9.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, -1, -1));

        jRadioButton12.setText("Si");
        jRadioButton12.setEnabled(false);
        jPanel9.add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        jRadioButton13.setText("No");
        jRadioButton13.setEnabled(false);
        jPanel9.add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        jRadioButton14.setText("Si");
        jRadioButton14.setEnabled(false);
        jPanel9.add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        jLabel50.setText("¿Suspendió sus pagos o cuentas hasta el mes de julio de acuerdo con el acápite del Articulo 85ºde la LIR?  ");
        jPanel9.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jRadioButton15.setText("No");
        jRadioButton15.setEnabled(false);
        jPanel9.add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        jLabel52.setText("¿El coeficiente del PDT 625 con Estado de Ganancias y Pérdidas al 31 de julio es menor al limite previsto en la tabla II");
        jPanel9.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jRadioButton16.setText("Si");
        jRadioButton16.setEnabled(false);
        jPanel9.add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, -1, -1));

        jRadioButton17.setText("No");
        jPanel9.add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, -1, -1));

        jLabel74.setText("¿Ha presentado un formulario 625 con estado de Ganacias y Perdidas  ");
        jPanel9.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jRadioButton18.setText("Si");
        jPanel9.add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, -1, -1));

        jLabel75.setText(" de Acápite del Articulo 85º de la LIR, correspondiente al mes en que afectuó la suspensión?  ");
        jPanel9.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel76.setText("Coeficiente - Art 85º inc a ");
        jPanel9.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jTextField33.setEditable(false);
        jPanel9.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 108, -1));

        jTextField34.setEditable(false);
        jTextField34.setText("1.0");
        jPanel9.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 108, -1));

        jLabel77.setText("Porcentaje - Art 85º inc b ");
        jPanel9.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        txtIngresosNetoIGV.setEditable(false);
        jPanel9.add(txtIngresosNetoIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 108, -1));

        jLabel78.setText("Ingresos Netos ");
        jPanel9.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        txtIngresosNeto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIngresosNetoKeyPressed(evt);
            }
        });
        jPanel9.add(txtIngresosNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 108, -1));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgInfo.png"))); // NOI18N
        jLabel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel79MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel79MouseExited(evt);
            }
        });
        jPanel9.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        btnCompletar3.setText("Completar");
        btnCompletar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletar3ActionPerformed(evt);
            }
        });
        jPanel9.add(btnCompletar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));

        jLabel80.setText(" actualizadas al 31 de julio con el que suspende sus pagos a cuenta?");
        jPanel9.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jPanel9.add(lblPorcentajeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));
        jPanel9.add(lblIngresosNetoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgInfo.png"))); // NOI18N
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel81MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel81MouseExited(evt);
            }
        });
        jPanel9.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));
        jPanel9.add(lblErrorIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        Panel.addTab("3", jPanel9);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 140, -1));
        jPanel5.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 140, -1));

        jTextField25.setEditable(false);
        jPanel5.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 140, -1));

        jTextField26.setEditable(false);
        jPanel5.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 140, -1));

        jTextField27.setEditable(false);
        jPanel5.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 140, -1));

        jTextField28.setEditable(false);
        jPanel5.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 140, -1));

        jLabel16.setText("SUB TOTAL ");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel17.setText("Pagos previos ");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel18.setText("Interés moratorio ");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jPanel3.setBackground(new java.awt.Color(225, 225, 225));

        jTextField30.setEditable(false);

        jTextField31.setEditable(false);

        jLabel19.setText("Importe a Pagar ");

        jLabel20.setText("Total Deuda Tributaria ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 630, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setText("Validar");
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setText("Agregar a bandeja");
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 143, -1));

        jLabel4.setText("Impuesto resultante o Saldo a favor ");

        jLabel6.setText("Saldo a favor del periodo anterior ");

        jLabel5.setText("Tributo a pagar o saldo a favor ");

        jLabel7.setText("Percepciones del período ");

        jLabel11.setText("Saldos de percepciones de períodos anteriores ");

        jLabel10.setText("Saldo de percepciones no aplicadas ");

        jLabel9.setText("Retenciones del período ");

        jLabel8.setText("Saldo de Retenciones de períodos anteriores ");

        jLabel12.setText("Saldo de retenciones no aplicadas ");

        jLabel13.setText("Compensación saldo a favor del exportador");

        jLabel15.setText("Impuestos temporal a los activos netos");

        jLabel14.setText("Pagos a Cuenta en Exceso");

        jTextField20.setEditable(false);

        jTextField19.setEditable(false);

        jTextField16.setEditable(false);

        txtIgvPagar.setEditable(false);

        txtRentaPagar.setEditable(false);

        txtRentaSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRentaSaldoKeyPressed(evt);
            }
        });

        txtIgvSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIgvSaldoKeyPressed(evt);
            }
        });

        txtRentaImpuesto.setEditable(false);

        txtIgvImpuesto.setEditable(false);

        jLabel59.setText("RENTA");

        jLabel58.setText("IGV");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(74, 74, 74)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(txtIgvPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRentaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(txtIgvSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRentaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(txtIgvImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRentaImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel58)
                .addGap(114, 114, 114)
                .addComponent(jLabel59)
                .addGap(61, 61, 61))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIgvImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRentaImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIgvSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRentaSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIgvPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRentaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(181, 181, 181))
        );

        jPanel5.add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 370));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText(" Aplicación de saldos a favor y otros créditos");
        jLabel21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel21KeyPressed(evt);
            }
        });
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgInfo.png"))); // NOI18N
        jLabel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel85MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel85MouseExited(evt);
            }
        });
        jPanel5.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, -1));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgInfo.png"))); // NOI18N
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel86MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel86MouseExited(evt);
            }
        });
        jPanel5.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 20, -1));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgInfo.png"))); // NOI18N
        jLabel87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel87MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel87MouseExited(evt);
            }
        });
        jPanel5.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, -1, -1));
        jPanel5.add(lblBandejaInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));
        jPanel5.add(lblSaldoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, -1));
        jPanel5.add(lblValidarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, -1, -1));

        btnCompletar4.setText("Completar");
        btnCompletar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletar4ActionPerformed(evt);
            }
        });
        jPanel5.add(btnCompletar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, -1, -1));

        jScrollPane2.setViewportView(jPanel5);

        Panel.addTab("4", jScrollPane2);

        panelBarra.setOpaque(false);
        panelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraMouseDragged(evt);
            }
        });
        panelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraMousePressed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(100, 50, 100, 00));
        btnCerrar.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setText("x");
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setOpaque(true);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addComponent(btnCerrar)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(794, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addComponent(panelBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(77, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 460, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(Color.red);
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(Color.blue);
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        if (btnNo.isSelected()){
            if (btnSi.isSelected()){
                btnSi.doClick(1);
            }
        }
    }//GEN-LAST:event_btnNoActionPerformed

    private void lblInfoPeriodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoPeriodoMouseEntered
        lblPeriodoInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblPeriodoInfo.png")));
    }//GEN-LAST:event_lblInfoPeriodoMouseEntered

    private void lblInfoPeriodoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoPeriodoMouseExited
        lblPeriodoInfo.setIcon(null);
    }//GEN-LAST:event_lblInfoPeriodoMouseExited

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
        if (btnSi.isSelected()){
            if (btnNo.isSelected()){
                btnNo.doClick(1);
            }
        }
    }//GEN-LAST:event_btnSiActionPerformed

    private void lblInfoRegimenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoRegimenMouseEntered
        lblRegimenInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblRegimenInfo.png")));
    }//GEN-LAST:event_lblInfoRegimenMouseEntered

    private void lblInfoRegimenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoRegimenMouseExited
        lblRegimenInfo.setIcon(null);
    }//GEN-LAST:event_lblInfoRegimenMouseExited

    private void lblInfoDeclaracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoDeclaracionMouseEntered
        lblDeclaracionInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblDeclaracionInfo.png")));
    }//GEN-LAST:event_lblInfoDeclaracionMouseEntered

    private void lblInfoDeclaracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoDeclaracionMouseExited
        lblDeclaracionInfo.setIcon(null);
    }//GEN-LAST:event_lblInfoDeclaracionMouseExited

    private void lblInfoImpuestoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoImpuestoMouseEntered
        lblImpuestoInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblImpuestoInfo.png")));
    }//GEN-LAST:event_lblInfoImpuestoMouseEntered

    private void lblInfoImpuestoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoImpuestoMouseExited
        lblImpuestoInfo.setIcon(null);
    }//GEN-LAST:event_lblInfoImpuestoMouseExited

    private void btnCompletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletarActionPerformed
        boolean completo = true;

        if (completo){
            if (cboPeriodo.getSelectedIndex() == 0){
                lblPeriodoInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblPeriodoInfo.png")));
                cboPeriodo.setBackground(Color.getHSBColor(360, 62, 96));
                completo = false;
                return;
            }
            else {
                lblPeriodoInfo.setIcon(null);
                cboPeriodo.setBackground(Color.WHITE);
                completo = true;
            }
        }

        if (completo){
            if (cboDeclaracion.getSelectedIndex() != 0){
                lblDeclaracionInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblDeclaracionInfo.png")));
                cboDeclaracion.setBackground(Color.getHSBColor(360, 62, 96));
                completo = false;
                return;
            }
            else {
                lblDeclaracionInfo.setIcon(null);
                cboDeclaracion.setBackground(Color.WHITE);
                completo = true;
            }
        }

        if (completo){
            if (cboRegimen.getSelectedIndex() == 3){
                lblRegimenInfo.setIcon(null);
                cboRegimen.setBackground(Color.WHITE);
                completo = true;
            }
            else {
                lblRegimenInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblRegimenInfo.png")));
                cboRegimen.setBackground(Color.getHSBColor(360, 62, 96));
                completo = false;
                return;
            }
        }

        if (completo){
            if (cboImpuesto.getSelectedIndex() != 0){
                lblImpuestoInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblImpuestoInfo.png")));
                cboImpuesto.setBackground(Color.getHSBColor(360, 62, 96));
                completo = false;
                return;
            }
            else {
                lblImpuestoInfo.setIcon(null);
                cboImpuesto.setBackground(Color.WHITE);
                completo = true;
            }
        }

        if (completo){
            cboPeriodo.setEnabled(false);
            cboDeclaracion.setEnabled(false);
            cboRegimen.setEnabled(false);
            cboImpuesto.setEnabled(false);

            JOptionPane.showMessageDialog(null,
                "La pantalla se completo y los datos se guardaron.",
                "Pantalla Completada",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,
                "Hay datos que son incorrectos.",
                "Pantalla Completada",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCompletarActionPerformed

    private void asdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asdMouseEntered
        lblVentasInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblVentasInfo.png")));
    }//GEN-LAST:event_asdMouseEntered

    private void asdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asdMouseExited
        lblVentasInfo.setIcon(null);
    }//GEN-LAST:event_asdMouseExited

    private void lblInfoVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoVentasMouseEntered
        lblVentasInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblVentasInfo.png")));
    }//GEN-LAST:event_lblInfoVentasMouseEntered

    private void lblInfoVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoVentasMouseExited
        lblVentasInfo.setIcon(null);
    }//GEN-LAST:event_lblInfoVentasMouseExited

    private void txtVentasNetoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentasNetoKeyPressed
        lblErrorVentas.setText("");
        try{
            int ventas = Integer.parseInt(txtVentasNeto.getText());
            txtVentasIGV.setText(String.valueOf(Math.round(ventas * 0.18)));
            txtVentasTotal.setText(String.valueOf(Math.round(ventas * 0.18)));
        } catch (NumberFormatException ex){
            lblErrorVentas.setText("Ingrese números");
        } finally {
            System.out.println("Se ingreso valor String en la variable ventas de tipo int");
        }
    }//GEN-LAST:event_txtVentasNetoKeyPressed

    private void lblInfoComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoComprasMouseEntered
        lblComprasInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblComprasInfo.png")));
    }//GEN-LAST:event_lblInfoComprasMouseEntered

    private void lblInfoComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoComprasMouseExited
        lblComprasInfo.setIcon(null);
    }//GEN-LAST:event_lblInfoComprasMouseExited

    private void txtComprasNetoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComprasNetoKeyPressed
        lblErrorCompras.setText("");
        try{
            int compras = Integer.parseInt(txtComprasNeto.getText());
            txtComprasIGV.setText(String.valueOf(Math.round(compras * 0.18)));
            txtComprasTotal.setText(String.valueOf(Math.round(compras * 0.18)));
        } catch (NumberFormatException ex){
            lblErrorCompras.setText("Ingrese números");
        } finally {
            System.out.println("Se ingreso valor String en la variable compras de tipo int");
        }
    }//GEN-LAST:event_txtComprasNetoKeyPressed

    private void btnCompletar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletar1ActionPerformed
        boolean completo = true;
        if (completo){
            if (txtVentasNeto.getText().equals("")){
                lblVentasInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblVentasInfo.png")));
                txtVentasNeto.setBackground(Color.getHSBColor(360, 62, 96));
                completo = false;
                return;
            }
            else {
                lblVentasInfo.setIcon(null);
                txtVentasNeto.setBackground(Color.WHITE);
                completo = true;
            }
        }

        if (completo){
            if (txtComprasNeto.getText().equals("")){
                lblComprasInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblComprasInfo.png")));
                txtComprasNeto.setBackground(Color.getHSBColor(360, 62, 96));
                completo = false;
                return;
            }
            else {
                lblComprasInfo.setIcon(null);
                txtComprasNeto.setBackground(Color.WHITE);
                completo = true;
            }
        }

        if (completo){
            if (!txtCompras10.getText().equals("")){
                txtCompras10.setBackground(Color.getHSBColor(360, 62, 96));
                completo = false;
                return;
            }
            else {
                txtCompras10.setBackground(Color.WHITE);
                completo = true;
            }
        }

        if (completo){
            int a = Integer.parseInt(txtVentasTotal.getText());
            int b = Integer.parseInt(txtComprasTotal.getText());
            txtIgvImpuesto.setText(String.valueOf(a - b));

            txtVentasNeto.setEditable(false);
            txtCompras10.setEditable(false);
            txtComprasNeto.setEditable(false);

            JOptionPane.showMessageDialog(null,
                "La pantalla se completo y los datos se guardaron.",
                "Pantalla Completada",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,
                "Hay datos que son incorrectos.",
                "Pantalla Completada",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCompletar1ActionPerformed

    private void txtIngresosNetoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresosNetoKeyPressed
        lblErrorIngresos.setText("");
        try{
            int ingresos = Integer.parseInt(txtIngresosNeto.getText());
            txtIngresosNetoIGV.setText(String.valueOf(Math.round(ingresos * 0.01)));
            txtRentaImpuesto.setText(String.valueOf(Math.round(ingresos * 0.01)));
        } catch (NumberFormatException ex){
            lblErrorIngresos.setText("Ingrese números");
        } finally {
            System.out.println("Se ingreso valor String en la variable ingresos de tipo int");
        }
    }//GEN-LAST:event_txtIngresosNetoKeyPressed

    private void jLabel79MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseEntered
        lblPorcentajeInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblPorcentajeInfo.png")));
    }//GEN-LAST:event_jLabel79MouseEntered

    private void jLabel79MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseExited
        lblPorcentajeInfo.setIcon(null);
    }//GEN-LAST:event_jLabel79MouseExited

    private void btnCompletar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletar3ActionPerformed
        boolean completo = true;

        if (completo){
            if (txtIngresosNeto.getText().equals("")){
                lblIngresosNetoInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblIngresosNetoInfo.png")));
                txtIngresosNeto.setBackground(Color.getHSBColor(360, 62, 96));
                completo = false;
                return;
            }
            else {
                lblIngresosNetoInfo.setIcon(null);
                txtIngresosNeto.setBackground(Color.WHITE);
                completo = true;
            }
        }

        if (completo){
            txtIngresosNeto.setEditable(false);

            JOptionPane.showMessageDialog(null,
                "La pantalla se completo y los datos se guardaron.",
                "Pantalla Completada",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,
                "Hay datos que son incorrectos.",
                "Pantalla Completada",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCompletar3ActionPerformed

    private void jLabel81MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseEntered
        lblIngresosNetoInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblIngresosNetoInfo.png")));
    }//GEN-LAST:event_jLabel81MouseEntered

    private void jLabel81MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseExited
        lblIngresosNetoInfo.setIcon(null);
    }//GEN-LAST:event_jLabel81MouseExited

    private void txtRentaSaldoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRentaSaldoKeyPressed
        try{
            int impRenta = Integer.parseInt(txtRentaImpuesto.getText());
            int saldoRenta = Integer.parseInt(txtRentaSaldo.getText());
            txtRentaPagar.setText(String.valueOf(saldoRenta - impRenta));
        } catch (NumberFormatException ex){
            System.out.println("Se ingreso valor String en la variable saldoRenta de tipo int");
        } finally {

        }
    }//GEN-LAST:event_txtRentaSaldoKeyPressed

    private void txtIgvSaldoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIgvSaldoKeyPressed
        try{
            int impIgv = Integer.parseInt(txtIgvImpuesto.getText());
            int saldoIgv = Integer.parseInt(txtIgvSaldo.getText());
            txtIgvPagar.setText(String.valueOf(saldoIgv - impIgv));
        } catch (NumberFormatException ex){
            System.out.println("Se ingreso valor String en la variable saldoIgv de tipo int");
        } finally {

        }
    }//GEN-LAST:event_txtIgvSaldoKeyPressed

    private void jLabel21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel21KeyPressed
        if (PanelActivo){
            Panel1.setVisible(false);
            PanelActivo = false;
        }
        else {
            Panel1.setVisible(true);
            PanelActivo = true;
        }
    }//GEN-LAST:event_jLabel21KeyPressed

    private void jLabel85MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel85MouseEntered
        lblSaldoInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblSaldoInfo.png")));
    }//GEN-LAST:event_jLabel85MouseEntered

    private void jLabel85MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel85MouseExited
        lblSaldoInfo.setIcon(null);
    }//GEN-LAST:event_jLabel85MouseExited

    private void jLabel86MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseEntered
        lblBandejaInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblBandejaInfo.png")));
    }//GEN-LAST:event_jLabel86MouseEntered

    private void jLabel86MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseExited
        lblBandejaInfo.setIcon(null);
    }//GEN-LAST:event_jLabel86MouseExited

    private void jLabel87MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel87MouseEntered
        lblValidarInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblValidarInfo.png")));
    }//GEN-LAST:event_jLabel87MouseEntered

    private void jLabel87MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel87MouseExited
        lblValidarInfo.setIcon(null);
    }//GEN-LAST:event_jLabel87MouseExited

    private void btnCompletar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletar4ActionPerformed
        boolean completo = true;

        if (completo){
            if (txtIgvSaldo.getText().equals("")){
                lblSaldoInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblIngresosNetoInfo.png")));
                txtIgvSaldo.setBackground(Color.getHSBColor(360, 62, 96));
                completo = false;
                return;
            }
            else {
                lblIngresosNetoInfo.setIcon(null);
                txtIgvSaldo.setBackground(Color.WHITE);
                completo = true;
            }
        }

        if (completo){
            if (txtRentaSaldo.getText().equals("")){
                lblSaldoInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lblIngresosNetoInfo.png")));
                txtRentaSaldo.setBackground(Color.getHSBColor(360, 62, 96));
                completo = false;
                return;
            }
            else {
                lblIngresosNetoInfo.setIcon(null);
                txtRentaSaldo.setBackground(Color.WHITE);
                completo = true;
            }
        }

        if (completo){
            txtIgvSaldo.setEditable(false);
            txtRentaSaldo.setEditable(false);

            JOptionPane.showMessageDialog(null,
                "La pantalla se completo y los datos se guardaron.",
                "Pantalla Completada",
                JOptionPane.INFORMATION_MESSAGE);
            VentReconocimiento reconocimiento = new VentReconocimiento(padre);
            reconocimiento.setLocationRelativeTo(null);
            reconocimiento.setVisible(true);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null,
                "Hay datos que son incorrectos.",
                "Pantalla Completada",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCompletar4ActionPerformed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        //Cerramos el proceso
        comand.TerminarProceso();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        // Entra al panel boton
        comand.BotonSeleccionado(btnCerrar, jPanel1);

    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        // Sale al panel boton
        comand.BotonNoSeleccionado(btnCerrar, jPanel1);
    }//GEN-LAST:event_btnCerrarMouseExited

    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        // Mover ventana
        comand.MovemosPosVentana(
            this, evt.getXOnScreen(), evt.getYOnScreen());

    }//GEN-LAST:event_panelBarraMouseDragged

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        // TODO add your handling code here:
        comand.GuardamosPosMouse(evt.getX(), evt.getY());
    }//GEN-LAST:event_panelBarraMousePressed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Panel;
    private javax.swing.JPanel Panel1;
    private javax.swing.JLabel asd;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnCompletar;
    private javax.swing.JButton btnCompletar1;
    private javax.swing.JButton btnCompletar3;
    private javax.swing.JButton btnCompletar4;
    private javax.swing.JRadioButton btnNo;
    private javax.swing.JRadioButton btnSi;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JComboBox<String> cboDeclaracion;
    private javax.swing.JComboBox<String> cboImpuesto;
    private javax.swing.JComboBox<String> cboPeriodo;
    private javax.swing.JComboBox<String> cboRegimen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblBandejaInfo;
    private javax.swing.JLabel lblComprasInfo;
    private javax.swing.JLabel lblDeclaracionInfo;
    private javax.swing.JLabel lblErrorCompras;
    private javax.swing.JLabel lblErrorIngresos;
    private javax.swing.JLabel lblErrorVentas;
    private javax.swing.JLabel lblImpuestoInfo;
    private javax.swing.JLabel lblInfoCompras;
    private javax.swing.JLabel lblInfoDeclaracion;
    private javax.swing.JLabel lblInfoImpuesto;
    private javax.swing.JLabel lblInfoPeriodo;
    private javax.swing.JLabel lblInfoRegimen;
    private javax.swing.JLabel lblInfoVentas;
    private javax.swing.JLabel lblIngresosNetoInfo;
    private javax.swing.JLabel lblPeriodoInfo;
    private javax.swing.JLabel lblPorcentajeInfo;
    private javax.swing.JLabel lblPreg1Info;
    private javax.swing.JLabel lblRegimenInfo;
    private javax.swing.JLabel lblSaldoInfo;
    private javax.swing.JLabel lblValidarInfo;
    private javax.swing.JLabel lblVentasInfo;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JTextField txtCompras10;
    private javax.swing.JTextField txtComprasIGV;
    private javax.swing.JTextField txtComprasNeto;
    private javax.swing.JTextField txtComprasTotal;
    private javax.swing.JTextField txtIgvImpuesto;
    private javax.swing.JTextField txtIgvPagar;
    private javax.swing.JTextField txtIgvSaldo;
    private javax.swing.JTextField txtIngresosNeto;
    private javax.swing.JTextField txtIngresosNetoIGV;
    private javax.swing.JTextField txtRentaImpuesto;
    private javax.swing.JTextField txtRentaPagar;
    private javax.swing.JTextField txtRentaSaldo;
    private javax.swing.JTextField txtVentasIGV;
    private javax.swing.JTextField txtVentasNeto;
    private javax.swing.JTextField txtVentasTotal;
    // End of variables declaration//GEN-END:variables
}
