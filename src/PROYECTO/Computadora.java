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
public class Computadora extends javax.swing.JFrame {

    /**
     * Creates new form Computadora
     */
    public Computadora() {
        setUndecorated(true);
        initComponents();
        
        seleccion.setVisible(true);
        txtescritorio.setVisible(false);
        txtlaptop.setVisible(false);        
        tipoEscri.setVisible(false);
        comboMarcaEscri.setVisible(false);
        txtram.setVisible(false);
        txtcpu.setVisible(false);
        sistemaOperativo.setVisible(false);
        memoriaRam.setVisible(false);
        proceador.setVisible(false);
        comboSO.setVisible(false);
        comboMac.setVisible(false);
        modelo.setVisible(false);
        txtmodelo.setVisible(false);
        marca.setVisible(false);
        txtmarca.setVisible(false);
        comboWindows1.setVisible(false);
        comboLinux.setVisible(false);
        txtdistribuciones.setVisible(false);
        btnCompu.setBorderPainted(false);
        btnLapto.setBorderPainted(false);
        descripcion.setVisible(false);
        descrippcion.setVisible(false);
        marcaEscri.setVisible(false);
        modeloEscri.setVisible(false);
        txtModeloEscri.setVisible(false);
        txtMarcaEscri.setVisible(false);
    }
 int x,y;
 
 
  
 
 
   @Override
   public Image getIconImage() {
        Image imagen = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("iconos/icono.png"));


        return imagen;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblComputadora = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        txtescritorio = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        descrippcion = new javax.swing.JTextField();
        btnLapto = new javax.swing.JButton();
        btnCompu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        comboMarcaEscri = new javax.swing.JComboBox();
        modeloEscri = new javax.swing.JLabel();
        txtModeloEscri = new javax.swing.JTextField();
        tipoEscri = new javax.swing.JLabel();
        marcaEscri = new javax.swing.JLabel();
        txtMarcaEscri = new javax.swing.JTextField();
        comboSO = new javax.swing.JComboBox();
        sistemaOperativo = new javax.swing.JLabel();
        comboLinux = new javax.swing.JComboBox();
        comboMac = new javax.swing.JComboBox();
        comboWindows1 = new javax.swing.JComboBox();
        marca = new javax.swing.JLabel();
        modelo = new javax.swing.JLabel();
        txtmodelo = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtlaptop = new javax.swing.JLabel();
        memoriaRam = new javax.swing.JLabel();
        txtcpu = new javax.swing.JTextField();
        seleccion = new javax.swing.JLabel();
        proceador = new javax.swing.JLabel();
        txtram = new javax.swing.JTextField();
        txtdistribuciones = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        jButton1.setText("jButton1");

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
        jPanel1.setLayout(null);

        lblComputadora.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        lblComputadora.setForeground(new java.awt.Color(255, 255, 255));
        lblComputadora.setText("Computadora ");
        jPanel1.add(lblComputadora);
        lblComputadora.setBounds(10, 10, 370, 50);

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/home_48.png"))); // NOI18N
        atras.setToolTipText("Ir Atras");
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.setFocusPainted(false);
        atras.setFocusable(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras);
        atras.setBounds(610, 500, 70, 70);

        txtescritorio.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtescritorio.setForeground(new java.awt.Color(255, 255, 255));
        txtescritorio.setText("Escritorio");
        jPanel1.add(txtescritorio);
        txtescritorio.setBounds(280, 70, 220, 40);

        descripcion.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        descripcion.setForeground(new java.awt.Color(204, 255, 255));
        descripcion.setText("Descripcion de falla");
        jPanel1.add(descripcion);
        descripcion.setBounds(230, 390, 210, 33);
        jPanel1.add(descrippcion);
        descrippcion.setBounds(230, 430, 420, 70);

