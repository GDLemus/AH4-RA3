
package VISTA;

import MODEL.Conexion;
import MODEL.JsonCarga;
import MODEL.VendedoresDAORelacional;
import MODEL.vendedoresM;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Administrador extends javax.swing.JFrame {
DefaultTableModel tabla2;
     int xMouse, yMouse;
     
    public Administrador() {
        initComponents();
        datos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaV = new javax.swing.JTable();
        crear = new javax.swing.JPanel();
        textbutom = new javax.swing.JLabel();
        Update = new javax.swing.JPanel();
        Modi = new javax.swing.JLabel();
        elimi = new javax.swing.JPanel();
        ELI = new javax.swing.JLabel();
        carga = new javax.swing.JPanel();
        masi = new javax.swing.JLabel();
        expo = new javax.swing.JPanel();
        pdf = new javax.swing.JLabel();
        cerrar = new javax.swing.JPanel();
        sesion = new javax.swing.JLabel();
        head = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        x = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 156, 223));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(139, 195, 74));

        tablaV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaV);

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
        textbutom.setText("CREAR VENDEDOR");
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
            .addComponent(textbutom, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        crearLayout.setVerticalGroup(
            crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbutom, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Update.setBackground(new java.awt.Color(102, 102, 102));
        Update.setPreferredSize(new java.awt.Dimension(150, 55));
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateMouseExited(evt);
            }
        });

        Modi.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        Modi.setForeground(new java.awt.Color(139, 195, 74));
        Modi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Modi.setText("MODIFICAR VENDEDOR");
        Modi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout UpdateLayout = new javax.swing.GroupLayout(Update);
        Update.setLayout(UpdateLayout);
        UpdateLayout.setHorizontalGroup(
            UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modi, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        UpdateLayout.setVerticalGroup(
            UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modi, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        elimi.setBackground(new java.awt.Color(102, 102, 102));
        elimi.setPreferredSize(new java.awt.Dimension(150, 55));
        elimi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elimiMouseClicked(evt);
            }
        });

        ELI.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        ELI.setForeground(new java.awt.Color(139, 195, 74));
        ELI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ELI.setText("ELIMINAR VENDEDOR");
        ELI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ELI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ELIMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ELIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ELIMouseExited(evt);
            }
        });

        javax.swing.GroupLayout elimiLayout = new javax.swing.GroupLayout(elimi);
        elimi.setLayout(elimiLayout);
        elimiLayout.setHorizontalGroup(
            elimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ELI, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        elimiLayout.setVerticalGroup(
            elimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ELI, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        carga.setBackground(new java.awt.Color(102, 102, 102));
        carga.setPreferredSize(new java.awt.Dimension(150, 55));
        carga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargaMouseClicked(evt);
            }
        });

        masi.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        masi.setForeground(new java.awt.Color(139, 195, 74));
        masi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masi.setText("CARGA MASIVA");
        masi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                masiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                masiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cargaLayout = new javax.swing.GroupLayout(carga);
        carga.setLayout(cargaLayout);
        cargaLayout.setHorizontalGroup(
            cargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masi, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        cargaLayout.setVerticalGroup(
            cargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masi, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        expo.setBackground(new java.awt.Color(102, 102, 102));
        expo.setPreferredSize(new java.awt.Dimension(150, 55));
        expo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expoMouseClicked(evt);
            }
        });

        pdf.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        pdf.setForeground(new java.awt.Color(139, 195, 74));
        pdf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pdf.setText("EXPORTAR LISTADO A PDF");
        pdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdfMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pdfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pdfMouseExited(evt);
            }
        });

        javax.swing.GroupLayout expoLayout = new javax.swing.GroupLayout(expo);
        expo.setLayout(expoLayout);
        expoLayout.setHorizontalGroup(
            expoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pdf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        expoLayout.setVerticalGroup(
            expoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pdf, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        cerrar.setBackground(new java.awt.Color(102, 102, 102));

        sesion.setBackground(new java.awt.Color(255, 255, 255));
        sesion.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N
        sesion.setForeground(new java.awt.Color(0, 0, 0));
        sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesion.setText("Cerrar Sesión");
        sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sesion.setPreferredSize(new java.awt.Dimension(70, 43));
        sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarLayout = new javax.swing.GroupLayout(cerrar);
        cerrar.setLayout(cerrarLayout);
        cerrarLayout.setHorizontalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        cerrarLayout.setVerticalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(crear, 148, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(Update, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(elimi, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carga, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(expo, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(elimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(expo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vendedores", jPanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 650, 380));

        head.setBackground(new java.awt.Color(102, 102, 102));
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

        exit.setBackground(new java.awt.Color(102, 102, 102));

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
                .addGap(0, 608, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textbutomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseClicked
 
        AddV av = new AddV();
        av.setVisible(true);
        dispose();
    }//GEN-LAST:event_textbutomMouseClicked

    private void textbutomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseEntered

        crear.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_textbutomMouseEntered

    private void textbutomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutomMouseExited

        crear.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_textbutomMouseExited

    private void crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseClicked
        
        
        
    }//GEN-LAST:event_crearMouseClicked

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

    private void headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headMouseDragged

    private void headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headMousePressed

    private void ModiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModiMouseClicked
        enviar_datos();
    }//GEN-LAST:event_ModiMouseClicked

    private void ModiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModiMouseEntered
       Update.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_ModiMouseEntered

    private void ModiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModiMouseExited
       Update.setBackground(new Color(102,102,102));         
    }//GEN-LAST:event_ModiMouseExited

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
      
        
    }//GEN-LAST:event_UpdateMouseClicked

    private void ELIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELIMouseClicked
        
        eliminar_datos();
    }//GEN-LAST:event_ELIMouseClicked

    private void eliminar_datos(){
    
    int codigo = (int) tablaV.getValueAt(tablaV.getSelectedRow(), 0);

         EliV ev = new EliV();
         ev.EliMostrar(codigo);
         ev.setVisible(true);
         dispose();
         VendedoresDAORelacional sd = new VendedoresDAORelacional();
         sd.eliminar(codigo);
  


    }
    
    private void ELIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELIMouseEntered
        elimi.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_ELIMouseEntered

    private void ELIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELIMouseExited
        elimi.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_ELIMouseExited

    private void elimiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elimiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_elimiMouseClicked

    private void UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseEntered
     
        
    }//GEN-LAST:event_UpdateMouseEntered

    private void UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseExited
      
        
    }//GEN-LAST:event_UpdateMouseExited

    private void masiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masiMouseClicked


          JsonCarga archivo = new JsonCarga();
          String leerarchivo = archivo.leerarchivo();
          cargaMasiva(leerarchivo);
          datos();
          
    }//GEN-LAST:event_masiMouseClicked

    private void cargaMasiva(String leerarchivo) {
        String archivo_retorno = leerarchivo;
        JsonParser parse = new JsonParser();
        JsonArray matriz = parse.parse(archivo_retorno).getAsJsonArray();

        for (int i = 0; i < matriz.size(); i++) {
            JsonObject object = matriz.get(i).getAsJsonObject();

            
            String nombre = object.get("nombre").getAsString();
            int caja = object.get("caja").getAsInt();
            int ventas = object.get("ventas").getAsInt();
            String genero = object.get("genero").getAsString();
            String pass = object.get("password").getAsString();

            
            vendedoresM in = new vendedoresM(nombre, caja, ventas, genero, pass);
                    
            VendedoresDAORelacional insertar = new VendedoresDAORelacional();
            insertar.crear_vendedor(in);

        }
    }
    
    
    
    
    
    private void masiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masiMouseEntered
      
        carga.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_masiMouseEntered

    private void masiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masiMouseExited
       
        carga.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_masiMouseExited

    private void cargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cargaMouseClicked

    private void pdfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfMouseClicked
     exportarPDF();
        
    }//GEN-LAST:event_pdfMouseClicked
     Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();
    
    public void exportarPDF() {
        Document doc = new Document();
        try {

            FileOutputStream gen = new FileOutputStream("Listado Oficial Vendedores.pdf");
            

            PdfWriter.getInstance(doc, gen);
            doc.open();
            
            Paragraph titulo = new Paragraph("Listado Vendedores");
            titulo.setAlignment(Element.ALIGN_CENTER);
            Font fontTitulo = FontFactory.getFont(FontFactory.COURIER, 24, Font.BOLD, new BaseColor(0, 102, 204));
            titulo.setFont(fontTitulo);
            doc.add(titulo);

            doc.add(new Paragraph("\n"));
            PdfPTable tabla = new PdfPTable(5);
            tabla.setWidthPercentage(100);

            float[] cAn = {0.70f, 0.45f, 0.45f,0.50f, 2f};
            tabla.setWidths(cAn);


            Font fontHeader = FontFactory.getFont("Russo One", 13, Font.BOLD, new BaseColor(139, 195, 74));

            PdfPCell celdaNombre = new PdfPCell(new Phrase("Nombre", fontHeader));
            celdaNombre.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaNombre);

            PdfPCell celdaCaja = new PdfPCell(new Phrase("Caja", fontHeader));
            celdaCaja.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaCaja);

            PdfPCell celdaVentas = new PdfPCell(new Phrase("Ventas", fontHeader));
            celdaVentas.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaVentas);

            PdfPCell celdaGenero = new PdfPCell(new Phrase("Genero", fontHeader));
            celdaGenero.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaGenero);
            
            PdfPCell celdaPassword = new PdfPCell(new Phrase("Password", fontHeader));
            celdaPassword.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaPassword);
            
            try {
                String sql = "select * from vendedores";
                con = acceso.Conectar();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                    } while (rs.next());
                    doc.add(tabla);
                }
            } catch (DocumentException | SQLException e) {
            }
            doc.close();
            JOptionPane.showMessageDialog(null, "PDF Creado");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
    }
    
    
    private void pdfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfMouseEntered
        
        expo.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_pdfMouseEntered

    private void pdfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfMouseExited
        
         expo.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_pdfMouseExited

    private void expoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_expoMouseClicked

    private void sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesionMouseClicked
        Login lo = new Login();
        lo.setVisible(true);
        dispose();
    }//GEN-LAST:event_sesionMouseClicked

    private void sesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesionMouseEntered
         cerrar.setBackground(Color.red);
         cerrar.setForeground(Color.white);
    }//GEN-LAST:event_sesionMouseEntered

    private void sesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesionMouseExited
        cerrar.setBackground(Color.white);
        cerrar.setForeground(Color.black);
    }//GEN-LAST:event_sesionMouseExited

    
    private void enviar_datos(){
    
    int usuario_id = (int) tablaV.getValueAt(tablaV.getSelectedRow(), 0);
        
         UpV mu = new UpV();
         mu.Mostrar(usuario_id);
         mu.setVisible(true);
         dispose();
       
    }
    

    private void datos(){
    
    String columnas []={"Codigo","Nombre","Caja","Ventas","Genero"};
    tabla2 = new DefaultTableModel(null, columnas);
    VendedoresDAORelacional vd = new VendedoresDAORelacional();
        for (vendedoresM dat : vd.listarV()) {
            Object ayuda [] = new Object[5];
            ayuda[0] = dat.getCodigo();
            ayuda[1] = dat.getNombre();
            ayuda[2] = dat.getCaja();
            ayuda[3] = dat.getVentas();
            ayuda[4] = dat.getGenero();
            tabla2.addRow(ayuda);
        }
    tablaV.setModel(tabla2);
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ELI;
    private javax.swing.JLabel Modi;
    private javax.swing.JPanel Update;
    private javax.swing.JPanel carga;
    private javax.swing.JPanel cerrar;
    private javax.swing.JPanel crear;
    private javax.swing.JPanel elimi;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel expo;
    private javax.swing.JPanel head;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel masi;
    private javax.swing.JLabel pdf;
    private javax.swing.JLabel sesion;
    private javax.swing.JTable tablaV;
    private javax.swing.JLabel textbutom;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
