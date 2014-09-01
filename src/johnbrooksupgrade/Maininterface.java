package johnbrooksupgrade;

import java.lang.Math; //brings in math class for degree to radian conversion
import java.lang.Character; //brings in Double works when commented out
import java.io.File; //allows file representation //prints to file
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
//importing classes for functionality

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
    protected String Filename;
    private boolean isDiscreet;
    // </editor-fold>

    //Referencing Salesinfo class
    private final SalesInfo save;

    public Maininterface()
    {

        initComponents();

        save = new SalesInfo(this);
        //Referencing salesinfo

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
        btnApplicationfactor = new javax.swing.JButton();
        Angleinput = new javax.swing.JTextField();
        Unithourinput = new javax.swing.JTextField();
        Lengthinput = new javax.swing.JTextField();
        Spacinginput = new javax.swing.JTextField();
        jcdeiscret = new javax.swing.JCheckBox();
        jlunitsperhour = new javax.swing.JLabel();
        jlLengh = new javax.swing.JLabel();
        jlSpacing = new javax.swing.JLabel();
        speedofbeltbtn = new javax.swing.JButton();
        Loadperhourcontiniousbtn = new javax.swing.JButton();
        Loadperhourcontiniousoutput = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jlLengthMetres = new javax.swing.JLabel();
        jlSpacingMetress = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jweightofunit = new javax.swing.JLabel();
        Weightofunitinput = new javax.swing.JTextField();
        weightofunitlabel = new javax.swing.JLabel();
        Productonconveyorbutton = new javax.swing.JButton();
        Rpmconveyor = new javax.swing.JButton();
        pocError = new javax.swing.JLabel();
        speedOfBeltError = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jBQuit = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Kwoutput = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("John Brooks Ltd Conveyor Calculator");

        Drumdiameterinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        Rpminput.setEditable(false);
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

        Lengthofconveyorinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        Productonconveyorinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        jLabel1.setText("Product on Conveyor");

        jLabel2.setText("Length of Conveyor");

        jLabel3.setText("Rpm");

        jLabel4.setText("Drum Diameter");

        jLabel5.setText("Metres");

        jLRpm.setText("Rpm");

        jLabel7.setText("Metres");

        jLabel8.setText("Kg's");

        jLabel9.setText("Belt Weight");

        jLabel10.setText("Service Factor");

        jLabel11.setText("Width of Conveyor");

        Widthofconveyorinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        Beltweightinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        Servicefactorinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        jLabel12.setText("Metres");

        other.setText("Calculate");
        other.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                otherActionPerformed(evt);
            }
        });

        jLabel13.setText("Conveyor Speed");

        Conveyorspeedinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        jLConveyorSpeed.setText("M/pm");

        jcbMeterial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Pivoting Bucket Conveyor", "Belt on Rollers", "Metal on Metal (finished)", "Fabric on Steel", "Fabric on Wood", "Leather on Wood", "Wood on Wood", "Plastic on Steel", "Metal on Wood", "Rubber on Wood", "Rubber on Steel", "Leather on Metal", "" }));
        jcbMeterial.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jcbMeterialActionPerformed(evt);
            }
        });

        jLabel15.setText("Belt Material");

        btnApplicationfactor.setText("Coeff.Friction");
        btnApplicationfactor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnApplicationfactorActionPerformed(evt);
            }
        });

        Angleinput.setText("0");
        Angleinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

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

        Spacinginput.setEnabled(false);
        Spacinginput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

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

        jlunitsperhour.setText("Units/Hour");
        jlunitsperhour.setEnabled(false);

        jlLengh.setText("Product Length");
        jlLengh.setEnabled(false);

        jlSpacing.setText("Spacing per Unit");
        jlSpacing.setEnabled(false);

        speedofbeltbtn.setText("Speed of Belt");
        speedofbeltbtn.setEnabled(false);
        speedofbeltbtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                speedofbeltbtnActionPerformed(evt);
            }
        });

        Loadperhourcontiniousbtn.setText("Load per Hour Continuous");
        Loadperhourcontiniousbtn.setEnabled(false);
        Loadperhourcontiniousbtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                LoadperhourcontiniousbtnActionPerformed(evt);
            }
        });

        jLabel19.setText("Decimal");

        jlLengthMetres.setText("Metres");
        jlLengthMetres.setEnabled(false);

        jlSpacingMetress.setText("Metres");
        jlSpacingMetress.setEnabled(false);

        jLabel16.setText("Angle in Degrees");

        jweightofunit.setText("Weight of unit");
        jweightofunit.setEnabled(false);

        Weightofunitinput.setEnabled(false);
        Weightofunitinput.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                AngleinputKeyTyped(evt);
            }
        });

        weightofunitlabel.setText("Kg");
        weightofunitlabel.setEnabled(false);

        Productonconveyorbutton.setText("Product on conveyor");
        Productonconveyorbutton.setEnabled(false);
        Productonconveyorbutton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ProductonconveyorbuttonActionPerformed(evt);
            }
        });

        Rpmconveyor.setText("Conveyor/Rpm speed");
        Rpmconveyor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RpmconveyorActionPerformed(evt);
            }
        });

        jLabel6.setText("Torque");

        jLabel14.setText("Total design Load");

        jLabel20.setText("Kg'f");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jBQuit.setText("Quit");
        jBQuit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBQuitActionPerformed(evt);
            }
        });

        jLabel17.setText("Kg/m2");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Loading");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Conveyor speed and load");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Torque and power");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/johnbrooksupgrade/John Brooks logo - New Globe - Industral automationresized.jpg"))); // NOI18N
        jLabel18.setText("jLabel18");

        jLabel24.setText("Power");

        jLabel25.setText("Kw");

        jLabel26.setText("Nm");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcdeiscret)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Kgsatanygiventimeoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Beltweightinput, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(Servicefactorinput, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbMeterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                                        .addGap(15, 15, 15)
                                        .addComponent(other, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Widthofconveyorinput, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Angleinput, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Kwoutput)
                                    .addComponent(Nmoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Beltloadoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnApplicationfactor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Applicationfactoranswer, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(140, 140, 140))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlLengh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlSpacing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlunitsperhour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jweightofunit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Weightofunitinput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Spacinginput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lengthinput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Unithourinput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jlLengthMetres, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jlSpacingMetress, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(Loadperhourcontiniousbtn)
                                .addGap(18, 18, 18)
                                .addComponent(Loadperhourcontiniousoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(weightofunitlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(Productonconveyorbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pocError, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(speedofbeltbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(speedOfBeltError, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Productonconveyorinput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lengthofconveyorinput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Conveyorspeedinput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rpminput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Drumdiameterinput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLConveyorSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLRpm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(4, 4, 4)))
                                .addComponent(Rpmconveyor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(jBQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Beltweightinput, Servicefactorinput, Widthofconveyorinput});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcdeiscret)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Unithourinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(speedofbeltbtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jlunitsperhour))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(speedOfBeltError)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Lengthinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlLengthMetres, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlLengh)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(Spacinginput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jlSpacingMetress))
                                    .addComponent(Loadperhourcontiniousbtn)
                                    .addComponent(Loadperhourcontiniousoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jlSpacing)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(Weightofunitinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(weightofunitlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Productonconveyorbutton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jweightofunit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(pocError)))
                .addGap(25, 25, 25)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Drumdiameterinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))))
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
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Lengthofconveyorinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(Rpmconveyor)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Productonconveyorinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Kgsatanygiventimeoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jcbMeterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Angleinput)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Applicationfactoranswer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnApplicationfactor))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Servicefactorinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Beltweightinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Widthofconveyorinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jBQuit))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Beltloadoutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(other)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Nmoutput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(Kwoutput))
                                .addGap(202, 202, 202))))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Loadperhourcontiniousoutput, pocError, speedOfBeltError});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Beltweightinput, Servicefactorinput, Widthofconveyorinput});

        Kgsatanygiventimeoutput.getAccessibleContext().setAccessibleName("SalesInfo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnkgsAtAnyGivenTimeActionPerformed()
    {

        if (Drumdiameterinput.getText().isEmpty() || Rpminput.getText().isEmpty()
                || Lengthofconveyorinput.getText().isEmpty() || Productonconveyorinput.getText().isEmpty())
        {

            Kgsatanygiventimeoutput.setText("Error please fill out all required fields");
            Kgsatanygiventimeoutput.setForeground(Color.red);
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
        if(isDiscreet)
        {
            CalculateSpeedOfBelt();
        }
        Beltload();
        NM();
        Designkw();
        BtnkgsAtAnyGivenTimeActionPerformed();
    }//GEN-LAST:event_otherActionPerformed

    private void Beltload()
    {
        if (Drumdiameterinput.getText().isEmpty() || Widthofconveyorinput.getText().isEmpty()
                || Beltweightinput.getText().isEmpty() || Lengthofconveyorinput.getText().isEmpty())
        {
            Beltloadoutput.setText("Error please fill out all required fields");
            Beltloadoutput.setForeground(Color.red);
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

    private void NM()
    {
        if (Drumdiameterinput.getText().isEmpty() || Beltweightinput.getText().isEmpty())
        {
            Nmoutput.setText("Error please fill out all required fields");
            Nmoutput.setForeground(Color.red);
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
        String fstring = String.format("%.2f", Designkwanswer18);
        Designkwanswer18f = (fstring);
        Kwoutput.setText(fstring);
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
            speedofbeltbtn.setEnabled(true);
            jlLengh.setEnabled(true);
            jlSpacing.setEnabled(true);
            Lengthinput.setEnabled(true);
            Spacinginput.setEnabled(true);
            jlLengthMetres.setEnabled(true);
            jlSpacingMetress.setEnabled(true);
            Loadperhourcontiniousbtn.setEnabled(true);
            Weightofunitinput.setEnabled(true);
            weightofunitlabel.setEnabled(true);
            jweightofunit.setEnabled(true);
            Productonconveyorbutton.setEnabled(true);
        } 
        else
        {
            isDiscreet = false;
            jlunitsperhour.setEnabled(false);
            Unithourinput.setEnabled(false);
            speedofbeltbtn.setEnabled(false);
            jlLengh.setEnabled(false);
            jlSpacing.setEnabled(false);
            Lengthinput.setEnabled(false);
            Spacinginput.setEnabled(false);
            jlLengthMetres.setEnabled(false);
            jlSpacingMetress.setEnabled(false);
            Loadperhourcontiniousbtn.setEnabled(false);
            Weightofunitinput.setEnabled(false);
            weightofunitlabel.setEnabled(false);
            jweightofunit.setEnabled(false);
            Productonconveyorbutton.setEnabled(false);
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

    private void speedofbeltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedofbeltbtnActionPerformed
    // Calculate speed of belt for discrete loading

        
    }//GEN-LAST:event_speedofbeltbtnActionPerformed

    private void CalculateSpeedOfBelt()
    {
        if (Unithourinput.getText().isEmpty() || Lengthinput.getText().isEmpty() || Spacinginput.getText().isEmpty())
        {
            speedOfBeltError.setText("Error please enter units per hour lengh and spacing");
            speedOfBeltError.setForeground(Color.red);
        } 
        else
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
    
    private void LoadperhourcontiniousbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadperhourcontiniousbtnActionPerformed
        if (Unithourinput.getText().isEmpty())
        {
            Loadperhourcontiniousoutput.setText("Error please enter units per hour");
            Loadperhourcontiniousoutput.setForeground(Color.red);
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

    }//GEN-LAST:event_LoadperhourcontiniousbtnActionPerformed

    private void btnApplicationfactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplicationfactorActionPerformed
        // Calculate Application Factor 

        if (Angleinput.getText().isEmpty())
        {
            Applicationfactoranswer.setText("Error please enter an angle");
            Applicationfactoranswer.setForeground(Color.red);
            //Error checking for inputs

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
    }//GEN-LAST:event_btnApplicationfactorActionPerformed

    private void LengthinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LengthinputActionPerformed

    }//GEN-LAST:event_LengthinputActionPerformed

    private void UnithourinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnithourinputActionPerformed

    }//GEN-LAST:event_UnithourinputActionPerformed

    private void ProductonconveyorbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductonconveyorbuttonActionPerformed
        // calculate weight on conveyor for discrete loads

        if (Weightofunitinput.getText().isEmpty()
                || Lengthinput.getText().isEmpty() || Spacinginput.getText().isEmpty()
                || Lengthofconveyorinput.getText().isEmpty())
        {
            pocError.setText("Please enter all necessary fields");
            pocError.setForeground(Color.red);
            //Error checking for inputs

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

            // ensure error text turned off
            pocError.setText("");

            // formats output
            String fstring = String.format("%.2f", Productonconveyor32);
            Productonconveyorinput.setText(fstring);

        }
    }//GEN-LAST:event_ProductonconveyorbuttonActionPerformed

    private void RpmconveyorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RpmconveyorActionPerformed
        // selects appropriate speed or rpm calculation

        if (Conveyorspeedinput.getText().isEmpty() && Rpminput != null)
        {
            Rpm();
        } else if (Rpminput.getText().isEmpty() && Conveyorspeedinput != null)
        {
            conveyorspeed();
        }

    }//GEN-LAST:event_RpmconveyorActionPerformed

    private void jBQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQuitActionPerformed
        //Quit button

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

    private void Rpm()
    {
        // Calculates belt speed  from drum diameter and rpm

        if (Rpminput.getText().isEmpty() || Drumdiameterinput.getText().isEmpty())
        {
            jLRpm.setText("Error");
            jLRpm.setForeground(Color.red);
        } else
        {

            Rpmoutput20 = Double.parseDouble(Rpminput.getText());
            Drumdiameterinput1 = Double.parseDouble(Drumdiameterinput.getText());
            Conveyorrpm33 = Rpmoutput20 * (Drumdiameterinput1 * 3.142);

            // Formats output
            String fstring = String.format("%.2f", Conveyorrpm33);
            Conveyorspeedinput.setText(fstring);
            jLRpm.setText("Rpm");
            jLRpm.setForeground(Color.black);

        }
    }

    private void conveyorspeed()
    {
        // Calculates Rpm from belt speed and drum diameter
        if (Conveyorspeedinput.getText().isEmpty() || Drumdiameterinput.getText().isEmpty())
        {
            jLConveyorSpeed.setText("Please enter ConveyorSpeed and Drumdiameter");
            jLConveyorSpeed.setForeground(Color.red);
        } else
        {
            //Getting required inputs

            Conveyorspeedinput19 = Double.parseDouble(Conveyorspeedinput.getText());
            Drumdiameterinput1 = Double.parseDouble(Drumdiameterinput.getText());

            // rpm = conveypr s[eed / drum circumference.
            Rpmconveyor34 = Conveyorspeedinput19 / (Drumdiameterinput1 * 3.1415927);

            // Fromat outputs
            String fstring = String.format("%.2f", Rpmconveyor34);
            Rpminput.setText(fstring);
            Rpmconveyor35 = fstring;
            jLRpm.setText("Rpm");
            jLRpm.setForeground(Color.black);

        }
    }

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
    //get statement's for security and to return variables to other classes within the project

    public void setCircumferenceanswer2(double Circumferenceanswer2)
    {
        this.Circumferenceanswer2 = Circumferenceanswer2;
    }

    public void setRpmoutput20(double Rpmoutput20)
    {
        this.Rpmoutput20 = Rpmoutput20;
    }

    public void setMetresperminuteanswer4(double Metresperminuteanswer4)
    {
        this.Metresperminuteanswer4 = Metresperminuteanswer4;
    }

    public void setMetresperhouranswer5(double Metresperhouranswer5)
    {
        this.Metresperhouranswer5 = Metresperhouranswer5;
    }

    public void setLengthperhouranswer7(double Lengthperhouranswer7)
    {
        this.Lengthperhouranswer7 = Lengthperhouranswer7;
    }

    public void setKgsperhouranswer9(double Kgsperhouranswer9)
    {
        this.Kgsperhouranswer9 = Kgsperhouranswer9;
    }

    public void setKgatanygiventimeanswer10(double Kgatanygiventimeanswer10)
    {
        this.Kgatanygiventimeanswer10 = Kgatanygiventimeanswer10;
    }

    public void setBeltloadanswer13(double Beltloadanswer13)
    {
        this.Beltloadanswer13 = Beltloadanswer13;
    }

    public void setNmanswer15(double Nmanswer15)
    {
        this.Nmanswer15 = Nmanswer15;
    }

    public void setDesignkwanswer18(double Designkwanswer18)
    {
        this.Designkwanswer18 = Designkwanswer18;
    }

    public void setBeltspeedoutput21(double Beltspeedoutput21)
    {
        this.Beltspeedoutput21 = Beltspeedoutput21;
    }

    public void setRadiananswer25(double Radiananswer25)
    {
        this.Radiananswer25 = Radiananswer25;
    }

    public void setSpeedofbeltanswer29(double Speedofbeltanswer29)
    {
        this.Speedofbeltanswer29 = Speedofbeltanswer29;
    }

    public void setLoadperhourcontiniousoutput30(double Loadperhourcontiniousoutput30)
    {
        this.Loadperhourcontiniousoutput30 = Loadperhourcontiniousoutput30;
    }

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
    }

    // <editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Angleinput;
    private javax.swing.JLabel Applicationfactoranswer;
    private javax.swing.JLabel Beltloadoutput;
    private javax.swing.JTextField Beltweightinput;
    private javax.swing.JTextField Conveyorspeedinput;
    private javax.swing.JTextField Drumdiameterinput;
    private javax.swing.JLabel Kgsatanygiventimeoutput;
    private javax.swing.JLabel Kwoutput;
    private javax.swing.JTextField Lengthinput;
    private javax.swing.JTextField Lengthofconveyorinput;
    private javax.swing.JButton Loadperhourcontiniousbtn;
    private javax.swing.JLabel Loadperhourcontiniousoutput;
    private javax.swing.JLabel Nmoutput;
    private javax.swing.JButton Productonconveyorbutton;
    private javax.swing.JTextField Productonconveyorinput;
    private javax.swing.JButton Rpmconveyor;
    private javax.swing.JTextField Rpminput;
    private javax.swing.JTextField Servicefactorinput;
    private javax.swing.JTextField Spacinginput;
    private javax.swing.JTextField Unithourinput;
    private javax.swing.JTextField Weightofunitinput;
    private javax.swing.JTextField Widthofconveyorinput;
    private javax.swing.JButton btnApplicationfactor;
    private javax.swing.JButton jBQuit;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JComboBox jcbMeterial;
    private javax.swing.JCheckBox jcdeiscret;
    private javax.swing.JLabel jlLengh;
    private javax.swing.JLabel jlLengthMetres;
    private javax.swing.JLabel jlSpacing;
    private javax.swing.JLabel jlSpacingMetress;
    private javax.swing.JLabel jlunitsperhour;
    private javax.swing.JLabel jweightofunit;
    private javax.swing.JButton other;
    private javax.swing.JLabel pocError;
    private javax.swing.JLabel speedOfBeltError;
    private javax.swing.JButton speedofbeltbtn;
    private javax.swing.JLabel weightofunitlabel;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
