package PackageLab01;


import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

public class Lab01_GraficaArbo_l00 extends javax.swing.JFrame {
    String Date[];
    private NodosUsuario user;
    Archivos Arc = new Archivos(2,Date);
    NodoBanco Banco = new NodoBanco();
  
 
 
     
    public Lab01_GraficaArbo_l00() {
          this.setLocationRelativeTo(null);
          this.setResizable(false);
         //setLocationRelativeTo(null);
        initComponents();
              
    }
  
    
    
   public void buscar(int Elem,String Con, NodosUsuario A) {
        if (A == null) {           
            JOptionPane.showMessageDialog(null,"Usuario y/o contraseña no encontrado o incorrecto");
        } else if (A.ID == Elem && A.Contraseña.equals(Con)) {
           user = A;

        } else if (Elem > A.ID) {
           
            buscar(Elem,Con, A.LD);
            
        } else {
            buscar(Elem,Con, A.LI);
        }
    }
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OttoBitIS = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        MiBilleteraButton = new javax.swing.JButton();
        TransaccionesButton = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Minado = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        PanelBilletera = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        TFBilletera = new javax.swing.JTextField();
        ConsultarSaldo = new javax.swing.JButton();
        IDUsuario = new javax.swing.JTextField();
        PanelTransacciones = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RTransaccionButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CantidadTransferir = new javax.swing.JTextField();
        IDBilleteraTransferir = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        CrearUsuario = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        Crear = new javax.swing.JButton();
        CancelarCC = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabelNombre1 = new javax.swing.JLabel();
        JTFApellido = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        JTFID = new javax.swing.JTextField();
        jLabelNombre4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabelNombre3 = new javax.swing.JLabel();
        JTFPass = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        JTFNombre = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        Miner = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeMinado = new javax.swing.JTable();
        SecondCode = new javax.swing.JTextField();
        PrimeCode = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaMinadoSelecionada = new javax.swing.JTable();
        Minar = new javax.swing.JButton();
        CancelarMiner = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Selecionar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Registrar = new javax.swing.JButton();
        BTNEntrar = new javax.swing.JButton();
        TFUsuario = new javax.swing.JTextField();
        TFPassw = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        OttoBitLabel = new javax.swing.JLabel();

