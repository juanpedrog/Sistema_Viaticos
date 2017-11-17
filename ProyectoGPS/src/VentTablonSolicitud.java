
import com.itextpdf.text.DocumentException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DenisseYEA
 */
public class VentTablonSolicitud extends javax.swing.JFrame {

    SolicitudView s;
    CrearPDF pdf = new CrearPDF();
    int posx, posy, i, c;
    DefaultTableModel modelo;

    /**
     * Creates new form VentTablonSolicitud
     */
    public VentTablonSolicitud() {
        initComponents();
        jButton3.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Puesto");
        modelo.addColumn("Fecha de salida");
        modelo.addColumn("Fecha de llegada");
        modelo.addColumn("Lugar");
        this.jTable1.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlcerrar = new javax.swing.JLabel();
        jlmini = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jlFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlcerrarMouseClicked(evt);
            }
        });
        getContentPane().add(jlcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 50, 20));

        jlmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlminiMouseClicked(evt);
            }
        });
        getContentPane().add(jlmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 40, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pendientes", "Aceptadas", "Canceladas" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 120, -1));

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 90, -1));

        jButton3.setText("ASIGNAR MONTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jButton4.setText("CONSULTAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jLabel1.setText("BUSCAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel2.setText("TABLÒN DE SOLICITUD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 750, 300));

        jButton5.setText("OFICIO DE COMISIÒN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jButton6.setText("OFICIO DE VIÀTICOS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, -1));

        jlFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prueba6.png"))); // NOI18N
        jlFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jlFondoMouseDragged(evt);
            }
        });
        jlFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlFondoMousePressed(evt);
            }
        });
        getContentPane().add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlFondoMouseDragged
        int xp = evt.getXOnScreen() - posx;
        int yp = evt.getYOnScreen() - posy;
        this.setLocation(xp, yp);
    }//GEN-LAST:event_jlFondoMouseDragged

    private void jlFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlFondoMousePressed
        posx = evt.getX();
        posy = evt.getY();
    }//GEN-LAST:event_jlFondoMousePressed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        switch (jComboBox1.getSelectedIndex()) {
            case 0: {
                jButton3.setVisible(false);
                jButton2.setVisible(true);
                jButton1.setVisible(true);
                jButton5.setVisible(false);
                jButton6.setVisible(false);
                SolicitudP();
                i = 0;
                break;
            }
            case 1: {
                jButton1.setVisible(false);
                jButton3.setVisible(true);
                jButton2.setVisible(true);
                jButton5.setVisible(true);
                jButton6.setVisible(true);
                SolicitudA();
                i = 1;
                break;
            }
            case 2: {
                jButton3.setVisible(false);
                jButton2.setVisible(false);
                jButton1.setVisible(true);
                jButton5.setVisible(false);
                jButton6.setVisible(false);
                SolicitudC();
                i = 2;
                break;
            }
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (i == 0) {
            int i = jTable1.getSelectedRow();
            if (i >= 0) {
                String id = jTable1.getValueAt(i, 0).toString();
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");

                    Statement sentencia = con.createStatement();

                    sentencia.executeUpdate("UPDATE solicitud SET Estado = 'C' WHERE (idSolicitud = '" + id + "')");
                    javax.swing.JOptionPane.showMessageDialog(null, "Solicitud cancelada");

                } catch (SQLException ex) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }//fin del catch

            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Seleccionar solicitud");
            }
            SolicitudP();
        } else {
            int i = jTable1.getSelectedRow();
            if (i >= 0) {
                String folio = jTable1.getValueAt(i, 0).toString();
                String idSolicitud = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");

                    Statement sentencia = con.createStatement();
                    ResultSet rs = sentencia.executeQuery("SELECT Solicitud_idSolicitud FROM oficio_comision WHERE Folio = '" + folio + "'");
                    while (rs.next()) {
                        idSolicitud = rs.getString("Solicitud_idSolicitud");
                    }
                    sentencia.execute("DELETE FROM oficio_comision WHERE (Folio = " + folio + ")");
                    sentencia.executeUpdate("UPDATE solicitud SET Estado = 'C' WHERE (idSolicitud = " + idSolicitud + ")");
                    javax.swing.JOptionPane.showMessageDialog(null, "Solicitud cancelada");

                } catch (SQLException ex) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }//fin del catch

            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Seleccionar solicitud");
            }
            int filas = jTable1.getRowCount();
            if (filas != 0) {
                for (int j = 0; filas > j; j++) {
                    modelo.removeRow(0);
                }
            }
            SolicitudA();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jlcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlcerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlcerrarMouseClicked

    private void jlminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlminiMouseClicked

        setExtendedState(JFrame.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_jlminiMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int k = jTable1.getSelectedRow();
        if (k >= 0) {
            int id = Integer.parseInt(jTable1.getValueAt(k, 0).toString());

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");

                Statement sentencia = con.createStatement();
                String valor = javax.swing.JOptionPane.showInputDialog("Asignar folio");
                if (valor == null) {
                } else {
                    int folio = Integer.parseInt(valor);
                    sentencia.execute("INSERT INTO oficio_comision VALUES(" + folio + "," + id + "," + 0.00 + ")");

                    sentencia.executeUpdate("UPDATE solicitud SET Estado = 'A' WHERE (idSolicitud = '" + id + "')");

                    javax.swing.JOptionPane.showMessageDialog(null, "Solicitud aceptada");
                }

            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta o folio ya asignado");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (NumberFormatException exp){
                javax.swing.JOptionPane.showMessageDialog(null, "Ingresar solo números");
            }//fin del catch

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Seleccionar solicitud");
        }
        int filas = jTable1.getRowCount();
        if (filas != 0) {
            for (int j = 0; filas > j; j++) {
                modelo.removeRow(0);

            }

        }
        if (i == 0) {
            SolicitudP();
        } else {
            SolicitudC();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int k = jTable1.getSelectedRow();
        if (k >= 0) {
            String folio = jTable1.getValueAt(k, 0).toString();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");

                Statement sentencia = con.createStatement();
                String valor = javax.swing.JOptionPane.showInputDialog("Asignar monto");
                
                if (valor == null) {

                } else {
                    float monto = Float.parseFloat(valor);
                    sentencia.executeUpdate("UPDATE oficio_comision SET Monto = " + monto + "WHERE(Folio =" + folio + ")");
                    javax.swing.JOptionPane.showMessageDialog(null, "Monto Asignado");
                }
            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (NumberFormatException exp){
                javax.swing.JOptionPane.showMessageDialog(null, "Ingresar solo números");
            }//fin del catch

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Seleccionar solicitud");
        }
        int filas = jTable1.getRowCount();
        if (filas != 0) {
            for (int j = 0; filas > j; j++) {
                modelo.removeRow(0);
            }
        }
        SolicitudA();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");

            Statement sentencia = con.createStatement();

            ResultSet rs = sentencia.executeQuery("SELECT idSolicitud,Nombre, Puesto, Fecha_salida, Fecha_llegada,Lugar FROM solicitud WHERE Estado = 'P'");

            String solicitud[] = new String[6];
            while (rs.next()) {
                solicitud[0] = rs.getString("idSolicitud");
                solicitud[1] = rs.getString("Nombre");
                solicitud[2] = rs.getString("Puesto");
                solicitud[3] = rs.getString("Fecha_salida");
                solicitud[4] = rs.getString("Fecha_llegada");
                solicitud[5] = rs.getString("Lugar");
                modelo.addRow(solicitud);
                i = 0;
                c = 0;
            }

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }//fin del catch
    }//GEN-LAST:event_formWindowOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (c == 0) {
            Consultar();
            c = 1;
        } else if (c == 1) {
            s.setVisible(false);
            Consultar();
            c = 0;
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        if (i == 1) {
            modelo = new DefaultTableModel();
            modelo.addColumn("Folio");
            modelo.addColumn("Monto");
            modelo.addColumn("Fecha de salida");
            modelo.addColumn("Fecha de llegada");
            modelo.addColumn("Lugar");
            this.jTable1.setModel(modelo);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");

                Statement sentencia = con.createStatement();

                ResultSet rs = sentencia.executeQuery("SELECT O.Folio, O.Monto, S.Fecha_salida, S.Fecha_llegada,S.Lugar FROM solicitud S, oficio_comision O WHERE S.Estado = 'A' AND S.idSolicitud = O.Solicitud_idSolicitud AND (O.Folio LIKE '%" + jTextField1.getText() + "%'"
                        + "OR O.Monto LIKE '%" + jTextField1.getText() + "%' OR S.Fecha_salida LIKE '%" + jTextField1.getText() + "%' OR S.Fecha_llegada LIKE '%" + jTextField1.getText() + "%'"
                        + "OR S.Lugar LIKE '%" + jTextField1.getText() + "%') ");

                String solicitud[] = new String[5];
                while (rs.next()) {
                    solicitud[0] = rs.getString("Folio");
                    solicitud[1] = rs.getString("Monto");
                    solicitud[2] = rs.getString("Fecha_salida");
                    solicitud[3] = rs.getString("Fecha_llegada");
                    solicitud[4] = rs.getString("Lugar");
                    modelo.addRow(solicitud);
                }

            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }//fin del catch
        }
        if (i == 2) {
            modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Puesto");
            modelo.addColumn("Fecha de salida");
            modelo.addColumn("Fecha de llegada");
            modelo.addColumn("Lugar");
            this.jTable1.setModel(modelo);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");

                Statement sentencia = con.createStatement();

                ResultSet rs = sentencia.executeQuery("SELECT idSolicitud, Nombre, Puesto, Fecha_salida, Fecha_llegada,Lugar FROM solicitud WHERE Estado = 'C' AND (idSolicitud LIKE '%" + jTextField1.getText() + "%'"
                        + "OR Nombre LIKE '%" + jTextField1.getText() + "%' OR Puesto LIKE '%" + jTextField1.getText() + "%' OR Fecha_salida LIKE '%" + jTextField1.getText() + "%' OR Fecha_llegada LIKE '%" + jTextField1.getText() + "%'"
                        + "OR Lugar LIKE '%" + jTextField1.getText() + "%') ");

                String solicitud[] = new String[6];
                while (rs.next()) {
                    solicitud[0] = rs.getString("idSolicitud");
                    solicitud[1] = rs.getString("Nombre");
                    solicitud[2] = rs.getString("Puesto");
                    solicitud[3] = rs.getString("Fecha_salida");
                    solicitud[4] = rs.getString("Fecha_llegada");
                    solicitud[5] = rs.getString("Lugar");
                    modelo.addRow(solicitud);
                }

            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }//fin del catch
        }
        if (i == 0) {
            modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Puesto");
            modelo.addColumn("Fecha de salida");
            modelo.addColumn("Fecha de llegada");
            modelo.addColumn("Lugar");
            this.jTable1.setModel(modelo);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");

                Statement sentencia = con.createStatement();

                ResultSet rs = sentencia.executeQuery("SELECT idSolicitud, Nombre, Puesto, Fecha_salida, Fecha_llegada,Lugar FROM solicitud WHERE Estado = 'P' AND (idSolicitud LIKE '%" + jTextField1.getText() + "%'"
                        + "OR Nombre LIKE '%" + jTextField1.getText() + "%' OR Puesto LIKE '%" + jTextField1.getText() + "%' OR Fecha_salida LIKE '%" + jTextField1.getText() + "%' OR Fecha_llegada LIKE '%" + jTextField1.getText() + "%'"
                        + "OR Lugar LIKE '%" + jTextField1.getText() + "%') ");

                String solicitud[] = new String[6];
                while (rs.next()) {
                    solicitud[0] = rs.getString("idSolicitud");
                    solicitud[1] = rs.getString("Nombre");
                    solicitud[2] = rs.getString("Puesto");
                    solicitud[3] = rs.getString("Fecha_salida");
                    solicitud[4] = rs.getString("Fecha_llegada");
                    solicitud[5] = rs.getString("Lugar");
                    modelo.addRow(solicitud);
                }

            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }//fin del catch
        }

    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        String folio = jTable1.getValueAt(i, 0).toString();
        try {
            pdf.oficio_comision(folio);
        } catch (DocumentException ex) {
            Logger.getLogger(VentTablonSolicitud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        String folio = jTable1.getValueAt(i, 0).toString();
        try {
            pdf.pdfFolio(folio);
        } catch (DocumentException ex) {
            Logger.getLogger(VentTablonSolicitud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    public void SolicitudA() {
        modelo = new DefaultTableModel();
        modelo.addColumn("Folio");
        modelo.addColumn("Monto");
        modelo.addColumn("Fecha de salida");
        modelo.addColumn("Fecha de llegada");
        modelo.addColumn("Lugar");
        this.jTable1.setModel(modelo);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");

            Statement sentencia = con.createStatement();

            ResultSet rs = sentencia.executeQuery("SELECT O.Folio, O.Monto, S.Fecha_salida, S.Fecha_llegada,S.Lugar FROM solicitud S, oficio_comision O WHERE S.Estado = 'A' AND S.idSolicitud = O.Solicitud_idSolicitud");

            String solicitud[] = new String[5];
            while (rs.next()) {
                solicitud[0] = rs.getString("Folio");
                solicitud[1] = rs.getString("Monto");
                solicitud[2] = rs.getString("Fecha_salida");
                solicitud[3] = rs.getString("Fecha_llegada");
                solicitud[4] = rs.getString("Lugar");
                modelo.addRow(solicitud);
            }

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }//fin del catch
    }

    public void SolicitudC() {
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Puesto");
        modelo.addColumn("Fecha de salida");
        modelo.addColumn("Fecha de llegada");
        modelo.addColumn("Lugar");
        this.jTable1.setModel(modelo);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");

            Statement sentencia = con.createStatement();

            ResultSet rs = sentencia.executeQuery("SELECT idSolicitud, Nombre, Puesto, Fecha_salida, Fecha_llegada,Lugar FROM solicitud WHERE Estado = 'C'");

            String solicitud[] = new String[6];
            while (rs.next()) {
                solicitud[0] = rs.getString("idSolicitud");
                solicitud[1] = rs.getString("Nombre");
                solicitud[2] = rs.getString("Puesto");
                solicitud[3] = rs.getString("Fecha_salida");
                solicitud[4] = rs.getString("Fecha_llegada");
                solicitud[5] = rs.getString("Lugar");
                modelo.addRow(solicitud);
            }

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }//fin del catch
    }

    public void SolicitudP() {
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Puesto");
        modelo.addColumn("Fecha de salida");
        modelo.addColumn("Fecha de llegada");
        modelo.addColumn("Lugar");
        this.jTable1.setModel(modelo);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");

            Statement sentencia = con.createStatement();

            ResultSet rs = sentencia.executeQuery("SELECT idSolicitud, Nombre, Puesto, Fecha_salida, Fecha_llegada,Lugar FROM solicitud WHERE Estado = 'P'");

            String solicitud[] = new String[6];
            while (rs.next()) {
                solicitud[0] = rs.getString("idSolicitud");
                solicitud[1] = rs.getString("Nombre");
                solicitud[2] = rs.getString("Puesto");
                solicitud[3] = rs.getString("Fecha_salida");
                solicitud[4] = rs.getString("Fecha_llegada");
                solicitud[5] = rs.getString("Lugar");
                modelo.addRow(solicitud);
            }

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }//fin del catch
    }

    public void Consultar() {
        if (i == 1) {
            int i = jTable1.getSelectedRow();
            if (i >= 0) {
                String folio = jTable1.getValueAt(i, 0).toString();
                String idSolicitud = "";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");

                    Statement sentencia = con.createStatement();
                    ResultSet rs = sentencia.executeQuery("SELECT Solicitud_idSolicitud FROM oficio_comision WHERE Folio = '" + folio + "'");
                    while (rs.next()) {
                        idSolicitud = rs.getString("Solicitud_idSolicitud");
                    }
                    s = new SolicitudView();
                    s.IdUsuario(Integer.parseInt(idSolicitud));
                } catch (SQLException ex) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }//fin del catch
                s.setVisible(true);
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Seleccionar solicitud");
            }
        } else {
            int k = jTable1.getSelectedRow();
            if (k >= 0) {
                int id = Integer.parseInt(jTable1.getValueAt(k, 0).toString());
                s = new SolicitudView();
                s.IdUsuario(id);
                s.setVisible(true);
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Seleccionar solicitud");
            }
        }
    }

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
            java.util.logging.Logger.getLogger(VentTablonSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentTablonSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentTablonSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentTablonSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentTablonSolicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlcerrar;
    private javax.swing.JLabel jlmini;
    // End of variables declaration//GEN-END:variables
}
