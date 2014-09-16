package johnbrooksupgrade;

public class User
{
    private String Name;

    public User()
    {

    }

    public User(String name)
    {
        Name = name;
    }

    public String GetName()
    {
        return Name;
    }
    
    public void SetName(String name)
    {
        Name = name;
    }
}
