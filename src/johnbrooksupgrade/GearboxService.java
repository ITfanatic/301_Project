package johnbrooksupgrade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GearboxService
{    
    private String url, driver;

    public GearboxService()
    {
        // Initialise connection vars 
        url = "jdbc:derby:JohnBrooks;create=true;";
        driver = "org.apache.derby.jdbc.EmbeddedDriver";
    }

    public ArrayList GetWormBoxOptions(double kwInput, double rpm, double torque)
    {
        ArrayList<String> options = new ArrayList();

        try
        {
            
            Class.forName(driver).newInstance();
            try (Connection sqlCon = DriverManager.getConnection(url))
            {
                java.sql.Statement st = sqlCon.createStatement();
               
                // Wormbox should be based on any RPM and Torque that is greater than or equal to the requirements but orderedy by the smallest Kw 
                // this is because there are cases where the Kw is enough but for that Kw the RPM or Torque isn't high enough. Meaning they have to
                // go to the next Kw size.
                String selectOptions = String.format("SELECT KWInput, Size, Inches,RPM FROM Wormbox WHERE RPM >= %.1f and Torque >= %.2f ORDER BY KWInput,Size,RPM", rpm, torque);              
                
                ResultSet res = st.executeQuery(selectOptions);
                
                while (res.next())
                {
                    int motorSize = res.getInt("Size");
                    double gearboxRatio = res.getDouble("Inches");
                    double kwOutput = res.getDouble("KWInput");
                    
                    // only for this number should we display to 1dp otherwise don't display the dp
                    if (gearboxRatio == 7.50)
                    {
                        options.add(String.format("%.2fKw 4P Motor \nFCNDK %d %.1f:1", kwOutput,motorSize, gearboxRatio));
                    }
                    else
                    {
                        options.add(String.format("%.2fKw 4P Motor \nFCNDK %d %.0f:1", kwOutput,motorSize, gearboxRatio));    
                    }
                }
            }
            
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }

        return options;
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
                    suggested are the smallest but still fit for purpose. We then order by lowest RPM, then smallest servicefactor. That is the 
                    order of importance.
                 */                
                String selectOptions = String.format("SELECT Gearbox, Ratio, ServiceFactor, KWInput, ServiceFactorOverload,RPM FROM BROOKSCYCLO WHERE KWInput >=%.2f and RPM >= %.1f and Torque >= %.2f ORDER BY KWInput,RPM,ServiceFactor", kwInput, rpm, torque);
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
                String selectOptions = String.format("SELECT ID,Size, Ratio, KWInput,RPM FROM BEVELHELICAL WHERE KWInput >= %.2f and RPM >= %.1f and Torque >= %.2f ORDER BY KWInput,RPM,ID", kwInput, rpm, torque);
                                
                ResultSet res = st.executeQuery(selectOptions);
                
                while (res.next())
                {
                    String motorSize = res.getString("Size");
                    double gearboxRatio = res.getDouble("Ratio");
                    double KW = res.getDouble("KWInput");
                    double RPMOoutput = res.getDouble("RPM");
                    
                    // this checks if the ratio is a whole number, if so we can display to 0dp
                    if ((gearboxRatio % 1) == 0)
                    {
                        options.add(String.format("%.2fKw 4P Motor \nSize: %s Ratio: %.0f RPM: %.0f", KW, motorSize, gearboxRatio, RPMOoutput));
                    } 
                    else
                    {

                        options.add(String.format("%.2fKw 4P Motor \nSize: %s Ratio: %.1f RPM: %.0f", KW, motorSize, gearboxRatio, RPMOoutput));
                    }
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
                
                // Order the results by the smallest Kw and the smallest RPM, a lower RPM is more important 
                // than a lower torque, then order by ID so that the smallest size motor is chosen i.e. 56B over 71B
                String selectOptions = String.format("SELECT Size, Ratio, KWInput,RPM,Torque FROM HELICAL WHERE KWInput >= %.2f and RPM >= %.1f and Torque >= %.2f ORDER BY KWInput,RPM,ID", kwInput, rpm, torque);
                                
                ResultSet res = st.executeQuery(selectOptions);
                int count = 0;

                while (res.next())
                {
                    String motorSize = res.getString("Size");
                    double gearboxRatio = res.getDouble("Ratio");
                    double KW = res.getDouble("KWInput");
                    int RPM = res.getInt("RPM");
                    int outputTorque = res.getInt("Torque");
                    

                    if (OutputTorqueIsTooHigh(torque, outputTorque))
                    {
                        // we don't want to add this if an option was found for the first result,
                        // only if we hit this on the first result.
                        if (count == 0)
                        {
                            options.add("Sorry, the output torque for this type of\ngearbox based on the results\nis in excess by more than 25%.\nPlease use a different gearbox option.");
                        }
                        
                        break;
                    }
                    
                    // this checks if the ratio is a whole number, if so we can display to 0dp
                    if ((gearboxRatio % 1) == 0)
                    {
                        options.add(String.format("%.2fKw 4P Motor \nSize: %s Ratio: %.0f RPM: %d", KW, motorSize, gearboxRatio,RPM));
                    } 
                    else
                    {
                        options.add(String.format("%.2fKw 4P Motor \nSize: %s Ratio: %.1f RPM: %d", KW, motorSize, gearboxRatio,RPM));
                    }
                    
                    count++;
                   
                    if(count == 2)
                    {
                        // only need two results
                        break;
                    }
                }
            }
            
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }

        return options;
    }

    private boolean OutputTorqueIsTooHigh(double torque, double outputTorque)
    {
        // This finds what 25% of the required torque is.
        // We use this to find if the outputTorque is
        // more than 25% over the torque requirements.
        // If so then we should tell the
        // user to use a different gearbox option
        // because this one is too powerful for the requirements.
        
        double percentOfTorque = (torque * 25) / 100;
        
        return outputTorque > (torque + percentOfTorque);
    }
    
    public ArrayList GetKCWormbox4POptions(double kwInput, double rpm, double torque)
    {
        ArrayList<String> options = new ArrayList();

        try
        {
            
            Class.forName(driver).newInstance();
            try (Connection sqlCon = DriverManager.getConnection(url))
            {
                java.sql.Statement st = sqlCon.createStatement();
                String selectOptions = String.format("SELECT Size, Ratio, KWInput,RPM FROM KCWORMBOX4P WHERE KWInput >= %.2f and RPM >= %.1f and Torque >= %.2f ORDER BY KWInput,RPM", kwInput, rpm, torque);
                                
                ResultSet res = st.executeQuery(selectOptions);
                
                while (res.next())
                {
                    int motorSize = res.getInt("Size");
                    double gearboxRatio = res.getDouble("Ratio");
                    double KW = res.getDouble("KWInput");
                    
                    // this checks if the ratio is a whole number, if so we can display to 0dp
                    if ((gearboxRatio % 1) == 0)
                    {                    
                        options.add(String.format("%.2fKw 4P Motor \nSize: %d Ratio: %.0f", KW, motorSize, gearboxRatio));
                    }
                    else
                    {
                        options.add(String.format("%.2fKw 4P Motor \nSize: %d Ratio: %.1f", KW, motorSize, gearboxRatio));                        
                    }
                }
            }
            
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }

        return options;
    }
    
    public ArrayList GetKCWormbox6POptions(double kwInput, double rpm, double torque)
    {
        ArrayList<String> options = new ArrayList();

        try
        {
            
            Class.forName(driver).newInstance();
            try (Connection sqlCon = DriverManager.getConnection(url))
            {
                java.sql.Statement st = sqlCon.createStatement();
                String selectOptions = String.format("SELECT Size, Ratio, KWInput, RPM FROM KCWORMBOX6P WHERE KWInput >= %.2f and RPM >= %.1f and Torque >= %.2f ORDER BY KWInput,RPM", kwInput, rpm, torque);
                                
                ResultSet res = st.executeQuery(selectOptions);
                
                while (res.next())
                {
                    int motorSize = res.getInt("Size");
                    double gearboxRatio = res.getDouble("Ratio");
                    double KW = res.getDouble("KWInput");
                    
                    // this checks if the ratio is a whole number, if so we can display to 0dp
                    if ((gearboxRatio % 1) == 0)
                    {                      
                        options.add(String.format("%.2fKw 6P Motor \nSize: %d Ratio: %.0f", KW, motorSize, gearboxRatio));
                    }
                    else
                    {
                        options.add(String.format("%.2fKw 6P Motor \nSize: %d Ratio: %.1f", KW, motorSize, gearboxRatio));                        
                    }
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
                
                if (!results.next())
                {
                    // this is pretty much just a fail safe for if the table exists at this stage but
                    // the records haven't been inserted. This won't be executed if the table doesn't exist
                    String insertRecords = "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null, 'WORMBOX', 'Wormbox.csv', null, null, null,0)";
                    st.executeUpdate(insertRecords);
                }
                
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

                String insertRecords = "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null, 'WORMBOX', 'Wormbox.csv', null, null, null,0)";
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
