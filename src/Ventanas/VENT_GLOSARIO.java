/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import javax.swing.JLabel;

/**
 *
 * @author ESTUDIANTE
 */
public class VENT_GLOSARIO extends javax.swing.JFrame {

    VENT_PRINCIPAL padre;
    int x,y;
    
    public VENT_GLOSARIO(VENT_PRINCIPAL padre) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        this.padre = padre;
        IniciarGlosarios();
        
        
    }
    
    public void IniciarGlosarios(){
        tema1.setModel(
                padre.biblioteca.CrearGlosario(
                        padre.biblioteca.getTemas().get(0), 1));
        tema2.setModel(
                padre.biblioteca.CrearGlosario(
                        padre.biblioteca.getTemas().get(1), 2));
        tema3.setModel(
                padre.biblioteca.CrearGlosario(
                        padre.biblioteca.getTemas().get(2), 3));
        tema4.setModel(
                padre.biblioteca.CrearGlosario(
                        padre.biblioteca.getTemas().get(3), 4));
    }
    
    public void Mousedentro(JLabel e){
        e.setBackground(new java.awt.Color(100, 50, 100, 100));
        repaint();
    }
    public void Mousefuera(JLabel e){
        e.setBackground(new java.awt.Color(100, 50, 100, 0));
        repaint();
    }
    
    public void Salir(){
        this.dispose();
        padre.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAcerca = new javax.swing.JLabel();
        tema1 = new javax.swing.JList<>();
        tema2 = new javax.swing.JList<>();
        tema3 = new javax.swing.JList<>();
        tema4 = new javax.swing.JList<>();
        panelAjustes = new javax.swing.JPanel();
        btnFav7 = new javax.swing.JLabel();
        btnFav14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelBarra = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAcerca.setBackground(new java.awt.Color(100, 50, 100, 00));
        btnAcerca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAcerca.setForeground(new java.awt.Color(255, 255, 255));
        btnAcerca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAcerca.setText("VOLVER");
        btnAcerca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnAcerca.setOpaque(true);
        btnAcerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcercaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAcercaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAcercaMouseExited(evt);
            }
        });
        jPanel1.add(btnAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 600, 180, 40));

        tema1.setBackground(new java.awt.Color(100, 50, 100, 00));
        tema1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        tema1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tema1.setForeground(new java.awt.Color(255, 255, 255));
        tema1.setOpaque(false);
        tema1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tema1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tema1MouseMoved(evt);
            }
        });
        jPanel1.add(tema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 170, 430));

        tema2.setBackground(new java.awt.Color(100, 50, 100, 00));
        tema2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        tema2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tema2.setForeground(new java.awt.Color(255, 255, 255));
        tema2.setOpaque(false);
        tema2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tema2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tema2MouseMoved(evt);
            }
        });
        jPanel1.add(tema2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 170, 430));

        tema3.setBackground(new java.awt.Color(100, 50, 100, 00));
        tema3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        tema3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tema3.setForeground(new java.awt.Color(255, 255, 255));
        tema3.setOpaque(false);
        tema3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tema3MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tema3MouseMoved(evt);
            }
        });
        jPanel1.add(tema3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 170, 430));

        tema4.setBackground(new java.awt.Color(100, 50, 100, 00));
        tema4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        tema4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tema4.setForeground(new java.awt.Color(255, 255, 255));
        tema4.setOpaque(false);
        tema4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tema4MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tema4MouseMoved(evt);
            }
        });
        jPanel1.add(tema4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 170, 430));

        panelAjustes.setBackground(new java.awt.Color(100, 50, 100, 70));

        btnFav7.setBackground(new java.awt.Color(100, 50, 100, 00));
        btnFav7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFav7.setForeground(new java.awt.Color(255, 255, 255));
        btnFav7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFav7.setText("VENTAJAS DE LA FORMALIDAD");
        btnFav7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnFav7.setOpaque(true);
        btnFav7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFav7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFav7MouseExited(evt);
            }
        });

        btnFav14.setBackground(new java.awt.Color(100, 50, 100, 00));
        btnFav14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnFav14.setForeground(new java.awt.Color(255, 255, 255));
        btnFav14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFav14.setText("GLOSARIO");
        btnFav14.setOpaque(true);
        btnFav14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFav14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFav14MouseExited(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout panelAjustesLayout = new javax.swing.GroupLayout(panelAjustes);
        panelAjustes.setLayout(panelAjustesLayout);
        panelAjustesLayout.setHorizontalGroup(
            panelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAjustesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAjustesLayout.createSequentialGroup()
                        .addGap(1246, 1246, 1246)
                        .addComponent(btnFav7, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFav14, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAjustesLayout.setVerticalGroup(
            panelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAjustesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnFav14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAjustesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAjustesLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnFav7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1110, 110));

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
        btnCerrar.setFont(new java.awt.Font("OCR A Extended", 0, 30)); // NOI18N
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
                .addContainerGap(1166, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fdf.png"))); // NOI18N
        Fondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnAcercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaMouseClicked

        Salir();
    }//GEN-LAST:event_btnAcercaMouseClicked

    private void btnAcercaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaMouseEntered
        Mousedentro(btnAcerca);
    }//GEN-LAST:event_btnAcercaMouseEntered

    private void btnAcercaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaMouseExited
        Mousefuera(btnAcerca);
    }//GEN-LAST:event_btnAcercaMouseExited

    private void tema1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema1MouseDragged
        repaint();
    }//GEN-LAST:event_tema1MouseDragged

    private void tema1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema1MouseMoved
        repaint();
    }//GEN-LAST:event_tema1MouseMoved

    private void btnFav7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFav7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFav7MouseEntered

    private void btnFav7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFav7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFav7MouseExited

    private void btnFav14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFav14MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFav14MouseEntered

    private void btnFav14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFav14MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFav14MouseExited

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

    private void tema2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_tema2MouseDragged

    private void tema2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tema2MouseMoved

    private void tema3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema3MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_tema3MouseDragged

    private void tema3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tema3MouseMoved

    private void tema4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema4MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_tema4MouseDragged

    private void tema4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tema4MouseMoved

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel btnAcerca;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnFav14;
    private javax.swing.JLabel btnFav7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelAjustes;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JList<String> tema1;
    private javax.swing.JList<String> tema2;
    private javax.swing.JList<String> tema3;
    private javax.swing.JList<String> tema4;
    // End of variables declaration//GEN-END:variables
}
