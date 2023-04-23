
package VISTA;

import MODEL.VendedoresDAORelacional;
import MODEL.vendedoresM;
import java.awt.Color;
import javax.swing.JOptionPane;
import sun.misc.VM;

public class EliV extends javax.swing.JFrame {
int xMouse, yMouse;
    public EliV() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        c = new javax.swing.JLabel();
        inisiar1 = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        j_genero = new javax.swing.JTextField();
        j_caja = new javax.swing.JTextField();
        c1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        j_codigo = new javax.swing.JTextField();
        v1 = new javax.swing.JLabel();
        j_ventas = new javax.swing.JTextField();
        j_pass = new javax.swing.JPasswordField();
        crear = new javax.swing.JPanel();
        textbutom = new javax.swing.JLabel();
        head = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        j_name = new javax.swing.JTextField();
        n3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c.setBackground(new java.awt.Color(139, 195, 74));
        c.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        c.setForeground(new java.awt.Color(0, 0, 0));
        c.setText("Contraseña");
        jPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        inisiar1.setBackground(new java.awt.Color(139, 195, 74));
        inisiar1.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
        inisiar1.setForeground(new java.awt.Color(0, 0, 0));
        inisiar1.setText("ELIMINAR VENDEDOR");
        jPanel1.add(inisiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        v.setBackground(new java.awt.Color(139, 195, 74));
        v.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        v.setForeground(new java.awt.Color(0, 0, 0));
        v.setText("Genero");
        jPanel1.add(v, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        j_genero.setBackground(new java.awt.Color(139, 195, 74));
        j_genero.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_genero.setForeground(new java.awt.Color(102, 102, 102));
        j_genero.setBorder(null);
        j_genero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_genero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_generoMousePressed(evt);
            }
        });
        j_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_generoActionPerformed(evt);
            }
        });
        jPanel1.add(j_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 190, 30));

        j_caja.setBackground(new java.awt.Color(139, 195, 74));
        j_caja.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_caja.setForeground(new java.awt.Color(102, 102, 102));
        j_caja.setBorder(null);
        j_caja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_cajaMousePressed(evt);
            }
        });
        j_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_cajaActionPerformed(evt);
            }
        });
        jPanel1.add(j_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, 30));

        c1.setBackground(new java.awt.Color(139, 195, 74));
        c1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        c1.setForeground(new java.awt.Color(0, 0, 0));
        c1.setText("Caja");
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        n2.setBackground(new java.awt.Color(139, 195, 74));
        n2.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        n2.setForeground(new java.awt.Color(0, 0, 0));
        n2.setText("Codigo");
        jPanel1.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        j_codigo.setBackground(new java.awt.Color(139, 195, 74));
        j_codigo.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_codigo.setForeground(new java.awt.Color(102, 102, 102));
        j_codigo.setBorder(null);
        j_codigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_codigoMousePressed(evt);
            }
        });
        j_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_codigoActionPerformed(evt);
            }
        });
        jPanel1.add(j_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, 30));

        v1.setBackground(new java.awt.Color(139, 195, 74));
        v1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        v1.setForeground(new java.awt.Color(0, 0, 0));
        v1.setText("Ventas");
        jPanel1.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        j_ventas.setBackground(new java.awt.Color(139, 195, 74));
        j_ventas.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_ventas.setForeground(new java.awt.Color(102, 102, 102));
        j_ventas.setBorder(null);
        j_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_ventasMousePressed(evt);
            }
        });
        j_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_ventasActionPerformed(evt);
            }
        });
        jPanel1.add(j_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 190, 30));

        j_pass.setBackground(new java.awt.Color(139, 195, 74));
        j_pass.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N
        j_pass.setForeground(new java.awt.Color(102, 102, 102));
        j_pass.setBorder(null);
        j_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_passMousePressed(evt);
            }
        });
        j_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_passActionPerformed(evt);
            }
        });
        jPanel1.add(j_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 190, 30));

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
        textbutom.setText("ELIMINAR VENDEDOR");
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 260, 10));

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

        j_name.setBackground(new java.awt.Color(139, 195, 74));
        j_name.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_name.setForeground(new java.awt.Color(102, 102, 102));
        j_name.setBorder(null);
        j_name.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_nameMousePressed(evt);
            }
        });
        j_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_nameActionPerformed(evt);
            }
        });
        jPanel1.add(j_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 30));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j_generoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_generoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_generoMousePressed

    private void j_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_generoActionPerformed

    private void j_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_cajaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_cajaMousePressed

    private void j_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_cajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_cajaActionPerformed

    private void j_codigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_codigoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_codigoMousePressed

    private void j_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_codigoActionPerformed

    private void j_ventasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_ventasMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_ventasMousePressed

    private void j_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_ventasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_ventasActionPerformed

    private void j_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_passMousePressed

    }//GEN-LAST:event_j_passMousePressed

    private void j_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_passActionPerformed

    private void textbutomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseClicked

        Administrador ad = new Administrador();
         ad.setVisible(true);
         dispose();
    }//GEN-LAST:event_textbutomMouseClicked


    
    
    public void EliMostrar(int codigo){
        
        codigo = codigo;
        VendedoresDAORelacional vd = new VendedoresDAORelacional();
        

     vendedoresM vendedores = vd.obtener(codigo);
     
     j_codigo.setText(vendedores.getCodigo()+"");
     j_name.setText(vendedores.getNombre()+"");
     j_caja.setText(vendedores.getCaja()+"");
     j_ventas.setText(vendedores.getVentas()+"");
     j_genero.setText(vendedores.getGenero()+"");
     j_pass.setText(vendedores.getPass()+"");
     
    
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

    private void j_nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_nameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nameMousePressed

    private void j_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nameActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c;
    private javax.swing.JLabel c1;
    private javax.swing.JPanel crear;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel head;
    private javax.swing.JLabel inisiar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField j_caja;
    private javax.swing.JTextField j_codigo;
    private javax.swing.JTextField j_genero;
    private javax.swing.JTextField j_name;
    private javax.swing.JPasswordField j_pass;
    private javax.swing.JTextField j_ventas;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel textbutom;
    private javax.swing.JLabel v;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
