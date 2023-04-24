/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import MODEL.ClientesDAORelacional;
import MODEL.ProductosDAORelacional;
import MODEL.clientesM;
import MODEL.productosM;
import java.awt.Color;


public class EliC extends javax.swing.JFrame {
int xMouse, yMouse;
    public EliC() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inisiar1 = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        j_generoC = new javax.swing.JTextField();
        j_nitC = new javax.swing.JTextField();
        c1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        j_codigoC = new javax.swing.JTextField();
        v1 = new javax.swing.JLabel();
        j_correoC = new javax.swing.JTextField();
        crear = new javax.swing.JPanel();
        textbutom = new javax.swing.JLabel();
        head = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        j_nameC = new javax.swing.JTextField();
        n3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inisiar1.setBackground(new java.awt.Color(139, 195, 74));
        inisiar1.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
        inisiar1.setForeground(new java.awt.Color(0, 0, 0));
        inisiar1.setText("ELIMINAR CLIENTE");
        jPanel1.add(inisiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 260, -1));

        v.setBackground(new java.awt.Color(139, 195, 74));
        v.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        v.setForeground(new java.awt.Color(0, 0, 0));
        v.setText("Genero");
        jPanel1.add(v, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        j_generoC.setBackground(new java.awt.Color(139, 195, 74));
        j_generoC.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_generoC.setForeground(new java.awt.Color(102, 102, 102));
        j_generoC.setBorder(null);
        j_generoC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_generoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_generoCMousePressed(evt);
            }
        });
        j_generoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_generoCActionPerformed(evt);
            }
        });
        jPanel1.add(j_generoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 190, 30));

        j_nitC.setBackground(new java.awt.Color(139, 195, 74));
        j_nitC.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_nitC.setForeground(new java.awt.Color(102, 102, 102));
        j_nitC.setBorder(null);
        j_nitC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_nitC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_nitCMousePressed(evt);
            }
        });
        j_nitC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_nitCActionPerformed(evt);
            }
        });
        jPanel1.add(j_nitC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, 30));

        c1.setBackground(new java.awt.Color(139, 195, 74));
        c1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        c1.setForeground(new java.awt.Color(0, 0, 0));
        c1.setText("NIT");
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        n2.setBackground(new java.awt.Color(139, 195, 74));
        n2.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        n2.setForeground(new java.awt.Color(0, 0, 0));
        n2.setText("Codigo");
        jPanel1.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        j_codigoC.setBackground(new java.awt.Color(139, 195, 74));
        j_codigoC.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_codigoC.setForeground(new java.awt.Color(102, 102, 102));
        j_codigoC.setBorder(null);
        j_codigoC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_codigoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_codigoCMousePressed(evt);
            }
        });
        j_codigoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_codigoCActionPerformed(evt);
            }
        });
        jPanel1.add(j_codigoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, 30));

        v1.setBackground(new java.awt.Color(139, 195, 74));
        v1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        v1.setForeground(new java.awt.Color(0, 0, 0));
        v1.setText("Correo");
        jPanel1.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        j_correoC.setBackground(new java.awt.Color(139, 195, 74));
        j_correoC.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_correoC.setForeground(new java.awt.Color(102, 102, 102));
        j_correoC.setBorder(null);
        j_correoC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_correoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_correoCMousePressed(evt);
            }
        });
        j_correoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_correoCActionPerformed(evt);
            }
        });
        jPanel1.add(j_correoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 190, 30));

        crear.setBackground(new java.awt.Color(102, 102, 102));
        crear.setPreferredSize(new java.awt.Dimension(150, 55));
        crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMouseClicked(evt);
            }
        });

        textbutom.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        textbutom.setForeground(new java.awt.Color(139, 195, 74));
        textbutom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textbutom.setText("ELIMINAR CLIENTE");
        textbutom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textbutom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textbutomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textbutomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textbutomMouseExited(evt);
            }
        });

        javax.swing.GroupLayout crearLayout = new javax.swing.GroupLayout(crear);
        crear.setLayout(crearLayout);
        crearLayout.setHorizontalGroup(
            crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbutom, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        crearLayout.setVerticalGroup(
            crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbutom, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 190, 40));

        head.setBackground(new java.awt.Color(255, 255, 255));
        head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headMouseDragged(evt);
            }
        });
        head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 255));

        x.setBackground(new java.awt.Color(255, 255, 255));
        x.setFont(new java.awt.Font("Russo One", 0, 18)); // NOI18N
        x.setForeground(new java.awt.Color(0, 0, 0));
        x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x.setText("X");
        x.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        x.setPreferredSize(new java.awt.Dimension(70, 43));
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headLayout.createSequentialGroup()
                .addGap(0, 518, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 40));

        jPanel2.setBackground(new java.awt.Color(0, 156, 223));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 260, 10));

        jPanel3.setBackground(new java.awt.Color(0, 156, 223));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 230, -1));

        j_nameC.setBackground(new java.awt.Color(139, 195, 74));
        j_nameC.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_nameC.setForeground(new java.awt.Color(102, 102, 102));
        j_nameC.setBorder(null);
        j_nameC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_nameC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_nameCMousePressed(evt);
            }
        });
        j_nameC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_nameCActionPerformed(evt);
            }
        });
        jPanel1.add(j_nameC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 30));

        n3.setBackground(new java.awt.Color(139, 195, 74));
        n3.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        n3.setForeground(new java.awt.Color(0, 0, 0));
        n3.setText("Nombre");
        jPanel1.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j_generoCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_generoCMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_generoCMousePressed

    private void j_generoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_generoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_generoCActionPerformed

    private void j_nitCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_nitCMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nitCMousePressed

    private void j_nitCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_nitCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nitCActionPerformed

    private void j_codigoCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_codigoCMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_codigoCMousePressed

    private void j_codigoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_codigoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_codigoCActionPerformed

    private void j_correoCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_correoCMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_correoCMousePressed

    private void j_correoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_correoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_correoCActionPerformed

    private void textbutomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseClicked

        Administrador ad = new Administrador();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_textbutomMouseClicked

    public void EliMostrarC(int codigo){
        
        codigo = codigo;
         ClientesDAORelacional cd = new ClientesDAORelacional();
     
    clientesM cliente = cd.obtener_clientes(codigo);
     
     j_codigoC.setText(cliente.getCodigo()+"");
     j_nameC.setText(cliente.getNombre()+"");
     j_nitC.setText(cliente.getNit()+"");
     j_correoC.setText(cliente.getCorreo()+"");
     j_generoC.setText(cliente.getGenero()+"");
  
    
    }
    
    
    private void textbutomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseEntered

        crear.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_textbutomMouseEntered

    private void textbutomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseExited

        crear.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_textbutomMouseExited

    private void crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseClicked

    }//GEN-LAST:event_crearMouseClicked

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked

        Administrador ad = new Administrador();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        exit.setBackground(Color.red);
        exit.setForeground(Color.white);
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        exit.setBackground(Color.white);
        exit.setForeground(Color.black);
    }//GEN-LAST:event_xMouseExited

    private void headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headMouseDragged

    private void headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headMousePressed

    private void j_nameCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_nameCMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nameCMousePressed

    private void j_nameCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_nameCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nameCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EliC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c1;
    private javax.swing.JPanel crear;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel head;
    private javax.swing.JLabel inisiar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField j_codigoC;
    private javax.swing.JTextField j_correoC;
    private javax.swing.JTextField j_generoC;
    private javax.swing.JTextField j_nameC;
    private javax.swing.JTextField j_nitC;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel textbutom;
    private javax.swing.JLabel v;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
