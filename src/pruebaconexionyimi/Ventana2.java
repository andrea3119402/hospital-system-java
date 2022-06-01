package pruebaconexionyimi;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;
import modelos.Paciente;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import servicios.Conexion;
import servicios.Consultas;

public class Ventana2 extends javax.swing.JFrame {
    private int i=0;
    private XYSeries serie=new XYSeries("BPM");
    private XYSeriesCollection dataset=new XYSeriesCollection();
    JFreeChart grafica;
    PanamaHitek_Arduino ino;
  
            
    private int cachar;
    private int mayorLatido=0;
    private int menorLatido=1000;
    
    public Ventana2() {
        super();
        initComponents();
        ino=new PanamaHitek_Arduino();
        
        //try {
            try {
            ino.arduinoRXTX("/dev/cu.usbserial-1420",9600,evento);
            } catch (ArduinoException ex) {
            Logger.getLogger(Ventana2.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        serie.add(0,0);
        dataset.addSeries(serie);
        //Crear grafic x y
        grafica=ChartFactory.createXYLineChart("FRECUENCIA CARDÍACA", "Tiempo (seg)", "Latidos", dataset, PlotOrientation.VERTICAL, true, true, false);
    }
        
    
    SerialPortEventListener evento=new SerialPortEventListener(){
        @Override
        public void serialEvent(SerialPortEvent spe) {
             try { 
                if(ino.isMessageAvailable()==true){
                    
                    //ecgTxt_Doc.setText(ino.printMessage());
                    //System.out.println("Normal= "+ino.printMessage());
                    try{
                        i++;
                        System.out.println("i===="+i);
                        cachar=Integer.parseInt(ino.printMessage());
                        if(i>5 && cachar>mayorLatido){
                            mayorLatido=cachar;
                        }
                        if(i>5 && cachar<menorLatido){
                            menorLatido=cachar;
                        }
                        System.out.println("CACHEEER= "+cachar);
                        //serie.add(i, cachar);
                    }catch (NumberFormatException nfe){
                        System.out.println("error...");
                        nfe.printStackTrace();
                    }
                serie.add(i, cachar);

                }
            } catch (SerialPortException ex) {
                Logger.getLogger(Ventana2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ArduinoException ex) {
                Logger.getLogger(Ventana2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
         
    };//finn de serial
    
    

    
    
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
        jLabel13 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btn_equis = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btn_Inicio1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Titulo_Docs = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        ecgTxt_Doc = new javax.swing.JTextField();
        estadisticasBtn = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        JLabelEdad = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        buscarPaciente = new javax.swing.JTextField();
        nombreTxt_Doc = new javax.swing.JTextField();
        edadTxt_Doc = new javax.swing.JTextField();
        direccionTxt_Doc = new javax.swing.JTextField();
        telefonoTxt_Doc = new javax.swing.JTextField();
        sexoTxt_Doc = new javax.swing.JTextField();
        sangreTxt_Doc = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        cambiarBtn = new javax.swing.JButton();
        cambiarEcgBtn = new javax.swing.JButton();
        sacarDatosBtn = new javax.swing.JButton();
        abrirEcgBtn = new javax.swing.JButton();
        consultarTBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEstadisticas = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        escondidoTxt_Doc = new javax.swing.JTextField();

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
        jLabel36.setText("DOCTORES");
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

        btn_Doctores.setBackground(new java.awt.Color(153, 204, 255));
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

        btn_Pacientes.setBackground(new java.awt.Color(0, 51, 102));
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

        fondo.add(lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 640));

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

        jLabel22.setFont(new java.awt.Font("Cambria", 3, 15)); // NOI18N
        jLabel22.setText("ESPECIALISTAS EN EL ANÁLISIS DEL CORAZÓN");
        jPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 370, 60));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_stethoscope_100px.png"))); // NOI18N
        jPanel17.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 90));
        jPanel17.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, 40));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_heart_with_pulse_40px.png"))); // NOI18N
        jPanel17.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 40, 50));

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
        jLabel31.setText("INICIO/HOME");
        btn_Inicio1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 120, 30));

        fondo.add(btn_Inicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 280, 50));

        Titulo_Docs.setBackground(new java.awt.Color(255, 255, 255));
        Titulo_Docs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel44.setText("DOCTORES");
        Titulo_Docs.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 220, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebaconexionyimi/Imagenes/icons8_infusion_pumps_40px.png"))); // NOI18N
        Titulo_Docs.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 60));

        fondo.add(Titulo_Docs, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
/*
        jLabel33.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel33.setText(":");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 40, 30));

        ecgTxt_Doc.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        ecgTxt_Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecgTxt_DocActionPerformed(evt);
            }
        });
        jPanel9.add(ecgTxt_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 380, 30));*/

        estadisticasBtn.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        estadisticasBtn.setText("Estadísticas");
        estadisticasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticasBtnActionPerformed(evt);
            }
        });
        jPanel9.add(estadisticasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 130, 30));

        jLabel34.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel34.setText("ID Paciente:");
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 30));

        jLabel39.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel39.setText("Nombre:");
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 80, 30));

        JLabelEdad.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        JLabelEdad.setText("Edad:");
        jPanel9.add(JLabelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 50, 30));

        jLabel41.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel41.setText("Alergias:");
        jPanel9.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 90, 30));

        jLabel42.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel42.setText("Peso:");
        jPanel9.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 30));

        jLabel43.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel43.setText("Estatura:");
        jPanel9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 110, 90, 30));

        buscarPaciente.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        buscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPacienteActionPerformed(evt);
            }
        });
        jPanel9.add(buscarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 290, 30));

        nombreTxt_Doc.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        nombreTxt_Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxt_DocActionPerformed(evt);
            }
        });
        jPanel9.add(nombreTxt_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 350, 30));

        edadTxt_Doc.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        edadTxt_Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadTxt_DocActionPerformed(evt);
            }
        });
        jPanel9.add(edadTxt_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 80, 30));

        direccionTxt_Doc.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        direccionTxt_Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionTxt_DocActionPerformed(evt);
            }
        });
        jPanel9.add(direccionTxt_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 340, 30));

        telefonoTxt_Doc.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        telefonoTxt_Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoTxt_DocActionPerformed(evt);
            }
        });
        jPanel9.add(telefonoTxt_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 340, 30));

        sexoTxt_Doc.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        sexoTxt_Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoTxt_DocActionPerformed(evt);
            }
        });
        jPanel9.add(sexoTxt_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 140, 30));

        sangreTxt_Doc.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        sangreTxt_Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sangreTxt_DocActionPerformed(evt);
            }
        });
        jPanel9.add(sangreTxt_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 290, 30));

        jLabel45.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel45.setText("Tipo Sanguineo:");
        jPanel9.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 140, 30));

        buscarBtn.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });
        jPanel9.add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 100, 30));

        eliminarBtn.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        eliminarBtn.setText("Dar De Baja");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });
        jPanel9.add(eliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 100, 30));

        cambiarBtn.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        cambiarBtn.setText("Cambiar");
        cambiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarBtnActionPerformed(evt);
            }
        });
        jPanel9.add(cambiarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 100, 30));
