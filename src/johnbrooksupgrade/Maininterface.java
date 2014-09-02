package johnbrooksupgrade;

import java.awt.Color; //brings in Double works when commented out
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.lang.Character;
import java.lang.Math;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//importing packages for functionality

public class Maininterface extends javax.swing.JFrame
{

    // <editor-fold defaultstate="collapsed" desc="vars for the formatted answers getting printed to the pdf">
    protected String Circumferenceanswer2f;
    protected String Metresperminuteanswer4f;
    protected String Metresperhouranswer5f;
    protected String Lengthperhouranswer7f;
    protected String Kgsperhouranswer9f;
    protected String Kgatanygiventimeanswer10f;
    protected String Beltloadanswer13f;
    protected String Nmanswer15f;
    protected String Designkwanswer18f;
    protected String Rpmoutput20f;
    protected String Beltspeedoutput21f;
    protected String Radiananswer25f;
    protected String Servicefactor17f;
    protected String Speedofbeltanswer29f;
    protected String Loadperhourcontiniousoutput30f;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="calculation vars">
    protected double Drumdiameterinput1;
    protected double Circumferenceanswer2;
    protected double Rpminput3;
    protected double Metresperminuteanswer4;
    protected double Metresperhouranswer5;
    protected double Lengthofconveyor6;
    protected double Lengthperhouranswer7;
    protected double Productonconveyorinput8;
    protected double Kgsperhouranswer9;
    protected double Kgatanygiventimeanswer10;
    protected double Widthofconveyorinput11;
    protected double Beltweightinput12;
    protected double Beltloadanswer13;
    protected double Applicationfactoranswer14;
    protected double Nmanswer15;
    protected double Kwanswer16;
    protected double Servicefactorinput17;
    protected double Designkwanswer18;
    protected double Conveyorspeedinput19;
    protected double Rpmoutput20;
    protected double Beltspeedoutput21;
    protected double Materialtypeinput22;
    protected double Angleinput23;
    protected double Radianangle24;
    protected double Radiananswer25;
    protected double Unithourinput26;
    protected double Lengthinput27;
    protected double Spacinginput28;
    protected double Speedofbeltanswer29;
    protected double Loadperhourcontiniousoutput30;
    protected double Weightofunitinput31;
    protected double Productonconveyor32;
    protected double Conveyorrpm33;
    protected double Rpmconveyor34;
    protected String Rpmconveyor35;
    private boolean isDiscreet;
    // </editor-fold>

    //Referencing Salesinfo class
    private final SalesInfo save;
    //This is used so we can collect the error messages for each error and display them in one message box 
    private ArrayList<String> errorMessages = new ArrayList<>();

