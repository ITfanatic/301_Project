package johnbrooksupgrade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GearboxService
{    
    public String url, driver;

    public GearboxService()
    {
        // Initialise connection vars 
        url = "jdbc:derby:JohnBrooks;create=true;";
        driver = "org.apache.derby.jdbc.EmbeddedDriver";
    }

    public ArrayList GetWormBoxOptions(double kwInput, double rpm, double torque)
    {
        ArrayList<String> options = new ArrayList();

        double dbKilloWatt = DetermineDBKilloWattForWormBox(kwInput);

        try
        {
            
            Class.forName(driver).newInstance();
            try (Connection sqlCon = DriverManager.getConnection(url))
            {
                java.sql.Statement st = sqlCon.createStatement();
                String selectOptions = String.format("SELECT Size, Inches FROM Wormbox WHERE KWInput=%.2f and RPM >= %.1f and Torque >= %.2f ORDER BY Size", dbKilloWatt, rpm, torque);
                                
                ResultSet res = st.executeQuery(selectOptions);
                
                while (res.next())
                {
                    int motorSize = res.getInt("Size");
                    double gearboxRatio = res.getDouble("Inches");
                    
                    // only for this number should we display to 1dp otherwise don't display the dp
                    if (gearboxRatio == 7.50)
                    {
                        options.add(String.format("%.2fKw 4P Motor \nFCNDK %d %.1f:1", dbKilloWatt,motorSize, gearboxRatio));
                    }
                    else
                    {
                        options.add(String.format("%.2fKw 4P Motor \nFCNDK %d %.0f:1", dbKilloWatt,motorSize, gearboxRatio));                        
                    }
                }
            }
            
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }

        return options;
    }

    private double DetermineDBKilloWattForWormBox(double kwInput)
    {
        // ***Hack alert*** 
        // We need to convert the KW value into a value we can match to the database KW values
        // this seemed like quickest way to do it.

        if (kwInput < 0.55)
        {
            kwInput = 0.55;
            return kwInput;
        } else if (kwInput < 0.75)
        {
            kwInput = 0.75;
            return kwInput;
        } else if (kwInput < 1.1)
        {
            kwInput = 1.1;
            return kwInput;
        } else if (kwInput < 1.5)
        {
            kwInput = 1.5;
            return kwInput;
        } else if (kwInput < 2.2)
        {
            kwInput = 2.2;
            return kwInput;
        } else if (kwInput < 3.0)
        {
            kwInput = 3.0;
            return kwInput;
        } else if (kwInput < 4.0)
        {
            kwInput = 4.0;
            return kwInput;
        } else if (kwInput < 5.5)
        {
            kwInput = 5.5;
            return kwInput;
        } else if (kwInput < 7.5)
        {
            kwInput = 7.5;
            return kwInput;
        } else if (kwInput < 11.0)
        {
            kwInput = 11.0;
            return kwInput;
        } else if (kwInput < 15.0)
        {
            kwInput = 15.0;
            return kwInput;
        } else
        {
            return 0.0;
        }
    }

    public ArrayList GetBrooksCycloOptions(double kwInput, double rpm, double torque)
    {
        ArrayList<String> options = new ArrayList();

        try
        {
            Class.forName(driver).newInstance();
            try (Connection sqlCon = DriverManager.getConnection(url))
            {
                java.sql.Statement st = sqlCon.createStatement();
                
                 /* The thinking behind this query is that we get the columns we need based on the gearbox/motor 
                    being able to handle (greater than or equal to) the kwinput, rpm, and torque results determined by the conveyor's specs.
               
                    Because we only display the first two matches we want to order the query results by KW so that the two options 
                    suggested are the smallest but still fit for purpose */                
                String selectOptions = String.format("SELECT Gearbox, Ratio, ServiceFactor, KWInput, ServiceFactorOverload FROM BROOKSCYCLO WHERE KWInput >=%.2f and RPM >= %.1f and Torque >= %.2f ORDER BY KWInput", kwInput, rpm, torque);
                ResultSet res = st.executeQuery(selectOptions);
                
                while (res.next())
                {
                    String gearbox = res.getString("Gearbox");
                    double serviceFactor = res.getDouble("ServiceFactor");                    
                    int gearboxRatio = res.getInt("Ratio");
                    double dbMotorKw = res.getDouble("KWInput");
                    boolean serviceFactorOverload = res.getBoolean("ServiceFactorOverload");

                    if(serviceFactorOverload)
                    {
                        options.add(String.format("Gearbox: %s \n Service Factor: %.2f Ratio: %d \n %.2fKw 4P Motor\nOverload may occur if this motor is\nloaded to its full KW.", gearbox, serviceFactor, gearboxRatio, dbMotorKw));
                    }
                    else
                    {
                        options.add(String.format("Gearbox: %s \n Service Factor: %.2f Ratio: %d \n %.2fKw 4P Motor", gearbox, serviceFactor, gearboxRatio, dbMotorKw));
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }

        return options;
    }
    
    public ArrayList GetBevelHelicalOptions(double kwInput, double rpm, double torque)
    {
        ArrayList<String> options = new ArrayList();

        try
        {
            
            Class.forName(driver).newInstance();
            try (Connection sqlCon = DriverManager.getConnection(url))
            {
                java.sql.Statement st = sqlCon.createStatement();
                String selectOptions = String.format("SELECT Size, Ratio, KWInput FROM BEVELHELICAL WHERE KWInput >= %.2f and RPM >= %.1f and Torque >= %.2f ORDER BY KWInput", kwInput, rpm, torque);
                                
                ResultSet res = st.executeQuery(selectOptions);
                
                while (res.next())
                {
                    String motorSize = res.getString("Size");
                    double gearboxRatio = res.getDouble("Ratio");
                    double KW = res.getDouble("KWInput");
                    
                    options.add(String.format("%.2fKw 4P Motor \n%s %.2f", KW, motorSize, gearboxRatio));
                }
            }
            
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }

        return options;
    }
    
    public ArrayList GetHelicalOptions(double kwInput, double rpm, double torque)
    {
        ArrayList<String> options = new ArrayList();

        try
        {
            
            Class.forName(driver).newInstance();
            try (Connection sqlCon = DriverManager.getConnection(url))
            {
                java.sql.Statement st = sqlCon.createStatement();
                String selectOptions = String.format("SELECT Size, Ratio, KWInput FROM HELICAL WHERE KWInput >= %.2f and RPM >= %.1f and Torque >= %.2f ORDER BY KWInput", kwInput, rpm, torque);
                                
                ResultSet res = st.executeQuery(selectOptions);
                
                while (res.next())
                {
                    String motorSize = res.getString("Size");
                    double gearboxRatio = res.getDouble("Ratio");
                    double KW = res.getDouble("KWInput");
                    
                    options.add(String.format("%.2fKw 4P Motor \n%s %.2f", KW, motorSize, gearboxRatio));
                }
            }
            
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }

        return options;
    }
    
    public ArrayList GetKCWormbox4P(double kwInput, double rpm, double torque)
    {
        ArrayList<String> options = new ArrayList();

        try
        {
            
            Class.forName(driver).newInstance();
            try (Connection sqlCon = DriverManager.getConnection(url))
            {
                java.sql.Statement st = sqlCon.createStatement();
                String selectOptions = String.format("SELECT Size, Ratio, KWInput FROM KCWORMBOX4P WHERE KWInput >= %.2f and RPM >= %.1f and Torque >= %.2f ORDER BY KWInput", kwInput, rpm, torque);
                                
                ResultSet res = st.executeQuery(selectOptions);
                
                while (res.next())
                {
                    int motorSize = res.getInt("Size");
                    double gearboxRatio = res.getDouble("Ratio");
                    double KW = res.getDouble("KWInput");
                    
                    options.add(String.format("%.2fKw 4P Motor \n%d %.1f", KW, motorSize, gearboxRatio));
                }
            }
            
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }

        return options;
    }
    
    public ArrayList GetKCWormbox6P(double kwInput, double rpm, double torque)
    {
        ArrayList<String> options = new ArrayList();

        try
        {
            
            Class.forName(driver).newInstance();
            try (Connection sqlCon = DriverManager.getConnection(url))
            {
                java.sql.Statement st = sqlCon.createStatement();
                String selectOptions = String.format("SELECT Size, Ratio, KWInput FROM KCWORMBOX6P WHERE KWInput >= %.2f and RPM >= %.1f and Torque >= %.2f ORDER BY KWInput", kwInput, rpm, torque);
                                
                ResultSet res = st.executeQuery(selectOptions);
                
                while (res.next())
                {
                    int motorSize = res.getInt("Size");
                    double gearboxRatio = res.getDouble("Ratio");
                    double KW = res.getDouble("KWInput");
                    
                    options.add(String.format("%.2fKw 6P Motor \n%d %.1f", KW, motorSize, gearboxRatio));
                }
            }
            
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }

        return options;
    }    
    
    public void CreateTables()
    {
        CreateWormboxTable();
        CreateBrooksCycloTable();
        CreateBevelHelicalTable();
        CreateHelicalTable();
        CreateKCWormbox4PTable();
        CreateKCWormbox6PTable();
    }
    
    private void CreateWormboxTable()
    {
         try
        {
            Class.forName(driver).newInstance();
            Connection sqlCon = DriverManager.getConnection(url);
            java.sql.Statement st = sqlCon.createStatement();

            try
            {
                // this is just a check to see if the table exists
                // hence getting one record is enough
                ResultSet results = st.executeQuery("SELECT ID FROM Wormbox WHERE ID=1");
                sqlCon.close();
            } 
            catch (SQLException e)
            {

                // If the select throws an exception it means we haven't created
                // the table yet, so create the table and insert the records.
                String createTable = "CREATE TABLE Wormbox"
                        + "("
                        + "ID int NOT NULL,"
                        + "CONSTRAINT PK_WormBox PRIMARY KEY (ID),"
                        + "KWInput decimal(4,2) NOT NULL,"
                        + "RPM decimal(4,1) NOT NULL,"
                        + "Torque decimal(5,1) NOT NULL,"
                        + "Size int NOT NULL,"
                        + "Inches decimal(4,1)"
                        + ")";

                st.executeUpdate(createTable);

                String insertRecords = "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null, 'WORMBOX', 'Wormboxids.csv', null, null, null,0)";
                st.executeUpdate(insertRecords);
            }
            finally
            {
                sqlCon.close();
            }
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error creating Brooks Drive table | Details: \n" + e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void CreateBrooksCycloTable()
    {
        try
        {
            Class.forName(driver).newInstance();
            Connection sqlCon = DriverManager.getConnection(url);
            java.sql.Statement st = sqlCon.createStatement();

            try
            {
                // this is just a check to see if the table exists
                // hence getting one record is enough
                ResultSet results = st.executeQuery("SELECT ID FROM Brookscyclo WHERE ID=1");

                if (!results.next())
                {
                    // this is pretty much just a fail safe for if some how the records weren't
                    // inserted when the table was created. This won't be executed if the 
                    // above select throws an exception.
                    String insertRecords = "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null, 'BROOKSCYCLO', 'Brookscyclo.csv', null, null, null,0)";
                    st.executeUpdate(insertRecords);
                }
            } 
            catch (SQLException e)
            {

                // If the select throws an exception it means we haven't created
                // the table yet, so create the table and insert the records.
                String createTable = "CREATE TABLE Brookscyclo"
                        + "("
                        + "ID int NOT NULL,"
                        + "CONSTRAINT PK_Brookscyclo PRIMARY KEY (ID),"
                        + "KWInput decimal(4,2) NOT NULL,"
                        + "RPM decimal(4,1) NOT NULL,"
                        + "Torque decimal(8,2) NOT NULL,"
                        + "Gearbox varchar(25) NOT NULL,"
                        + "Ratio int NOT NULL,"
                        + "ServiceFactor decimal(4,2) NOT NULL,"
                        + "ServiceFactorOverload BOOLEAN NOT NULL"
                        + ")";

                st.executeUpdate(createTable);

                String insertRecords = "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null, 'BROOKSCYCLO', 'Brookscyclo.csv', null, null, null,0)";
                st.executeUpdate(insertRecords);
            } finally
            {
                sqlCon.close();
            }
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error creating Brooks Cyclo table | Details: \n" + e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void CreateBevelHelicalTable()
    {
        try
        {
            Class.forName(driver).newInstance();
            Connection sqlCon = DriverManager.getConnection(url);
            java.sql.Statement st = sqlCon.createStatement();

            try
            {
                // this is just a check to see if the table exists
                // hence getting one record is enough
                ResultSet results = st.executeQuery("SELECT ID FROM BEVELHELICAL WHERE ID=1");

                if (!results.next())
                {
                    // this is pretty much just a fail safe for if some how the records weren't
                    // inserted when the table was created. This won't be executed if the 
                    // above select throws an exception.
                    String insertRecords = "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null, 'BEVELHELICAL', 'BevelHelical.csv', null, null, null,0)";
                    st.executeUpdate(insertRecords);
                }
            } 
            catch (SQLException e)
            {

                // If the select throws an exception it means we haven't created
                // the table yet, so create the table and insert the records.
                String createTable = "CREATE TABLE BEVELHELICAL"
                        + "("
                        + "ID int NOT NULL,"
                        + "CONSTRAINT PK_BEVELHELICAL PRIMARY KEY (ID),"
                        + "KWInput decimal(4,2) NOT NULL,"
                        + "RPM decimal(4,1) NOT NULL,"
                        + "Torque decimal(7,2) NOT NULL,"
                        + "Size varchar(5) NOT NULL,"
                        + "Ratio decimal(4,1) NOT NULL"
                        + ")";

                st.executeUpdate(createTable);

                String insertRecords = "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null, 'BEVELHELICAL', 'BevelHelical.csv', null, null, null,0)";
                st.executeUpdate(insertRecords);
            } finally
            {
                sqlCon.close();
            }
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error creating Bevel Helical table | Details: \n" + e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void CreateHelicalTable()
    {
        try
        {
            Class.forName(driver).newInstance();
            Connection sqlCon = DriverManager.getConnection(url);
            java.sql.Statement st = sqlCon.createStatement();

            try
            {
                // this is just a check to see if the table exists
                // hence getting one record is enough
                ResultSet results = st.executeQuery("SELECT ID FROM HELICAL WHERE ID=1");

                if (!results.next())
                {
                    // this is pretty much just a fail safe for if some how the records weren't
                    // inserted when the table was created. This won't be executed if the 
                    // above select throws an exception.
                    String insertRecords = "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null, 'HELICAL', 'Helical.csv', null, null, null,0)";
                    st.executeUpdate(insertRecords);
                }
            } 
            catch (SQLException e)
            {

                // If the select throws an exception it means we haven't created
                // the table yet, so create the table and insert the records.
                String createTable = "CREATE TABLE HELICAL"
                        + "("
                        + "ID int NOT NULL,"
                        + "CONSTRAINT PK_HELICAL PRIMARY KEY (ID),"
                        + "KWInput decimal(5,2) NOT NULL,"
                        + "RPM int NOT NULL,"
                        + "Torque int NOT NULL,"
                        + "Size varchar(5) NOT NULL,"
                        + "Ratio decimal(4,1) NOT NULL"
                        + ")";

                st.executeUpdate(createTable);

                String insertRecords = "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null, 'HELICAL', 'Helical.csv', null, null, null,0)";
                st.executeUpdate(insertRecords);
            } finally
            {
                sqlCon.close();
            }
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error creating Helical table | Details: \n" + e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }
    }    
    
    private void CreateKCWormbox4PTable()
    {
        try
        {
            Class.forName(driver).newInstance();
            Connection sqlCon = DriverManager.getConnection(url);
            java.sql.Statement st = sqlCon.createStatement();

            try
            {
                // this is just a check to see if the table exists
                // hence getting one record is enough
                ResultSet results = st.executeQuery("SELECT ID FROM KCWORMBOX4P WHERE ID=1");

                if (!results.next())
                {
                    // this is pretty much just a fail safe for if some how the records weren't
                    // inserted when the table was created. This won't be executed if the 
                    // above select throws an exception.
                    String insertRecords = "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null, 'KCWORMBOX4P', 'KCWORMBOX4P.csv', null, null, null,0)";
                    st.executeUpdate(insertRecords);
                }
            } 
            catch (SQLException e)
            {

                // If the select throws an exception it means we haven't created
                // the table yet, so create the table and insert the records.
                String createTable = "CREATE TABLE KCWORMBOX4P"
                        + "("
                        + "ID int NOT NULL,"
                        + "CONSTRAINT PK_KCWORMBOX4P PRIMARY KEY (ID),"
                        + "KWInput decimal(4,2) NOT NULL,"
                        + "Torque int NOT NULL,"
                        + "RPM int NOT NULL,"
                        + "Ratio decimal(4,1) NOT NULL,"
                        + "Size int NOT NULL"
                        + ")";

                st.executeUpdate(createTable);

                String insertRecords = "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null, 'KCWORMBOX4P', 'KCWORMBOX4P.csv', null, null, null,0)";
                st.executeUpdate(insertRecords);
            } finally
            {
                sqlCon.close();
            }
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error creating Tramec KC Wormbox 4P table | Details: \n" + e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }
    }    
    
    private void CreateKCWormbox6PTable()
    {
        try
        {
            Class.forName(driver).newInstance();
            Connection sqlCon = DriverManager.getConnection(url);
            java.sql.Statement st = sqlCon.createStatement();

            try
            {
                // this is just a check to see if the table exists
                // hence getting one record is enough
                ResultSet results = st.executeQuery("SELECT ID FROM KCWORMBOX6P WHERE ID=1");

                if (!results.next())
                {
                    // this is pretty much just a fail safe for if some how the records weren't
                    // inserted when the table was created. This won't be executed if the 
                    // above select throws an exception.
                    String insertRecords = "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null, 'KCWORMBOX6P', 'KCWORMBOX6P.csv', null, null, null,0)";
                    st.executeUpdate(insertRecords);
                }
            } 
            catch (SQLException e)
            {

                // If the select throws an exception it means we haven't created
                // the table yet, so create the table and insert the records.
                String createTable = "CREATE TABLE KCWORMBOX6P"
                        + "("
                        + "ID int NOT NULL,"
                        + "CONSTRAINT PK_KCWORMBOX6P PRIMARY KEY (ID),"
                        + "KWInput decimal(4,2) NOT NULL,"
                        + "Torque int NOT NULL,"
                        + "RPM int NOT NULL,"
                        + "Ratio decimal(4,1) NOT NULL,"
                        + "Size int NOT NULL"
                        + ")";

                st.executeUpdate(createTable);

                String insertRecords = "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null, 'KCWORMBOX6P', 'KCWORMBOX6P.csv', null, null, null,0)";
                st.executeUpdate(insertRecords);
            } finally
            {
                sqlCon.close();
            }
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error creating Tramec KC Wormbox 6P table | Details: \n" + e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }
    }     
}