        OttoBitIS.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        OttoBitIS.setTitle("OttoBit [Cliente]");
        OttoBitIS.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        MiBilleteraButton.setText("Mi Billetera");
        MiBilleteraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiBilleteraButtonActionPerformed(evt);
            }
        });

        TransaccionesButton.setText("Transacciones");
        TransaccionesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaccionesButtonActionPerformed(evt);
            }
        });

        Salir.setText("salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Minado.setText("Minar");
        Minado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MiBilleteraButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TransaccionesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Minado, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TransaccionesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MiBilleteraButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Minado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setToolTipText("");

        PanelBilletera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("ID de billetera");

        TFBilletera.setEditable(false);
        TFBilletera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFBilleteraActionPerformed(evt);
            }
        });

        ConsultarSaldo.setText("consultar saldo");
        ConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarSaldoActionPerformed(evt);
            }
        });

        IDUsuario.setEditable(false);
        IDUsuario.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PanelBilleteraLayout = new javax.swing.GroupLayout(PanelBilletera);
        PanelBilletera.setLayout(PanelBilleteraLayout);
        PanelBilleteraLayout.setHorizontalGroup(
            PanelBilleteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBilleteraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBilleteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelBilleteraLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(IDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TFBilletera, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        PanelBilleteraLayout.setVerticalGroup(
            PanelBilleteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBilleteraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBilleteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(IDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                .addComponent(ConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFBilletera, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelTransacciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        jLabel8.setBackground(new java.awt.Color(51, 255, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TRANSACCIONES");

        jLabel9.setText("ID de billetera a la que se va a transferir");

        RTransaccionButton.setText("Realizar transaccion");
        RTransaccionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTransaccionButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Cantidad a transferir");

        CantidadTransferir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadTransferirKeyTyped(evt);
            }
        });

        IDBilleteraTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDBilleteraTransferirActionPerformed(evt);
            }
        });
        IDBilleteraTransferir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDBilleteraTransferirKeyTyped(evt);
            }
        });

        jButton1.setText("Arbol");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTransaccionesLayout = new javax.swing.GroupLayout(PanelTransacciones);
        PanelTransacciones.setLayout(PanelTransaccionesLayout);
        PanelTransaccionesLayout.setHorizontalGroup(
            PanelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTransaccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RTransaccionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(PanelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(CantidadTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                        .addComponent(IDBilleteraTransferir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelTransaccionesLayout.setVerticalGroup(
            PanelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTransaccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDBilleteraTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CantidadTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addGroup(PanelTransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RTransaccionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBilletera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelTransacciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelBilletera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout OttoBitISLayout = new javax.swing.GroupLayout(OttoBitIS.getContentPane());
        OttoBitIS.getContentPane().setLayout(OttoBitISLayout);
        OttoBitISLayout.setHorizontalGroup(
            OttoBitISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        OttoBitISLayout.setVerticalGroup(
            OttoBitISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OttoBitISLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CrearUsuario.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        CrearUsuario.setTitle("OttoBit [Registrar]");

        jPanel2.setToolTipText("");

        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        CancelarCC.setText("Cancelar");
        CancelarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarCCActionPerformed(evt);
            }
        });

        jLabelNombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre1.setText("Apellido:");

        JTFApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFApellidoActionPerformed(evt);
            }
        });
        JTFApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFApellidoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        JTFID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFIDKeyTyped(evt);
            }
        });

        jLabelNombre4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre4.setText("Numero de ID: ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre4)
                    .addComponent(JTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelNombre3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre3.setText("Contraseña:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre3)
                    .addComponent(JTFPass, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNombreActionPerformed(evt);
            }
        });
        JTFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFNombreKeyTyped(evt);
            }
        });

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JTFNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CancelarCC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Crear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelarCC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout CrearUsuarioLayout = new javax.swing.GroupLayout(CrearUsuario.getContentPane());
        CrearUsuario.getContentPane().setLayout(CrearUsuarioLayout);
        CrearUsuarioLayout.setHorizontalGroup(
            CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CrearUsuarioLayout.setVerticalGroup(
            CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Miner.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Miner.setTitle("OttoBit[Mining]");

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TablaDeMinado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Origen", "Destinario", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaDeMinado);
        TablaDeMinado.getAccessibleContext().setAccessibleDescription("");

        SecondCode.setEditable(false);

        PrimeCode.setEditable(false);

        TablaMinadoSelecionada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oriigen", "Destinario", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaMinadoSelecionada);

        Minar.setText("Minar");
        Minar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinarActionPerformed(evt);
            }
        });

        CancelarMiner.setText("Cancelar");
        CancelarMiner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarMinerActionPerformed(evt);
            }
        });

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        Selecionar.setText("Selecionar");
        Selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(CancelarMiner, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Minar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(PrimeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SecondCode, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(Selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrimeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SecondCode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Minar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CancelarMiner, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout MinerLayout = new javax.swing.GroupLayout(Miner.getContentPane());
        Miner.getContentPane().setLayout(MinerLayout);
        MinerLayout.setHorizontalGroup(
            MinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MinerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MinerLayout.setVerticalGroup(
            MinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MinerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OttoBit [InicioSesión]");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 102, 102));
        setBounds(new java.awt.Rectangle(0, 0, 200, 200));
        setFocusCycleRoot(false);

        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        BTNEntrar.setText("Entrar");
        BTNEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEntrarActionPerformed(evt);
            }
        });

        TFUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFUsuarioMouseClicked(evt);
            }
        });
        TFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFUsuarioActionPerformed(evt);
            }
        });
        TFUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFUsuarioKeyTyped(evt);
            }
        });

        jLabel1.setText("Numero ID:");

        jLabel2.setText("contraseña:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(BTNEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFPassw, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFPassw, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OttoBitLabel.setFont(new java.awt.Font("Agency FB", 1, 50)); // NOI18N
        OttoBitLabel.setText("OttoBit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OttoBitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(OttoBitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFUsuarioMouseClicked
     
        
        
    }//GEN-LAST:event_TFUsuarioMouseClicked

    private void BTNEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEntrarActionPerformed
         if(!(TFUsuario.getText().equals("") && TFPassw.getText().equals(""))){
            if(Banco.PUsuarios != null){
  
        buscar(Integer.parseInt(TFUsuario.getText()),TFPassw.getText(),Banco.PUsuarios);
        
        if(user != null){
     
          
        //System.out.println(S.Nombre);
                OttoBitIS.setVisible(true);
                OttoBitIS.setBounds(0,0,500,500);
                OttoBitIS.setLocationRelativeTo(null);
                OttoBitIS.setResizable(false);
                
                PanelBilletera.setVisible(true);
                PanelTransacciones.setVisible(false);
                MiBilleteraButton.setEnabled(false);
                user.MiBilletera.BilleteraID = user.ID;
                IDUsuario.setText(Integer.toString(user.ID));
                TFUsuario.setText("");
                TFPassw.setText("");
                this.dispose();
        }        
            }else {
         JOptionPane.showMessageDialog(null, "Error Base de datos vacias");
         }
            }else {
        JOptionPane.showMessageDialog(null, "Primero debe ingresar el numero el la barra de texto");
        
        } 
        
        
        
    }//GEN-LAST:event_BTNEntrarActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
  CrearUsuario.setVisible(true);
  CrearUsuario.setBounds(0,0, 440, 320);
  //CrearUsuario.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
  CrearUsuario.setLocationRelativeTo(null);
  CrearUsuario.setResizable(false);
 this.setVisible(false);
 JTFNombre.setText("");
 JTFApellido.setText("");
 JTFID.setText("");
 JTFPass.setText("");
    }//GEN-LAST:event_RegistrarActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