    public Maininterface()
    {
        initComponents();

        save = new SalesInfo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Drumdiameterinput = new javax.swing.JTextField();
        Rpminput = new javax.swing.JTextField();
        Lengthofconveyorinput = new javax.swing.JTextField();
        Productonconveyorinput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLRpm = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Kgsatanygiventimeoutput = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Widthofconveyorinput = new javax.swing.JTextField();
        Beltweightinput = new javax.swing.JTextField();
        Servicefactorinput = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        other = new javax.swing.JButton();
        Beltloadoutput = new javax.swing.JLabel();
        Nmoutput = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Conveyorspeedinput = new javax.swing.JTextField();
        jLConveyorSpeed = new javax.swing.JLabel();
        jcbMeterial = new javax.swing.JComboBox();
        Applicationfactoranswer = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Angleinput = new javax.swing.JTextField();
        Unithourinput = new javax.swing.JTextField();
        Lengthinput = new javax.swing.JTextField();
        Spacinginput = new javax.swing.JTextField();
        jcdeiscret = new javax.swing.JCheckBox();
        jlunitsperhour = new javax.swing.JLabel();
        jlLengh = new javax.swing.JLabel();
        jlSpacing = new javax.swing.JLabel();
        Loadperhourcontiniousoutput = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jlLengthMetres = new javax.swing.JLabel();
        jlSpacingMetress = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jweightofunit = new javax.swing.JLabel();
        Weightofunitinput = new javax.swing.JTextField();
        weightofunitlabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jBQuit = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Kwoutput = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        loadContinuousLbl = new javax.swing.JLabel();
        powerLbl = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        rpmResultsOutput = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jBWormBox = new javax.swing.JButton();
        jBBevelHelical = new javax.swing.JButton();
        jBBrooksCyclo = new javax.swing.JButton();
        jBReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GearboxOptionsOutput = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        dbProcessing = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("John Brooks Ltd Conveyor Calculator");
        setResizable(false);

        Drumdiameterinput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Drumdiameterinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        Rpminput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Rpminput.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RpminputActionPerformed(evt);
            }
        });
        Rpminput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        Lengthofconveyorinput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Lengthofconveyorinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        Productonconveyorinput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Productonconveyorinput.setMaximumSize(new java.awt.Dimension(6, 22));
        Productonconveyorinput.setPreferredSize(new java.awt.Dimension(65, 22));
        Productonconveyorinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Product on Conveyor");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Length of Conveyor");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Rpm");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Drum Diameter");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Metres");

        jLRpm.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLRpm.setText("Rpm");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Metres");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Kg's");

        Kgsatanygiventimeoutput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Belt Weight");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("Service Factor");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Width of Conveyor");

        Widthofconveyorinput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Widthofconveyorinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        Beltweightinput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Beltweightinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        Servicefactorinput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Servicefactorinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("Metres");

        other.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        other.setText("Calculate");
        other.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                otherActionPerformed(evt);
            }
        });

        Beltloadoutput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        Nmoutput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("Conveyor Speed");

        Conveyorspeedinput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Conveyorspeedinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        jLConveyorSpeed.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLConveyorSpeed.setText("M/pm");

        jcbMeterial.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jcbMeterial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Pivoting Bucket Conveyor", "Belt on Rollers", "Metal on Metal (finished)", "Fabric on Steel", "Fabric on Wood", "Leather on Wood", "Wood on Wood", "Plastic on Steel", "Metal on Wood", "Rubber on Wood", "Rubber on Steel", "Leather on Metal", "" }));
        jcbMeterial.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jcbMeterialActionPerformed(evt);
            }
        });

        Applicationfactoranswer.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setText("Belt Material");

        Angleinput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Angleinput.setText("0");
        Angleinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        Unithourinput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Unithourinput.setEnabled(false);
        Unithourinput.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                UnithourinputActionPerformed(evt);
            }
        });
        Unithourinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        Lengthinput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Lengthinput.setEnabled(false);
        Lengthinput.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                LengthinputActionPerformed(evt);
            }
        });
        Lengthinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        Spacinginput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Spacinginput.setEnabled(false);
        Spacinginput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        jcdeiscret.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jcdeiscret.setText("Discreet");
        jcdeiscret.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                jcdeiscretItemStateChanged(evt);
            }
        });
        jcdeiscret.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jcdeiscretActionPerformed(evt);
            }
        });

        jlunitsperhour.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlunitsperhour.setText("Units/Hour");
        jlunitsperhour.setEnabled(false);

        jlLengh.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlLengh.setText("Product Length");
        jlLengh.setEnabled(false);

        jlSpacing.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlSpacing.setText("Spacing per Unit");
        jlSpacing.setEnabled(false);

        Loadperhourcontiniousoutput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setText("Decimal");

        jlLengthMetres.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlLengthMetres.setText("Metres");
        jlLengthMetres.setEnabled(false);

        jlSpacingMetress.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jlSpacingMetress.setText("Metres");
        jlSpacingMetress.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setText("Angle in Degrees");

        jweightofunit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jweightofunit.setText("Weight of unit");
        jweightofunit.setEnabled(false);

        Weightofunitinput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Weightofunitinput.setEnabled(false);
        Weightofunitinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        weightofunitlabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        weightofunitlabel.setText("Kg");
        weightofunitlabel.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Torque");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("Total design Load");

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel20.setText("Kg'f");

        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setText("PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jBQuit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jBQuit.setText("Quit");
        jBQuit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBQuitActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setText("Kg/m2");

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel22.setText("Specifications");

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/johnbrooksupgrade/John Brooks logo.jpg"))); // NOI18N
        jLabel18.setText("jLabel18");

        jLabel24.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel24.setText("Power");

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel25.setText("Kw");

        Kwoutput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel26.setText("Nm");

        loadContinuousLbl.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        loadContinuousLbl.setText("Continuous Load Per Hour:");
        loadContinuousLbl.setEnabled(false);

        jLabel27.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel27.setText("Coeff. Friction");

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel28.setText("Results:");

        jLabel29.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel29.setText("RPM");

        rpmResultsOutput.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel30.setText("Rpm");

        jBWormBox.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jBWormBox.setText("Brooks Drive WormBox");
        jBWormBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBWormBoxActionPerformed(evt);
            }
        });

        jBBevelHelical.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jBBevelHelical.setText("Bevel/Helical");
        jBBevelHelical.setToolTipText("");
        jBBevelHelical.setActionCommand("");
        jBBevelHelical.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBBevelHelicalActionPerformed(evt);
            }
        });

        jBBrooksCyclo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jBBrooksCyclo.setText("BrooksCyclo");
        jBBrooksCyclo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBBrooksCycloActionPerformed(evt);
            }
        });

        jBReset.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jBReset.setText("Reset");
        jBReset.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBResetActionPerformed(evt);
            }
        });

        GearboxOptionsOutput.setEditable(false);
        GearboxOptionsOutput.setColumns(20);
        GearboxOptionsOutput.setRows(5);
        jScrollPane1.setViewportView(GearboxOptionsOutput);
        GearboxOptionsOutput.getAccessibleContext().setAccessibleName("");

        jLabel31.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel31.setText("Gearbox Options");

        dbProcessing.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        dbProcessing.setText(" ");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jlLengh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlSpacing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jweightofunit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(loadContinuousLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlunitsperhour, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Weightofunitinput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Spacinginput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Lengthinput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Unithourinput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlLengthMetres, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlSpacingMetress, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(weightofunitlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Loadperhourcontiniousoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jcdeiscret))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(other, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Drumdiameterinput)
                                    .addComponent(Rpminput)
                                    .addComponent(Conveyorspeedinput)
                                    .addComponent(Lengthofconveyorinput)
                                    .addComponent(Productonconveyorinput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLConveyorSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(0, 0, Short.MAX_VALUE)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLRpm)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel16)
                                                    .addComponent(jLabel15))
                                                .addGap(24, 24, 24)
                                                .addComponent(jcbMeterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(Angleinput, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(Beltweightinput, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addComponent(jLabel10)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(Servicefactorinput, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel27)
                                                                        .addGap(47, 47, 47)
                                                                        .addComponent(Applicationfactoranswer, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                            .addGap(18, 18, 18)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(2, 2, 2)
                                                            .addComponent(jLabel11)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(Widthofconveyorinput, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jBBrooksCyclo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBBevelHelical, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jBWormBox, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(107, 107, 107)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(dbProcessing)
                                                            .addComponent(powerLbl))
                                                        .addGap(157, 157, 157))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rpmResultsOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Beltloadoutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nmoutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Kwoutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBReset)
                                .addGap(89, 89, 89)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kgsatanygiventimeoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Beltweightinput, Servicefactorinput, Widthofconveyorinput});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcdeiscret)
                        .addGap(13, 13, 13)
                        .addComponent(jlunitsperhour)
                        .addGap(18, 18, 18)
                        .addComponent(jlLengh)
                        .addGap(15, 15, 15)
                        .addComponent(jlSpacing)
                        .addGap(17, 17, 17)
                        .addComponent(jweightofunit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Unithourinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(Lengthinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jlLengthMetres, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Spacinginput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jlSpacingMetress)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Weightofunitinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(weightofunitlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadContinuousLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Loadperhourcontiniousoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(Kgsatanygiventimeoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Drumdiameterinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Rpminput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLRpm))))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Conveyorspeedinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLConveyorSpeed))))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Lengthofconveyorinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Productonconveyorinput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbMeterial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Angleinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Applicationfactoranswer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Servicefactorinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Beltweightinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Widthofconveyorinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addComponent(powerLbl)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(other, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel29)
                                .addComponent(jLabel30))
                            .addComponent(rpmResultsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Beltloadoutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nmoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(Kwoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel25)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBQuit)
                            .addComponent(jBReset)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dbProcessing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBWormBox)
                                .addGap(18, 18, 18)
                                .addComponent(jBBrooksCyclo)
                                .addGap(18, 18, 18)
                                .addComponent(jBBevelHelical)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Beltweightinput, Servicefactorinput, Widthofconveyorinput});

        Kgsatanygiventimeoutput.getAccessibleContext().setAccessibleName("SalesInfo");
        loadContinuousLbl.getAccessibleContext().setAccessibleName("LoadHourContinuousLbl");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void InfoBox(String infoMessage)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Error!", JOptionPane.ERROR_MESSAGE);
    }

    private void CalculateKgsAtAnyGivenTime()
    {

        if (Drumdiameterinput.getText().isEmpty() || Rpminput.getText().isEmpty()
                || Lengthofconveyorinput.getText().isEmpty() || Productonconveyorinput.getText().isEmpty())
        {
            errorMessages.add("Attempted to calculate KGs at any given time but required fields were missing.");
            //Error checking for inputs
        } else
        {

            Drumdiameterinput1 = Double.parseDouble(Drumdiameterinput.getText());
            Circumferenceanswer2 = Drumdiameterinput1 * 3.142;
            Circumferenceanswer2f = String.format("%.2f", Circumferenceanswer2);
            //grabs inputed text puts it in a variable and does the math then outputs it to another variable.

            Rpmoutput20 = Double.parseDouble(Rpminput.getText());
            Metresperminuteanswer4 = (Circumferenceanswer2 * Rpmoutput20);
            Metresperminuteanswer4f = String.format("%.2f", Metresperminuteanswer4);
            //grabs inputed text puts it in a variable and does the math then outputs it to another variable.

            Metresperhouranswer5 = (Metresperminuteanswer4 * 60);
            Metresperhouranswer5f = String.format("%.2f", Metresperhouranswer5);
            //grabs variable value and does the math then outputs it to another variable.

            Lengthofconveyor6 = Double.parseDouble(Lengthofconveyorinput.getText());
            Lengthperhouranswer7 = (Metresperhouranswer5 / Lengthofconveyor6);
            Lengthperhouranswer7f = String.format("%.2f", Lengthperhouranswer7);
            //grabs inputed text puts it in a variable and does the math then outputs it to another variable.

            Productonconveyorinput8 = Double.parseDouble(Productonconveyorinput.getText());
            Kgsperhouranswer9 = (Lengthperhouranswer7 * Productonconveyorinput8);
            Kgsperhouranswer9f = String.format("%.2f", Kgsperhouranswer9);
            //grabs inputed text puts it in a variable and does the math then outputs it to another variable.

            Kgatanygiventimeanswer10 = (Kgsperhouranswer9 / Lengthperhouranswer7);
            //grabs both variable values and does the math then outputs it to another variable.

            String fstring = String.format("%.2f", Kgatanygiventimeanswer10);
            //makes it print to 2 decimal places
            Kgatanygiventimeanswer10f = (fstring);
            //grabs the local variable and puts it into the global variable

        }
    }


    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
        try
        {
            if (isDiscreet)
            {
                CalculateSpeedOfBelt();
                CalculateProductOnConveyor();
                CalculateContinuousLoadPerHour();
            }

            if (!"".equals(Rpminput.getText()) && !"".equals(Conveyorspeedinput.getText()) && !isDiscreet)
            {
                // If all these fields are not empty, they've entered the values manually
                // This means we need to display an error message telling them to clear one of the fields out
                // so that the system can calculate the blank field itself rather than risk inaccuracy from
                // the user.
                
                InfoBox("RPM and conveyor speed currently have values."
                        + "\nThe System requires one of these to be empty in order to calculate the other accurately."
                        + "\nPlease correct this.");
            } 
            else
            {
                CaculateRpmOrConveyorSpeedDependingOnInput();
                CalculateApplicationFactor();
                Beltload();
                CalculateTorque();
                Designkw();
                CalculateKgsAtAnyGivenTime();
            }
        } 
        catch (Exception e)
        {
            //Add this at the first index of the array so it displays first
            errorMessages.add(0, "Sorry, there were some errors:");
        }

        DisplayErrorsIfNecessary();
    }//GEN-LAST:event_otherActionPerformed

    private void DisplayErrorsIfNecessary()
    {
        String errorMessagesForPopUp = "";

        if (!errorMessages.isEmpty())
        {
            for (String message : errorMessages)
            {
                errorMessagesForPopUp += message + "\n";
            }
            InfoBox(errorMessagesForPopUp);
            errorMessages.clear();
        }
    }

    private void Beltload()
    {
        if (Drumdiameterinput.getText().isEmpty() || Widthofconveyorinput.getText().isEmpty()
                || Beltweightinput.getText().isEmpty() || Lengthofconveyorinput.getText().isEmpty())
        {
            errorMessages.add("Attempted to calculate Belt Load but one or more required fields: Drum Diameter, Width of Convenyor, Belt Weight, or Length of Conveyor was empty.");
            //Error checking for inputs
        } else
        {
            Drumdiameterinput1 = Double.parseDouble(Drumdiameterinput.getText());
            Widthofconveyorinput11 = Double.parseDouble(Widthofconveyorinput.getText());
            Beltweightinput12 = Double.parseDouble(Beltweightinput.getText());
            Lengthofconveyor6 = Double.parseDouble(Lengthofconveyorinput.getText());
            //gabbing inputs values and putting them into variables.

            Circumferenceanswer2 = Drumdiameterinput1 * 3.142;
            Beltloadanswer13 = ((Lengthofconveyor6 * 2) + Circumferenceanswer2) * (Widthofconveyorinput11) * Beltweightinput12;
            //grabs inputed text puts it in a variable and does the math then outputs it to another variable

            String fstring = String.format("%.2f", Beltloadanswer13);
            //makes it print to 2 decimal place and converting from a double to a string
            Beltloadanswer13f = (fstring);
            Beltloadoutput.setText(fstring);
            //pushing the values to show on the textbox.

            Beltloadoutput.setForeground(Color.BLACK);
        }
    }

    private void CalculateTorque()
    {
        if (Drumdiameterinput.getText().isEmpty() || Beltweightinput.getText().isEmpty() || Productonconveyorinput.getText().isEmpty())
        {
            errorMessages.add("Attempted to calculate torque but one or more requried fields: Drum Diameter, Product on Conveyor or Belt Weight were empty.");

            //Error checking for inputs
        } else
        {

            Productonconveyor32 = Double.parseDouble(Productonconveyorinput.getText());
            Drumdiameterinput1 = Double.parseDouble(Drumdiameterinput.getText());
            Beltweightinput12 = Double.parseDouble(Beltweightinput.getText());
            //gabbing inputs values and putting them into variables.

            Nmanswer15 = (Productonconveyor32 + Beltloadanswer13) * Radiananswer25 * ((Drumdiameterinput1 / 2)) * 10;
            //grabs inputed text puts it in a variable and does the math then outputs it to another variable

            String fstring = String.format("%.2f", Nmanswer15);
            //makes it print to 2 decimal place and converting from a double to a string
            Nmanswer15f = (fstring);
            Nmoutput.setText(fstring);
            //pushing the values to show on the textbox.
            Nmoutput.setForeground(Color.BLACK);
        }
    }

    private void Designkw()
    {
        // design Power = ( Service factor * torque * rotation ) / 9550

        Servicefactorinput17 = Double.parseDouble(Servicefactorinput.getText());
        Kwanswer16 = (Nmanswer15 * Rpmconveyor34) / 9550;
        Designkwanswer18 = (Kwanswer16 * Servicefactorinput17);

        // Format answers to 2 decimal places    
        String formattedKWResult = String.format("%.2f", Designkwanswer18);
        Designkwanswer18f = (formattedKWResult);
        Kwoutput.setText(formattedKWResult);
        String f1string = String.format("%.2f", Servicefactorinput17);
        Servicefactor17f = f1string;
        Servicefactorinput.setText(f1string);
    }

    private void jcbMeterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMeterialActionPerformed
        // Select base friction factor for belt/base combinations

        int item = jcbMeterial.getSelectedIndex();

        switch (item)
        {
            case 1:
                Materialtypeinput22 = 0.025;
                break;
            case 2:
                Materialtypeinput22 = 0.025;
                break;
            case 3:
                Materialtypeinput22 = 0.2;
                break;
            case 4:
                Materialtypeinput22 = 0.27;
                break;
            case 5:
                Materialtypeinput22 = 0.32;
                break;
            case 6:
                Materialtypeinput22 = 0.35;
                break;
            case 7:
                Materialtypeinput22 = 0.35;
                break;
            case 8:
                Materialtypeinput22 = 0.35;
                break;
            case 9:
                Materialtypeinput22 = 0.4;
                break;
            case 10:
                Materialtypeinput22 = 0.45;
                break;
            case 11:
                Materialtypeinput22 = 0.5;
                break;
            case 12:
                Materialtypeinput22 = 0.56;
                break;
        }
    }//GEN-LAST:event_jcbMeterialActionPerformed

    private void jcdeiscretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcdeiscretActionPerformed
        // Enable or disable fields for discrete/continuous conveyor loading 

        if (jcdeiscret.isSelected())
        {
            isDiscreet = true;
            jlunitsperhour.setEnabled(true);
            Unithourinput.setEnabled(true);
            jlLengh.setEnabled(true);
            jlSpacing.setEnabled(true);
            Lengthinput.setEnabled(true);
            Spacinginput.setEnabled(true);
            jlLengthMetres.setEnabled(true);
            jlSpacingMetress.setEnabled(true);
            Weightofunitinput.setEnabled(true);
            weightofunitlabel.setEnabled(true);
            jweightofunit.setEnabled(true);

            Rpminput.setEditable(false);
            Conveyorspeedinput.setEditable(false);
            Productonconveyorinput.setEditable(false);
            Rpminput.setBackground(Color.gray);
            Conveyorspeedinput.setBackground(Color.gray);
            Productonconveyorinput.setBackground(Color.gray);
            Rpminput.setText("");
            Conveyorspeedinput.setText("");
            Productonconveyorinput.setText("");
        } else
        {
            isDiscreet = false;
            jlunitsperhour.setEnabled(false);
            Unithourinput.setEnabled(false);
            jlLengh.setEnabled(false);
            jlSpacing.setEnabled(false);
            Lengthinput.setEnabled(false);
            Spacinginput.setEnabled(false);
            jlLengthMetres.setEnabled(false);
            jlSpacingMetress.setEnabled(false);
            Weightofunitinput.setEnabled(false);
            weightofunitlabel.setEnabled(false);
            jweightofunit.setEnabled(false);

            Rpminput.setEditable(true);
            Conveyorspeedinput.setEditable(true);
            Productonconveyorinput.setEditable(true);
            Rpminput.setBackground(Color.white);
            Conveyorspeedinput.setBackground(Color.white);
            Productonconveyorinput.setBackground(Color.white);
            //Sets discreet interface to be visible and useable or visible but not useable 
        }
    }//GEN-LAST:event_jcdeiscretActionPerformed

    private void jcdeiscretItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcdeiscretItemStateChanged


    }//GEN-LAST:event_jcdeiscretItemStateChanged

    private void AngleinputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AngleinputKeyTyped
        // error handling for incorrect angle entry

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD)))
        {
            getToolkit().beep();
            evt.consume();
        } //
    }//GEN-LAST:event_AngleinputKeyTyped

    private void RpminputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RpminputActionPerformed

    }//GEN-LAST:event_RpminputActionPerformed

    private void CalculateSpeedOfBelt()
    {
        if (Unithourinput.getText().isEmpty() || Lengthinput.getText().isEmpty() || Spacinginput.getText().isEmpty())
        {
            errorMessages.add("Attempted to calculate Speed of Belt but one or more of the required fields: Units Per Hour, Product Length, or Spacing Per Unit were empty");
        } else
        {
            // get required input
            Unithourinput26 = Double.parseDouble(Unithourinput.getText());
            Lengthinput27 = Double.parseDouble(Lengthinput.getText());
            Spacinginput28 = Double.parseDouble(Spacinginput.getText());

            // speed of belt is units per hour * (length plus spacing) / 60
            Speedofbeltanswer29 = Unithourinput26 * (Lengthinput27 + Spacinginput28) / 60;

            // Format answers
            String fstring = String.format("%.2f", Speedofbeltanswer29);
            Speedofbeltanswer29f = (fstring);
            Conveyorspeedinput.setText(fstring);
            Conveyorspeedinput.setForeground(Color.BLACK);
        }
    }

    private void CalculateContinuousLoadPerHour()
    {
        if (Unithourinput.getText().isEmpty())
        {
            errorMessages.add("Attempted to calculate Continuous Load per hour but required field: Units Per Hour was empty.");
            //Error checking for inputs
        } else
        {
            Unithourinput26 = Double.parseDouble(Unithourinput.getText());
            Weightofunitinput31 = Double.parseDouble(Weightofunitinput.getText());
            //gabbing inputs values and putting them into variables.

            Loadperhourcontiniousoutput30 = Unithourinput26 * Weightofunitinput31;
            //grabs inputed text puts it in a variable and does the math then outputs it to another variable

            String fstring = String.format("%.2f", Loadperhourcontiniousoutput30);
            //makes it print to 2 decimal place and converting from a double to a string
            Loadperhourcontiniousoutput30f = (fstring);
            Loadperhourcontiniousoutput.setText(fstring);
            //pushing the values to show on the textbox.
            Loadperhourcontiniousoutput.setForeground(Color.BLACK);
        }
    }

    private void CalculateApplicationFactor()
    {
        // Calculate Application Factor 
        if (Angleinput.getText().isEmpty())
        {
            errorMessages.add("Attempted to calculate Applcation Factor but required field: Angle was empty.");
        } else
        {
            // Get slope angle and convert to radians

            Angleinput23 = Double.parseDouble(Angleinput.getText());
            Radianangle24 = Math.toRadians(Angleinput23);

            // calculate the application factor Friction factor * cos(slope) + sin(slope)
            Radiananswer25 = Materialtypeinput22 * Math.cos(Radianangle24) + Math.sin(Radianangle24);

            // format output
            String fstring = String.format("%.2f", Radiananswer25);
            Radiananswer25f = (fstring);
            Applicationfactoranswer.setText(fstring);
            Applicationfactoranswer.setForeground(Color.BLACK);
        }
    }

    private void LengthinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LengthinputActionPerformed

    }//GEN-LAST:event_LengthinputActionPerformed

    private void UnithourinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnithourinputActionPerformed

    }//GEN-LAST:event_UnithourinputActionPerformed

    private void CalculateProductOnConveyor()
    {
        // calculate weight on conveyor for discrete loads
        if (Weightofunitinput.getText().isEmpty()
                || Lengthinput.getText().isEmpty() || Spacinginput.getText().isEmpty()
                || Lengthofconveyorinput.getText().isEmpty())
        {
            //Error checking for inputs
            errorMessages.add("Attempted to calculate Product on Conveyor but one or more required fields: Weight of Unit, Length of Unit, Spacing, or Length of Conveyor were empty.");
        } else
        {
            // get required values

            Weightofunitinput31 = Double.parseDouble(Weightofunitinput.getText());
            Lengthinput27 = Double.parseDouble(Lengthinput.getText());
            Spacinginput28 = Double.parseDouble(Spacinginput.getText());
            Lengthofconveyor6 = Double.parseDouble(Lengthofconveyorinput.getText());
            //gabbing inputs values and putting them into variables.

            // total weight =  number of units * unit weight
            Productonconveyor32 = (Lengthofconveyor6 / (Lengthinput27 + Spacinginput28)) * Weightofunitinput31;

            // formats output
            String fstring = String.format("%d", Math.round(Productonconveyor32));
            Productonconveyorinput.setText(fstring);
        }
    }
    private void jBQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQuitActionPerformed
        try
        {
            //We need to delete the temporary output file that may have been created
            Path path = Paths.get("C:\\Windows\\Temp\\ConveyorFile.pdf");
            Files.delete(path);
        } //Because we're dealing with file IO we need error handling
        catch (IOException e)
        {
        }

        System.exit(0);
    }//GEN-LAST:event_jBQuitActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            save.setVisible(true);
        } catch (Exception ie)
        {
            System.out.println(ie);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBWormBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBWormBoxActionPerformed
    {//GEN-HEADEREND:event_jBWormBoxActionPerformed
        try
        {
            GearBoxDatabaseConnection database = new GearBoxDatabaseConnection();
            ArrayList<String> options = database.GetWormBoxOptions(Designkwanswer18, Double.parseDouble(rpmResultsOutput.getText()), Nmanswer15);
            String results = "";
            int matchNumber = 0;

            if (!options.isEmpty())
            {

                for (String option : options)
                {
                    matchNumber += 1;
                    
                    // we only want to display the first two options
                    // so once the match number is 2, we've got two options 
                    if (matchNumber > 2)
                    {
                        break;
                    }

                    results += String.format("%d. %s\n\n", matchNumber, option);
                }

                GearboxOptionsOutput.setText(results.trim());//trim to get rid of the trailing newlines
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No matches were found for the calculated results.", "No Matches", JOptionPane.INFORMATION_MESSAGE);
            }        
        } 
        catch (NumberFormatException | HeadlessException e)
        {
            InfoBox(e.getMessage());
        }
    }//GEN-LAST:event_jBWormBoxActionPerformed

    private void jBResetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBResetActionPerformed
    {//GEN-HEADEREND:event_jBResetActionPerformed
        Unithourinput.setText("");
        Lengthinput.setText("");
        Spacinginput.setText("");
        Loadperhourcontiniousoutput.setText("");
        Weightofunitinput.setText("");
        Drumdiameterinput.setText("");
        Rpminput.setText("");
        Unithourinput.setText("");
        Conveyorspeedinput.setText("");
        Lengthofconveyorinput.setText("");
        Productonconveyorinput.setText("");
        Angleinput.setText("0");
        Applicationfactoranswer.setText("");   
        Servicefactorinput.setText("");
        Beltweightinput.setText("");
        Widthofconveyorinput.setText("");
        rpmResultsOutput.setText("");
        Beltloadoutput.setText("");
        Nmoutput.setText("");
        Kwoutput.setText("");
        GearboxOptionsOutput.setText("");
    }//GEN-LAST:event_jBResetActionPerformed

    private void jBBrooksCycloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBBrooksCycloActionPerformed
    {//GEN-HEADEREND:event_jBBrooksCycloActionPerformed
        try
        {
            GearBoxDatabaseConnection database = new GearBoxDatabaseConnection();
            ArrayList<String> options = database.GetBrooksCycloOptions(Designkwanswer18, Double.parseDouble(rpmResultsOutput.getText()), Nmanswer15);
            String results = "";
            int matchNumber = 0;
            
            if (!options.isEmpty())
            {
                for (String option : options)
                {
                    matchNumber += 1;
                    
                    // we only want to display the first two options
                    // so once the match number is 2, we've got two options 
                    if (matchNumber > 2)
                    {
                        break;
                    }

                    results += String.format("%d. %s\n\n", matchNumber, option);
                }
                
                GearboxOptionsOutput.setText(results.trim());//trim to get rid of the trailing newlines
            } 
            else
            {
                JOptionPane.showMessageDialog(null, "No matches were found for the calculated results.", "No Matches", JOptionPane.INFORMATION_MESSAGE);
            }        
        } 
        catch (NumberFormatException | HeadlessException e)
        {
            InfoBox(e.getMessage());
        }
    }//GEN-LAST:event_jBBrooksCycloActionPerformed

    private void jBBevelHelicalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBBevelHelicalActionPerformed
    {//GEN-HEADEREND:event_jBBevelHelicalActionPerformed
        JOptionPane.showMessageDialog(null, "Coming Soon!", "Under Construction", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBBevelHelicalActionPerformed

    @Override
    public void print(Graphics g
    )
    {
        super.print(g); //To change body of generated methods, choose Tools | Templates.
    }

    private void CaculateRpmOrConveyorSpeedDependingOnInput()
    {
        if (Conveyorspeedinput.getText().isEmpty() && Rpminput != null)
        {
            CalculateConveyorSpeed();
        } else if (Rpminput.getText().isEmpty() && Conveyorspeedinput != null)
        {
            CalculateRPM();
        } else
        {
            //In the case the user enters both the rpm and conveyor speed, neither of the above methods will be executed
            //so we need to set the rpm results output to whatever they entered at this point.
            rpmResultsOutput.setText(Rpminput.getText());
            Rpmconveyor34 = Double.parseDouble(Rpminput.getText());
        }
    }

    private void CalculateConveyorSpeed()
    {
        // Calculates belt speed  from drum diameter and rpm

        if (Rpminput.getText().isEmpty() || Drumdiameterinput.getText().isEmpty())
        {
            errorMessages.add("Attempted to calculate Conveyor Speed based on RPM but one or more required fields: RPM or Drum Diameter were empty.");
        } else
        {
            Rpmoutput20 = Double.parseDouble(Rpminput.getText());
            Drumdiameterinput1 = Double.parseDouble(Drumdiameterinput.getText());
            Conveyorrpm33 = Rpmoutput20 * (Drumdiameterinput1 * 3.142);

            // Formats output
            String fstring = String.format("%.2f", Conveyorrpm33);
            Conveyorspeedinput.setText(fstring);
            // when not a discreet load we need to set the speed of belt variable here in order for it to not be null when creating the pdf
            Speedofbeltanswer29f = fstring;
            jLRpm.setText("Rpm");
            jLRpm.setForeground(Color.black);

            //because the rpm has been entered manually in order to execute this method, we need to assign the rpm input text to the result field
            rpmResultsOutput.setText(Rpminput.getText());

        }
    }

    private void CalculateRPM()
    {
        // Calculates Rpm from belt speed and drum diameter
        if (Conveyorspeedinput.getText().isEmpty() || Drumdiameterinput.getText().isEmpty())
        {
            errorMessages.add("Attempted to calculate RPM based on Conveyor Speed but one or more required fields: Conveyor Speed or Drum Diameter were empty.");
        } else
        {
            //Getting required inputs

            Conveyorspeedinput19 = Double.parseDouble(Conveyorspeedinput.getText());
            Drumdiameterinput1 = Double.parseDouble(Drumdiameterinput.getText());

            // when not a discreet load we need to set the speed of belt variable here in order for it to not be null when creating the pdf
            Speedofbeltanswer29f = Conveyorspeedinput.getText();
            // rpm = conveypr s[eed / drum circumference.
            Rpmconveyor34 = Conveyorspeedinput19 / (Drumdiameterinput1 * 3.1415927);

            String formattedRPM = Math.round(Rpmconveyor34) < 10 ? String.format("%.1f", Rpmconveyor34) : String.format("%d", Math.round(Rpmconveyor34));

            Rpminput.setText(formattedRPM);
            Rpmconveyor35 = formattedRPM;
            rpmResultsOutput.setText(Rpminput.getText());
            jLRpm.setText("Rpm");
            jLRpm.setForeground(Color.black);

        }
    }
    //<editor-fold defaultstate="collapsed" desc="getters">

    public double getAngleInput()
    {
        return this.Angleinput23;
    }

    public String getCircumferenceanswer2f()
    {
        return this.Circumferenceanswer2f;
    }

    public String getRpmoutput20f()
    {
        return this.Rpmoutput20f;
    }

    public String getMetresperminuteanswer4f()
    {
        return this.Metresperminuteanswer4f;
    }

    public String getMetresperhouranswer5f()
    {
        return this.Metresperhouranswer5f;
    }

    public String getLengthperhouranswer7f()
    {
        return this.Lengthperhouranswer7f;
    }

    public String getKgsperhouranswer9f()
    {
        return this.Kgsperhouranswer9f;
    }

    public String getKgatanygiventimeanswer10f()
    {
        return this.Kgatanygiventimeanswer10f;
    }

    public String getBeltloadanswer13f()
    {
        return this.Beltloadanswer13f;
    }

    public String getNmanswer15f()
    {
        return this.Nmanswer15f;
    }

    public String getServicefactor17f()
    {
        return this.Servicefactor17f;
    }

    public String getDesignkwanswer18f()
    {
        return this.Designkwanswer18f;
    }

    public String getBeltspeedoutput21f()
    {
        return this.Beltspeedoutput21f;
    }

    public String getRadiananswer25f()
    {
        return this.Radiananswer25f;
    }

    public String getSpeedofbeltanswer29f()
    {
        return this.Speedofbeltanswer29f;
    }

    public String getLoadperhourcontiniousoutput30f()
    {
        return this.Loadperhourcontiniousoutput30f;
    }

    public String getRpmconveyor35()
    {
        return this.Rpmconveyor35;
    }

    public double getSpeedofbeltanswer29()
    {
        return this.Speedofbeltanswer29;
    }

    public double getConveyorrpm33()
    {
        return this.Conveyorrpm33;
    }

    public double getRpmconveyor34()
    {
        return this.Rpmconveyor34;
    }
//</editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Maininterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Maininterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Maininterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Maininterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Maininterface().setVisible(true);
            }
        });
        
        // create the tables we need when the app is launched
        GearBoxDatabaseConnection databaseConnection = new GearBoxDatabaseConnection();
        databaseConnection.CreateTables();
    }

    // <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Angleinput;
    private javax.swing.JLabel Applicationfactoranswer;
    private javax.swing.JLabel Beltloadoutput;
    private javax.swing.JTextField Beltweightinput;
    private javax.swing.JTextField Conveyorspeedinput;
    private javax.swing.JTextField Drumdiameterinput;
    private javax.swing.JTextArea GearboxOptionsOutput;
    private javax.swing.JLabel Kgsatanygiventimeoutput;
    private javax.swing.JLabel Kwoutput;
    private javax.swing.JTextField Lengthinput;
    private javax.swing.JTextField Lengthofconveyorinput;
    private javax.swing.JLabel Loadperhourcontiniousoutput;
    private javax.swing.JLabel Nmoutput;
    private javax.swing.JTextField Productonconveyorinput;
    private javax.swing.JTextField Rpminput;
    private javax.swing.JTextField Servicefactorinput;
    private javax.swing.JTextField Spacinginput;
    private javax.swing.JTextField Unithourinput;
    private javax.swing.JTextField Weightofunitinput;
    private javax.swing.JTextField Widthofconveyorinput;
    private javax.swing.JLabel dbProcessing;
    private javax.swing.JButton jBBevelHelical;
    private javax.swing.JButton jBBrooksCyclo;
    private javax.swing.JButton jBQuit;
    private javax.swing.JButton jBReset;
    private javax.swing.JButton jBWormBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLConveyorSpeed;
    private javax.swing.JLabel jLRpm;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcbMeterial;
    private javax.swing.JCheckBox jcdeiscret;
    private javax.swing.JLabel jlLengh;
    private javax.swing.JLabel jlLengthMetres;
    private javax.swing.JLabel jlSpacing;
    private javax.swing.JLabel jlSpacingMetress;
    private javax.swing.JLabel jlunitsperhour;
    private javax.swing.JLabel jweightofunit;
    private javax.swing.JLabel loadContinuousLbl;
    private javax.swing.JButton other;
    private javax.swing.JLabel powerLbl;
    private javax.swing.JLabel rpmResultsOutput;
    private javax.swing.JLabel weightofunitlabel;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
