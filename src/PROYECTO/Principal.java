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
 * @author FerSotox
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal1
     */
    public Principal() {
        this.setUndecorated(true);
        initComponents();
        lblCedula.setVisible(false);
        txtCedula.setVisible(false);
        btnBuscar.setVisible(false);
        btnAgregar.setVisible(false);
        lblServicio.setVisible(false);
        btnComputadora.setVisible(false);
        btnTelefono.setVisible(false);
        btnPresupuesto.setVisible(false);
        btnAcerca.setVisible(false);
        lblOpciones.setVisible(false);
        lblArchivo.setVisible(false);
        lblReporte.setVisible(false);
        lblNombre.setVisible(false);
        btnOK.setVisible(false);
        btnCobrar.setVisible(false);
        btnInsumos.setVisible(false);
        btnNoReparados.setVisible(false);
        btnInventario.setVisible(false);
        btnContabilidad.setVisible(false);
        Warning.setVisible(false);
        btnArchivo.setBorderPainted(false);
        btnReporte.setBorderPainted(false);
        btnOtro.setBorderPainted(false);
        btnOpciones.setBorderPainted(false);
        
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
        Minimizar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        btnArchivo = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnOpciones = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblServicio = new javax.swing.JLabel();
        btnComputadora = new javax.swing.JButton();
        btnTelefono = new javax.swing.JButton();
        btnPresupuesto = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnAcerca = new javax.swing.JButton();
        lblOpciones = new javax.swing.JLabel();
        lblReporte = new javax.swing.JLabel();
        lblArchivo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnCobrar = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnContabilidad = new javax.swing.JButton();
        Warning = new javax.swing.JLabel();
        btnNoReparados = new javax.swing.JButton();
        btnInsumos = new javax.swing.JButton();
        Brothernologic = new javax.swing.JLabel();
        Bandera = new javax.swing.JLabel();
        btnOtro = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

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

        Minimizar.setBackground(new java.awt.Color(255, 255, 255));
        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Minimizar.png"))); // NOI18N
        Minimizar.setToolTipText("Minimizar");
        Minimizar.setBorderPainted(false);
        Minimizar.setContentAreaFilled(false);
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.setFocusPainted(false);
        Minimizar.setFocusable(false);
        Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarActionPerformed(evt);
            }
        });
        jPanel1.add(Minimizar);
        Minimizar.setBounds(730, 10, 30, 30);

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
        Cerrar.setBounds(760, 10, 30, 30);

        btnArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Archivo.png"))); // NOI18N
        btnArchivo.setToolTipText("Archivo");
        btnArchivo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        btnArchivo.setContentAreaFilled(false);
        btnArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArchivo.setFocusPainted(false);
        btnArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnArchivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnArchivoMouseExited(evt);
            }
        });
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnArchivo);
        btnArchivo.setBounds(10, 40, 140, 140);

        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ReportesPresupuestos.png"))); // NOI18N
        btnReporte.setToolTipText("Reportes");
        btnReporte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        btnReporte.setContentAreaFilled(false);
        btnReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporte.setFocusPainted(false);
        btnReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReporteMouseEntered(evt);
            }
        });
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnReporte);
        btnReporte.setBounds(10, 180, 140, 140);

        btnOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Opciones.png"))); // NOI18N
        btnOpciones.setToolTipText("Opciones");
        btnOpciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        btnOpciones.setContentAreaFilled(false);
        btnOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpciones.setFocusPainted(false);
        btnOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOpcionesMouseEntered(evt);
            }
        });
        btnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnOpciones);
        btnOpciones.setBounds(10, 460, 140, 140);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        jPanel2.setFocusable(false);
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblServicio.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        lblServicio.setForeground(new java.awt.Color(255, 255, 255));
        lblServicio.setText("Servicio");
        jPanel2.add(lblServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 140, 50));

        btnComputadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/computadora.png"))); // NOI18N
        btnComputadora.setToolTipText("Computadora");
        btnComputadora.setBorderPainted(false);
        btnComputadora.setContentAreaFilled(false);
        btnComputadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComputadora.setFocusPainted(false);
        btnComputadora.setFocusable(false);
        btnComputadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputadoraActionPerformed(evt);
            }
        });
        jPanel2.add(btnComputadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 140, 130));

        btnTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Telefono.png"))); // NOI18N
        btnTelefono.setToolTipText("telefono");
        btnTelefono.setBorderPainted(false);
        btnTelefono.setContentAreaFilled(false);
        btnTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTelefono.setFocusPainted(false);
        btnTelefono.setFocusable(false);
        btnTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelefonoActionPerformed(evt);
            }
        });
        jPanel2.add(btnTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 110, 130));

        btnPresupuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ReportesPresupuestos.png"))); // NOI18N
        btnPresupuesto.setToolTipText("Presupuesto");
        btnPresupuesto.setBorderPainted(false);
        btnPresupuesto.setContentAreaFilled(false);
        btnPresupuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPresupuesto.setFocusPainted(false);
        btnPresupuesto.setFocusable(false);
        btnPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresupuestoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 130, 160));

        txtCedula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCedula.setToolTipText("Ingrese Cedula del Cliente");
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 250, 40));

        lblCedula.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(204, 204, 204));
        lblCedula.setText("Cedula del Cliente");
        lblCedula.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                lblCedulaComponentHidden(evt);
            }
        });
        jPanel2.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 170, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Buscar.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 60, 60));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Agregar.png"))); // NOI18N
        btnAgregar.setToolTipText("Agregar");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.setFocusable(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 60, 60));

        btnAcerca.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/help-hint.png"))); // NOI18N
        btnAcerca.setText("Acerca de");
        btnAcerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcerca.setFocusPainted(false);
        btnAcerca.setFocusable(false);
        btnAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 260, 70));

        lblOpciones.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        lblOpciones.setForeground(new java.awt.Color(255, 255, 255));
        lblOpciones.setText("Opciones");
        jPanel2.add(lblOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 190, -1));

        lblReporte.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        lblReporte.setForeground(new java.awt.Color(255, 255, 255));
        lblReporte.setText("Reportes");
        jPanel2.add(lblReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 190, -1));

        lblArchivo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        lblArchivo.setForeground(new java.awt.Color(255, 255, 255));
        lblArchivo.setText("Archivo");
        jPanel2.add(lblArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 190, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("                     ");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 260, -1));

        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Seleccionar.png"))); // NOI18N
        btnOK.setToolTipText("Seleccionar");
        btnOK.setBorderPainted(false);
        btnOK.setContentAreaFilled(false);
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOK.setFocusPainted(false);
        btnOK.setFocusable(false);
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        jPanel2.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 60, 50));

        btnCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cobrar.png"))); // NOI18N
        btnCobrar.setToolTipText("Cobro y Entrega");
        btnCobrar.setBorderPainted(false);
        btnCobrar.setContentAreaFilled(false);
        btnCobrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCobrar.setFocusPainted(false);
        btnCobrar.setFocusable(false);
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 120, 120));

        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inventario.png"))); // NOI18N
        btnInventario.setToolTipText("Inventario");
        btnInventario.setBorderPainted(false);
        btnInventario.setContentAreaFilled(false);
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.setFocusPainted(false);
        btnInventario.setFocusable(false);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        btnContabilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/contabilidad.png"))); // NOI18N
        btnContabilidad.setToolTipText("Contabilidad");
        btnContabilidad.setBorderPainted(false);
        btnContabilidad.setContentAreaFilled(false);
        btnContabilidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContabilidad.setFocusPainted(false);
        btnContabilidad.setFocusable(false);
        btnContabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContabilidadActionPerformed(evt);
            }
        });
        jPanel2.add(btnContabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 140, 140));

        Warning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        Warning.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(Warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 80, 80));

        btnNoReparados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Telefono.png"))); // NOI18N
        btnNoReparados.setToolTipText("Equipos No Reparados");
        btnNoReparados.setBorderPainted(false);
        btnNoReparados.setContentAreaFilled(false);
        btnNoReparados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNoReparados.setFocusPainted(false);
        btnNoReparados.setFocusable(false);
        btnNoReparados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoReparadosActionPerformed(evt);
            }
        });
        jPanel2.add(btnNoReparados, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 120, 130));

        btnInsumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/insumos.png"))); // NOI18N
        btnInsumos.setToolTipText("Insumos");
        btnInsumos.setBorderPainted(false);
        btnInsumos.setContentAreaFilled(false);
        btnInsumos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsumos.setFocusPainted(false);
        btnInsumos.setFocusable(false);
        btnInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsumosActionPerformed(evt);
            }
        });
        jPanel2.add(btnInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 130, 120));

        Brothernologic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Imagen1.png"))); // NOI18N
        jPanel2.add(Brothernologic, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 380, 90));

        Bandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/bandera-italiana.png"))); // NOI18N
        jPanel2.add(Bandera, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 260, 170));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(150, 40, 640, 560);

        btnOtro.setForeground(new java.awt.Color(153, 255, 255));
        btnOtro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/entrar.png"))); // NOI18N
        btnOtro.setText("OTRO");
        btnOtro.setToolTipText("OTRO");
        btnOtro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        btnOtro.setContentAreaFilled(false);
        btnOtro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOtro.setFocusPainted(false);
        btnOtro.setFocusable(false);
        btnOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtroActionPerformed(evt);
            }
        });
        jPanel1.add(btnOtro);
        btnOtro.setBounds(10, 320, 140, 140);

        Nombre.setFont(new java.awt.Font("Thames", 3, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Control Brothernologic V 1.3");
        jPanel1.add(Nombre);
        Nombre.setBounds(10, 10, 230, 20);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user_32.png"))); // NOI18N
        btnCerrarSesion.setToolTipText("Cerrar sesión");
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setFocusPainted(false);
        btnCerrarSesion.setFocusable(false);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion);
        btnCerrarSesion.setBounds(700, 10, 30, 30);

        Fondo.setBackground(new java.awt.Color(204, 204, 204));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/20FB742C2.jpg"))); // NOI18N
        Fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FondoMouseDragged(evt);
            }
        });
        Fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FondoMousePressed(evt);
            }
        });
        Fondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FondoKeyPressed(evt);
            }
        });
        jPanel1.add(Fondo);
        Fondo.setBounds(0, 0, 800, 610);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed

        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed

        ConfirmarSalir confir=new ConfirmarSalir();

        confir.setResizable(false);
        confir.setLocationRelativeTo(null);
        confir.setVisible(true);

    }//GEN-LAST:event_CerrarActionPerformed

    private void btnArchivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArchivoMouseEntered

    }//GEN-LAST:event_btnArchivoMouseEntered

    private void btnArchivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArchivoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArchivoMouseExited

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        lblCedula.setVisible(true);
        txtCedula.setVisible(true);
        btnBuscar.setVisible(true);
        btnAgregar.setVisible(true);
        lblServicio.setVisible(false);
        btnComputadora.setVisible(false);
        btnTelefono.setVisible(false);
        btnPresupuesto.setVisible(false);
        btnAcerca.setVisible(false);
        lblOpciones.setVisible(false);
        lblArchivo.setVisible(true);
        lblReporte.setVisible(false);
        lblNombre.setVisible(false);
        btnOK.setVisible(false);
        btnCobrar.setVisible(false);
        btnInsumos.setVisible(false);
        btnNoReparados.setVisible(false);
        btnInventario.setVisible(false);
        btnContabilidad.setVisible(false);
        Warning.setVisible(false);
        btnArchivo.setBorderPainted(true);
        btnReporte.setBorderPainted(false);
        btnOtro.setBorderPainted(false);
        btnOpciones.setBorderPainted(false);
        Bandera.setVisible(false);
        Brothernologic.setVisible(false);
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseEntered

    }//GEN-LAST:event_btnReporteMouseEntered

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        lblCedula.setVisible(false);
        txtCedula.setVisible(false);
        btnBuscar.setVisible(false);
        btnAgregar.setVisible(false);
        lblServicio.setVisible(false);
        btnComputadora.setVisible(false);
        btnTelefono.setVisible(false);
        btnPresupuesto.setVisible(false);
        btnAcerca.setVisible(false);
        lblOpciones.setVisible(false);
        lblArchivo.setVisible(false);
        lblReporte.setVisible(true);
        lblNombre.setVisible(false);
        btnOK.setVisible(false);
        btnCobrar.setVisible(false);
        btnInsumos.setVisible(true);
        btnNoReparados.setVisible(true);
        btnInventario.setVisible(true);
        btnContabilidad.setVisible(true);
        Warning.setVisible(true);
        btnArchivo.setBorderPainted(false);
        btnReporte.setBorderPainted(true);
        btnOtro.setBorderPainted(false);
        btnOpciones.setBorderPainted(false);
        Bandera.setVisible(false);
        Brothernologic.setVisible(false);
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnOpcionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcionesMouseEntered

    }//GEN-LAST:event_btnOpcionesMouseEntered

    private void btnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesActionPerformed
        lblCedula.setVisible(false);
        txtCedula.setVisible(false);
        btnBuscar.setVisible(false);
        btnAgregar.setVisible(false);
        lblServicio.setVisible(false);
        btnComputadora.setVisible(false);
        btnTelefono.setVisible(false);
        btnPresupuesto.setVisible(false);
        btnAcerca.setVisible(true);
        lblOpciones.setVisible(true);
        lblReporte.setVisible(false);
        lblArchivo.setVisible(false);
        lblNombre.setVisible(false);
        btnOK.setVisible(false);
        btnCobrar.setVisible(false);
        btnInsumos.setVisible(false);
        btnNoReparados.setVisible(false);
        btnInventario.setVisible(false);
        btnContabilidad.setVisible(false);
        Warning.setVisible(false);
        btnArchivo.setBorderPainted(false);
        btnReporte.setBorderPainted(false);
        btnOtro.setBorderPainted(false);
        btnOpciones.setBorderPainted(true);
        Bandera.setVisible(false);
        Brothernologic.setVisible(false);
    }//GEN-LAST:event_btnOpcionesActionPerformed

    private void btnComputadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComputadoraActionPerformed

        Computadora co=new Computadora();

        co.setResizable(false);
        co.setLocationRelativeTo(null);
        co.setVisible(true);

    }//GEN-LAST:event_btnComputadoraActionPerformed

    private void btnTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelefonoActionPerformed
        Telefono tele=new Telefono();

        tele.setResizable(false);
        tele.setLocationRelativeTo(null);
        tele.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_btnTelefonoActionPerformed

    private void btnPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresupuestoActionPerformed

        Presupuesto pre=new Presupuesto();

        pre.setResizable(false);
        pre.setLocationRelativeTo(null);
        pre.setVisible(true);

    }//GEN-LAST:event_btnPresupuestoActionPerformed

    private void lblCedulaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblCedulaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCedulaComponentHidden

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtCedula.getText().equals("1234")){
            lblNombre.setVisible(true);
            btnOK.setVisible(true);
            lblNombre.setText("Nombre Usuario");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        NuevoCliente nvo=new NuevoCliente();

        nvo.setResizable(false);
        nvo.setLocationRelativeTo(null);
        nvo.setVisible(true);

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        lblCedula.setVisible(false);
        txtCedula.setVisible(false);
        btnBuscar.setVisible(false);
        btnAgregar.setVisible(false);
        lblServicio.setVisible(false);
        btnComputadora.setVisible(true);
        btnTelefono.setVisible(true);
        btnPresupuesto.setVisible(true);
        btnAcerca.setVisible(false);
        lblOpciones.setVisible(false);
        lblArchivo.setVisible(true);
        lblReporte.setVisible(false);
        lblNombre.setVisible(false);
        btnOK.setVisible(false);
        btnCobrar.setVisible(true);
        btnInsumos.setVisible(false);
        btnNoReparados.setVisible(false);
        btnInventario.setVisible(false);
        btnContabilidad.setVisible(false);
        Warning.setVisible(false);
        btnArchivo.setBorderPainted(true);
        btnReporte.setBorderPainted(false);
        btnOtro.setBorderPainted(false);
        btnOpciones.setBorderPainted(false);
        Bandera.setVisible(false);
        Brothernologic.setVisible(false);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed

        Cobrar cobro=new Cobrar();

        cobro.setResizable(false);
        cobro.setLocationRelativeTo(null);
        cobro.setVisible(true);

    }//GEN-LAST:event_btnCobrarActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed

        Inventario inv=new Inventario();
        inv.setResizable(false);
        inv.setLocationRelativeTo(inv);
        inv.setVisible(true);

    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnContabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContabilidadActionPerformed
        Contabilidad conta=new Contabilidad();
        conta.setResizable(false);
        conta.setLocationRelativeTo(null);
        conta.setVisible(true);

    }//GEN-LAST:event_btnContabilidadActionPerformed

    private void btnNoReparadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoReparadosActionPerformed
        NoReparados NoRe=new NoReparados();
        NoRe.setResizable(false);
        NoRe.setLocationRelativeTo(null);
        NoRe.setVisible(true);
    }//GEN-LAST:event_btnNoReparadosActionPerformed

    private void btnInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumosActionPerformed

        Insumos insu=new Insumos();
        insu.setResizable(false);
        insu.setLocationRelativeTo(null);
        insu.setVisible(true);

    }//GEN-LAST:event_btnInsumosActionPerformed

    private void btnOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtroActionPerformed
        lblCedula.setVisible(false);
        txtCedula.setVisible(false);
        btnBuscar.setVisible(false);
        btnAgregar.setVisible(false);
        lblServicio.setVisible(false);
        btnComputadora.setVisible(false);
        btnTelefono.setVisible(false);
        btnPresupuesto.setVisible(false);
        btnAcerca.setVisible(false);
        lblOpciones.setVisible(false);
        lblArchivo.setVisible(false);
        lblReporte.setVisible(false);
        lblNombre.setVisible(false);
        btnOK.setVisible(false);
        btnCobrar.setVisible(false);
        btnInsumos.setVisible(false);
        btnNoReparados.setVisible(false);
        btnInventario.setVisible(false);
        btnContabilidad.setVisible(false);
        Warning.setVisible(false);
        btnArchivo.setBorderPainted(false);
        btnReporte.setBorderPainted(false);
        btnOtro.setBorderPainted(true);
        btnOpciones.setBorderPainted(false);
        Bandera.setVisible(false);
        Brothernologic.setVisible(false);
    }//GEN-LAST:event_btnOtroActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed

        Inicio i=new Inicio();

        i.setResizable(false);
        i.setLocationRelativeTo(null);
        i.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void FondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoMouseDragged

        Point point = MouseInfo.getPointerInfo().getLocation() ;
        setLocation(point.x - x, point.y - y )  ;
    }//GEN-LAST:event_FondoMouseDragged

    private void FondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoMousePressed

        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_FondoMousePressed

    private void FondoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FondoKeyPressed

    }//GEN-LAST:event_FondoKeyPressed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseEntered

    private void btnAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaActionPerformed
       AcercaDe ad=new AcercaDe();

        ad.setResizable(false);
        ad.setLocationRelativeTo(null);
        ad.setVisible(true);
         
        
    }//GEN-LAST:event_btnAcercaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bandera;
    private javax.swing.JLabel Brothernologic;
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Minimizar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Warning;
    private javax.swing.JButton btnAcerca;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnComputadora;
    private javax.swing.JButton btnContabilidad;
    private javax.swing.JButton btnInsumos;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnNoReparados;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnOpciones;
    private javax.swing.JButton btnOtro;
    private javax.swing.JButton btnPresupuesto;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblOpciones;
    private javax.swing.JLabel lblReporte;
    private javax.swing.JLabel lblServicio;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
