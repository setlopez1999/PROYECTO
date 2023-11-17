package Ventanas;

import Entidades.Comandos;
import java.awt.Color;

/**
 *
 * @author HP
 */
public class VentReconocimiento extends javax.swing.JFrame {

    VentPrincipal padre;
    
    /**
     * Creates new form FrameReconocimiento
     */
    public VentReconocimiento(VentPrincipal padre) {
        initComponents();
        this.padre = padre;
    }

    Comandos comand = new Comandos();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBarra = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNomUsuario = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel22.setText("RECONOCIMIENTO");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel23.setText("<html>TE FELICITAMOS POR COMPLETA <br/>SATISFACTORIAMENTE EL SIMULADOR</html>");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel22))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblNomUsuario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(panelBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(panelBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVolver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnSalir)))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        padre.setLocationRelativeTo(null);
        padre.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblNomUsuario;
    private javax.swing.JPanel panelBarra;
    // End of variables declaration//GEN-END:variables
}
