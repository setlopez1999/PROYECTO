package Ventanas;

import Entidades.Comandos;

/**
 *
 * @author ESTUDIANTE
 */
public class VENT_TEMA extends javax.swing.JFrame {
    VENT_PRINCIPAL padre ;
    int x,y;
    public VENT_TEMA(VENT_PRINCIPAL padre) {
        initComponents();
        this.padre = padre;
        this.setVisible(true);
        this.setLocationRelativeTo(null);    
        //tema4.setVisible(false);
    }
    
    Comandos comand = new Comandos();
    public void Salir(){
        this.dispose();
        this.padre.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        panelAjustes1 = new javax.swing.JPanel();
        tema4 = new javax.swing.JLabel();
        tema2 = new javax.swing.JLabel();
        tema3 = new javax.swing.JLabel();
        tema1 = new javax.swing.JLabel();
        panelAjustes = new javax.swing.JPanel();
        btnFav14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelBarra = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 600, 180, 40));

        panelAjustes1.setBackground(new java.awt.Color(100, 50, 100, 70));
        panelAjustes1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tema4.setBackground(new java.awt.Color(100, 50, 100, 00));
        tema4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tema4.setForeground(new java.awt.Color(255, 255, 255));
        tema4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tema4.setText("COMO TRIBUTAR");
        tema4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        tema4.setOpaque(true);
        tema4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tema4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tema4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tema4MouseExited(evt);
            }
        });
        panelAjustes1.add(tema4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 324, 139));

        tema2.setBackground(new java.awt.Color(100, 50, 100, 00));
        tema2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tema2.setForeground(new java.awt.Color(255, 255, 255));
        tema2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tema2.setText("<html>REQUISITOS <br>PARA FORMALIZAR</html>");
        tema2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        tema2.setOpaque(true);
        tema2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tema2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tema2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tema2MouseExited(evt);
            }
        });
        panelAjustes1.add(tema2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 324, 139));

        tema3.setBackground(new java.awt.Color(100, 50, 100, 00));
        tema3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tema3.setForeground(new java.awt.Color(255, 255, 255));
        tema3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tema3.setText("<html>INICIO DE LA <br>FORMALIZACION </html>");
        tema3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        tema3.setOpaque(true);
        tema3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tema3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tema3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tema3MouseExited(evt);
            }
        });
        panelAjustes1.add(tema3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 324, 139));

        tema1.setBackground(new java.awt.Color(100, 50, 100, 00));
        tema1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tema1.setForeground(new java.awt.Color(255, 255, 255));
        tema1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tema1.setText("<html>SITUACION ACTUAL<br>DEL PERU </html>");
        tema1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        tema1.setOpaque(true);
        tema1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tema1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tema1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tema1MouseExited(evt);
            }
        });
        panelAjustes1.add(tema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 324, 139));

        jPanel1.add(panelAjustes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1110, 430));

        panelAjustes.setBackground(new java.awt.Color(100, 50, 100, 70));

        btnFav14.setBackground(new java.awt.Color(100, 50, 100, 00));
        btnFav14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnFav14.setForeground(new java.awt.Color(255, 255, 255));
        btnFav14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFav14.setText("TEMAS");
        btnFav14.setOpaque(true);
        btnFav14.addMouseListener(new java.awt.event.MouseAdapter() {
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
                    .addComponent(btnFav14, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelAjustesLayout.setVerticalGroup(
            panelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAjustesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnFav14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

        btnCerrar.setBackground(new java.awt.Color(0, 0, 100, 00));
        btnCerrar.setFont(new java.awt.Font("OCR A Extended", 0, 30)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setText("x");
        btnCerrar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
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
                .addGap(0, 1166, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
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

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        //Cerramos el proceso
        System.exit(0);
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
                this,evt.getXOnScreen(),evt.getYOnScreen());
    }//GEN-LAST:event_panelBarraMouseDragged

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed

        comand.GuardamosPosMouse(evt.getX(),evt.getY());
    }//GEN-LAST:event_panelBarraMousePressed

    private void btnFav14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFav14MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFav14MouseExited

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        comand.BotonSeleccionado(btnVolver, jPanel1);
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        comand.BotonNoSeleccionado(btnVolver, jPanel1);
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        VENT_PRINCIPAL vent = 
                new VENT_PRINCIPAL(
                        padre.usuarioActual, padre.login);
        this.dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void tema4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema4MouseExited
        // TODO add your handling code here:
        
        comand.BotonNoSeleccionado(tema4, jPanel1);
 
    }//GEN-LAST:event_tema4MouseExited

    private void tema4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema4MouseEntered
        // TODO add your handling code here:
        comand.BotonSeleccionado(tema4, jPanel1);
    }//GEN-LAST:event_tema4MouseEntered

    private void tema2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema2MouseEntered
        // TODO add your handling code here:
        comand.BotonSeleccionado(tema2, jPanel1);
 
    }//GEN-LAST:event_tema2MouseEntered

    private void tema2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema2MouseExited
        // TODO add your handling code here:
        comand.BotonNoSeleccionado(tema2, jPanel1);
    }//GEN-LAST:event_tema2MouseExited

    private void tema3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema3MouseEntered
        comand.BotonSeleccionado(tema3, jPanel1);
 
    }//GEN-LAST:event_tema3MouseEntered
        
    private void tema3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema3MouseExited
        comand.BotonNoSeleccionado(tema3, jPanel1);
    }//GEN-LAST:event_tema3MouseExited

    private void tema1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema1MouseEntered
        // TODO add your handling code here:
        comand.BotonSeleccionado(tema1, jPanel1);
    }//GEN-LAST:event_tema1MouseEntered

    private void tema1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema1MouseExited
        // TODO add your handling code here:
        comand.BotonNoSeleccionado(tema1, jPanel1);
    }//GEN-LAST:event_tema1MouseExited

    private void tema1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema1MouseClicked
        //abrimos las ventana con la coleccion de tarjetas del primer tema
        comand.abrirTarjeta(padre,0, 0);
        this.dispose();
    }//GEN-LAST:event_tema1MouseClicked

    private void tema2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema2MouseClicked
        // TODO add your handling code here:
        comand.abrirTarjeta(padre,1, 0);
        this.dispose();
    }//GEN-LAST:event_tema2MouseClicked

    private void tema3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema3MouseClicked
        // TODO add your handling code here:
        comand.abrirTarjeta(padre,2, 0);
        this.dispose();
    }//GEN-LAST:event_tema3MouseClicked

    private void tema4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tema4MouseClicked
        // TODO add your handling code here:
        comand.abrirTarjeta(padre,3, 0);
        this.dispose();
    }//GEN-LAST:event_tema4MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnFav14;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelAjustes;
    private javax.swing.JPanel panelAjustes1;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JLabel tema1;
    private javax.swing.JLabel tema2;
    private javax.swing.JLabel tema3;
    private javax.swing.JLabel tema4;
    // End of variables declaration//GEN-END:variables
}
