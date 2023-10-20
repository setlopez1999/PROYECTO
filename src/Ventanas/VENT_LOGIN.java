
package Ventanas;


public class VENT_LOGIN extends javax.swing.JFrame {

    
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
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        registrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 83, -1, -1));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 175, 250, -1));

        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 306, 250, 36));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 250, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 149, -1, -1));

        registrar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        registrar.setForeground(new java.awt.Color(0, 51, 153));
        registrar.setText("Registrar");
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
        });
        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 221, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PARA MICROEMPRENDEDORES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 81, -1, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CAPACITACIÓN TRIBUTARIA  ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 29, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, -1, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        // Entramos
        //AbrimosPrincipal
        
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked
        // TODO add your handling code here:
        VENT_REGISTRAR vent = new VENT_REGISTRAR();
    }//GEN-LAST:event_registrarMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel registrar;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
