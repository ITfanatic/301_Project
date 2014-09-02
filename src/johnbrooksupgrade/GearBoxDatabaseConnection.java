package johnbrooksupgrade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GearBoxDatabaseConnection
{

    
    public String url, driver;

    public GearBoxDatabaseConnection()
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
                    options.add(String.format("%.2fKw 4P Motor \nFCNDK %d %.2f:1", dbKilloWatt,motorSize, gearboxRatio));
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
    
    public void CreateTables()
    {
        CreateWormboxTable();
        CreateBrooksCycloTable();
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
            }
            finally
            {
                sqlCon.close();
            }
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error creating Brooks Cyclo table | Details: \n" + e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
