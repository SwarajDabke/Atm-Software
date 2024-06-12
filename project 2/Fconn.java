import java.sql.*; 

class Fconn
{
	 Connection c;
	 Statement s;
	Fconn()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
				c =DriverManager.getConnection("jdbc:mysql://localhost:3306/swaraj1?autoReconnect=true&useSSL=false","root","143198");
				s=c.createStatement();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
			
		}
}

