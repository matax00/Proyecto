/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author FerSo
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Inicio() {
        setUndecorated(true);
        initComponents();
       FONDO.setFocusable(false)  ; 
       Minimizar.setFocusable(false)  ; 
       Cerrar.setFocusable(false)  ; 
       Minimizar.setOpaque(false);
Minimizar.setContentAreaFilled(false);
Minimizar.setBorderPainted(false);
Cerrar.setOpaque(false);
Cerrar.setContentAreaFilled(false);
Cerrar.setBorderPainted(false);
       
    }
    
   int x,y;
   String nombre,clave;
   
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
        Minimizar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        lblTituloIniciarSesion = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        pwrContraseña = new javax.swing.JPasswordField();
        tfieldUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 0));
        setIconImage(getIconImage());
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
        jPanel1.setLayout(null);

        Minimizar.setBackground(new java.awt.Color(255, 255, 255));
        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Minimizar.png"))); // NOI18N
        Minimizar.setToolTipText("Minimizar");
        Minimizar.setBorderPainted(false);
        Minimizar.setContentAreaFilled(false);
        Minimizar.setFocusPainted(false);
        Minimizar.setFocusable(false);
        Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarActionPerformed(evt);
            }
        });
        jPanel1.add(Minimizar);
        Minimizar.setBounds(290, 10, 30, 30);

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cerrar.png"))); // NOI18N
        Cerrar.setToolTipText("Cerrar");
        Cerrar.setBorderPainted(false);
        Cerrar.setContentAreaFilled(false);
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.setFocusPainted(false);
        Cerrar.setFocusable(false);
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(Cerrar);
        Cerrar.setBounds(320, 10, 30, 30);

        lblTituloIniciarSesion.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        lblTituloIniciarSesion.setForeground(new java.awt.Color(204, 255, 255));
        lblTituloIniciarSesion.setText("Iniciar Sesión ");
        jPanel1.add(lblTituloIniciarSesion);
        lblTituloIniciarSesion.setBounds(30, 40, 330, 50);

        lblClave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Contraseña.png"))); // NOI18N
        jPanel1.add(lblClave);
        lblClave.setBounds(70, 150, 60, 60);

        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/entrar.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setToolTipText("Iniciar Sesión");
        btnEntrar.setFocusPainted(false);
        btnEntrar.setFocusable(false);
        btnEntrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEntrarMouseMoved(evt);
            }
        });
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarMouseExited(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar);
        btnEntrar.setBounds(80, 230, 220, 70);

        pwrContraseña.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pwrContraseña.setToolTipText("Ingrese Contraseña");
        pwrContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwrContraseñaActionPerformed(evt);
            }
        });
        pwrContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwrContraseñaKeyPressed(evt);
            }
        });
        jPanel1.add(pwrContraseña);
        pwrContraseña.setBounds(140, 170, 170, 30);

        tfieldUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfieldUsuario.setToolTipText("Ingrese Usuario");
        tfieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfieldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(tfieldUsuario);
        tfieldUsuario.setBounds(140, 110, 170, 30);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Usuario.png"))); // NOI18N
        jPanel1.add(lblUsuario);
        lblUsuario.setBounds(70, 90, 48, 60);

        FONDO.setBackground(new java.awt.Color(204, 204, 204));
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/20FB742C2.jpg"))); // NOI18N
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
        FONDO.setBounds(0, 0, 370, 320);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseEntered

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed

        setExtendedState(ICONIFIED); 
    }//GEN-LAST:event_MinimizarActionPerformed

    private void FONDOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FONDOKeyPressed
 
    }//GEN-LAST:event_FONDOKeyPressed

    private void FONDOMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FONDOMouseDragged
        
        Point point = MouseInfo.getPointerInfo().getLocation() ;
        setLocation(point.x - x, point.y - y )  ; 
    }//GEN-LAST:event_FONDOMouseDragged

    private void FONDOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FONDOMousePressed
        
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_FONDOMousePressed

    private void tfieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfieldUsuarioActionPerformed

    private void pwrContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwrContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwrContraseñaActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        
        
       ConfirmarSalir confir=new ConfirmarSalir();
      
       confir.setResizable(false);
       confir.setLocationRelativeTo(null);
        confir.setVisible(true);
        
    }//GEN-LAST:event_CerrarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
     

        if ((tfieldUsuario.getText().equals("admin"))&& pwrContraseña.getText().equals("admin")){

            Principal p=new Principal();

            p.setResizable(false);
            p.setLocationRelativeTo(null);
            p.setVisible(true);
            dispose();
        }
        else {

        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited

    }//GEN-LAST:event_btnEntrarMouseExited

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseMoved

    }//GEN-LAST:event_btnEntrarMouseMoved

    private void pwrContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwrContraseñaKeyPressed
       
        int enter=evt.getKeyCode();

        if(enter==KeyEvent.VK_ENTER){

         btnEntrar.doClick();
        }
    }//GEN-LAST:event_pwrContraseñaKeyPressed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton Minimizar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblTituloIniciarSesion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pwrContraseña;
    private javax.swing.JTextField tfieldUsuario;
    // End of variables declaration//GEN-END:variables
}
