import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection 
{
	static Connection con;
	public static Connection getConnection()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/securecomputation","root","root");
              System.out.println("Connected");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
		
	}

}
