/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelo.Vista;

import java.awt.Color;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import vuelo.Control.Asientos;
import vuelo.Control.Procedimientos;
import vuelo.Control.Vuelo;
import vuelo.Modelo.AsientoData;
import vuelo.Modelo.CiudadesData;
import vuelo.Modelo.Conexion;
import vuelo.Modelo.VuelosData;

/**
 *
 * @author Sebastian
 */
public class F_Vuelo extends javax.swing.JInternalFrame {
public static DefaultComboBoxModel model_ciuda;
    /**
     * Creates new form F_Vuelo
     */
    public F_Vuelo() {
        initComponents();  
      cbxpaisorigen.addItem("Seleccionar");
      cbxpaisdestino.addItem("Seleccionar");
        CargarComboxPais();
        CargarComboxCiudadOrigen();
        CargarComboxCiudadDestino();
    }
  
    public void LimpiarFormulario(){
    txtaerolinea.setText("");
    txtaeronave.setText("");
    txtnumerovuelo.setText("");
    txtpreciovuelo.setText("");
    cbxciudaddestino.setSelectedIndex(0);
    cbxciudadorigen.setSelectedIndex(0);
     cbxpaisorigen.setSelectedIndex(0);
     cbxpaisdestino.setSelectedIndex(0);
    jdcsalida.setCalendar(null);
    jdcllegada.setCalendar(null);
    Date date = new Date(00, 00, 00);
     jtcllegada.setTime(date);
     jtcsalida.setTime(date);
    rbnormal.setSelected(true);

    }
    public void LimpiarAsientos(){
    txtventanilla.setText("");
    txtpasillo.setText("");
    jspventana.setValue(0);
    jsppasillo.setValue(0);
    jcboxdisponible.setSelected(true);
    }
    
    
    
   public void CargarComboxPais(){

        Conexion conexion; //Iniciamos el combox del form con los paises /////////////////////////////////////////////////////
        try {
            conexion = new Conexion("jdbc:mysql://siscollege.dynu.net:3306/vuelos", "connect", "123456");
            CiudadesData ciudades = new CiudadesData(conexion);
            ciudades.LlenarComboPais().forEach(Ciudades -> {
            cbxpaisorigen.addItem(String.valueOf(Ciudades.getPais()));  
            cbxpaisdestino.addItem(String.valueOf(Ciudades.getPais()));
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(F_Vuelo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al instanciar la clase conexion: " + ex.getMessage());
        }
    }
   public void CargarComboxCiudadOrigen(){///cargo los combos ciudad origen
       Conexion conexion; 
        try{
            conexion = new Conexion("jdbc:mysql://siscollege.dynu.net:3306/vuelos", "connect", "123456");
            VuelosData vuelosData = new VuelosData(conexion);
            vuelosData.LlenarComboCiudad(String.valueOf(cbxpaisorigen.getSelectedItem())).forEach(ciudad -> {
            cbxciudadorigen.addItem(ciudad.getCiudad());
        });
        
   } catch (ClassNotFoundException ex) {
        Logger.getLogger(F_Vuelo.class.getName()).log(Level.SEVERE, null, ex);
    }
}
   public void CargarComboxCiudadDestino(){
       Conexion conexion; 
        try{
            conexion = new Conexion("jdbc:mysql://siscollege.dynu.net:3306/vuelos", "connect", "123456");
            VuelosData vuelosData = new VuelosData(conexion);
            vuelosData.LlenarComboCiudad(String.valueOf(cbxpaisdestino.getSelectedItem())).forEach(ciudad -> {
            cbxciudaddestino.addItem(ciudad.getCiudad());
        });
        
   } catch (ClassNotFoundException ex) {
        Logger.getLogger(F_Vuelo.class.getName()).log(Level.SEVERE, null, ex);
    }
}  

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesVuelo = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btneliminarvuelo = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxpaisorigen = new javax.swing.JComboBox<>();
        cbxpaisdestino = new javax.swing.JComboBox<>();
        cbxciudadorigen = new javax.swing.JComboBox<>();
        cbxciudaddestino = new javax.swing.JComboBox<>();
        btnagregarciudad1 = new javax.swing.JButton();
        btnagregarciudad2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtcsalida = new lu.tudor.santec.jtimechooser.JTimeChooser();
        jtcllegada = new lu.tudor.santec.jtimechooser.JTimeChooser();
        jdcllegada = new com.toedter.calendar.JDateChooser();
        jdcsalida = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtpreciovuelo = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        rbnormal = new javax.swing.JRadioButton();
        rbretrasado = new javax.swing.JRadioButton();
        rbcancelado = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtventanilla = new javax.swing.JTextField();
        txtpasillo = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jspventana = new javax.swing.JSpinner();
        jsppasillo = new javax.swing.JSpinner();
        jcboxdisponible = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtasientos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtnumerovuelo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        txtaerolinea = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtaeronave = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton2.setText("Modificar Estado de Vuelo");

        jButton1.setText("Confirmar Vuelo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btneliminarvuelo.setMnemonic('e');
        btneliminarvuelo.setText("Eliminar");
        btneliminarvuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarvueloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btneliminarvuelo)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(btneliminarvuelo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("ORIGEN - DESTINO"));
        jPanel6.setToolTipText("");
        jPanel6.setName(""); // NOI18N

        jLabel1.setText("Origen");

        jLabel2.setText("Destino");

        cbxpaisorigen.setToolTipText("");
        cbxpaisorigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxpaisorigenActionPerformed(evt);
            }
        });

        cbxpaisdestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxpaisdestinoActionPerformed(evt);
            }
        });

        btnagregarciudad1.setText("+");
        btnagregarciudad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarciudad1ActionPerformed(evt);
            }
        });

        btnagregarciudad2.setText("+");
        btnagregarciudad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarciudad2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxpaisorigen, 0, 178, Short.MAX_VALUE)
                    .addComponent(cbxpaisdestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxciudadorigen, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxciudaddestino, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnagregarciudad1)
                    .addComponent(btnagregarciudad2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxpaisorigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxciudadorigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregarciudad1))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxpaisdestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxciudaddestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregarciudad2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Horarios"));

        jLabel3.setText("Fecha y Hora de Salida");

        jLabel4.setText("Fecha y Hora de Llegada");

        jtcsalida.setAutoscrolls(true);
        jtcsalida.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jtcsalida.setShowIcon(true);
        jtcsalida.setShowSeconds(false);

        jtcllegada.setAutoscrolls(true);
        jtcllegada.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jtcllegada.setName(""); // NOI18N
        jtcllegada.setShowIcon(true);
        jtcllegada.setShowSeconds(false);

        jdcllegada.setBorder(null);
        jdcllegada.setMinSelectableDate(new java.util.Date(-62135755110000L));

        jdcsalida.setMaxSelectableDate(new java.util.Date(253370779260000L));
        jdcsalida.setMinSelectableDate(new java.util.Date(-62135755140000L));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdcllegada, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jdcsalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtcsalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtcllegada, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcsalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtcsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtcllegada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdcllegada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("INFORMACION"));

        jLabel5.setText("Costo del Pasaje");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado del vuelo"));

        opcionesVuelo.add(rbnormal);
        rbnormal.setSelected(true);
        rbnormal.setText("Normal");
        rbnormal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbnormalMouseClicked(evt);
            }
        });

        opcionesVuelo.add(rbretrasado);
        rbretrasado.setText("Retrasado");
        rbretrasado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbretrasadoMouseClicked(evt);
            }
        });

        opcionesVuelo.add(rbcancelado);
        rbcancelado.setForeground(new java.awt.Color(255, 0, 0));
        rbcancelado.setText("Cancelado");
        rbcancelado.setToolTipText("");
        rbcancelado.setName(""); // NOI18N
        rbcancelado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbcanceladoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbnormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbretrasado)
                .addGap(18, 18, 18)
                .addComponent(rbcancelado)
                .addGap(14, 14, 14))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnormal)
                    .addComponent(rbretrasado)
                    .addComponent(rbcancelado))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(txtpreciovuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpreciovuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Vuelos", jPanel5);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo del Asiento"));

        jLabel9.setText("Ventanilla");

        jLabel10.setText("Pasillo");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtpasillo, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(txtventanilla))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtventanilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtpasillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));

        jLabel6.setText("Ventana");

        jLabel8.setText("Pasillo");

        jButton4.setText("Asientos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jcboxdisponible.setText("Disponibles");
        jcboxdisponible.setActionCommand("Disponible");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jspventana, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jsppasillo))
                        .addGap(70, 70, 70))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jcboxdisponible)
                        .addGap(0, 58, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jspventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jsppasillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jcboxdisponible))
                .addGap(27, 27, 27))
        );

        jtasientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jtasientos.setToolTipText("");
        jtasientos.setEnabled(false);
        jtasientos.setName(""); // NOI18N
        jScrollPane2.setViewportView(jtasientos);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(370, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        jTabbedPane2.addTab("Asientos", jPanel7);

        jLabel7.setText("Nº de Vuelo");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS AEROLINEA"));

        jLabel11.setText("Aerolinea");

        jLabel12.setText("Aeronave");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtaeronave, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtaeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        lblestado.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        lblestado.setBorder(null);
        lblestado.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblestadoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumerovuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtnumerovuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblestado, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Vuelos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarciudad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarciudad1ActionPerformed
        // TODO add your handling code here:
        FDOC_Ciudad fc = new FDOC_Ciudad(null, rootPaneCheckingEnabled);
        fc.setVisible(true);
        fc.setAlwaysOnTop(true);
        fc.setModal(true);
    }//GEN-LAST:event_btnagregarciudad1ActionPerformed

    private void btnagregarciudad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarciudad2ActionPerformed
        // TODO add your handling code here:
        FDOC_Ciudad fc = new FDOC_Ciudad(null, rootPaneCheckingEnabled);
        fc.setVisible(true);
        fc.setAlwaysOnTop(true);
        fc.setModal(true);
    }//GEN-LAST:event_btnagregarciudad2ActionPerformed

    private void lblestadoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblestadoAncestorAdded
      // TODO add your handling code here:
      //   rbnormal.setActionCommand("Normal");
      //   lblestado.setText("Normal");
      //   lblestado.setForeground(Color.GREEN); 
      //      opcionesVuelo.getSelection().getActionCommand();
        if (rbnormal.isSelected()) {
        lblestado.setText("Normal");
        lblestado.setForeground(Color.ORANGE);       
        }
        if (rbretrasado.isSelected()) {
            lblestado.setText("Retrasado");
            lblestado.setForeground(Color.BLUE);      
        }
        if (rbcancelado.isSelected()) {
            lblestado.setText("Cancelado");
            lblestado.setForeground(Color.RED); 
        } 
        
    }//GEN-LAST:event_lblestadoAncestorAdded

    private void cbxpaisorigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxpaisorigenActionPerformed
        // TODO add your handling code here:
       cbxciudadorigen.removeAllItems();
       cbxciudadorigen.addItem("Seleccione una opcion");
       CargarComboxCiudadOrigen();
    }//GEN-LAST:event_cbxpaisorigenActionPerformed

    private void cbxpaisdestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxpaisdestinoActionPerformed
        // TODO add your handling code here:
       cbxciudaddestino.removeAllItems();
       cbxciudaddestino.addItem("Seleccione una opcion");
       CargarComboxCiudadDestino();
    }//GEN-LAST:event_cbxpaisdestinoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ////JDateChooser
        Procedimientos procedimientos = new Procedimientos();
        String A = procedimientos.getFecha(jdcllegada);
        String B = procedimientos.getFecha(jdcsalida);
        
        
        /////////////////////////grupo de opciones con valores
       rbnormal.setActionCommand("Normal");
       rbretrasado.setActionCommand("Retrasado");
       rbcancelado.setActionCommand("Cancelado");
        

        Conexion conexion;
    try {
        conexion = new Conexion("jdbc:mysql://siscollege.dynu.net:3306/vuelos", "connect", "123456");
        VuelosData vuelosData = new VuelosData(conexion);
        Vuelo vuelo = new Vuelo(txtaerolinea.getText(),txtaeronave.getText(),cbxciudaddestino.getSelectedItem().toString(),cbxciudadorigen.getSelectedItem().toString(),B,A,jtcsalida.getFormatedTime(),jtcllegada.getFormatedTime(),Float.parseFloat(txtpreciovuelo.getText()),txtnumerovuelo.getText(),opcionesVuelo.getSelection().getActionCommand());
        vuelosData.guardarVuelo(vuelo);
        
        LimpiarFormulario();
        LimpiarAsientos();
        AsientoData tbl_eliminar = new AsientoData(conexion);
        tbl_eliminar.LimpiarTabla(jtasientos);//ilmpio tabla
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(F_Vuelo.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbnormalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbnormalMouseClicked
        // TODO add your handling code here:
        lblestado.setText("Normal");
        lblestado.setForeground(Color.ORANGE);  
    }//GEN-LAST:event_rbnormalMouseClicked

    private void rbretrasadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbretrasadoMouseClicked
        // TODO add your handling code here:
         lblestado.setText("Retrasado");
         lblestado.setForeground(Color.BLUE); 
    }//GEN-LAST:event_rbretrasadoMouseClicked

    private void rbcanceladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbcanceladoMouseClicked
        // TODO add your handling code here:
        lblestado.setText("Cancelado");
        lblestado.setForeground(Color.RED);  
    }//GEN-LAST:event_rbcanceladoMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  
     Procedimientos procedimientos = new Procedimientos();
     int num1 = procedimientos.SpiN(jspventana);
     int num2 = procedimientos.SpiN(jsppasillo);
     int resultado = num1 + num2;

     int[] numeros = new int[resultado];
        int i;
        int a = 0;
        int b = 0;
        
    Conexion conexion;    
     try {
        conexion = new Conexion("jdbc:mysql://siscollege.dynu.net:3306/vuelos", "connect", "123456");    
        AsientoData asientoData = new AsientoData(conexion);
        if (num1 > 0) {
            for (i = 0; i < num1; i++) {
            
              Asientos asientos = new Asientos( Integer.parseInt(txtnumerovuelo.getText()), "V"+ ++a, "Ventana", jcboxdisponible.isSelected(), Float.parseFloat(txtventanilla.getText()) );
              asientoData.GuardarAsientos(asientos);
                
             //System.out.println(numeros[i]);
             //System.out.println("Ventana "+ " V"+ ++a);
             //System.out.println("$ "+txtventanilla.getText());   
            }         
        }
        if (num2 > 0) {
            for (i = 0; i < num2; i++) {
                
              Asientos asientos = new Asientos( Integer.parseInt(txtnumerovuelo.getText()), "P"+ ++b, "Pasillo", jcboxdisponible.isSelected(), Float.parseFloat(txtpasillo.getText()) );
              asientoData.GuardarAsientos(asientos);  
              //System.out.println(numeros[i]);
             //System.out.println("Pasillo "+ " P"+ ++b);
            //System.out.println("$ "+txtpasillo.getText());
            }        
        }
        int val =  Integer.parseInt(txtnumerovuelo.getText());//busco el valor insertado en numero de vuelo para filtrar
        asientoData.CargarTablaAsientos(jtasientos , val); //Cargo la tabla con los asientos de ese vuelo
        System.out.println("Asientos  para el vuelo "+ txtnumerovuelo.getText() +" insertados correctamente.."); 
      } catch (ClassNotFoundException ex) {
        Logger.getLogger(F_Vuelo.class.getName()).log(Level.SEVERE, null, ex);    
        } catch (SQLException ex) {
        Logger.getLogger(F_Vuelo.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Procedimientos procedimientos = new Procedimientos();

        Conexion conexion;
        try {
            conexion = new Conexion("jdbc:mysql://siscollege.dynu.net:3306/vuelos", "connect", "123456");
            VuelosData vuelosData = new VuelosData(conexion);
            Vuelo vuelo = new Vuelo(txtnumerovuelo.getText());
            vuelosData.buscarVuelo(vuelo);
            txtaerolinea.setText(vuelo.getAerolinea());
            txtaeronave.setText(vuelo.getAeronave());
            txtpreciovuelo.setText(String.valueOf(vuelo.getPrecioVuelo()));
           
            cbxciudadorigen.removeAllItems();
            cbxciudadorigen.addItem(vuelo.getCiudadOrigen());
            cbxciudaddestino.removeAllItems();
            cbxciudaddestino.addItem(vuelo.getCiudadDestino());
            
            jdcllegada.setDate(procedimientos.sumarFechasDias(java.sql.Date.valueOf(vuelo.getFechaLlegada()),1));
            jdcsalida.setDate(procedimientos.sumarFechasDias(java.sql.Date.valueOf(vuelo.getFechaPartida()),1));
            
           jtcllegada.setTime(procedimientos.StringATime(vuelo.getHoraLlegada()));
           jtcsalida.setTime(procedimientos.StringATime(vuelo.getHoraPartida()));
         
           lblestado.setText(vuelo.getEstadoVuelo());
         
           ///CARGAR ASIENTOS
         AsientoData asientoData = new AsientoData(conexion);
         int val =  Integer.parseInt(txtnumerovuelo.getText());
         asientoData.CargarTablaAsientos(jtasientos , val);
         jspventana.setEnabled(false);
         jsppasillo.setEnabled(false);
         txtventanilla.setEnabled(false);
         txtpasillo.setEnabled(false);
         jButton4.setEnabled(false);
         jcboxdisponible.setEnabled(false);
         
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(F_Vuelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
        Logger.getLogger(F_Vuelo.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btneliminarvueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarvueloActionPerformed
       
        try { 
            Conexion conexion;
            conexion = new Conexion("jdbc:mysql://siscollege.dynu.net:3306/vuelos", "connect", "123456");
            VuelosData vd = new VuelosData(conexion);
            int val =  Integer.parseInt(txtnumerovuelo.getText());
            vd.eliminarVuelo(val);
            System.out.println("Vuelo eliminado correctamente");
            LimpiarFormulario();
            LimpiarAsientos();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(F_Vuelo.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("No se ha podido eliminar el vuelo");
        }
 
    }//GEN-LAST:event_btneliminarvueloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregarciudad1;
    private javax.swing.JButton btnagregarciudad2;
    private javax.swing.JButton btneliminarvuelo;
    public static javax.swing.JComboBox<String> cbxciudaddestino;
    public static javax.swing.JComboBox<String> cbxciudadorigen;
    public static javax.swing.JComboBox<String> cbxpaisdestino;
    public static javax.swing.JComboBox<String> cbxpaisorigen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JCheckBox jcboxdisponible;
    private com.toedter.calendar.JDateChooser jdcllegada;
    private com.toedter.calendar.JDateChooser jdcsalida;
    private javax.swing.JSpinner jsppasillo;
    private javax.swing.JSpinner jspventana;
    public javax.swing.JTable jtasientos;
    private lu.tudor.santec.jtimechooser.JTimeChooser jtcllegada;
    private lu.tudor.santec.jtimechooser.JTimeChooser jtcsalida;
    private javax.swing.JLabel lblestado;
    private javax.swing.ButtonGroup opcionesVuelo;
    private javax.swing.JRadioButton rbcancelado;
    private javax.swing.JRadioButton rbnormal;
    private javax.swing.JRadioButton rbretrasado;
    private javax.swing.JTextField txtaerolinea;
    private javax.swing.JTextField txtaeronave;
    public javax.swing.JTextField txtnumerovuelo;
    private javax.swing.JTextField txtpasillo;
    private javax.swing.JTextField txtpreciovuelo;
    private javax.swing.JTextField txtventanilla;
    // End of variables declaration//GEN-END:variables


    
}
