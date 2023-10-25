
package Ventanas;

import Entidades.Usuario;
import java.awt.Color;
import java.util.List;


public class VENT_LOGIN extends javax.swing.JFrame {

    List<Usuario> listaUsuarios;
    Usuario usuarioLogueado;
    int x,y;
    public VENT_LOGIN() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        panelBarra = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnEntrarr = new javax.swing.JPanel();
        lblEntrar = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        Mensaje = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
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
                .addContainerGap(916, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 40));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, -1, -1));

        btnEntrarr.setBackground(new java.awt.Color(51, 102, 255));

        lblEntrar.setBackground(new java.awt.Color(255, 255, 255));
        lblEntrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setText("ENTRAR");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jPanel1.add(btnEntrarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 250, 40));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(true);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 240, 20));

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContraseña.setBorder(null);
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 240, -1));

        Mensaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 450, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/blanco.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/blanco.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, -1, -1));

        registrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registrar.setForeground(new java.awt.Color(0, 0, 102));
        registrar.setText("REGISTRAR");
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
        });
        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 80, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PARA MICROEMPRENDEDORES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CAPACITACIÓN TRIBUTARIA  ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Fondo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Aqui recibiremos la clave y usuario y comprobaremos que este en la base de datos
    
    
    
    
    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked
        // TODO add your handling code here:
        VENT_REGISTRAR vent = new VENT_REGISTRAR(this);
    }//GEN-LAST:event_registrarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        //Cerramos el proceso
        System.exit(0);
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

    private void lblEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseClicked
        // 
        if(true){
            //Si entramos entonces si existe el usuario
            VENT_PRINCIPAL vent = new VENT_PRINCIPAL(usuarioLogueado,this);
            this.dispose();
        }
    }//GEN-LAST:event_lblEntrarMouseClicked

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        // TODO add your handling code here:
        
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelBarraMousePressed

    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        // Mover ventana
        int Xmouse, Ymouse;
        
        Xmouse = evt.getXOnScreen();
        Ymouse = evt.getYOnScreen();
        
        this.setLocation(Xmouse-x,Ymouse-y);
    }//GEN-LAST:event_panelBarraMouseDragged

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
    
    public void Salir(){
        this.dispose();
    }
    public boolean ValidarUsuario(){
        int value1 = 0;
        int value2 = 0;
        String usuario = txtUsuario.getText();
        String contra="";
        char [] xd = txtContraseña.getPassword();
        for(int i = 0 ; i< xd.length ;i++){
            contra += xd[i];
        }
        if (listaUsuarios != null){
            //Verificamos si el usuario existe
            for(int i = 0 ;i<listaUsuarios.size();i++){
                Usuario usuarioActual = listaUsuarios.get(i);
                if(usuarioActual.getNombre()== usuario){
                    value1 = 1;
                    //Verificamos la contraseña
                    if (usuarioActual.getContraseña()== contra){
                        value2 = 1;
                    }
                }
            }
        }
        
        if(value1 == 0 && value2 == 0){
            Mensaje.setText("Usuario no encontrado");
        }
        if(value1 == 1 && value2 == 0){
            Mensaje.setText("Contraseña incorrecta");
        }
        
        return value1 == 1 && value2 == 1;
    }

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JPanel btnEntrarr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JLabel registrar;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
