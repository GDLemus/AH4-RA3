
package VISTA;

import MODEL.ClientesDAORelacional;
import MODEL.Conexion;
import MODEL.JsonCarga;
import MODEL.ProductosDAORelacional;
import MODEL.productosM;
import MODEL.SucursalesDAORelacional;
import MODEL.VendedoresDAORelacional;
import MODEL.clientesM;
import MODEL.sucursalesM;
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
DefaultTableModel tablaS3;
DefaultTableModel tablaP4;
DefaultTableModel tablaC5;
     int xMouse, yMouse;
     
    public Administrador() {
        initComponents();
        datos();
        datosS();
        datosP();
        datosC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelV = new javax.swing.JPanel();
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
        panelS = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaS = new javax.swing.JTable();
        crearS = new javax.swing.JPanel();
        textbutom1 = new javax.swing.JLabel();
        Update1 = new javax.swing.JPanel();
        Modi1 = new javax.swing.JLabel();
        elimi1 = new javax.swing.JPanel();
        ELI1 = new javax.swing.JLabel();
        carga1 = new javax.swing.JPanel();
        masi1 = new javax.swing.JLabel();
        expo1 = new javax.swing.JPanel();
        pdf1 = new javax.swing.JLabel();
        cerrar1 = new javax.swing.JPanel();
        sesion1 = new javax.swing.JLabel();
        panelP = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaP = new javax.swing.JTable();
        crearS1 = new javax.swing.JPanel();
        textbutom2 = new javax.swing.JLabel();
        Update2 = new javax.swing.JPanel();
        Modi2 = new javax.swing.JLabel();
        elimi2 = new javax.swing.JPanel();
        ELI2 = new javax.swing.JLabel();
        carga2 = new javax.swing.JPanel();
        masi2 = new javax.swing.JLabel();
        expo2 = new javax.swing.JPanel();
        pdf2 = new javax.swing.JLabel();
        cerrar2 = new javax.swing.JPanel();
        sesion2 = new javax.swing.JLabel();
        panelC = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaC = new javax.swing.JTable();
        crearS2 = new javax.swing.JPanel();
        textbutom3 = new javax.swing.JLabel();
        Update3 = new javax.swing.JPanel();
        Modi3 = new javax.swing.JLabel();
        elimi3 = new javax.swing.JPanel();
        ELI3 = new javax.swing.JLabel();
        carga3 = new javax.swing.JPanel();
        masi3 = new javax.swing.JLabel();
        expo3 = new javax.swing.JPanel();
        pdf3 = new javax.swing.JLabel();
        cerrar3 = new javax.swing.JPanel();
        sesion3 = new javax.swing.JLabel();
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

        panelV.setBackground(new java.awt.Color(139, 195, 74));

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

        javax.swing.GroupLayout panelVLayout = new javax.swing.GroupLayout(panelV);
        panelV.setLayout(panelVLayout);
        panelVLayout.setHorizontalGroup(
            panelVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVLayout.createSequentialGroup()
                        .addComponent(crear, 148, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(Update, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVLayout.createSequentialGroup()
                        .addComponent(elimi, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carga, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(expo, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelVLayout.setVerticalGroup(
            panelVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addGroup(panelVLayout.createSequentialGroup()
                        .addGroup(panelVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(elimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(expo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vendedores", panelV);

        panelS.setBackground(new java.awt.Color(139, 195, 74));

        tablaS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaS);

        crearS.setBackground(new java.awt.Color(102, 102, 102));
        crearS.setPreferredSize(new java.awt.Dimension(150, 55));
        crearS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearSMouseClicked(evt);
            }
        });

        textbutom1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        textbutom1.setForeground(new java.awt.Color(139, 195, 74));
        textbutom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textbutom1.setText("CREAR SUCURSAL");
        textbutom1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textbutom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textbutom1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textbutom1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textbutom1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout crearSLayout = new javax.swing.GroupLayout(crearS);
        crearS.setLayout(crearSLayout);
        crearSLayout.setHorizontalGroup(
            crearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbutom1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        crearSLayout.setVerticalGroup(
            crearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbutom1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Update1.setBackground(new java.awt.Color(102, 102, 102));
        Update1.setPreferredSize(new java.awt.Dimension(150, 55));
        Update1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Update1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Update1MouseExited(evt);
            }
        });

        Modi1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        Modi1.setForeground(new java.awt.Color(139, 195, 74));
        Modi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Modi1.setText("MODIFICAR SUCURSAL");
        Modi1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modi1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Modi1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Modi1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Update1Layout = new javax.swing.GroupLayout(Update1);
        Update1.setLayout(Update1Layout);
        Update1Layout.setHorizontalGroup(
            Update1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modi1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        Update1Layout.setVerticalGroup(
            Update1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modi1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        elimi1.setBackground(new java.awt.Color(102, 102, 102));
        elimi1.setPreferredSize(new java.awt.Dimension(150, 55));
        elimi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elimi1MouseClicked(evt);
            }
        });

        ELI1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        ELI1.setForeground(new java.awt.Color(139, 195, 74));
        ELI1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ELI1.setText("ELIMINAR SUCURSAL");
        ELI1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ELI1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ELI1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ELI1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ELI1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout elimi1Layout = new javax.swing.GroupLayout(elimi1);
        elimi1.setLayout(elimi1Layout);
        elimi1Layout.setHorizontalGroup(
            elimi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ELI1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        elimi1Layout.setVerticalGroup(
            elimi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ELI1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        carga1.setBackground(new java.awt.Color(102, 102, 102));
        carga1.setPreferredSize(new java.awt.Dimension(150, 55));
        carga1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carga1MouseClicked(evt);
            }
        });

        masi1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        masi1.setForeground(new java.awt.Color(139, 195, 74));
        masi1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masi1.setText("CARGA MASIVA");
        masi1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masi1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                masi1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                masi1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout carga1Layout = new javax.swing.GroupLayout(carga1);
        carga1.setLayout(carga1Layout);
        carga1Layout.setHorizontalGroup(
            carga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masi1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        carga1Layout.setVerticalGroup(
            carga1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masi1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        expo1.setBackground(new java.awt.Color(102, 102, 102));
        expo1.setPreferredSize(new java.awt.Dimension(150, 55));
        expo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expo1MouseClicked(evt);
            }
        });

        pdf1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        pdf1.setForeground(new java.awt.Color(139, 195, 74));
        pdf1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pdf1.setText("EXPORTAR LISTADO A PDF");
        pdf1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pdf1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdf1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pdf1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pdf1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout expo1Layout = new javax.swing.GroupLayout(expo1);
        expo1.setLayout(expo1Layout);
        expo1Layout.setHorizontalGroup(
            expo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pdf1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        expo1Layout.setVerticalGroup(
            expo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pdf1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        cerrar1.setBackground(new java.awt.Color(102, 102, 102));

        sesion1.setBackground(new java.awt.Color(255, 255, 255));
        sesion1.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N
        sesion1.setForeground(new java.awt.Color(0, 0, 0));
        sesion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesion1.setText("Cerrar Sesión");
        sesion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sesion1.setPreferredSize(new java.awt.Dimension(70, 43));
        sesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sesion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sesion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sesion1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrar1Layout = new javax.swing.GroupLayout(cerrar1);
        cerrar1.setLayout(cerrar1Layout);
        cerrar1Layout.setHorizontalGroup(
            cerrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sesion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        cerrar1Layout.setVerticalGroup(
            cerrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sesion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelSLayout = new javax.swing.GroupLayout(panelS);
        panelS.setLayout(panelSLayout);
        panelSLayout.setHorizontalGroup(
            panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSLayout.createSequentialGroup()
                        .addComponent(crearS, 148, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(Update1, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSLayout.createSequentialGroup()
                        .addComponent(elimi1, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carga1, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(expo1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelSLayout.setVerticalGroup(
            panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addGroup(panelSLayout.createSequentialGroup()
                        .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(crearS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(elimi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carga1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(expo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sucursales", panelS);

        panelP.setBackground(new java.awt.Color(139, 195, 74));

        tablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaP);

        crearS1.setBackground(new java.awt.Color(102, 102, 102));
        crearS1.setPreferredSize(new java.awt.Dimension(150, 55));
        crearS1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearS1MouseClicked(evt);
            }
        });

        textbutom2.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        textbutom2.setForeground(new java.awt.Color(139, 195, 74));
        textbutom2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textbutom2.setText("CREAR PRODUCTO");
        textbutom2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textbutom2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textbutom2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textbutom2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textbutom2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout crearS1Layout = new javax.swing.GroupLayout(crearS1);
        crearS1.setLayout(crearS1Layout);
        crearS1Layout.setHorizontalGroup(
            crearS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbutom2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        crearS1Layout.setVerticalGroup(
            crearS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbutom2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Update2.setBackground(new java.awt.Color(102, 102, 102));
        Update2.setPreferredSize(new java.awt.Dimension(150, 55));
        Update2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Update2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Update2MouseExited(evt);
            }
        });

        Modi2.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        Modi2.setForeground(new java.awt.Color(139, 195, 74));
        Modi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Modi2.setText("MODIFICAR PRODUCTO");
        Modi2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modi2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Modi2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Modi2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Update2Layout = new javax.swing.GroupLayout(Update2);
        Update2.setLayout(Update2Layout);
        Update2Layout.setHorizontalGroup(
            Update2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modi2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        Update2Layout.setVerticalGroup(
            Update2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modi2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        elimi2.setBackground(new java.awt.Color(102, 102, 102));
        elimi2.setPreferredSize(new java.awt.Dimension(150, 55));
        elimi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elimi2MouseClicked(evt);
            }
        });

        ELI2.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        ELI2.setForeground(new java.awt.Color(139, 195, 74));
        ELI2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ELI2.setText("ELIMINAR PRODUCTO");
        ELI2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ELI2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ELI2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ELI2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ELI2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout elimi2Layout = new javax.swing.GroupLayout(elimi2);
        elimi2.setLayout(elimi2Layout);
        elimi2Layout.setHorizontalGroup(
            elimi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ELI2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        elimi2Layout.setVerticalGroup(
            elimi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ELI2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        carga2.setBackground(new java.awt.Color(102, 102, 102));
        carga2.setPreferredSize(new java.awt.Dimension(150, 55));
        carga2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carga2MouseClicked(evt);
            }
        });

        masi2.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        masi2.setForeground(new java.awt.Color(139, 195, 74));
        masi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masi2.setText("CARGA MASIVA");
        masi2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masi2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                masi2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                masi2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout carga2Layout = new javax.swing.GroupLayout(carga2);
        carga2.setLayout(carga2Layout);
        carga2Layout.setHorizontalGroup(
            carga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masi2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        carga2Layout.setVerticalGroup(
            carga2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masi2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        expo2.setBackground(new java.awt.Color(102, 102, 102));
        expo2.setPreferredSize(new java.awt.Dimension(150, 55));
        expo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expo2MouseClicked(evt);
            }
        });

        pdf2.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        pdf2.setForeground(new java.awt.Color(139, 195, 74));
        pdf2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pdf2.setText("EXPORTAR LISTADO A PDF");
        pdf2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pdf2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdf2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pdf2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pdf2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout expo2Layout = new javax.swing.GroupLayout(expo2);
        expo2.setLayout(expo2Layout);
        expo2Layout.setHorizontalGroup(
            expo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pdf2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        expo2Layout.setVerticalGroup(
            expo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pdf2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        cerrar2.setBackground(new java.awt.Color(102, 102, 102));

        sesion2.setBackground(new java.awt.Color(255, 255, 255));
        sesion2.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N
        sesion2.setForeground(new java.awt.Color(0, 0, 0));
        sesion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesion2.setText("Cerrar Sesión");
        sesion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sesion2.setPreferredSize(new java.awt.Dimension(70, 43));
        sesion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sesion2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sesion2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sesion2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrar2Layout = new javax.swing.GroupLayout(cerrar2);
        cerrar2.setLayout(cerrar2Layout);
        cerrar2Layout.setHorizontalGroup(
            cerrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sesion2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        cerrar2Layout.setVerticalGroup(
            cerrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sesion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPLayout = new javax.swing.GroupLayout(panelP);
        panelP.setLayout(panelPLayout);
        panelPLayout.setHorizontalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addComponent(crearS1, 148, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(Update2, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addComponent(elimi2, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carga2, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(expo2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPLayout.setVerticalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addGroup(panelPLayout.createSequentialGroup()
                        .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(crearS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(elimi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(expo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Productos", panelP);

        panelC.setBackground(new java.awt.Color(139, 195, 74));

        tablaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaC);

        crearS2.setBackground(new java.awt.Color(102, 102, 102));
        crearS2.setPreferredSize(new java.awt.Dimension(150, 55));
        crearS2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearS2MouseClicked(evt);
            }
        });

        textbutom3.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        textbutom3.setForeground(new java.awt.Color(139, 195, 74));
        textbutom3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textbutom3.setText("CREAR CLIENTE");
        textbutom3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textbutom3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textbutom3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textbutom3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textbutom3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout crearS2Layout = new javax.swing.GroupLayout(crearS2);
        crearS2.setLayout(crearS2Layout);
        crearS2Layout.setHorizontalGroup(
            crearS2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbutom3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        crearS2Layout.setVerticalGroup(
            crearS2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textbutom3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        Update3.setBackground(new java.awt.Color(102, 102, 102));
        Update3.setPreferredSize(new java.awt.Dimension(150, 55));
        Update3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Update3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Update3MouseExited(evt);
            }
        });

        Modi3.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        Modi3.setForeground(new java.awt.Color(139, 195, 74));
        Modi3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Modi3.setText("MODIFICAR CLIENTE");
        Modi3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modi3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modi3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Modi3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Modi3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Update3Layout = new javax.swing.GroupLayout(Update3);
        Update3.setLayout(Update3Layout);
        Update3Layout.setHorizontalGroup(
            Update3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modi3, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        Update3Layout.setVerticalGroup(
            Update3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modi3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        elimi3.setBackground(new java.awt.Color(102, 102, 102));
        elimi3.setPreferredSize(new java.awt.Dimension(150, 55));
        elimi3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elimi3MouseClicked(evt);
            }
        });

        ELI3.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        ELI3.setForeground(new java.awt.Color(139, 195, 74));
        ELI3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ELI3.setText("ELIMINAR CLIENTE");
        ELI3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ELI3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ELI3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ELI3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ELI3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout elimi3Layout = new javax.swing.GroupLayout(elimi3);
        elimi3.setLayout(elimi3Layout);
        elimi3Layout.setHorizontalGroup(
            elimi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ELI3, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        elimi3Layout.setVerticalGroup(
            elimi3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ELI3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        carga3.setBackground(new java.awt.Color(102, 102, 102));
        carga3.setPreferredSize(new java.awt.Dimension(150, 55));
        carga3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carga3MouseClicked(evt);
            }
        });

        masi3.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        masi3.setForeground(new java.awt.Color(139, 195, 74));
        masi3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masi3.setText("CARGA MASIVA");
        masi3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masi3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masi3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                masi3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                masi3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout carga3Layout = new javax.swing.GroupLayout(carga3);
        carga3.setLayout(carga3Layout);
        carga3Layout.setHorizontalGroup(
            carga3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masi3, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        carga3Layout.setVerticalGroup(
            carga3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(masi3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        expo3.setBackground(new java.awt.Color(102, 102, 102));
        expo3.setPreferredSize(new java.awt.Dimension(150, 55));
        expo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expo3MouseClicked(evt);
            }
        });

        pdf3.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        pdf3.setForeground(new java.awt.Color(139, 195, 74));
        pdf3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pdf3.setText("EXPORTAR LISTADO A PDF");
        pdf3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pdf3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdf3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pdf3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pdf3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout expo3Layout = new javax.swing.GroupLayout(expo3);
        expo3.setLayout(expo3Layout);
        expo3Layout.setHorizontalGroup(
            expo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pdf3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        expo3Layout.setVerticalGroup(
            expo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pdf3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        cerrar3.setBackground(new java.awt.Color(102, 102, 102));

        sesion3.setBackground(new java.awt.Color(255, 255, 255));
        sesion3.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N
        sesion3.setForeground(new java.awt.Color(0, 0, 0));
        sesion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesion3.setText("Cerrar Sesión");
        sesion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sesion3.setPreferredSize(new java.awt.Dimension(70, 43));
        sesion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sesion3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sesion3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sesion3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrar3Layout = new javax.swing.GroupLayout(cerrar3);
        cerrar3.setLayout(cerrar3Layout);
        cerrar3Layout.setHorizontalGroup(
            cerrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sesion3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        cerrar3Layout.setVerticalGroup(
            cerrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sesion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCLayout = new javax.swing.GroupLayout(panelC);
        panelC.setLayout(panelCLayout);
        panelCLayout.setHorizontalGroup(
            panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCLayout.createSequentialGroup()
                        .addComponent(crearS2, 148, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(Update3, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCLayout.createSequentialGroup()
                        .addComponent(elimi3, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carga3, 147, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(expo3, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cerrar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCLayout.setVerticalGroup(
            panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addGroup(panelCLayout.createSequentialGroup()
                        .addGroup(panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(crearS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(elimi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carga3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(expo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Clientes", panelC);

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
        exit.setBackground(new Color(102, 102, 102));
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
        cerrar.setBackground(new Color(102, 102, 102));
        cerrar.setForeground(Color.black);
    }//GEN-LAST:event_sesionMouseExited

    private void textbutom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutom1MouseClicked
        AddS as = new AddS();
        as.setVisible(true);
        dispose();       
    }//GEN-LAST:event_textbutom1MouseClicked

    private void textbutom1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutom1MouseEntered
        crearS.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_textbutom1MouseEntered

    private void textbutom1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutom1MouseExited
        crearS.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_textbutom1MouseExited

    private void crearSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearSMouseClicked

    private void Modi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modi1MouseClicked
     
        enviar_datosS();
        
    }//GEN-LAST:event_Modi1MouseClicked

    private void Modi1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modi1MouseEntered
        Update1.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_Modi1MouseEntered

    private void Modi1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modi1MouseExited
        Update1.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_Modi1MouseExited

    private void Update1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Update1MouseClicked

    private void Update1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Update1MouseEntered

    private void Update1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Update1MouseExited

    private void ELI1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELI1MouseClicked
       eliminar_datosS();
    }//GEN-LAST:event_ELI1MouseClicked
  
    private void eliminar_datosS(){
    
    int codigo = (int) tablaS.getValueAt(tablaS.getSelectedRow(), 0);

         EliS ev = new EliS();
         ev.EliMostrarS(codigo);
         ev.setVisible(true);
         dispose();
         SucursalesDAORelacional sd = new SucursalesDAORelacional();
         sd.eliminar_sucursales(codigo);
  


    }
    private void ELI1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELI1MouseEntered
       elimi1.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_ELI1MouseEntered

    private void ELI1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELI1MouseExited
       elimi1.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_ELI1MouseExited

    private void elimi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elimi1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_elimi1MouseClicked

    private void masi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masi1MouseClicked
      
          JsonCarga archivo = new JsonCarga();
          String leerarchivo = archivo.leerarchivo();
          cargaMasivaS(leerarchivo);
          datosS();
    }//GEN-LAST:event_masi1MouseClicked

    private void cargaMasivaS(String leerarchivo) {
        String archivo_retorno = leerarchivo;
        JsonParser parse = new JsonParser();
        JsonArray matriz = parse.parse(archivo_retorno).getAsJsonArray();

        for (int i = 0; i < matriz.size(); i++) {
            JsonObject object = matriz.get(i).getAsJsonObject();
            String nombre = object.get("nombre").getAsString();
            String direccion = object.get("direccion").getAsString();
            String correo = object.get("correo").getAsString();
            int telefono = object.get("telefono").getAsInt();
 
            sucursalesM in = new sucursalesM(nombre, direccion, correo, telefono);
            SucursalesDAORelacional insert = new SucursalesDAORelacional();
            insert.crear_sucursal(in);

        }
    }
    
    private void masi1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masi1MouseEntered
        carga1.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_masi1MouseEntered

    private void masi1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masi1MouseExited
        carga1.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_masi1MouseExited

    private void carga1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carga1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carga1MouseClicked

    private void pdf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdf1MouseClicked
        exportarPDFs();
    }//GEN-LAST:event_pdf1MouseClicked

    
    
    public void exportarPDFs() {
        Document doc = new Document();
        try {

            FileOutputStream gen = new FileOutputStream("Listado Oficial Sucursales.pdf");
            

            PdfWriter.getInstance(doc, gen);
            doc.open();
            
            Paragraph titulo = new Paragraph("Listado Sucursales");
            titulo.setAlignment(Element.ALIGN_CENTER);
            Font fontTitulo = FontFactory.getFont(FontFactory.COURIER, 24, Font.BOLD, new BaseColor(0, 102, 204));
            titulo.setFont(fontTitulo);
            doc.add(titulo);

            doc.add(new Paragraph("\n"));
            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);

            float[] cAn = {2f, 2f, 2f, 1f};
            tabla.setWidths(cAn);


            Font fontHeader = FontFactory.getFont("Russo One", 13, Font.BOLD, new BaseColor(139, 195, 74));

            PdfPCell celdaNombreS = new PdfPCell(new Phrase("Nombre", fontHeader));
            celdaNombreS.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaNombreS);

            PdfPCell celdaDireccion = new PdfPCell(new Phrase("Direccion", fontHeader));
            celdaDireccion.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaDireccion);

            PdfPCell celdaCorreo = new PdfPCell(new Phrase("Correo", fontHeader));
            celdaCorreo.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaCorreo);

            PdfPCell celdaTelefono = new PdfPCell(new Phrase("Telefono", fontHeader));
            celdaTelefono.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaTelefono);
            
            
            
            try {
                String sql = "select * from sucursales";
                con = acceso.Conectar();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        
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
    
    private void pdf1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdf1MouseEntered
       expo1.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_pdf1MouseEntered

    private void pdf1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdf1MouseExited
       expo1.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_pdf1MouseExited

    private void expo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_expo1MouseClicked

    private void sesion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesion1MouseClicked
        Login lo = new Login();
        lo.setVisible(true);
        dispose();
    }//GEN-LAST:event_sesion1MouseClicked

    private void sesion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesion1MouseEntered
         cerrar1.setBackground(Color.red);
         cerrar1.setForeground(Color.white);
    }//GEN-LAST:event_sesion1MouseEntered

    private void sesion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesion1MouseExited
        cerrar1.setBackground(new Color(102, 102, 102));
        cerrar1.setForeground(Color.black);
    }//GEN-LAST:event_sesion1MouseExited

    private void textbutom2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutom2MouseClicked
     
        AddP ap = new AddP();
        ap.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_textbutom2MouseClicked

    private void textbutom2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutom2MouseEntered
      crearS1.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_textbutom2MouseEntered

    private void textbutom2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutom2MouseExited
       
     crearS1.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_textbutom2MouseExited

    private void crearS1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearS1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearS1MouseClicked

    private void Modi2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modi2MouseClicked
       
        enviar_datosP();
        
    }//GEN-LAST:event_Modi2MouseClicked

    private void enviar_datosP(){
    
    int codigo = (int) tablaP.getValueAt(tablaP.getSelectedRow(), 0);
        
         UpP pu = new UpP();
         pu.MostrarP(codigo);
         pu.setVisible(true);
         dispose();
       
    }
    
    private void Modi2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modi2MouseEntered
        
        
     Update2.setBackground(new Color(0, 156, 223));
        
    }//GEN-LAST:event_Modi2MouseEntered

    private void Modi2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modi2MouseExited
       Update2.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_Modi2MouseExited

    private void Update2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Update2MouseClicked

    private void Update2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Update2MouseEntered

    private void Update2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Update2MouseExited

    private void ELI2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELI2MouseClicked
      
     eliminar_datosP();
    }//GEN-LAST:event_ELI2MouseClicked

    private void eliminar_datosP(){
    
    int codigo = (int) tablaP.getValueAt(tablaP.getSelectedRow(), 0);

         EliP eP = new EliP();
         eP.EliMostrarP(codigo);
         eP.setVisible(true);
         dispose();
         ProductosDAORelacional pd = new ProductosDAORelacional();
         pd.eliminar_productos(codigo);
  


    }
    
    
    private void ELI2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELI2MouseEntered
        elimi2.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_ELI2MouseEntered

    private void ELI2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELI2MouseExited
        elimi2.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_ELI2MouseExited

    private void elimi2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elimi2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_elimi2MouseClicked

    private void masi2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masi2MouseClicked
      
          JsonCarga archivo = new JsonCarga();
          String leerarchivo = archivo.leerarchivo();
          cargaMasivaP(leerarchivo);
          datosP();
    }//GEN-LAST:event_masi2MouseClicked

    private void cargaMasivaP(String leerarchivo) {
        String archivo_retorno = leerarchivo;
        JsonParser parse = new JsonParser();
        JsonArray matriz = parse.parse(archivo_retorno).getAsJsonArray();

        for (int i = 0; i < matriz.size(); i++) {
            JsonObject object = matriz.get(i).getAsJsonObject();
            String nombre = object.get("nombre").getAsString();
            String descripcion = object.get("descripcion").getAsString();
            int cantidad = object.get("cantidad").getAsInt();
            float telefono = object.get("precio").getAsFloat();
 
            productosM in = new productosM(nombre, descripcion, cantidad, telefono);
            ProductosDAORelacional insertP = new ProductosDAORelacional();
            insertP.crear_productos(in);

        }
    }
    
    
    private void masi2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masi2MouseEntered
       carga2.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_masi2MouseEntered

    private void masi2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masi2MouseExited
      carga2.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_masi2MouseExited

    private void carga2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carga2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carga2MouseClicked

    private void pdf2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdf2MouseClicked
       
        exportarPDFp();
    }//GEN-LAST:event_pdf2MouseClicked

    
    public void exportarPDFp() {
        Document doc = new Document();
        try {

            FileOutputStream gen = new FileOutputStream("Listado Oficial Productos.pdf");
            

            PdfWriter.getInstance(doc, gen);
            doc.open();
            
            Paragraph titulo = new Paragraph("Listado Productos");
            titulo.setAlignment(Element.ALIGN_CENTER);
            Font fontTitulo = FontFactory.getFont(FontFactory.COURIER, 24, Font.BOLD, new BaseColor(0, 102, 204));
            titulo.setFont(fontTitulo);
            doc.add(titulo);

            doc.add(new Paragraph("\n"));
            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);

            float[] cAn = {2f, 2f, 2f, 1f};
            tabla.setWidths(cAn);


            Font fontHeader = FontFactory.getFont("Russo One", 13, Font.BOLD, new BaseColor(139, 195, 74));

            PdfPCell celdaNombreS = new PdfPCell(new Phrase("Nombre", fontHeader));
            celdaNombreS.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaNombreS);

            PdfPCell celdaDireccion = new PdfPCell(new Phrase("Descripcion", fontHeader));
            celdaDireccion.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaDireccion);

            PdfPCell celdaCorreo = new PdfPCell(new Phrase("Cantidad", fontHeader));
            celdaCorreo.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaCorreo);

            PdfPCell celdaTelefono = new PdfPCell(new Phrase("Precio", fontHeader));
            celdaTelefono.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaTelefono);
            
            
            
            try {
                String sql = "select * from productos";
                con = acceso.Conectar();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        
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
    
    
    
    
    
    private void pdf2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdf2MouseEntered
        expo2.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_pdf2MouseEntered

    private void pdf2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdf2MouseExited
        expo2.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_pdf2MouseExited

    private void expo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expo2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_expo2MouseClicked

    private void sesion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesion2MouseClicked
        Login lo = new Login();
        lo.setVisible(true);
        dispose();
    }//GEN-LAST:event_sesion2MouseClicked

    private void sesion2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesion2MouseEntered
         cerrar2.setBackground(Color.red);
         cerrar2.setForeground(Color.white);
    }//GEN-LAST:event_sesion2MouseEntered

    private void sesion2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesion2MouseExited
        cerrar2.setBackground(new Color(102, 102, 102));
        cerrar2.setForeground(Color.black);
    }//GEN-LAST:event_sesion2MouseExited

    private void textbutom3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutom3MouseClicked
     AddC ac = new AddC();
     ac.setVisible(true);
     dispose();
    }//GEN-LAST:event_textbutom3MouseClicked

    private void textbutom3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutom3MouseEntered
        crearS2.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_textbutom3MouseEntered

    private void textbutom3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textbutom3MouseExited
       crearS2.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_textbutom3MouseExited

    private void crearS2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearS2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearS2MouseClicked

    private void Modi3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modi3MouseClicked
        
        enviar_datosC();
    }//GEN-LAST:event_Modi3MouseClicked
 
    private void enviar_datosC(){
    
    int codigo = (int) tablaC.getValueAt(tablaC.getSelectedRow(), 0);
        
         UpC cu = new UpC();
         cu.MostrarC(codigo);
         cu.setVisible(true);
         dispose();
       
    }
    private void Modi3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modi3MouseEntered
       Update3.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_Modi3MouseEntered

    private void Modi3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modi3MouseExited
       Update3.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_Modi3MouseExited

    private void Update3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Update3MouseClicked

    private void Update3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Update3MouseEntered

    private void Update3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Update3MouseExited

    private void ELI3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELI3MouseClicked
       
        eliminar_datosC();
    }//GEN-LAST:event_ELI3MouseClicked

    private void eliminar_datosC(){
    
    int codigo = (int) tablaC.getValueAt(tablaC.getSelectedRow(), 0);

         EliC ec = new EliC();
         ec.EliMostrarC(codigo);
         ec.setVisible(true);
         dispose();
         ClientesDAORelacional cd = new ClientesDAORelacional();
         cd.eliminar_clientes(codigo);
         
  


    }
    
    
    private void ELI3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELI3MouseEntered
        
        elimi3.setBackground(new Color(0, 156, 223));

    }//GEN-LAST:event_ELI3MouseEntered

    private void ELI3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELI3MouseExited
        elimi3.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_ELI3MouseExited

    private void elimi3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elimi3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_elimi3MouseClicked

    private void masi3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masi3MouseClicked
     
          JsonCarga archivo = new JsonCarga();
          String leerarchivo = archivo.leerarchivo();
          cargaMasivaC(leerarchivo);
          datosC();
        
    }//GEN-LAST:event_masi3MouseClicked

    
    private void cargaMasivaC(String leerarchivo) {
        String archivo_retorno = leerarchivo;
        JsonParser parse = new JsonParser();
        JsonArray matriz = parse.parse(archivo_retorno).getAsJsonArray();

        for (int i = 0; i < matriz.size(); i++) {
            JsonObject object = matriz.get(i).getAsJsonObject();
            String nombre = object.get("nombre").getAsString();
            int nit = object.get("nit").getAsInt();
            String correo = object.get("correo").getAsString();
            String genero = object.get("genero").getAsString();
 
            clientesM in = new clientesM(nombre, nit, correo, genero);
            ClientesDAORelacional insertC = new ClientesDAORelacional();
            insertC.crear_clientes(in);

        }
    }
    
    private void masi3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masi3MouseEntered
        carga3.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_masi3MouseEntered

    private void masi3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masi3MouseExited
       carga3.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_masi3MouseExited

    private void carga3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carga3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carga3MouseClicked

    private void pdf3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdf3MouseClicked
        
        exportarPDFc();
    }//GEN-LAST:event_pdf3MouseClicked

    public void exportarPDFc() {
        Document doc = new Document();
        try {

            FileOutputStream gen = new FileOutputStream("Listado Oficial Clientes.pdf");
            

            PdfWriter.getInstance(doc, gen);
            doc.open();
            
            Paragraph titulo = new Paragraph("Listado Clientes");
            titulo.setAlignment(Element.ALIGN_CENTER);
            Font fontTitulo = FontFactory.getFont(FontFactory.COURIER, 24, Font.BOLD, new BaseColor(0, 102, 204));
            titulo.setFont(fontTitulo);
            doc.add(titulo);

            doc.add(new Paragraph("\n"));
            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);

            float[] cAn = {2f, 2f, 2f, 1f};
            tabla.setWidths(cAn);


            Font fontHeader = FontFactory.getFont("Russo One", 13, Font.BOLD, new BaseColor(139, 195, 74));

            PdfPCell celdaNombreS = new PdfPCell(new Phrase("Nombre", fontHeader));
            celdaNombreS.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaNombreS);

            PdfPCell celdaNIT = new PdfPCell(new Phrase("NIT", fontHeader));
            celdaNIT.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaNIT);

            PdfPCell celdaCorreo = new PdfPCell(new Phrase("Correo", fontHeader));
            celdaCorreo.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaCorreo);

            PdfPCell celdaGenero = new PdfPCell(new Phrase("Genero", fontHeader));
            celdaGenero.setBackgroundColor(new BaseColor(0, 156, 223));
            tabla.addCell(celdaGenero);
            
            
            
            try {
                String sql = "select * from clientes";
                con = acceso.Conectar();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        
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
    
    private void pdf3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdf3MouseEntered
        expo3.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_pdf3MouseEntered

    private void pdf3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdf3MouseExited
        expo3.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_pdf3MouseExited

    private void expo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expo3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_expo3MouseClicked

    private void sesion3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesion3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sesion3MouseClicked

    private void sesion3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesion3MouseEntered
       cerrar3.setBackground(Color.red);
         cerrar3.setForeground(Color.white);
    }//GEN-LAST:event_sesion3MouseEntered

    private void sesion3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesion3MouseExited
        cerrar3.setBackground(new Color(102, 102, 102));
        cerrar3.setForeground(Color.black);
    }//GEN-LAST:event_sesion3MouseExited

    
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
    
   private void datosS(){
    
    String columnas []={"Codigo","Nombre","Direccion","Correo","Telefono"};
    tablaS3 = new DefaultTableModel(null, columnas);
//    VendedoresDAORelacional vd = new VendedoresDAORelacional();
SucursalesDAORelacional sd = new SucursalesDAORelacional();
        for (sucursalesM datS : sd.ListarS()) {
            Object ayudaS [] = new Object[5];

              ayudaS[0] = datS.getCodido();
              ayudaS[1] = datS.getNombre();
              ayudaS[2] = datS.getDireccion();
              ayudaS[3] = datS.getCorreo();
              ayudaS[4] = datS.getTelefono();
            tablaS3.addRow(ayudaS);
        }
    tablaS.setModel(tablaS3);
    }

   private void enviar_datosS(){
    
    int codigo = (int) tablaS.getValueAt(tablaS.getSelectedRow(), 0);
        
         UpS mu = new UpS();
         mu.MostrarS(codigo);
         mu.setVisible(true);
         dispose();
       
    }
   
   
   private void datosP(){
    
    String columnas []={"Codigo","Nombre","Descripcion","Cantidad","Precio"};
    tablaP4 = new DefaultTableModel(null, columnas);
    ProductosDAORelacional pd = new ProductosDAORelacional();
        for (productosM dat : pd.ListarP()) {
            Object ayuda [] = new Object[5];
            ayuda[0] = dat.getCodigo();
            ayuda[1] = dat.getNombre();
            ayuda[2] = dat.getDescripcion();
            ayuda[3] = dat.getCantidad();
            ayuda[4] = dat.getPrecio();
            tablaP4.addRow(ayuda);
        }
    tablaP.setModel(tablaP4);
    }
   
   
   private void datosC(){
    
    String columnas []={"Codigo","Nombre","NIT","Correo","Genero"};
    tablaC5 = new DefaultTableModel(null, columnas);
    
       ClientesDAORelacional cd =new ClientesDAORelacional();
        for (clientesM dat : cd.ListarC()) {
            Object ayuda [] = new Object[5];
            ayuda[0] = dat.getCodigo();
            ayuda[1] = dat.getNombre();
            ayuda[2] = dat.getNit();
            ayuda[3] = dat.getCorreo();
            ayuda[4] = dat.getGenero();
            tablaC5.addRow(ayuda);
        }
    tablaC.setModel(tablaC5);
    }
   
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ELI;
    private javax.swing.JLabel ELI1;
    private javax.swing.JLabel ELI2;
    private javax.swing.JLabel ELI3;
    private javax.swing.JLabel Modi;
    private javax.swing.JLabel Modi1;
    private javax.swing.JLabel Modi2;
    private javax.swing.JLabel Modi3;
    private javax.swing.JPanel Update;
    private javax.swing.JPanel Update1;
    private javax.swing.JPanel Update2;
    private javax.swing.JPanel Update3;
    private javax.swing.JPanel carga;
    private javax.swing.JPanel carga1;
    private javax.swing.JPanel carga2;
    private javax.swing.JPanel carga3;
    private javax.swing.JPanel cerrar;
    private javax.swing.JPanel cerrar1;
    private javax.swing.JPanel cerrar2;
    private javax.swing.JPanel cerrar3;
    private javax.swing.JPanel crear;
    private javax.swing.JPanel crearS;
    private javax.swing.JPanel crearS1;
    private javax.swing.JPanel crearS2;
    private javax.swing.JPanel elimi;
    private javax.swing.JPanel elimi1;
    private javax.swing.JPanel elimi2;
    private javax.swing.JPanel elimi3;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel expo;
    private javax.swing.JPanel expo1;
    private javax.swing.JPanel expo2;
    private javax.swing.JPanel expo3;
    private javax.swing.JPanel head;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel masi;
    private javax.swing.JLabel masi1;
    private javax.swing.JLabel masi2;
    private javax.swing.JLabel masi3;
    private javax.swing.JPanel panelC;
    private javax.swing.JPanel panelP;
    private javax.swing.JPanel panelS;
    private javax.swing.JPanel panelV;
    private javax.swing.JLabel pdf;
    private javax.swing.JLabel pdf1;
    private javax.swing.JLabel pdf2;
    private javax.swing.JLabel pdf3;
    private javax.swing.JLabel sesion;
    private javax.swing.JLabel sesion1;
    private javax.swing.JLabel sesion2;
    private javax.swing.JLabel sesion3;
    private javax.swing.JTable tablaC;
    private javax.swing.JTable tablaP;
    private javax.swing.JTable tablaS;
    private javax.swing.JTable tablaV;
    private javax.swing.JLabel textbutom;
    private javax.swing.JLabel textbutom1;
    private javax.swing.JLabel textbutom2;
    private javax.swing.JLabel textbutom3;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
