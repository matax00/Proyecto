/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO;

import java.awt.MouseInfo;
import java.awt.Point;

/**
 *
 * @author FerSotox
 */
public class Recibo2 extends javax.swing.JFrame {

    /**
     * Creates new form Recibo2
     */
    public Recibo2() {
        this.setUndecorated(true);
        initComponents();
    }
    
    int x,y;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNoReparados = new javax.swing.JLabel();
        casa = new javax.swing.JButton();
        lblNombreCliente = new javax.swing.JLabel();
        lblTipoServicio = new javax.swing.JLabel();
        lblEquipo = new javax.swing.JLabel();
        cliente = new javax.swing.JLabel();
        lblNoReparados5 = new javax.swing.JLabel();
        lblNoReparados6 = new javax.swing.JLabel();
        Estado = new javax.swing.JLabel();
        lblEstadoservicio = new javax.swing.JLabel();
        btnCobrar = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNoReparados.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        lblNoReparados.setForeground(new java.awt.Color(204, 255, 255));
        lblNoReparados.setText("Datos del servicio");
        jPanel1.add(lblNoReparados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 420, 50));

        casa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inicio.png"))); // NOI18N
        casa.setToolTipText("Ir Atras");
        casa.setBorderPainted(false);
        casa.setContentAreaFilled(false);
        casa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        casa.setFocusPainted(false);
        casa.setFocusable(false);
        casa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casaActionPerformed(evt);
            }
        });
        jPanel1.add(casa, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 80, 80));

        lblNombreCliente.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(204, 255, 255));
        lblNombreCliente.setText("Jose Torres");
        jPanel1.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 260, 50));

        lblTipoServicio.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblTipoServicio.setForeground(new java.awt.Color(204, 255, 255));
        lblTipoServicio.setText("Reparacion de telefono");
        jPanel1.add(lblTipoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 280, 50));

        lblEquipo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblEquipo.setForeground(new java.awt.Color(204, 255, 255));
        lblEquipo.setText("Samsung Galaxy S2");
        jPanel1.add(lblEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 240, 50));

        cliente.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        cliente.setForeground(new java.awt.Color(204, 255, 255));
        cliente.setText("Cliente");
        jPanel1.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 30));

        lblNoReparados5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblNoReparados5.setForeground(new java.awt.Color(204, 255, 255));
        lblNoReparados5.setText("Tipo de servicio");
        jPanel1.add(lblNoReparados5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 210, 30));

        lblNoReparados6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblNoReparados6.setForeground(new java.awt.Color(204, 255, 255));
        lblNoReparados6.setText("Equipo");
        jPanel1.add(lblNoReparados6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 210, 30));

        Estado.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        Estado.setForeground(new java.awt.Color(204, 255, 255));
        Estado.setText("Estado de servicio");
        jPanel1.add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 330, 50));

        lblEstadoservicio.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblEstadoservicio.setForeground(new java.awt.Color(204, 255, 255));
        lblEstadoservicio.setText("Realizado");
        jPanel1.add(lblEstadoservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 120, 50));

        btnCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cobrar64.png"))); // NOI18N
        btnCobrar.setToolTipText("Ir a Factura");
        btnCobrar.setBorderPainted(false);
        btnCobrar.setContentAreaFilled(false);
        btnCobrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCobrar.setFocusPainted(false);
        btnCobrar.setFocusable(false);
        btnCobrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cobrar54.png"))); // NOI18N
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 70, 70));

        FONDO.setBackground(new java.awt.Color(204, 204, 204));
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/20FB742C2.jpg"))); // NOI18N
        FONDO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FONDO.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FONDOMouseDragged(evt);
            }
        });
        FONDO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FONDOMousePressed(evt);
            }
        });
        FONDO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FONDOKeyPressed(evt);
            }
        });
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casaActionPerformed
        dispose();
    }//GEN-LAST:event_casaActionPerformed

    private void FONDOMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FONDOMouseDragged

        Point point = MouseInfo.getPointerInfo().getLocation() ;
        setLocation(point.x - x, point.y - y )  ;
    }//GEN-LAST:event_FONDOMouseDragged

    private void FONDOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FONDOMousePressed

        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_FONDOMousePressed

    private void FONDOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FONDOKeyPressed

    }//GEN-LAST:event_FONDOKeyPressed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseEntered

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
 Factura fac=new Factura();
      fac.setLocationRelativeTo(fac);
      fac.setResizable(false);
      fac.setVisible(true);
             
        
    }//GEN-LAST:event_btnCobrarActionPerformed

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
            java.util.logging.Logger.getLogger(Recibo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recibo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recibo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recibo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recibo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton casa;
    private javax.swing.JLabel cliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEquipo;
    private javax.swing.JLabel lblEstadoservicio;
    private javax.swing.JLabel lblNoReparados;
    private javax.swing.JLabel lblNoReparados5;
    private javax.swing.JLabel lblNoReparados6;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblTipoServicio;
    // End of variables declaration//GEN-END:variables
}
