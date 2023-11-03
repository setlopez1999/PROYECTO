package Ventanas;

import javax.swing.JLabel;

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
    }
   
    
    public void Salir(){
        this.dispose();
        this.padre.setVisible(true);
    }
    
    public void Mousedentro(JLabel e){
        e.setBackground(new java.awt.Color(100, 50, 100, 100));
        repaint();
    }
    public void Mousefuera(JLabel e){
        e.setBackground(new java.awt.Color(100, 50, 100, 0));
        repaint();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAcerca = new javax.swing.JLabel();
        panelAjustes1 = new javax.swing.JPanel();
        aaaa1 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        aa1 = new javax.swing.JLabel();
        aaa1 = new javax.swing.JLabel();
        aaaa = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        aa = new javax.swing.JLabel();
        aaa = new javax.swing.JLabel();
        bbbb = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        bb = new javax.swing.JLabel();
        bbb = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        ccc = new javax.swing.JLabel();
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

        panelAjustes1.setBackground(new java.awt.Color(100, 50, 100, 70));
        panelAjustes1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aaaa1.setBackground(new java.awt.Color(100, 50, 100, 00));
        aaaa1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        aaaa1.setForeground(new java.awt.Color(255, 255, 255));
        aaaa1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aaaa1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        aaaa1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        aaaa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aaaa1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aaaa1MouseExited(evt);
            }
        });
        panelAjustes1.add(aaaa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 324, 139));

        a1.setBackground(new java.awt.Color(100, 50, 100, 00));
        a1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        a1.setForeground(new java.awt.Color(255, 255, 255));
        a1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a1.setText("FORMALIZAR");
        a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a1MouseExited(evt);
            }
        });
        panelAjustes1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 210, 46));

        aa1.setBackground(new java.awt.Color(100, 50, 100, 00));
        aa1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        aa1.setForeground(new java.awt.Color(255, 255, 255));
        aa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aa1.setText(" REQUISITOS PARA");
        aa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aa1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aa1MouseExited(evt);
            }
        });
        panelAjustes1.add(aa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 220, 46));

        aaa1.setBackground(new java.awt.Color(100, 50, 100, 00));
        aaa1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        aaa1.setForeground(new java.awt.Color(255, 255, 255));
        aaa1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aaa1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        aaa1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        aaa1.setOpaque(true);
        aaa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aaa1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aaa1MouseExited(evt);
            }
        });
        panelAjustes1.add(aaa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 324, 139));

        aaaa.setBackground(new java.awt.Color(100, 50, 100, 00));
        aaaa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        aaaa.setForeground(new java.awt.Color(255, 255, 255));
        aaaa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aaaa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        aaaa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        aaaa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aaaaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aaaaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aaaaMouseExited(evt);
            }
        });
        panelAjustes1.add(aaaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 324, 139));

        a.setBackground(new java.awt.Color(100, 50, 100, 00));
        a.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setText("DEL PERU");
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aMouseExited(evt);
            }
        });
        panelAjustes1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 210, 46));

        aa.setBackground(new java.awt.Color(100, 50, 100, 00));
        aa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        aa.setForeground(new java.awt.Color(255, 255, 255));
        aa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aa.setText("ACTUALIDAD");
        aa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aaMouseExited(evt);
            }
        });
        panelAjustes1.add(aa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 230, 46));

        aaa.setBackground(new java.awt.Color(100, 50, 100, 00));
        aaa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        aaa.setForeground(new java.awt.Color(255, 255, 255));
        aaa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aaa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        aaa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        aaa.setOpaque(true);
        aaa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aaaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aaaMouseExited(evt);
            }
        });
        panelAjustes1.add(aaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 324, 139));

        bbbb.setBackground(new java.awt.Color(100, 50, 100, 00));
        bbbb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bbbb.setForeground(new java.awt.Color(255, 255, 255));
        bbbb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bbbb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        bbbb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bbbbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bbbbMouseExited(evt);
            }
        });
        panelAjustes1.add(bbbb, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 324, 139));

        b.setBackground(new java.awt.Color(100, 50, 100, 00));
        b.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b.setText(" INICIO A LA   ");
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bMouseExited(evt);
            }
        });
        panelAjustes1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 220, 46));

        bb.setBackground(new java.awt.Color(100, 50, 100, 00));
        bb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bb.setForeground(new java.awt.Color(255, 255, 255));
        bb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bb.setText("FORMALIDAD");
        bb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bbMouseExited(evt);
            }
        });
        panelAjustes1.add(bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 250, 46));

        bbb.setBackground(new java.awt.Color(100, 50, 100, 00));
        bbb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bbb.setForeground(new java.awt.Color(255, 255, 255));
        bbb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bbb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        bbb.setOpaque(true);
        bbb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bbbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bbbMouseExited(evt);
            }
        });
        panelAjustes1.add(bbb, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 324, 139));

        c.setBackground(new java.awt.Color(100, 50, 100, 00));
        c.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.setText("COMO TRIBUTAR");
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cMouseExited(evt);
            }
        });
        panelAjustes1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 250, 30));

        ccc.setBackground(new java.awt.Color(100, 50, 100, 00));
        ccc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ccc.setForeground(new java.awt.Color(255, 255, 255));
        ccc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ccc.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ccc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        ccc.setOpaque(true);
        ccc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cccMouseExited(evt);
            }
        });
        panelAjustes1.add(ccc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 324, 139));

        jPanel1.add(panelAjustes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1110, 430));

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
        btnFav14.setText("TEMAS");
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

    private void aaaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aaaMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_aaaMouseEntered

    private void aaaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aaaMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_aaaMouseExited

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

    private void bbbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbbMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bbbMouseEntered

    private void bbbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbbMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bbbMouseExited

    private void aMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_aMouseEntered

    private void aMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_aMouseExited

    private void aaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_aaMouseEntered

    private void aaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_aaMouseExited

    private void bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bMouseEntered

    private void bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bMouseExited

    private void bbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bbMouseEntered

    private void bbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bbMouseExited

    private void cccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cccMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cccMouseEntered

    private void cccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cccMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cccMouseExited

    private void cMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cMouseEntered

    private void cMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cMouseExited

    private void aaaaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aaaaMouseEntered
        Mousedentro(aaa);
    }//GEN-LAST:event_aaaaMouseEntered

    private void aaaaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aaaaMouseExited
        Mousefuera(aaa);
    }//GEN-LAST:event_aaaaMouseExited

    private void aaaa1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aaaa1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_aaaa1MouseEntered

    private void aaaa1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aaaa1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_aaaa1MouseExited

    private void a1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_a1MouseEntered

    private void a1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_a1MouseExited

    private void aa1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aa1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_aa1MouseEntered

    private void aa1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aa1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_aa1MouseExited

    private void aaa1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aaa1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_aaa1MouseEntered

    private void aaa1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aaa1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_aaa1MouseExited

    private void bbbbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbbbMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bbbbMouseEntered

    private void bbbbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbbbMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bbbbMouseExited

    private void btnAcercaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaMouseEntered
        Mousedentro(btnAcerca);
    }//GEN-LAST:event_btnAcercaMouseEntered

    private void btnAcercaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaMouseExited
        Mousefuera(btnAcerca);
    }//GEN-LAST:event_btnAcercaMouseExited

    private void btnAcercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaMouseClicked
        
        Salir();
    }//GEN-LAST:event_btnAcercaMouseClicked

    private void aaaaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aaaaMouseClicked
        // Abrimos el primer tema  ACTIVIDAD EN EL PERU
        VENT_TARJETA ventana = new VENT_TARJETA();
        
    }//GEN-LAST:event_aaaaMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel a;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel aa;
    private javax.swing.JLabel aa1;
    private javax.swing.JLabel aaa;
    private javax.swing.JLabel aaa1;
    private javax.swing.JLabel aaaa;
    private javax.swing.JLabel aaaa1;
    private javax.swing.JLabel b;
    private javax.swing.JLabel bb;
    private javax.swing.JLabel bbb;
    private javax.swing.JLabel bbbb;
    private javax.swing.JLabel btnAcerca;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnFav14;
    private javax.swing.JLabel btnFav7;
    private javax.swing.JLabel c;
    private javax.swing.JLabel ccc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelAjustes;
    private javax.swing.JPanel panelAjustes1;
    private javax.swing.JPanel panelBarra;
    // End of variables declaration//GEN-END:variables
}
