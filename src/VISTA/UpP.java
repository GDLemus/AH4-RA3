
package VISTA;

import MODEL.ProductosDAORelacional;
import MODEL.SucursalesDAORelacional;
import MODEL.productosM;
import MODEL.sucursalesM;
import java.awt.Color;
import javax.swing.JOptionPane;

public class UpP extends javax.swing.JFrame {

 int xMouse, yMouse;
    public UpP() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inisiar1 = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        j_precioP = new javax.swing.JTextField();
        j_descripcionP = new javax.swing.JTextField();
        c1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        j_codigoP = new javax.swing.JTextField();
        v1 = new javax.swing.JLabel();
        j_cantidadP = new javax.swing.JTextField();
        crear = new javax.swing.JPanel();
        textbutom = new javax.swing.JLabel();
        head = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        j_nameP = new javax.swing.JTextField();
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
        inisiar1.setText("MODIFICAR PRODUCTO");
        jPanel1.add(inisiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        v.setBackground(new java.awt.Color(139, 195, 74));
        v.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        v.setForeground(new java.awt.Color(0, 0, 0));
        v.setText("Precio");
        jPanel1.add(v, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        j_precioP.setBackground(new java.awt.Color(139, 195, 74));
        j_precioP.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_precioP.setForeground(new java.awt.Color(102, 102, 102));
        j_precioP.setBorder(null);
        j_precioP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_precioP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_precioPMousePressed(evt);
            }
        });
        j_precioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_precioPActionPerformed(evt);
            }
        });
        jPanel1.add(j_precioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 190, 30));

        j_descripcionP.setBackground(new java.awt.Color(139, 195, 74));
        j_descripcionP.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_descripcionP.setForeground(new java.awt.Color(102, 102, 102));
        j_descripcionP.setBorder(null);
        j_descripcionP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_descripcionP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_descripcionPMousePressed(evt);
            }
        });
        j_descripcionP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_descripcionPActionPerformed(evt);
            }
        });
        jPanel1.add(j_descripcionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, 30));

        c1.setBackground(new java.awt.Color(139, 195, 74));
        c1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        c1.setForeground(new java.awt.Color(0, 0, 0));
        c1.setText("Descripción");
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        n2.setBackground(new java.awt.Color(139, 195, 74));
        n2.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        n2.setForeground(new java.awt.Color(0, 0, 0));
        n2.setText("Codigo");
        jPanel1.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        j_codigoP.setBackground(new java.awt.Color(139, 195, 74));
        j_codigoP.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_codigoP.setForeground(new java.awt.Color(102, 102, 102));
        j_codigoP.setBorder(null);
        j_codigoP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_codigoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_codigoPMousePressed(evt);
            }
        });
        j_codigoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_codigoPActionPerformed(evt);
            }
        });
        jPanel1.add(j_codigoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, 30));

        v1.setBackground(new java.awt.Color(139, 195, 74));
        v1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        v1.setForeground(new java.awt.Color(0, 0, 0));
        v1.setText("Cantidad");
        jPanel1.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        j_cantidadP.setBackground(new java.awt.Color(139, 195, 74));
        j_cantidadP.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_cantidadP.setForeground(new java.awt.Color(102, 102, 102));
        j_cantidadP.setBorder(null);
        j_cantidadP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_cantidadP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_cantidadPMousePressed(evt);
            }
        });
        j_cantidadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_cantidadPActionPerformed(evt);
            }
        });
        jPanel1.add(j_cantidadP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 190, 30));

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
        textbutom.setText("MODIFICAR PRODUCTO");
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

        j_nameP.setBackground(new java.awt.Color(139, 195, 74));
        j_nameP.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_nameP.setForeground(new java.awt.Color(102, 102, 102));
        j_nameP.setBorder(null);
        j_nameP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_nameP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_namePMousePressed(evt);
            }
        });
        j_nameP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_namePActionPerformed(evt);
            }
        });
        jPanel1.add(j_nameP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 30));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j_precioPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_precioPMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_precioPMousePressed

    private void j_precioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_precioPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_precioPActionPerformed

    private void j_descripcionPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_descripcionPMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_descripcionPMousePressed

    private void j_descripcionPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_descripcionPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_descripcionPActionPerformed

    private void j_codigoPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_codigoPMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_codigoPMousePressed

    private void j_codigoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_codigoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_codigoPActionPerformed

    private void j_cantidadPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_cantidadPMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_cantidadPMousePressed

    private void j_cantidadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_cantidadPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_cantidadPActionPerformed

    private void textbutomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseClicked

        if (j_codigoP.getText().isEmpty() || j_nameP.getText().isEmpty() || j_descripcionP.getText().isEmpty() || j_cantidadP.getText().isEmpty() || j_precioP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llena todos los campos");
        } else {
            enviarS();

        }
    }//GEN-LAST:event_textbutomMouseClicked

    private void enviarS(){
 
//        vendedoresM vm = new vendedoresM(Integer.parseInt(j_codigoS.getText()), j_nameS.getText(), Integer.parseInt(j_direccionS.getText()), Integer.parseInt(j_correoS.getText()), j_telefonoS.getText(), j_pass.getText());
//        VendedoresDAORelacional vd = new VendedoresDAORelacional();
//        sucursalesM sm = new sucursalesM(Integer.parseInt(j_codigoS.getText()), j_nameS.getText(), j_direccionS.getText(), j_correoS.getText(), Integer.parseInt(j_telefonoS.getText()));
        productosM pm = new productosM(Integer.parseInt(j_codigoP.getText()), j_nameP.getText(), j_descripcionP.getText(), Integer.parseInt(j_cantidadP.getText()), Float.parseFloat(j_precioP.getText()));
        ProductosDAORelacional pd = new ProductosDAORelacional();
        pd.modificar_productos(pm);
        Administrador ad = new Administrador();
        ad.setVisible(true);
        dispose();
  
     }
    
    public void MostrarP(int codigo){
        
        codigo = codigo;
        ProductosDAORelacional pd = new ProductosDAORelacional();
        

     productosM producto = pd.obtener_productos(codigo);
     
     j_codigoP.setText(producto.getCodigo()+"");
     j_nameP.setText(producto.getNombre()+"");
     j_descripcionP.setText(producto.getDescripcion()+"");
     j_cantidadP.setText(producto.getCantidad()+"");
     j_precioP.setText(producto.getPrecio()+"");
  
    
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

    private void j_namePMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_namePMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_namePMousePressed

    private void j_namePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_namePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_namePActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c1;
    private javax.swing.JPanel crear;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel head;
    private javax.swing.JLabel inisiar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField j_cantidadP;
    private javax.swing.JTextField j_codigoP;
    private javax.swing.JTextField j_descripcionP;
    private javax.swing.JTextField j_nameP;
    private javax.swing.JTextField j_precioP;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel textbutom;
    private javax.swing.JLabel v;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
