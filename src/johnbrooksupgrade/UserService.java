package johnbrooksupgrade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UserService
{

    private String url, driver;

    public UserService()
    {
        url = "jdbc:derby:JohnBrooks;create=true;";
        driver = "org.apache.derby.jdbc.EmbeddedDriver";
    }
    
    public void CreateTables()
    {
        CreateUserTable();
    }

    private void CreateUserTable()
    {
        try
        {
            Class.forName(driver).newInstance();
            Connection sqlCon = DriverManager.getConnection(url);
            java.sql.Statement st = sqlCon.createStatement();

            try
            {
                // this is just a check to see if the table exists
                ResultSet results = st.executeQuery("SELECT UserName FROM Users");

                sqlCon.close();
                
            } 
            catch (SQLException e)
            {

                // If the select throws an exception it means we haven't created
                // the table yet.
                
                // At this stage, users only have a username, if more is required to be added
                // for users in the future edit this query.
                String createTable = "CREATE TABLE Users"
                        + "("
                        + "UserName varchar(255) NOT NULL,"
                        + "CONSTRAINT PK_User PRIMARY KEY (UserName)"
                        + ")";

                st.executeUpdate(createTable);
            } 
            finally
            {
                sqlCon.close();
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error creating Users table | Details: \n" + e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public ArrayList GetUsers()
    {
        ArrayList<User> users = new ArrayList<>();

        try
        {
            Class.forName(driver).newInstance();
            Connection sqlCon = DriverManager.getConnection(url);
            java.sql.Statement st = sqlCon.createStatement();
            
            ResultSet results = st.executeQuery("SELECT * FROM Users");
            
            while(results.next())
            {
                User currentUser = new User();
                
                currentUser.SetName(results.getString("UserName"));
                
                users.add(currentUser);
            }       
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error fetching user data. | Details: \n" + e.getMessage(), "Error!", JOptionPane.INFORMATION_MESSAGE);            
        }
        
        return users;
    }
    
    public void InsertUser(String userName)
    {
        try
        {
            Class.forName(driver).newInstance();
            Connection sqlCon = DriverManager.getConnection(url);
            java.sql.Statement st = sqlCon.createStatement();

            String insertUser = "INSERT INTO Users VALUES ('" + userName + "')";
            st.executeUpdate(insertUser);
            
            JOptionPane.showMessageDialog(null, "User added successfully.\nThis user will now be an existing sales person option.", "Successful", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong adding the user.\nCheck the user doesn't already exist.", "Error!", JOptionPane.INFORMATION_MESSAGE);            
        }   
    }
}
