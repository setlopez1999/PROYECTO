
package Ventanas;

import Entidades.*;
import java.awt.Color;

/**
 *
 * @author ESTUDIANTE
 */
public class VENT_REGISTRAR extends javax.swing.JFrame {

    VENT_LOGIN padre ;
    int x,y;
    
    public VENT_REGISTRAR(VENT_LOGIN padre) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.padre = padre;
        ojo1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBarra = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        ojo = new javax.swing.JLabel();
        ojo1 = new javax.swing.JLabel();
        MensajeUser = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEntrarr1 = new javax.swing.JPanel();
        lblEntrar1 = new javax.swing.JLabel();
        btnEntrarr = new javax.swing.JPanel();
        lblEntrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnCerrar.setBackground(new java.awt.Color(0, 51, 204));
        btnCerrar.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setText("x");
        btnCerrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
                .addContainerGap(596, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 40));

        ojo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ojo_0.png"))); // NOI18N
        ojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ojoMouseClicked(evt);
            }
        });
        jPanel1.add(ojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 30, 20));

        ojo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ojo_1.png"))); // NOI18N
        ojo1.setText("OJO");
        ojo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ojo1MouseClicked(evt);
            }
        });
        jPanel1.add(ojo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 30, -1));

        MensajeUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MensajeUser.setForeground(new java.awt.Color(255, 255, 255));
        MensajeUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(MensajeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 270, 20));

        Mensaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 250, 410, 20));

        txtDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDNI.setBorder(null);
        txtDNI.setOpaque(true);
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 240, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/blanco.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DNI");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(true);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 240, 20));

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContraseña.setBorder(null);
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 210, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/blanco.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/blanco.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 80, -1));

        btnEntrarr1.setBackground(new java.awt.Color(204, 0, 51));

        lblEntrar1.setBackground(new java.awt.Color(255, 255, 255));
        lblEntrar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEntrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar1.setText("ATRAS");
        lblEntrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEntrar1.setOpaque(true);
        lblEntrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEntrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEntrar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEntrarr1Layout = new javax.swing.GroupLayout(btnEntrarr1);
        btnEntrarr1.setLayout(btnEntrarr1Layout);
        btnEntrarr1Layout.setHorizontalGroup(
            btnEntrarr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEntrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        btnEntrarr1Layout.setVerticalGroup(
            btnEntrarr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEntrar1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnEntrarr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 250, 40));

        btnEntrarr.setBackground(new java.awt.Color(51, 102, 255));

        lblEntrar.setBackground(new java.awt.Color(255, 255, 255));
        lblEntrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setText("REGISTRAR");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEntrar.setOpaque(true);
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEntrarrLayout = new javax.swing.GroupLayout(btnEntrarr);
        btnEntrarr.setLayout(btnEntrarrLayout);
        btnEntrarrLayout.setHorizontalGroup(
            btnEntrarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        btnEntrarrLayout.setVerticalGroup(
            btnEntrarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnEntrarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 250, 40));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRAR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Registro.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseClicked
        Mensaje.setText(""); 
        MensajeUser.setText("");
        //agregamos el usuario a la lista de usuarios
        String nombre = txtUsuario.getText();
        String dni = txtDNI.getText();
        char[] pass = txtContraseña.getPassword();
        String contraseña = padre.ExtraerPass(pass);
        
        if(padre.ValidarNombre(nombre,MensajeUser)&&
                padre.ValidarDNI(dni,Mensaje)&& 
                !contraseña.equals("")){   
            //creamos la cuenta
            Casual nuevaCuenta = new Casual(nombre, contraseña, dni);
            //ahora la agregamos ala lista
            padre.listaUsuarios.add(nuevaCuenta);
            //ahora cerramos la ventana                                                                                                                                                           
            Salir();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
        }
    }//GEN-LAST:event_lblEntrarMouseClicked

    private void lblEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseEntered
        //
        lblEntrar.setOpaque(false);
        lblEntrar.setForeground(Color.WHITE);
        repaint();
    }//GEN-LAST:event_lblEntrarMouseEntered

    private void lblEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseExited
        // TODO add your handling code here:
        lblEntrar.setOpaque(true);
        lblEntrar.setForeground(Color.BLACK);
        repaint();
    }//GEN-LAST:event_lblEntrarMouseExited

    private void lblEntrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrar1MouseClicked
        Salir();
        
    }//GEN-LAST:event_lblEntrar1MouseClicked

    private void lblEntrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrar1MouseEntered
        // TODO add your handling code here:
        lblEntrar1.setOpaque(false);
        lblEntrar1.setForeground(Color.WHITE);
        repaint();
    }//GEN-LAST:event_lblEntrar1MouseEntered

    private void lblEntrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrar1MouseExited
        // TODO add your handling code here:
        lblEntrar1.setOpaque(true);
        lblEntrar1.setForeground(Color.BLACK);
        repaint();
    }//GEN-LAST:event_lblEntrar1MouseExited

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        //Cerramos el proceso
        Salir();
        
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        // Entra al panel boton
        btnCerrar.setOpaque(true);
        repaint();

    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        // Sale al panel boton
        btnCerrar.setOpaque(false);
        repaint();
    }//GEN-LAST:event_btnCerrarMouseExited

    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        // Mover ventana
        int Xmouse, Ymouse;

        Xmouse = evt.getXOnScreen();
        Ymouse = evt.getYOnScreen();

        this.setLocation(Xmouse-x,Ymouse-y);
    }//GEN-LAST:event_panelBarraMouseDragged

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        // TODO add your handling code here:

        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelBarraMousePressed

    private void ojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojoMouseClicked
        // no se ve
        ojo.setVisible(false);
        ojo1.setVisible(true);
        //ahora si se ve
        txtContraseña.setEchoChar('\u0000');
        repaint();
    }//GEN-LAST:event_ojoMouseClicked

    private void ojo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojo1MouseClicked
        //se ve
        ojo.setVisible(true);
        ojo1.setVisible(false);
        //ahora no se ve
        txtContraseña.setEchoChar('*');
        repaint();
    }//GEN-LAST:event_ojo1MouseClicked

    public void Salir(){
        this.dispose();
        padre.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel MensajeUser;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JPanel btnEntrarr;
    private javax.swing.JPanel btnEntrarr1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblEntrar1;
    private javax.swing.JLabel ojo;
    private javax.swing.JLabel ojo1;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
