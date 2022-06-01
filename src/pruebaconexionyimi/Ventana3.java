
package pruebaconexionyimi;


import java.io.*;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.*;
import modelos.Paciente;
import servicios.Conexion;
import servicios.Consultas;


public class Ventana3 extends javax.swing.JFrame {

    
    public Ventana3() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Titulo_Doctores = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        lateral = new javax.swing.JPanel();
        btn_Doctores = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btn_Inicio = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_Pacientes = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        titulo = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_equis = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btn_Inicio1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Titulo_Pacientes = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        alergiasTxt = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        diaBox = new javax.swing.JComboBox<>();
        mesBox = new javax.swing.JComboBox<>();
        anioBox = new javax.swing.JComboBox<>();
        sexoBox = new javax.swing.JComboBox<>();
        ciudadBox = new javax.swing.JComboBox<>();
        sangreBox = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        pesoTxt = new javax.swing.JTextField();
        estaturaTxt = new javax.swing.JTextField();
        telefonoTxt = new javax.swing.JTextField();
        edadTxt = new javax.swing.JTextField();
        escondidoTxt = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        guardarBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Titulo_Doctores.setBackground(new java.awt.Color(255, 255, 255));
        Titulo_Doctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo_DoctoresMouseClicked(evt);
            }
        });
        Titulo_Doctores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_infusion_pumps_40px.png"))); // NOI18N
        Titulo_Doctores.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 70, 50));

        jLabel36.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel36.setText(" DOCTORES");
        Titulo_Doctores.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 190, 30));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel38.setText("PACIENTES");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_hospital_bed_64px.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lateral.setBackground(new java.awt.Color(0, 51, 102));
        lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Doctores.setBackground(new java.awt.Color(0, 51, 102));
        btn_Doctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DoctoresMouseClicked(evt);
            }
        });
        btn_Doctores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_infusion_pumps_40px.png"))); // NOI18N
        btn_Doctores.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 50));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DOCTORES");
        btn_Doctores.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 110, 30));

        lateral.add(btn_Doctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 280, 50));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 37, -1, -1));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" HOSPITAL SANTOS");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 70));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("& AVALOS");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 120, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_caduceus_40px.png"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_caduceus_40px.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 60));

        lateral.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 110));

        jPanel5.setBackground(new java.awt.Color(0, 51, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Cambria", 2, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TEL: 449-458-4877");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 30));

        jLabel7.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 50, 20));

        jLabel19.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("contacto@hospitalsaav.com");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, 30));

        lateral.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 200, 90));

        jPanel13.setBackground(new java.awt.Color(0, 51, 102));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("CONTACTOS");
        jPanel13.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_whatsapp_48px.png"))); // NOI18N
        jPanel13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_email_50px.png"))); // NOI18N
        jPanel13.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 6, 50, 40));

        lateral.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 280, 50));

        btn_Inicio.setBackground(new java.awt.Color(0, 51, 102));
        btn_Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_InicioMouseClicked(evt);
            }
        });
        btn_Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btn_Inicio.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 37, -1, -1));
        btn_Inicio.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_hospital_3_48px.png"))); // NOI18N
        btn_Inicio.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("INICIO");
        btn_Inicio.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 120, 30));

        lateral.add(btn_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 280, -1));

        btn_Pacientes.setBackground(new java.awt.Color(153, 204, 255));
        btn_Pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PacientesMouseClicked(evt);
            }
        });
        btn_Pacientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_hospital_bed_64px.png"))); // NOI18N
        btn_Pacientes.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("PACIENTES");
        btn_Pacientes.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 120, 30));

        lateral.add(btn_Pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 280, -1));

        fondo.add(lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 631));

        titulo.setBackground(new java.awt.Color(153, 204, 255));
        titulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 37, -1, -1));
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel25.setFont(new java.awt.Font("Cambria", 3, 20)); // NOI18N
        jLabel25.setText(" HOSPITAL SANTOS");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 70));

        jLabel26.setFont(new java.awt.Font("Cambria", 3, 20)); // NOI18N
        jLabel26.setText("& AVALOS");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 120, 50));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_caduceus_40px.png"))); // NOI18N
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 60));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_caduceus_40px.png"))); // NOI18N
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 60));

        titulo.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, -1));

        jPanel17.setBackground(new java.awt.Color(153, 204, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Cambria", 3, 16)); // NOI18N
        jLabel22.setText("ESPECIALISTAS EN EL ANÁLISIS DEL CORAZÓN");
        jPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 380, 60));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_stethoscope_100px.png"))); // NOI18N
        jPanel17.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 90));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_heart_with_pulse_40px.png"))); // NOI18N
        jPanel17.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 40, 50));

        titulo.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 580, 90));

        fondo.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 1050, 140));

        btn_equis.setBackground(new java.awt.Color(255, 255, 255));
        btn_equis.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btn_equis.setText("X");
        btn_equis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_equis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equisActionPerformed(evt);
            }
        });
        fondo.add(btn_equis, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 34, 40));

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        fondo.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 631, -1, -1));

        btn_Inicio1.setBackground(new java.awt.Color(0, 51, 102));
        btn_Inicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Inicio1MouseClicked(evt);
            }
        });
        btn_Inicio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(255, 204, 204));
        jPanel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btn_Inicio1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 37, -1, -1));
        btn_Inicio1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_hospital_3_48px.png"))); // NOI18N
        btn_Inicio1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jLabel31.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("INICIO");
        btn_Inicio1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 120, 30));

        fondo.add(btn_Inicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 280, 50));

        Titulo_Pacientes.setBackground(new java.awt.Color(255, 255, 255));
        Titulo_Pacientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(255, 204, 204));
        jPanel20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Titulo_Pacientes.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 37, -1, -1));
        Titulo_Pacientes.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel42.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel42.setText("PACIENTES");
        Titulo_Pacientes.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 220, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_hospital_bed_64px.png"))); // NOI18N
        Titulo_Pacientes.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 50));

        fondo.add(Titulo_Pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 310, 60));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel12.setText("Teléfono:");
        fondo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 80, 30));

        alergiasTxt.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        alergiasTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergiasTxtActionPerformed(evt);
            }
        });
        fondo.add(alergiasTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 320, 300, 100));

        jLabel32.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel32.setText("Nombre:");
        fondo.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 80, 30));

        jLabel33.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel33.setText("Fecha de Nacimiento: ");
        fondo.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 190, 30));

        jLabel34.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel34.setText("Ciudad:");
        fondo.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 70, 30));

        jLabel39.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel39.setText("Peso:");
        fondo.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 50, 30));

        jLabel40.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel40.setText("Tipo de Sangre: ");
        fondo.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 140, 30));

        jLabel41.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel41.setText("Sexo:");
        fondo.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, 50, 30));

        jLabel44.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel44.setText("Alergias:");
        fondo.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 320, 100, 30));

        jLabel45.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel45.setText("Estatura:");
        fondo.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 80, 30));

        diaBox.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        diaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(dia)", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        diaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaBoxActionPerformed(evt);
            }
        });
        fondo.add(diaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 270, -1, 30));

        mesBox.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        mesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(mes)", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        mesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesBoxActionPerformed(evt);
            }
        });
        fondo.add(mesBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 270, -1, 30));

        anioBox.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        anioBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(año)", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "11020", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        anioBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioBoxActionPerformed(evt);
            }
        });
        fondo.add(anioBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 270, -1, 30));

        sexoBox.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        sexoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione uno)", "Masculino", "Femenino" }));
        sexoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoBoxActionPerformed(evt);
            }
        });
        fondo.add(sexoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 220, -1, 30));

        ciudadBox.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        ciudadBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione una)", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila de Zaragoza", "Colima", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán de Ocampo", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz de Ignacio de la Llave", "Yucatán", "Zacatecas" }));
        ciudadBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadBoxActionPerformed(evt);
            }
        });
        fondo.add(ciudadBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 350, 30));

        sangreBox.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        sangreBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione una)", "O positivo (O+)", "O negativo (O-)", "A positivo (A+)", "A negativo (A-)", "B positivo (B+)", "B negativo (B-)", "AB positivo (AB+)", "AB negativo (AB-)" }));
        sangreBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sangreBoxActionPerformed(evt);
            }
        });
        fondo.add(sangreBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 350, 30));

        jLabel46.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel46.setText("Edad:");
        fondo.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 270, 60, 30));

        nombreTxt.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });
        fondo.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 340, 30));

        pesoTxt.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        pesoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoTxtActionPerformed(evt);
            }
        });
        fondo.add(pesoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 100, 30));

        estaturaTxt.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        estaturaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estaturaTxtActionPerformed(evt);
            }
        });
        fondo.add(estaturaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 100, 30));

        telefonoTxt.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        telefonoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoTxtActionPerformed(evt);
            }
        });
        fondo.add(telefonoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 400, 30));

        edadTxt.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        edadTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadTxtActionPerformed(evt);
            }
        });
        fondo.add(edadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 270, 70, 30));

        escondidoTxt.setBorder(null);
        escondidoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escondidoTxtActionPerformed(evt);
            }
        });
        fondo.add(escondidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 200, 60));

        jLabel47.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel47.setText("cm");
        fondo.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 30, 30));

        jLabel48.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel48.setText("Kg");
        fondo.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 30, 30));

        guardarBtn.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        guardarBtn.setText("GUARDAR");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });
        fondo.add(guardarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 520, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InicioMouseClicked
        Ventana1 v=new Ventana1();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_InicioMouseClicked

    private void btn_DoctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DoctoresMouseClicked
        Ventana2 v=new Ventana2();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_DoctoresMouseClicked

    private void btn_PacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PacientesMouseClicked
        Ventana3 v=new Ventana3();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_PacientesMouseClicked

    private void btn_equisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_equisActionPerformed

    private void btn_Inicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Inicio1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Inicio1MouseClicked

    private void Titulo_DoctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo_DoctoresMouseClicked
        
    }//GEN-LAST:event_Titulo_DoctoresMouseClicked

    private void alergiasTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergiasTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergiasTxtActionPerformed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void pesoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoTxtActionPerformed

    private void estaturaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estaturaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estaturaTxtActionPerformed

    private void telefonoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoTxtActionPerformed

    private void edadTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadTxtActionPerformed

    private void escondidoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escondidoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escondidoTxtActionPerformed

    private void diaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaBoxActionPerformed
        fecha=String.valueOf(diaBox.getSelectedItem())+"/";
    }//GEN-LAST:event_diaBoxActionPerformed

    private void mesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesBoxActionPerformed
        fecha=String.valueOf(mesBox.getSelectedItem())+"/";
    }//GEN-LAST:event_mesBoxActionPerformed

    private void anioBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioBoxActionPerformed
        fecha=String.valueOf(anioBox.getSelectedItem());
    }//GEN-LAST:event_anioBoxActionPerformed

    private void sexoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoBoxActionPerformed

    private void ciudadBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadBoxActionPerformed

    private void sangreBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sangreBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sangreBoxActionPerformed

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        Consultas consultaPaciente = new Consultas();
        File archivo;
        Paciente p = new Paciente(0, nombreTxt.getText(), edadTxt.getText(), (String) sexoBox.getSelectedItem(), (String) ciudadBox.getSelectedItem(), telefonoTxt.getText() , (String) sangreBox.getSelectedItem(), fecha, "México", estaturaTxt.getText(), pesoTxt.getText(), alergiasTxt.getText());    
        
        try {
            consultaPaciente.guardar(Conexion.obtener(), p);
            JOptionPane.showMessageDialog(null, "Se ha creado correctamente");
            //PARA CREAR ARCHIVO DE TEXTO DE CADA PACIENTE 
            try{
                archivo=new File("/Users/andrealaris/Desktop/"+nombreTxt.getText()+".txt");
                if(archivo.createNewFile()){
                    System.out.println("Se ha creado con exito el TXT");
                }
            }catch(IOException e){
                System.err.println("NO SE HA PODIDO CREAR EL ARCHIVO TXT");
            }//FIN DE CREAR ARCHIVOS
        } catch (SQLException ex) {
            Logger.getLogger(PruebaConexionYimi.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR. PACIENTE NO REGISTRADO");
            System.err.println("NO SE HA PODIDO CREAR EL ARCHIVO TXT");
        } //catch (ClassNotFoundException ex) {
            //Logger.getLogger(PruebaConexionYimi.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null, "Se ha creado correctamente");
        //}
        
        
        nombreTxt.setText(" ");
        edadTxt.setText(" ");
        sexoBox.setSelectedIndex(0);
        ciudadBox.setSelectedIndex(0);
        telefonoTxt.setText(" ");
        sangreBox.setSelectedIndex(0);
        diaBox.setSelectedIndex(0);
        mesBox.setSelectedIndex(0);
        anioBox.setSelectedIndex(0);
        estaturaTxt.setText(" ");
        pesoTxt.setText(" ");
        alergiasTxt.setText(" ");
    }//GEN-LAST:event_guardarBtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Titulo_Doctores;
    private javax.swing.JPanel Titulo_Pacientes;
    private javax.swing.JTextField alergiasTxt;
    private javax.swing.JComboBox<String> anioBox;
    private javax.swing.JPanel btn_Doctores;
    private javax.swing.JPanel btn_Inicio;
    private javax.swing.JPanel btn_Inicio1;
    private javax.swing.JPanel btn_Pacientes;
    private javax.swing.JButton btn_equis;
    private javax.swing.JComboBox<String> ciudadBox;
    private javax.swing.JComboBox<String> diaBox;
    private javax.swing.JTextField edadTxt;
    private javax.swing.JTextField escondidoTxt;
    private javax.swing.JTextField estaturaTxt;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel lateral;
    private javax.swing.JComboBox<String> mesBox;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField pesoTxt;
    private javax.swing.JComboBox<String> sangreBox;
    private javax.swing.JComboBox<String> sexoBox;
    private javax.swing.JTextField telefonoTxt;
    private javax.swing.JPanel titulo;
    private String fecha;
// End of variables declaration//GEN-END:variables
}