/*
        cambiarEcgBtn.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        cambiarEcgBtn.setText("Cambiar ECG");
        cambiarEcgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarEcgBtnActionPerformed(evt);
            }
        });
        jPanel9.add(cambiarEcgBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 120, 30));*/
        
        sacarDatosBtn.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        sacarDatosBtn.setText("Sacar Datos");
        sacarDatosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarDatosBtnActionPerformed(evt);
            }
        });
        jPanel9.add(sacarDatosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 120, 30));

        abrirEcgBtn.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        abrirEcgBtn.setText("Abrir BPM");
        abrirEcgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirEcgBtnActionPerformed(evt);
            }
        });
        jPanel9.add(abrirEcgBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 130, 30));

        consultarTBtn.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        consultarTBtn.setText("Consultar todo");
        consultarTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarTBtnActionPerformed(evt);
            }
        });
        jPanel9.add(consultarTBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 130, 30));

        tablaEstadisticas.setAutoCreateRowSorter(true);
        tablaEstadisticas.setBackground(new java.awt.Color(153, 204, 255));
        tablaEstadisticas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tablaEstadisticas.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        tablaEstadisticas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    
                },
                new String[]{
                    "Maximo", "Minimo", "Promedio"
                }
        ));
        tablaEstadisticas.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tablaEstadisticas);
        tablaEstadisticas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 420, 50));
        //tablaPacientes
        tablaPacientes.setAutoCreateRowSorter(true);
        tablaPacientes.setBackground(new java.awt.Color(153, 204, 255));
        tablaPacientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tablaPacientes.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                   
                },
                new String[]{
                    "No. Paciente", "Nombre", "Edad", "ESTATURA", "ALERGIAS", "PESO", "SANGRE"
                }
        ));
        jScrollPane1.setViewportView(tablaPacientes);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 550, 100));

        jLabel46.setBackground(new java.awt.Color(153, 204, 255));
        jLabel46.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel46.setText("Datos Generales de la Gráfica");
        jPanel9.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 250, 40));

        escondidoTxt_Doc.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        escondidoTxt_Doc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        escondidoTxt_Doc.setToolTipText("");
        escondidoTxt_Doc.setUI(null);
        escondidoTxt_Doc.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        escondidoTxt_Doc.setName(""); // NOI18N
        escondidoTxt_Doc.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        escondidoTxt_Doc.setSelectionColor(new java.awt.Color(153, 204, 255));
        escondidoTxt_Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escondidoTxt_DocActionPerformed(evt);
            }
        });
        jPanel9.add(escondidoTxt_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 372, 150, 50));

        fondo.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 1050, 440));

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
        Ventana1 v = new Ventana1();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_InicioMouseClicked

    private void btn_DoctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DoctoresMouseClicked
        Ventana2 v = new Ventana2();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_DoctoresMouseClicked

    private void btn_PacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PacientesMouseClicked
        Ventana3 v = new Ventana3();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_PacientesMouseClicked

    private void btn_equisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_equisActionPerformed

    public int getCntBajas() {
        return cntBajas;
    }

    public void setCntBajas(int cntBajas) {
        this.cntBajas = cntBajas;
    }

    public int getCntMayores() {
        return cntMayores;
    }

    public void setCntMayores(int cntMayores) {
        this.cntMayores = cntMayores;
    }

    public int getCntMenores() {
        return cntMenores;
    }

    public void setCntMenores(int cntMenores) {
        this.cntMenores = cntMenores;
    }

    public int getBajoPeso() {
        return bajoPeso;
    }

    public void setBajoPeso(int bajoPeso) {
        this.bajoPeso = bajoPeso;
    }

    public int getNormal() {
        return normal;
    }

    public void setNormal(int normal) {
        this.normal = normal;
    }

    public int getSobrepeso() {
        return sobrepeso;
    }

    public void setSobrepeso(int sobrepeso) {
        this.sobrepeso = sobrepeso;
    }

    public int getObesidad() {
        return obesidad;
    }

    public void setObesidad(int obesidad) {
        this.obesidad = obesidad;
    }

    public int getMujeres() {
        return mujeres;
    }

    public void setMujeres(int mujeres) {
        this.mujeres = mujeres;
    }

    public int getHombres() {
        return hombres;
    }

    public void setHombres(int hombres) {
        this.hombres = hombres;
    }

    
    private void btn_Inicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Inicio1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Inicio1MouseClicked

    private void Titulo_DoctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo_DoctoresMouseClicked

    }//GEN-LAST:event_Titulo_DoctoresMouseClicked

    private void ecgTxt_DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecgTxt_DocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ecgTxt_DocActionPerformed
    private int cntMayores=0;
    private int cntMenores=0;
    private   int bajoPeso=0;
    private int normal=0;
    private int sobrepeso=0;
    private  int obesidad=0;
    private int mujeres=0;
    private int hombres=0;
    private static int cnt=0;
    
    private void estadisticasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticasBtnActionPerformed
        cnt++;
        DefaultTableModel m=new DefaultTableModel();
        m = (DefaultTableModel) tablaPacientes.getModel();
        List<Paciente> list = new ArrayList<>();
        Consultas consultaPaciente = new Consultas();
        Object[] ob = new Object[list.size()];
        

        try {

            list = consultaPaciente.recuperarTodas(Conexion.obtener());
        } catch (SQLException ex) {
            Logger.getLogger(PruebaConexionYimi.class.getName()).log(Level.SEVERE, null, ex);

        } //catch (ClassNotFoundException ex) {
           // Logger.getLogger(PruebaConexionYimi.class.getName()).log(Level.SEVERE, null, ex);
       // }
        double estaturaMts;
        double imc;
        
        if(cnt==1){
        for (int i = 0; i < list.size(); i++) {
            
                                        //estadisticas de edad
            if(Integer.parseInt(list.get(i).getEdad())>18)
                cntMayores++;
            else 
                cntMenores++;
            
                                        //estadisticas de peso
            estaturaMts=0;
            imc=0;
            
            estaturaMts=(Double.parseDouble(list.get(i).getEstatura()))/100;
            //System.out.println("ESTATURA EN MTS"+estaturaMts);
            imc=(Integer.parseInt(list.get(i).getPeso()))/((estaturaMts)*(estaturaMts));
            //System.out.println("IMC"+imc);
            if(imc<18.5){
                bajoPeso++;
            }
            else{
                if(imc>=18.5 && imc<25){
                    normal++;
                }
                else{
                    if(imc>=25 && imc<30)
                        sobrepeso++;
                    else
                        obesidad++;
                }
            }
            
            
                                            //estadisticas de sexo
            if(list.get(i).getSexo().equals("Femenino"))
                mujeres++;
            if(list.get(i).getSexo().equals("Masculino"))
                hombres++;
        }
        } else 
            System.out.println("error");
        
        Estadistico e=new Estadistico(cntMayores, bajoPeso, normal, cntBajas, hombres, mujeres, sobrepeso, cntMenores, obesidad, this);
        e.setVisible(true);
        e.mayores(String.valueOf(cntMayores));
        e.menores(String.valueOf(cntMenores));
        e.mujeres(String.valueOf(mujeres));
        e.hombres(String.valueOf(hombres));
        e.bajas(String.valueOf(cntBajas));
        e.pesoBajo(String.valueOf(bajoPeso));
        e.pesoNormal(String.valueOf(normal));
        e.sobrepeso(String.valueOf(sobrepeso));
        e.obesidad(String.valueOf(obesidad));
        
    }//GEN-LAST:event_estadisticasBtnActionPerformed

    private void buscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarPacienteActionPerformed
    private Character s;
    
    
    public void validarLetras(KeyEvent evt){
        s=evt.getKeyChar();
        if(!Character.isLetter(s)){
            evt.consume();
        }
    }
    
    public void validarConEspacios(KeyEvent evt){
        s=evt.getKeyChar();
        if(!Character.isLetter(s) && s!=KeyEvent.VK_SPACE){
            evt.consume();
        }
    }

    private void nombreTxt_DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxt_DocActionPerformed
        Character tecla = null;
        for(int i=0; i<nombreTxt_Doc.getText().length(); i++){
            tecla=nombreTxt_Doc.getText().charAt(i);
                if(Character.isAlphabetic(tecla)){
                    JOptionPane.showMessageDialog(null, "Ingresar solo letras");
                }
                
                
        }
        
    }//GEN-LAST:event_nombreTxt_DocActionPerformed

    private void edadTxt_DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadTxt_DocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadTxt_DocActionPerformed

    private void direccionTxt_DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionTxt_DocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionTxt_DocActionPerformed

    private void telefonoTxt_DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoTxt_DocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoTxt_DocActionPerformed

    private void sexoTxt_DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoTxt_DocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoTxt_DocActionPerformed

    private void sangreTxt_DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sangreTxt_DocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sangreTxt_DocActionPerformed

    public static Paciente pacienteBuscao = null;

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_buscarBtnActionPerformed
        
        Consultas c = new Consultas();
        Paciente p = new Paciente((Integer.parseInt(buscarPaciente.getText())));
        try {
            p = c.recuperarPorId(Conexion.obtener(), Integer.parseInt(buscarPaciente.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(Ventana2.class.getName()).log(Level.SEVERE, null, ex);
        } //catch (ClassNotFoundException ex) {
            //Logger.getLogger(Ventana2.class.getName()).log(Level.SEVERE, null, ex);
        //}

        pacienteBuscao = p;

        if (pacienteBuscao == null) {
            JOptionPane.showMessageDialog(null, "ID NO ENCONTRADO");
            this.resetFields();
            return;
        }
        nombreTxt_Doc.setText(p.getNombre());
        edadTxt_Doc.setText(p.getEdad());
        sexoTxt_Doc.setText(p.getEstatura());
        direccionTxt_Doc.setText(p.getAlergias());
        telefonoTxt_Doc.setText(p.getPeso());
        sangreTxt_Doc.setText(p.getSangre());
        limpiarTabla();
        
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void limpiarTabla(){
        tablaEstadisticas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                   
                },
                new String[]{
                    "Mayor","Menor","Promedio" 
                }
        ));
        DefaultTableModel m=new DefaultTableModel();
        m = (DefaultTableModel) tablaEstadisticas.getModel();
        String []dato=new String[3];
        float prom=0;
        prom=(menorLatido+mayorLatido)/2.0f;
        for (int i = 0; i < 3; i++) {
            dato[0]=null;
            dato[1]=null;
            dato[2]=null;
        }
        m.addRow(dato);
    }
    private int cntBajas=0;
    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt)  {//GEN-FIRST:event_eliminarBtnActionPerformed
        Consultas c = new Consultas();
        Paciente p = new Paciente((Integer.parseInt(buscarPaciente.getText())));
        try {
            c.eliminar(Conexion.obtener(), p);
        } catch (SQLException ex) {
            Logger.getLogger(Ventana2.class.getName()).log(Level.SEVERE, null, ex);
        } //catch (ClassNotFoundException ex) {
            //Logger.getLogger(Ventana2.class.getName()).log(Level.SEVERE, null, ex);
       // }
        buscarPaciente.setText(" ");
        //Los espacion sa vacían a blanco
        nombreTxt_Doc.setText(" ");
        edadTxt_Doc.setText(" ");
        sexoTxt_Doc.setText(" ");
        direccionTxt_Doc.setText(" ");
        telefonoTxt_Doc.setText(" ");
        sangreTxt_Doc.setText(" ");
        JOptionPane.showMessageDialog(null, "PACIENTE DADO DE BAJA");
        cntBajas++;
        limpiarTabla();
    }//GEN-LAST:event_eliminarBtnActionPerformed

    //int idPaciente, String nombre, String edad, String estatura, String alergias, String peso
    private void cambiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarBtnActionPerformed
        Consultas consultaPaciente = new Consultas();
        File archivo;
        if (pacienteBuscao == null) {
            JOptionPane.showMessageDialog(null, "ID NO ENCONTRADO");  
        }
        else{
        Paciente p = new Paciente(pacienteBuscao.getIdPaciente(), (String) nombreTxt_Doc.getText(), (String) edadTxt_Doc.getText(), (String) sangreTxt_Doc.getText(), (String) sexoTxt_Doc.getText(), (String) telefonoTxt_Doc.getText(), (String) direccionTxt_Doc.getText());
        try {
            JOptionPane.showMessageDialog(null, "CAMBIO EXITOSO");  

            consultaPaciente.guardar(Conexion.obtener(), p);
        } catch (SQLException ex) {
            Logger.getLogger(Ventana2.class.getName()).log(Level.SEVERE, null, ex);
        } 
        //catch (ClassNotFoundException ex) {
          //  Logger.getLogger(Ventana2.class.getName()).log(Level.SEVERE, null, ex);
       // }
//Paciente p = new Paciente(pacienteBuscao.getIdPaciente(), nombreTxt_Doc.getText(), edadTxt_Doc.getText(), sangreTxt_Doc.getText(), sexoTxt_Doc.getText() , telefonoTxt_Doc.getText(), direccionTxt_Doc.getText());  
        this.resetFields();
        }
        limpiarTabla();
    }//GEN-LAST:event_cambiarBtnActionPerformed

    private void resetFields(){
        buscarPaciente.setText(" ");
        //Los espacion sa vacían a blanco
        nombreTxt_Doc.setText(" ");
        edadTxt_Doc.setText(" ");
        sexoTxt_Doc.setText(" ");
        direccionTxt_Doc.setText(" ");
        telefonoTxt_Doc.setText(" ");
        sangreTxt_Doc.setText(" ");
        
       
    }
    
    private void cambiarEcgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarEcgBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarEcgBtnActionPerformed

    private void sacarDatosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacarDatosBtnActionPerformed
        tablaEstadisticas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                   
                },
                new String[]{
                    "Mayor","Menor","Promedio" 
                }
        ));
        DefaultTableModel m=new DefaultTableModel();
        m = (DefaultTableModel) tablaEstadisticas.getModel();
        String []dato=new String[3];
        float prom=0;
        prom=(menorLatido+mayorLatido)/2.0f;
        for (int i = 0; i < 3; i++) {
            dato[0]=String.valueOf(mayorLatido);
            dato[1]=String.valueOf(menorLatido);
            dato[2]=String.valueOf(prom);
            
            
            
        }
        m.addRow(dato);
                
    }//GEN-LAST:event_sacarDatosBtnActionPerformed
    
    
    
    
    private void abrirEcgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirEcgBtnActionPerformed
        limpiarTabla();
        XYPlot plot=grafica.getXYPlot();
        XYLineAndShapeRenderer render=new XYLineAndShapeRenderer();
        render.setSeriesPaint(0, Color.PINK);
        render.setSeriesStroke(0, new BasicStroke(4.0f));
        plot.setRenderer(render);
        
       ChartPanel Panel=new ChartPanel(grafica);
       JFrame ventana=new JFrame("GRAFICO");
       ventana.getContentPane().add(Panel);
       //ventana.pack();
       
        ventana.setVisible(true);
        ventana.setSize(800, 600);
     
       
    }
    
    private int edades[]=new int[50];
    
    private void consultarTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarTBtnActionPerformed
        limpiarTabla();
        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                   
                },
                new String[]{
                    "No. Paciente", "Nombre", "Edad", "ESTATURA", "ALERGIAS", "PESO", "SANGRE"
                }
        ));
        String[] dato=new String[7];
        
        DefaultTableModel m=new DefaultTableModel();
        m = (DefaultTableModel) tablaPacientes.getModel();
        
        
        List<Paciente> list = new ArrayList<>();
        Consultas consultaPaciente = new Consultas();
        Object[] ob = new Object[list.size()];
        

        try {

            list = consultaPaciente.recuperarTodas(Conexion.obtener());
        } catch (SQLException ex) {
            Logger.getLogger(PruebaConexionYimi.class.getName()).log(Level.SEVERE, null, ex);

        } //catch (ClassNotFoundException ex) {
           // Logger.getLogger(PruebaConexionYimi.class.getName()).log(Level.SEVERE, null, ex);
       // }
        double estaturaMts;
        double imc;
        
        for (int i = 0; i < list.size(); i++) {
            dato[0]=String.valueOf(list.get(i).getIdPaciente());
            dato[1]=list.get(i).getNombre();
            dato[2]=list.get(i).getEdad();
            dato[3]=list.get(i).getEstatura();
            dato[4]=list.get(i).getAlergias();
            dato[5]=list.get(i).getPeso();
            dato[6]=list.get(i).getSangre();
            m.addRow(dato);
            
        }
        
    }//GEN-LAST:event_consultarTBtnActionPerformed
    
    
    

    private void escondidoTxt_DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escondidoTxt_DocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escondidoTxt_DocActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelEdad;
    private javax.swing.JPanel Titulo_Docs;
    private javax.swing.JPanel Titulo_Doctores;
    private javax.swing.JButton abrirEcgBtn;
    private javax.swing.JPanel btn_Doctores;
    private javax.swing.JPanel btn_Inicio;
    private javax.swing.JPanel btn_Inicio1;
    private javax.swing.JPanel btn_Pacientes;
    private javax.swing.JButton btn_equis;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarPaciente;
    private javax.swing.JButton cambiarBtn;
    private javax.swing.JButton cambiarEcgBtn;
    private javax.swing.JButton consultarTBtn;
    private javax.swing.JTextField direccionTxt_Doc;
    private javax.swing.JTextField ecgTxt_Doc;
    private javax.swing.JTextField edadTxt_Doc;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JTextField escondidoTxt_Doc;
    private javax.swing.JButton estadisticasBtn;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel lateral;
    private javax.swing.JTextField nombreTxt_Doc;
    private javax.swing.JButton sacarDatosBtn;
    private javax.swing.JTextField sangreTxt_Doc;
    private javax.swing.JTextField sexoTxt_Doc;
    private javax.swing.JTable tablaEstadisticas;
    private javax.swing.JTable tablaPacientes;
    private javax.swing.JTextField telefonoTxt_Doc;
    private javax.swing.JPanel titulo;
    // End of variables declaration//GEN-END:variables
}
