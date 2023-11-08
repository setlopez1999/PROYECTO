package Ventanas;

import Entidades.Admin;
import Entidades.Casual;
import Entidades.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;


public class VENT_LOGIN extends javax.swing.JFrame {

    List<Casual> listaUsuarios = new ArrayList<>();
    Casual usuarioLogueado;
    int indice;
    int x,y;
    public VENT_LOGIN() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        ojo1.setVisible(false);
        AgregarUsuario("set","","73666628");
        Inicializar();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        lblEntrar = new javax.swing.JLabel();
        ojo1 = new javax.swing.JLabel();
        ojo = new javax.swing.JLabel();
        panelBarra = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEntrar.setBackground(new java.awt.Color(100, 50, 100, 80));
        lblEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEntrar.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setText("ENTRAR");
        lblEntrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel1.add(lblEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 250, 40));

        ojo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ojo_1.png"))); // NOI18N
        ojo1.setText("OJO");
        ojo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ojo1MouseClicked(evt);
            }
        });
        jPanel1.add(ojo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 30, -1));

        ojo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ojo_0.png"))); // NOI18N
        ojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ojoMouseClicked(evt);
            }
        });
        jPanel1.add(ojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 30, 20));

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
                .addContainerGap(921, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(btnCerrar))
        );

        jPanel1.add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 40));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(true);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 240, 20));

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContraseña.setBorder(null);
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 210, -1));

        Mensaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 450, 20));

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
        Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

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

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Aqui recibiremos la clave y usuario y comprobaremos que este en la base de datos
    public void Inicializar(){
        txtContraseña.setText("");
        txtUsuario.setText("");
        Mensaje.setText("");
        txtUsuario.grabFocus();
    }
    
    
    
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
        if(txtUsuario.getText().equals(""))
            return;
            
        if(ValidarUsuario()){
            //Si entramos entonces si existe el usuario
            usuarioLogueado = listaUsuarios.get(indice);
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
        lblEntrar.setOpaque(true);

        repaint();
    }//GEN-LAST:event_lblEntrarMouseEntered

    private void lblEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseExited
        // TODO add your handling code here:
        lblEntrar.setOpaque(false);

        repaint();
    }//GEN-LAST:event_lblEntrarMouseExited

    private void ojo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojo1MouseClicked
        //se ve
        ojo.setVisible(true);
        ojo1.setVisible(false);
        //ahora no se ve
        txtContraseña.setEchoChar('*');
        repaint();
    }//GEN-LAST:event_ojo1MouseClicked

    private void ojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojoMouseClicked
        // no se ve
        ojo.setVisible(false);
        ojo1.setVisible(true);
        //ahora si se ve
        txtContraseña.setEchoChar('\u0000');
        repaint();
    }//GEN-LAST:event_ojoMouseClicked
    
    public void AgregarUsuario(String nombre, String contraseña, String dni){
        //Agregamos un usaurio
        Casual nuevoUser = new Casual(nombre,contraseña,dni);
        listaUsuarios.add(nuevoUser);
        
        
    }
    public void Salir(){
        this.dispose();
    }
    
    public String ExtraerPass(char[] xd){
        String contra="";
        //Obtenemos la contraseña
        for(int i = 0 ; i< xd.length ;i++){
            contra += xd[i];
        }  
        return contra;
    }
    
    public boolean ValidarUsuario(){
        int value1 = 0;
        int value2 = 0;
        
        //Obtenemos la el usuario
        String usuario = txtUsuario.getText();
        
        String contra = "";
        
        contra = ExtraerPass(txtContraseña.getPassword());
        
        //Buscamos si existe el usuario
        if (listaUsuarios != null){
            //Verificamos si el usuario existe
            for(int i = 0 ;i<listaUsuarios.size();i++){
                Usuario usuarioActual = listaUsuarios.get(i);
                
                //Si coincide un usuario, establecemos value1 = 1
                if(usuarioActual.getNombre().equals(usuario)){
                    value1 = 1;
                    //Verificamos la contraseña
                    if (usuarioActual.getContraseña().equals(contra)){
                        indice = i;
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

    public boolean ValidarDNI(String dni,JLabel Mensaje){
        //Verificamos condiciones
        // Tenga 8 digitos
        if(dni.length()<8 || dni.equals("")){
            Mensaje.setText("El dni debe tener 8 digitos");
            return false;
        }
        // Contenga numeros
        char[] dniLetras= dni.toCharArray();
        for(int i = 0; i<8 ;i++){
            if(!Character.isDigit(dniLetras[i])){
                Mensaje.setText("Escriba un DNI valido");
                return false;
            }
        }
        
        // Que pueda contener al 0 como primer numero
        return true;
    }
    
    public boolean ValidarNombre(String nombre,JLabel Mensaje){
        //verificamos que no este regsitrado
        if(nombre.equals("")){
            Mensaje.setText("Nombre de Usuario Vacio");
            return false;
        }
        for(int i=0;i<listaUsuarios.size();i++){
            if(listaUsuarios.get(indice).getNombre().equals(nombre)){
                Mensaje.setText("Nombre de Usuario ya registrado");
                return false;
            }
        }
        //devuelve true si el nombre no se repite
        return true;
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel btnCerrar;
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
    private javax.swing.JLabel ojo;
    private javax.swing.JLabel ojo1;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JLabel registrar;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