if((!(JTFNombre.getText().equals(""))) && (!(JTFApellido.getText().equals(""))) && (!(JTFApellido.getText().equals(""))) && (!(JTFPass.getText().equals("")))){
    String Datos[] = new String[4];
    Archivos arch = new Archivos();
    Datos[0] = JTFNombre.getText();
    Datos[1] = JTFApellido.getText();
    Datos[2] = JTFID.getText();
    Datos[3] = JTFPass.getText();
    arch.CrearArchivoUsuarios(Datos);
        
        Banco.PUsuarios = Banco.k.CargarNodoUsuario();
        
        CrearUsuario.dispose();
        this.setVisible(true);
}else{
JOptionPane.showMessageDialog(null, "Ningun campo debe estar vacio");
}
    }//GEN-LAST:event_CrearActionPerformed

    private void CancelarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarCCActionPerformed
      CrearUsuario.dispose();
      this.setVisible(true);
    }//GEN-LAST:event_CancelarCCActionPerformed

    private void TFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFUsuarioActionPerformed

    private void MiBilleteraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiBilleteraButtonActionPerformed
      PanelBilletera.setVisible(true);
      PanelTransacciones.setVisible(false);
      MiBilleteraButton.setEnabled(false);
      TransaccionesButton.setEnabled(true);
    }//GEN-LAST:event_MiBilleteraButtonActionPerformed

    private void TransaccionesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaccionesButtonActionPerformed
          PanelBilletera.setVisible(false);
      PanelTransacciones.setVisible(true);
      MiBilleteraButton.setEnabled(true);
      TransaccionesButton.setEnabled(false);
      PanelTransacciones.setLocation(20, 20);
    }//GEN-LAST:event_TransaccionesButtonActionPerformed

    private void ConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarSaldoActionPerformed
 
        TFBilletera.setText(user.MiBilletera.Cantidad + "");
    }//GEN-LAST:event_ConsultarSaldoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
     OttoBitIS.dispose();
     System.out.println("dolor");
    }//GEN-LAST:event_SalirActionPerformed

    private void RTransaccionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTransaccionButtonActionPerformed

        if(!(CantidadTransferir.getText().equals("") && IDBilleteraTransferir.getText().equals(""))){ 
            if(user.MiBilletera.Cantidad >= Float.parseFloat(CantidadTransferir.getText())){
            if(user.ID != Integer.parseInt(IDBilleteraTransferir.getText()) ){
int ID = Integer.parseInt(IDBilleteraTransferir.getText());
user.MiBilletera.Cantidad-=Float.parseFloat(CantidadTransferir.getText());
Arc.BuscarA(user.ID, ID,Banco.PUsuarios,Double.parseDouble(CantidadTransferir.getText()));
JOptionPane.showMessageDialog(null, "transaccion realizada");
            } else {
            JOptionPane.showMessageDialog(null, "No se puede tranferirse a sí mismo");
            }
    
            }else{JOptionPane.showMessageDialog(null, "saldo insuficiente");}
}else {

JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacio");

}   
        
    }//GEN-LAST:event_RTransaccionButtonActionPerformed

    private void MinadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinadoActionPerformed
      
        Miner.setVisible(true);
        Miner.setBounds(0,0,1025,495);
        Miner.setResizable(false);
        Miner.setLocationRelativeTo(null);
        Minado.setEnabled(false);
        
     
          if (Arc.ft.exists()){

 DefaultTableModel DateTable = (DefaultTableModel)TablaDeMinado.getModel();
  if(DateTable.getRowCount() >= 1){

        for(int l = DateTable.getRowCount() -1; l > -1; l--){     
        DateTable.removeRow(l);
        }
        }
 try(Scanner Scans = new Scanner (Arc.Transaccion)){
               while(Scans.hasNextLine()){               
                   String linea = Scans.nextLine();
                   String data[]= linea.split(Arc.SplitsGeneral);     
                  if(!(data[0].equals(user.ID)) && !(data[1].equals(user.ID)) ){         
                DateTable.addRow(new Object[]{data[0],data[1],data[2]});          
                  }
               
               }                 
         }catch(Exception ex){
    System.out.println("Error en la carga de datos de la tabla");
    }

}else{
    System.out.println("Transacción vacia");
}
        

       
    

         
    }//GEN-LAST:event_MinadoActionPerformed

    private void TFBilleteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFBilleteraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFBilleteraActionPerformed

    private void TFUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFUsuarioKeyTyped
   char valid = evt.getKeyChar(); // Variable "valid" tipo char que recoge "letras pulsada desde el teclado" (Creo)
     if(Character.isLetter(valid)){ // Verifica si la variable valid recibio una letra. 
     getToolkit().beep();
     evt.consume(); 
     JOptionPane.showMessageDialog(rootPane, "Ingresar solo numero"); // Un JOption que envia un mensaje que solo letras
   }
    }//GEN-LAST:event_TFUsuarioKeyTyped

    private void JTFIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFIDKeyTyped
    char valid = evt.getKeyChar(); // Variable "valid" tipo char que recoge "letras pulsada desde el teclado" 
   if(Character.isLetter(valid)){ // Verifica si la variable valid recibio una letra. 
     getToolkit().beep();// Resumiendolo... hace que genere un sonido de "Beep" 
     evt.consume(); // Evita que se escriba la letra
     JOptionPane.showMessageDialog(rootPane, "Ingresar solo numero"); // Un JOption que envia un mensaje que solo letras
   }
    }//GEN-LAST:event_JTFIDKeyTyped

    private void JTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNombreActionPerformed

    private void JTFNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNombreKeyTyped
       char valid = evt.getKeyChar(); // Variable "valid" tipo char que recoge "letras pulsada desde el teclado" 
   if(Character.isDigit(valid)){ // Verifica si la variable valid recibio una letra. 
     getToolkit().beep();// Resumiendolo... hace que genere un sonido de "Beep" 
     evt.consume(); // Evita que se escriba el numero
     JOptionPane.showMessageDialog(rootPane, "Ingresar solo Caracteres"); // Un JOption que envia un mensaje que solo letras
   }
    }//GEN-LAST:event_JTFNombreKeyTyped

    private void JTFApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFApellidoActionPerformed

    private void JTFApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFApellidoKeyTyped
       char valid = evt.getKeyChar(); // Variable "valid" tipo char que recoge "letras pulsada desde el teclado" 
   if(Character.isDigit(valid)){ // Verifica si la variable valid recibio una letra. 
     getToolkit().beep();// Resumiendolo... hace que genere un sonido de "Beep" 
     evt.consume(); // Evita que se escriba el numero
     JOptionPane.showMessageDialog(rootPane, "Ingresar solo Caracteres"); // Un JOption que envia un mensaje que solo letras
   }
    }//GEN-LAST:event_JTFApellidoKeyTyped

    private void CancelarMinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarMinerActionPerformed
     Minado.setEnabled(true);
     Miner.dispose();
        
     
    }//GEN-LAST:event_CancelarMinerActionPerformed

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
int a = TablaMinadoSelecionada.getRowCount();
DefaultTableModel TablaModelo = (DefaultTableModel) TablaMinadoSelecionada.getModel();
        System.out.println(a);
        if(a <= 2){
        
            
                //DefaultTableModel
          
        TablaModelo.addRow(new Object[] {TablaDeMinado.getValueAt(TablaDeMinado.getSelectedRow(), 0),TablaDeMinado.getValueAt(TablaDeMinado.getSelectedRow(), 1),TablaDeMinado.getValueAt(TablaDeMinado.getSelectedRow(), 2)} );
        
        if(a == 2){
            int ps = 0;
        for(int i = 0; i < 3; i++){
                for(int j = 0; j< 3; j++){
         
             ps += ((TablaMinadoSelecionada.getValueAt(i, j).toString()).hashCode());
                }
                
                    }
        ps = ps/100000;
            PrimeCode.setText(Integer.toString(ps));
        
        }
      
            
            
        }else {
        
        JOptionPane.showMessageDialog(null,"Cantidad llena de transacciones");
        }
        
        
    }//GEN-LAST:event_SelecionarActionPerformed

    private void IDBilleteraTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDBilleteraTransferirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDBilleteraTransferirActionPerformed

    private void IDBilleteraTransferirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDBilleteraTransferirKeyTyped
       //miguel estuvo aqui
        char valid = evt.getKeyChar(); // Variable "valid" tipo char que recoge "letras pulsada desde el teclado" 
   if(Character.isLetter(valid)){ // Verifica si la variable valid recibio una letra. 
     getToolkit().beep();// Resumiendolo... hace que genere un sonido de "Beep" 
     evt.consume(); // Evita que se escriba el numero
     JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros"); // Un JOption que envia un mensaje que solo letras
     
   }
    }//GEN-LAST:event_IDBilleteraTransferirKeyTyped

    private void CantidadTransferirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadTransferirKeyTyped
        //miguel estuvo aqui
        char valid = evt.getKeyChar(); // Variable "valid" tipo char que recoge "letras pulsada desde el teclado" 
   if(Character.isLetter(valid)){ // Verifica si la variable valid recibio una letra. 
     getToolkit().beep();// Resumiendolo... hace que genere un sonido de "Beep" 
     evt.consume(); // Evita que se escriba el numero
     JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros"); // Un JOption que envia un mensaje que solo letras
   }   
    }//GEN-LAST:event_CantidadTransferirKeyTyped

    private void MinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinarActionPerformed
       if(TablaMinadoSelecionada.getRowCount()<3){
            JOptionPane.showMessageDialog(null,"no se han seleccionado tres transacciones");
        }else if (TablaMinadoSelecionada.getRowCount() == 3){
            Minar.setEnabled(false);
           Selecionar.setEnabled(false);
           CancelarMiner.setEnabled(false);
           Actualizar.setEnabled(false);
            int peso = 0;
           for(int i = 0; i < 3; i++){
                for(int j = 0; j< 3; j++){
           // Dates[i][j] = TablaMinadoSelecionada.getValueAt(i, j);
              
             peso += (TablaMinadoSelecionada.getValueAt(i, j).toString()).hashCode();
             
                }
                    }
           System.out.println(peso);
           Random R = new Random();
           
      while(Integer.parseInt(PrimeCode.getText() + SecondCode.getText()) != peso){
      
         SecondCode.setText(Integer.toString(R.nextInt(99999)+999));
      
      }
       Minar.setEnabled(true);
           Selecionar.setEnabled(true);
           CancelarMiner.setEnabled(true);
           Actualizar.setEnabled(true);
           
           
           if(Integer.parseInt(PrimeCode.getText() + SecondCode.getText()) == peso){
           JOptionPane.showMessageDialog(null, "Codigo Encontrado");
           user.MiBilletera.Cantidad+=1;
           int ori[] = new int[3];{ 
            ori[0] = Integer.parseInt((TablaMinadoSelecionada.getValueAt(0, 0)).toString());
            ori[1] = Integer.parseInt((TablaMinadoSelecionada.getValueAt(1, 0)).toString());
            ori[2] = Integer.parseInt((TablaMinadoSelecionada.getValueAt(2, 0)).toString());
        }
           int desti[] = new int[3];{
        desti[0] = Integer.parseInt((TablaMinadoSelecionada.getValueAt(0, 1)).toString());
        desti[1] = Integer.parseInt((TablaMinadoSelecionada.getValueAt(1, 1)).toString());       
        desti[2] = Integer.parseInt((TablaMinadoSelecionada.getValueAt(2, 1)).toString());
        }
           double trans[] = new double[3];{
        trans[0] = Double.parseDouble((TablaMinadoSelecionada.getValueAt(0, 2)).toString());
        trans[1] = Double.parseDouble((TablaMinadoSelecionada.getValueAt(1, 2)).toString());       
        trans[2] = Double.parseDouble((TablaMinadoSelecionada.getValueAt(2, 2)).toString());
        }
          Bloque Block = new Bloque(ori,desti,trans);
          if(Banco.Genesis == null){
              Banco.Genesis = Block;
              Banco.B = Block;
          }else{
           
           Banco.B.BlockChain(Block);
           Banco.B = Banco.B.NextBlock();
           Banco.Recorrer();
          }
           }
            
        }
      
    }//GEN-LAST:event_MinarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed

          if (Arc.ft.exists()){

 DefaultTableModel DateTable = (DefaultTableModel)TablaDeMinado.getModel();
 DefaultTableModel TableMin = (DefaultTableModel)TablaMinadoSelecionada.getModel();
 if(DateTable.getRowCount() >= 1){

        for(int l = DateTable.getRowCount() -1; l > -1; l--){     
        DateTable.removeRow(l);
        }
        }
  if(TableMin.getRowCount() >= 1){

        for(int l = TableMin.getRowCount() -1; l > -1; l--){     
        TableMin.removeRow(l);
        }
        }
 try(Scanner Scans = new Scanner (Arc.Transaccion)){
               while(Scans.hasNextLine()){               
                   String linea = Scans.nextLine();
                   String data[]= linea.split(Arc.SplitsGeneral);     
                  if(!(data[0].equals(user.ID)) && !(data[1].equals(user.ID)) ){         
                DateTable.addRow(new Object[]{data[0],data[1],data[2]});          
                  }
               
               }                 
         }catch(Exception ex){
    System.out.println("Error en la carga de datos de la tabla");
    }

}else{
    System.out.println("Transacción vacia");
}     
           PrimeCode.setText("");
       SecondCode.setText("");
    }//GEN-LAST:event_ActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        grafico grafic = new grafico();
        grafic.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lab01_GraficaArbo_l00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab01_GraficaArbo_l00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab01_GraficaArbo_l00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab01_GraficaArbo_l00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           new Lab01_GraficaArbo_l00().setVisible(true); 
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton BTNEntrar;
    private javax.swing.JButton CancelarCC;
    private javax.swing.JButton CancelarMiner;
    private javax.swing.JTextField CantidadTransferir;
    private javax.swing.JButton ConsultarSaldo;
    private javax.swing.JButton Crear;
    private javax.swing.JFrame CrearUsuario;
    private javax.swing.JTextField IDBilleteraTransferir;
    private javax.swing.JTextField IDUsuario;
    private javax.swing.JTextField JTFApellido;
    private javax.swing.JTextField JTFID;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JPasswordField JTFPass;
    private javax.swing.JButton MiBilleteraButton;
    private javax.swing.JButton Minado;
    private javax.swing.JButton Minar;
    private javax.swing.JFrame Miner;
    private javax.swing.JFrame OttoBitIS;
    private javax.swing.JLabel OttoBitLabel;
    private javax.swing.JPanel PanelBilletera;
    private javax.swing.JPanel PanelTransacciones;
    private javax.swing.JTextField PrimeCode;
    private javax.swing.JButton RTransaccionButton;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField SecondCode;
    private javax.swing.JButton Selecionar;
    private javax.swing.JTextField TFBilletera;
    private javax.swing.JPasswordField TFPassw;
    private javax.swing.JTextField TFUsuario;
    private javax.swing.JTable TablaDeMinado;
    private javax.swing.JTable TablaMinadoSelecionada;
    private javax.swing.JButton TransaccionesButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JPanel jPanel1;
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
    // End of variables declaration//GEN-END:variables
}
