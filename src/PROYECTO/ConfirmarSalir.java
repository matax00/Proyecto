/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO;

import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;

/**
 *
 * @author FerSo
 */
public class ConfirmarSalir extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmarSalir
     */
    public ConfirmarSalir() {
        setUndecorated(true);
        initComponents();
        
        
    }

    int x,y;
    
       
    @Override
   public Image getIconImage() {
        Image imagen = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("iconos/icono.png"));


        return imagen;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cerrar = new javax.swing.JButton();
        lblTituloSalir = new javax.swing.JLabel();
        btnSi = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(null);

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cerrar.png"))); // NOI18N
        cerrar.setToolTipText("Cerrar");
        cerrar.setBorderPainted(false);
        cerrar.setContentAreaFilled(false);
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setFocusPainted(false);
        cerrar.setFocusable(false);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar);
        cerrar.setBounds(330, 0, 30, 30);

        lblTituloSalir.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        lblTituloSalir.setForeground(new java.awt.Color(204, 255, 255));
        lblTituloSalir.setText("¿Desea Salir?");
        jPanel1.add(lblTituloSalir);
        lblTituloSalir.setBounds(40, 30, 310, 50);

        btnSi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ok.png"))); // NOI18N
        btnSi.setBorderPainted(false);
        btnSi.setContentAreaFilled(false);
        btnSi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSi.setFocusPainted(false);
        btnSi.setFocusable(false);
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });
        jPanel1.add(btnSi);
        btnSi.setBounds(40, 90, 90, 70);

        btnNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnNo.setBorderPainted(false);
        btnNo.setContentAreaFilled(false);
        btnNo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNo.setFocusPainted(false);
        btnNo.setFocusable(false);
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNo);
        btnNo.setBounds(210, 90, 110, 70);

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
        jPanel1.add(FONDO);
        FONDO.setBounds(0, 0, 370, 170);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_cerrarActionPerformed

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

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
      
        System.exit(0);
    }//GEN-LAST:event_btnSiActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
      dispose();
    }//GEN-LAST:event_btnNoActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmarSalir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmarSalir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmarSalir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmarSalir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){            new ConfirmarSalir().setVisible(true);
            }
        });
                }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi;
    private javax.swing.JButton cerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTituloSalir;
    // End of variables declaration//GEN-END:variables
}