        btnLapto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/computadora.png"))); // NOI18N
        btnLapto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        btnLapto.setContentAreaFilled(false);
        btnLapto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLapto.setFocusPainted(false);
        btnLapto.setFocusable(false);
        btnLapto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaptoActionPerformed(evt);
            }
        });
        jPanel1.add(btnLapto);
        btnLapto.setBounds(20, 150, 180, 170);

        btnCompu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/laptox.png"))); // NOI18N
        btnCompu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        btnCompu.setContentAreaFilled(false);
        btnCompu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompu.setFocusPainted(false);
        btnCompu.setFocusable(false);
        btnCompu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompuActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompu);
        btnCompu.setBounds(20, 340, 180, 170);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save_48.png"))); // NOI18N
        jButton2.setToolTipText("Guardar");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jPanel1.add(jButton2);
        jButton2.setBounds(550, 510, 60, 60);

        comboMarcaEscri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboMarcaEscri.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "De Marca", "Generica" }));
        comboMarcaEscri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMarcaEscriActionPerformed(evt);
            }
        });
        jPanel1.add(comboMarcaEscri);
        comboMarcaEscri.setBounds(310, 130, 120, 30);

        modeloEscri.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modeloEscri.setForeground(new java.awt.Color(255, 255, 255));
        modeloEscri.setText("Modelo:");
        jPanel1.add(modeloEscri);
        modeloEscri.setBounds(450, 170, 100, 30);

        txtModeloEscri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtModeloEscri);
        txtModeloEscri.setBounds(520, 170, 140, 30);

        tipoEscri.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tipoEscri.setForeground(new java.awt.Color(255, 255, 255));
        tipoEscri.setText("Tipo:");
        jPanel1.add(tipoEscri);
        tipoEscri.setBounds(240, 130, 100, 30);

        marcaEscri.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        marcaEscri.setForeground(new java.awt.Color(255, 255, 255));
        marcaEscri.setText("Marca:");
        jPanel1.add(marcaEscri);
        marcaEscri.setBounds(450, 130, 100, 30);

        txtMarcaEscri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtMarcaEscri);
        txtMarcaEscri.setBounds(520, 130, 140, 30);

        comboSO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboSO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Windows", "Linux", "Mac" }));
        comboSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSOActionPerformed(evt);
            }
        });
        jPanel1.add(comboSO);
        comboSO.setBounds(370, 210, 130, 30);

        sistemaOperativo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sistemaOperativo.setForeground(new java.awt.Color(255, 255, 255));
        sistemaOperativo.setText("Sistema Operativo");
        jPanel1.add(sistemaOperativo);
        sistemaOperativo.setBounds(220, 210, 150, 30);

        comboLinux.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Debian", "Ubuntu", "Canaima", "Kubuntu", "Knoppix", "Mandriva", "Gentoo", "OpenSuSe", "Fedora" }));
        comboLinux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLinuxActionPerformed(evt);
            }
        });
        jPanel1.add(comboLinux);
        comboLinux.setBounds(510, 210, 150, 30);

        comboMac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Leopard", "Snow Leopard", "Lion", "Mountain Lion", "Mavericks", "Yosemite" }));
        jPanel1.add(comboMac);
        comboMac.setBounds(510, 210, 150, 30);

        comboWindows1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Windows 8 (64 bit)", "Windows 8 (32 bit)", "Windows 7 (64 bit)", "Windows 7 (32 bit)", "Windows vista (64 bit)", "Windows vista (32 bit)", "Windows XP (64 bit)", "Windows XP (32 bit)", "Windows 2000 (32 bit)", "Windows NT (32 bit)", "Windows 98 (32 bit)" }));
        comboWindows1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboWindows1ActionPerformed(evt);
            }
        });
        jPanel1.add(comboWindows1);
        comboWindows1.setBounds(510, 210, 150, 30);

        marca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setText("Marca");
        jPanel1.add(marca);
        marca.setBounds(230, 140, 70, 30);

        modelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modelo.setForeground(new java.awt.Color(255, 255, 255));
        modelo.setText("Modelo");
        jPanel1.add(modelo);
        modelo.setBounds(440, 140, 70, 30);

        txtmodelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtmodelo);
        txtmodelo.setBounds(510, 140, 120, 30);

        txtmarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtmarca);
        txtmarca.setBounds(290, 140, 120, 30);

        txtlaptop.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtlaptop.setForeground(new java.awt.Color(255, 255, 255));
        txtlaptop.setText("Laptop");
        jPanel1.add(txtlaptop);
        txtlaptop.setBounds(280, 80, 130, 40);

        memoriaRam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        memoriaRam.setForeground(new java.awt.Color(255, 255, 255));
        memoriaRam.setText("Memoria RAM");
        jPanel1.add(memoriaRam);
        memoriaRam.setBounds(230, 280, 130, 30);

        txtcpu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtcpu);
        txtcpu.setBounds(380, 330, 130, 30);

        seleccion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        seleccion.setForeground(new java.awt.Color(255, 255, 255));
        seleccion.setText("Seleccione Tipo");
        jPanel1.add(seleccion);
        seleccion.setBounds(290, 290, 270, 60);

        proceador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        proceador.setForeground(new java.awt.Color(255, 255, 255));
        proceador.setText("Procesador (CPU)");
        jPanel1.add(proceador);
        proceador.setBounds(230, 330, 150, 30);

        txtram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtram);
        txtram.setBounds(350, 280, 160, 30);

        txtdistribuciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdistribuciones.setForeground(new java.awt.Color(255, 255, 255));
        txtdistribuciones.setText("Distribuciones");
        jPanel1.add(txtdistribuciones);
        txtdistribuciones.setBounds(520, 180, 130, 30);

        FONDO.setBackground(new java.awt.Color(204, 204, 204));
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/20FB742C2.jpg"))); // NOI18N
        FONDO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FONDO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FONDOMousePressed(evt);
            }
        });
        FONDO.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FONDOMouseDragged(evt);
            }
        });
        FONDO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FONDOKeyPressed(evt);
            }
        });
        jPanel1.add(FONDO);
        FONDO.setBounds(0, 0, 700, 580);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
 
    }//GEN-LAST:event_jPanel1MouseEntered

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void comboSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSOActionPerformed
    
    if(comboSO.getSelectedItem().equals("Windows")){
    txtdistribuciones.setVisible(false);
    comboLinux.setVisible(false);
    comboWindows1.setVisible(true);
    comboMac.setVisible(false);
    }  
    if(comboSO.getSelectedItem().equals("Linux")){
    txtdistribuciones.setVisible(true);
    comboLinux.setVisible(true);
    comboWindows1.setVisible(false);
    comboMac.setVisible(false);
    }  
    if(comboSO.getSelectedItem().equals("Mac")){
    txtdistribuciones.setVisible(false);
    comboLinux.setVisible(false);
    comboWindows1.setVisible(false);
    comboMac.setVisible(true);
    } 
    if(comboSO.getSelectedItem().equals("Seleccionar")){
    txtdistribuciones.setVisible(false);
    comboLinux.setVisible(false);
    comboWindows1.setVisible(false);
    comboMac.setVisible(false);
    }  
        
    }//GEN-LAST:event_comboSOActionPerformed

    private void btnLaptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaptoActionPerformed
        btnCompu.setBorderPainted(false);
        btnLapto.setBorderPainted(true);
        seleccion.setVisible(false);
        txtescritorio.setVisible(true);
        txtlaptop.setVisible(false);
        descripcion.setVisible(true);
        descrippcion.setVisible(true);
        txtram.setVisible(false);
        txtcpu.setVisible(false);
        sistemaOperativo.setVisible(true);
        memoriaRam.setVisible(false);
        proceador.setVisible(false);
        comboSO.setVisible(true);
        comboMac.setVisible(false);
        modelo.setVisible(false);
        txtmodelo.setVisible(false);
        marca.setVisible(false);
        txtmarca.setVisible(false);
        comboWindows1.setVisible(false);
        comboLinux.setVisible(false);
        txtdistribuciones.setVisible(false);
        tipoEscri.setVisible(true);
        comboMarcaEscri.setVisible(true);
        
    }//GEN-LAST:event_btnLaptoActionPerformed

    private void btnCompuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompuActionPerformed
       btnCompu.setBorderPainted(true);
        btnLapto.setBorderPainted(false);
        seleccion.setVisible(false);
        txtescritorio.setVisible(false);
        txtlaptop.setVisible(true);
        descripcion.setVisible(true);
        descrippcion.setVisible(true);
        txtram.setVisible(false);
        txtcpu.setVisible(false);
        sistemaOperativo.setVisible(true);
        memoriaRam.setVisible(false);
        proceador.setVisible(false);
        comboSO.setVisible(true);
        comboMac.setVisible(false);
        modelo.setVisible(true);
        txtmodelo.setVisible(true);
        marca.setVisible(true);
        txtmarca.setVisible(true);
        comboWindows1.setVisible(false);
        comboLinux.setVisible(false);
        txtdistribuciones.setVisible(false);
        tipoEscri.setVisible(false);
        comboMarcaEscri.setVisible(false);
        marcaEscri.setVisible(false);
        modeloEscri.setVisible(false);
        txtModeloEscri.setVisible(false);
        txtMarcaEscri.setVisible(false);       
        
    }//GEN-LAST:event_btnCompuActionPerformed

    private void comboMarcaEscriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMarcaEscriActionPerformed
        if(comboMarcaEscri.getSelectedItem().equals("De Marca")){
        marcaEscri.setVisible(true);
        modeloEscri.setVisible(true);
        txtModeloEscri.setVisible(true);
        txtMarcaEscri.setVisible(true);
        txtram.setVisible(false);
        txtcpu.setVisible(false);
        memoriaRam.setVisible(false);
        proceador.setVisible(false);
        }else
        if(comboMarcaEscri.getSelectedItem().equals("Seleccione")){
        marcaEscri.setVisible(false);
        modeloEscri.setVisible(false);
        txtModeloEscri.setVisible(false);
        txtMarcaEscri.setVisible(false);
        txtram.setVisible(false);
        txtcpu.setVisible(false);
        memoriaRam.setVisible(false);
        proceador.setVisible(false);
            }else
        if(comboMarcaEscri.getSelectedItem().equals("Generica")){
        marcaEscri.setVisible(false);
        modeloEscri.setVisible(false);
        txtModeloEscri.setVisible(false);
        txtMarcaEscri.setVisible(false);
        txtram.setVisible(true);
        txtcpu.setVisible(true);
        memoriaRam.setVisible(true);
        proceador.setVisible(true);
        }
       
    }//GEN-LAST:event_comboMarcaEscriActionPerformed

    private void comboWindows1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboWindows1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboWindows1ActionPerformed

    private void comboLinuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLinuxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLinuxActionPerformed

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
            java.util.logging.Logger.getLogger(Computadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Computadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Computadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Computadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Computadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton atras;
    private javax.swing.JButton btnCompu;
    private javax.swing.JButton btnLapto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboLinux;
    private javax.swing.JComboBox comboMac;
    private javax.swing.JComboBox comboMarcaEscri;
    private javax.swing.JComboBox comboSO;
    private javax.swing.JComboBox comboWindows1;
    private javax.swing.JLabel descripcion;
    private javax.swing.JTextField descrippcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblComputadora;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel marcaEscri;
    private javax.swing.JLabel memoriaRam;
    private javax.swing.JLabel modelo;
    private javax.swing.JLabel modeloEscri;
    private javax.swing.JLabel proceador;
    private javax.swing.JLabel seleccion;
    private javax.swing.JLabel sistemaOperativo;
    private javax.swing.JLabel tipoEscri;
    private javax.swing.JTextField txtMarcaEscri;
    private javax.swing.JTextField txtModeloEscri;
    private javax.swing.JTextField txtcpu;
    private javax.swing.JLabel txtdistribuciones;
    private javax.swing.JLabel txtescritorio;
    private javax.swing.JLabel txtlaptop;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtram;
    // End of variables declaration//GEN-END:variables
}
