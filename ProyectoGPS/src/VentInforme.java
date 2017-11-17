
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class VentInforme extends javax.swing.JFrame {

    int posx, posy, i, c;
    DefaultTableModel modelo;

    /**
     * Creates new form VentInforme
     */
    public VentInforme() {
        initComponents();
        jTextArea1.enable(false);
        jTextArea2.enable(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton4.setVisible(false);
        Solicitud("SELECT O.Folio, S.Nombre FROM solicitud S, oficio_comision O WHERE S.Estado = 'A' AND S.Reporte = '0' AND S.idSolicitud = O.Solicitud_idSolicitud");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jlcerrar = new javax.swing.JLabel();
        jlmini = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jlFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 400, 370));

        jLabel1.setText("Observaciones Viaticos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 510, 120));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 510, 130));

        jLabel2.setText("Observaciones Vehículo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, -1, -1));

        jButton1.setText("Regresar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        jButton2.setText("Guardar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solicitudes Aceptadas", "Solicitudes Finalizadas" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, -1));

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

        jButton3.setText("Generar reporte");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jButton4.setText("Consultar Reporte");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

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

    private void jlcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlcerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlcerrarMouseClicked

    private void jlminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlminiMouseClicked

        setExtendedState(JFrame.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_jlminiMouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        switch (jComboBox1.getSelectedIndex()) {
            case 0: {
                Solicitud("SELECT O.Folio, S.Nombre FROM solicitud S, oficio_comision O WHERE S.Estado = 'A' AND S.Reporte = '0' AND S.idSolicitud = O.Solicitud_idSolicitud");
                jButton3.setVisible(true);
                jButton4.setVisible(false);
                break;
            }
            case 1: {
                Solicitud("SELECT O.Folio, S.Nombre FROM solicitud S, oficio_comision O WHERE S.Estado = 'A' AND S.Reporte = '1' AND S.idSolicitud = O.Solicitud_idSolicitud");
                jButton4.setVisible(true);
                jButton3.setVisible(false);
                break;
            }

        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int k = jTable1.getSelectedRow();
        int folio = 0;
        if (k >= 0) {
            folio = Integer.parseInt(jTable1.getValueAt(k, 0).toString());
            int filas = jTable1.getRowCount();
            if (filas != 0) {
                for (int j = 0; filas > j; j++) {
                    modelo.removeRow(0);

                }

            }
            modelo = new DefaultTableModel();
            modelo.addColumn("Descripción");
            modelo.addColumn("Precio");
            this.jTable1.setModel(modelo);
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Seleccionar solicitud");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    public void Solicitud(String s) {
        modelo = new DefaultTableModel();
        modelo.addColumn("Folio");
        modelo.addColumn("Nombre");
        this.jTable1.setModel(modelo);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");

            Statement sentencia = con.createStatement();

            ResultSet rs = sentencia.executeQuery(s);

            String solicitud[] = new String[2];
            while (rs.next()) {
                solicitud[0] = rs.getString("Folio");
                solicitud[1] = rs.getString("Nombre");
                modelo.addRow(solicitud);
            }

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }//fin del catch
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
            java.util.logging.Logger.getLogger(VentInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentInforme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel jlFondo;
    private javax.swing.JLabel jlcerrar;
    private javax.swing.JLabel jlmini;
    // End of variables declaration//GEN-END:variables
}
