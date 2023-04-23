package VISTA;

import MODEL.VendedoresDAORelacional;
import MODEL.vendedoresM;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    

 int xMouse, yMouse;
    public Login() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bggren = new javax.swing.JPanel();
        grisvertical = new javax.swing.JPanel();
        code = new javax.swing.JLabel();
        inisiar = new javax.swing.JLabel();
        contra = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        buttom = new javax.swing.JPanel();
        textbutom = new javax.swing.JLabel();
        pos = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        line = new javax.swing.JPanel();
        head = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        x = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bggren.setBackground(new java.awt.Color(139, 195, 74));

        grisvertical.setBackground(new java.awt.Color(0, 156, 223));

        javax.swing.GroupLayout grisverticalLayout = new javax.swing.GroupLayout(grisvertical);
        grisvertical.setLayout(grisverticalLayout);
        grisverticalLayout.setHorizontalGroup(
            grisverticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        grisverticalLayout.setVerticalGroup(
            grisverticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        code.setBackground(new java.awt.Color(139, 195, 74));
        code.setFont(new java.awt.Font("Russo One", 0, 18)); // NOI18N
        code.setForeground(new java.awt.Color(0, 0, 0));
        code.setText("Codigo");

        inisiar.setBackground(new java.awt.Color(139, 195, 74));
        inisiar.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
        inisiar.setForeground(new java.awt.Color(0, 0, 0));
        inisiar.setText("Iniciar Sesión");

        contra.setBackground(new java.awt.Color(139, 195, 74));
        contra.setFont(new java.awt.Font("Russo One", 0, 18)); // NOI18N
        contra.setForeground(new java.awt.Color(0, 0, 0));
        contra.setText("Contraseña");

        user.setBackground(new java.awt.Color(139, 195, 74));
        user.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        user.setForeground(new java.awt.Color(102, 102, 102));
        user.setText("Ingrese su codigo");
        user.setBorder(null);
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userMousePressed(evt);
            }
        });

        pass.setBackground(new java.awt.Color(139, 195, 74));
        pass.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(102, 102, 102));
        pass.setText("****************");
        pass.setBorder(null);
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passMousePressed(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        buttom.setBackground(new java.awt.Color(102, 102, 102));
        buttom.setPreferredSize(new java.awt.Dimension(114, 35));

        textbutom.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        textbutom.setForeground(new java.awt.Color(139, 195, 74));
        textbutom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textbutom.setText("INICIAR SESIÓN");
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

        javax.swing.GroupLayout buttomLayout = new javax.swing.GroupLayout(buttom);
        buttom.setLayout(buttomLayout);
        buttomLayout.setHorizontalGroup(
            buttomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbutom, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );
        buttomLayout.setVerticalGroup(
            buttomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbutom, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bggrenLayout = new javax.swing.GroupLayout(bggren);
        bggren.setLayout(bggrenLayout);
        bggrenLayout.setHorizontalGroup(
            bggrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bggrenLayout.createSequentialGroup()
                .addGroup(bggrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bggrenLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(bggrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(user)
                            .addGroup(bggrenLayout.createSequentialGroup()
                                .addGroup(bggrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contra)
                                    .addComponent(buttom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(code))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pass))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bggrenLayout.createSequentialGroup()
                        .addContainerGap(103, Short.MAX_VALUE)
                        .addComponent(inisiar)
                        .addGap(89, 89, 89)))
                .addComponent(grisvertical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bggrenLayout.setVerticalGroup(
            bggrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bggrenLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(inisiar)
                .addGap(58, 58, 58)
                .addComponent(code)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(buttom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(grisvertical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(bggren, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 450));

        pos.setBackground(new java.awt.Color(139, 195, 74));
        pos.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
        pos.setForeground(new java.awt.Color(139, 195, 74));
        pos.setText("Point of sale");
        bg.add(pos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 160, -1));

        title.setBackground(new java.awt.Color(139, 195, 74));
        title.setFont(new java.awt.Font("Russo One", 0, 40)); // NOI18N
        title.setForeground(new java.awt.Color(139, 195, 74));
        title.setText("GREEN MALL");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 270, -1));

        line.setBackground(new java.awt.Color(0, 156, 223));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        bg.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 240, 10));

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
            .addGroup(exitLayout.createSequentialGroup()
                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
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
                .addGap(0, 629, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMousePressed
        
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headMousePressed

    private void headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headMouseDragged

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
       
        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        exit.setBackground(Color.red);
        exit.setForeground(Color.white);
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        exit.setBackground(Color.white);
        exit.setForeground(Color.black);
    }//GEN-LAST:event_xMouseExited

    private void textbutomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseEntered
        
        buttom.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_textbutomMouseEntered

    private void textbutomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseExited
        
        buttom.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_textbutomMouseExited

    private void userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMousePressed
        if (user.getText().equals("Ingrese su nombre de usuario")) {
            user.setText("");
            user.setForeground(Color.black);
        }
        if (String.valueOf(pass.getPassword()).isEmpty()) {
            pass.setText("********");
            pass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userMousePressed

    private void passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMousePressed
        if (String.valueOf(pass.getPassword()).equals("********")) {
            pass.setText("");
            pass.setForeground(Color.black);
        }
        if (user.getText().isEmpty()) {
            user.setText("Ingrese su nombre de usuario");
            user.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passMousePressed

    private void textbutomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseClicked
       
        if (user.getText().isEmpty() || pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llena todos los campos");
        } else{
            consulta();
            anclar(); 
        }
     
    }//GEN-LAST:event_textbutomMouseClicked

    public void anclar(){
    
    String codigo = user.getText().trim().toLowerCase();
    String contra = pass.getText().trim().toLowerCase();
    
    if (codigo.equals("admin") || contra.equals("admin")) {
        
        Administrador ad = new Administrador();
        ad.setVisible(true);
        this.dispose();
        
    } else {
        
        }
    
    }
    private void consulta(){
    
        VendedoresDAORelacional ud = new VendedoresDAORelacional();
        vendedoresM us = ud.consultar(user.getText(), pass.getText());
        if (us !=null) {
            Administrador uv = new Administrador();
            uv.setVisible(true);
            dispose();
        } else {
//        JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
        }
    }
 
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bggren;
    private javax.swing.JPanel buttom;
    private javax.swing.JLabel code;
    private javax.swing.JLabel contra;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel grisvertical;
    private javax.swing.JPanel head;
    private javax.swing.JLabel inisiar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel line;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel pos;
    private javax.swing.JLabel textbutom;
    private javax.swing.JLabel title;
    private javax.swing.JTextField user;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
