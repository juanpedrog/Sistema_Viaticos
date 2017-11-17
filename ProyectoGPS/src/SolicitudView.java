
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DenisseYEA
 */
public class SolicitudView extends javax.swing.JFrame {

    int id;

    /**
     * Creates new form SolicitudView
     */
    public SolicitudView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        lbl_Nombre = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        spr_Nombre = new javax.swing.JSeparator();
        lbl_Fecha_Salida = new javax.swing.JLabel();
        lbl_Fecha_Llegada = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_Actividad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Actividad = new javax.swing.JTextArea();
        lbl_Puesto = new javax.swing.JLabel();
        txt_Puesto = new javax.swing.JTextField();
        lbl_Lugar = new javax.swing.JLabel();
        txt_Lugar = new javax.swing.JTextField();
        lbl_Vehiculo = new javax.swing.JLabel();
        lbl_Pernoctado = new javax.swing.JLabel();
        btn_Cerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setEnabled(false);
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, -1, -1));

        jTextField3.setEditable(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 340, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 170, -1));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 170, -1));

        lbl_Nombre.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbl_Nombre.setText("Nombre");
        getContentPane().add(lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 60, 20));

        txt_Nombre.setEditable(false);
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 290, -1));
        getContentPane().add(spr_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 282, 690, 10));

        lbl_Fecha_Salida.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbl_Fecha_Salida.setText("Fecha de salida");
        getContentPane().add(lbl_Fecha_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 130, -1));

        lbl_Fecha_Llegada.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbl_Fecha_Llegada.setText("Fecha de llegada");
        getContentPane().add(lbl_Fecha_Llegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 140, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 352, 700, 10));

        lbl_Actividad.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbl_Actividad.setText("Actividad a realizar");
        getContentPane().add(lbl_Actividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 150, -1));

        jScrollPane1.setEnabled(false);

        txt_Actividad.setEditable(false);
        txt_Actividad.setColumns(20);
        txt_Actividad.setRows(5);
        jScrollPane1.setViewportView(txt_Actividad);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 670, 80));

        lbl_Puesto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbl_Puesto.setText("Puesto");
        getContentPane().add(lbl_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        txt_Puesto.setEditable(false);
        getContentPane().add(txt_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 80, -1));

        lbl_Lugar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbl_Lugar.setText("Lugar");
        getContentPane().add(lbl_Lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, -1));

        txt_Lugar.setEditable(false);
        getContentPane().add(txt_Lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 90, -1));

        lbl_Vehiculo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbl_Vehiculo.setText("Vehículo");
        getContentPane().add(lbl_Vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 70, -1));

        lbl_Pernoctado.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbl_Pernoctado.setText("Pernoctado");
        getContentPane().add(lbl_Pernoctado, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 90, -1));

        btn_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_CerrarMouseReleased(evt);
            }
        });
        getContentPane().add(btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 40, 40));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 40, 30));

        Fondo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prueba6.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CerrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMouseReleased
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_CerrarMouseReleased

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        // TODO add your handling code here:
        setExtendedState(JFrame.CROSSHAIR_CURSOR);
    }//GEN-LAST:event_jLabel1MouseReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Viaticos", "root", "");
            Statement sentencia = con.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * FROM solicitud WHERE idSolicitud = " + id);
            String p = "";
            while (rs.next()) {
                txt_Nombre.setText(rs.getString("Nombre"));
                txt_Puesto.setText(rs.getString("Puesto"));
                jTextField1.setText(rs.getString("Fecha_salida"));
                jTextField2.setText(rs.getString("Fecha_llegada"));
                txt_Lugar.setText(rs.getString("Lugar"));
                txt_Actividad.setText(rs.getString("Actividad"));
                jTextField3.setText("Vehiculo");
                p = rs.getString("Pernoctado");
            }
            int pern = Integer.parseInt(p);
            if (pern == 1) {
                jRadioButton1.setSelected(true);
            } else {
                jRadioButton1.setSelected(false);
            }
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error en la consulta");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }//fin del catch
    }//GEN-LAST:event_formWindowActivated

    public void IdUsuario(int id) {
        this.id = id;
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
            java.util.logging.Logger.getLogger(SolicitudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolicitudView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel btn_Cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lbl_Actividad;
    private javax.swing.JLabel lbl_Fecha_Llegada;
    private javax.swing.JLabel lbl_Fecha_Salida;
    private javax.swing.JLabel lbl_Lugar;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Pernoctado;
    private javax.swing.JLabel lbl_Puesto;
    private javax.swing.JLabel lbl_Vehiculo;
    private javax.swing.JSeparator spr_Nombre;
    private javax.swing.JTextArea txt_Actividad;
    private javax.swing.JTextField txt_Lugar;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Puesto;
    // End of variables declaration//GEN-END:variables
}
