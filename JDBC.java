
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

public class JDBC 
{
	Connection c;
	Statement s;
	ResultSet rs;


	public JDBC() {
		// TODO Auto-generated constructor stub

		try
		{
			Class.forName("org.postgresql.Driver");
			c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","hp");
         if(c==null)
			System.out.println(" no connection");
		else
			rs=s.executeQuery("SELECT * FROM word");
			while(rs.next())
			{
				System.out.println("HIII");
				String abc =rs.getString(1);
				String xyz=rs.getString(2);
				System.out.println(""+abc+""+xyz);
			}


		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	void getdata()
	{
		try
		{
			Main.fr.l=new LinkedList();
			Main.fr.h=new LinkedList();
			s=c.createStatement();
			rs=s.executeQuery("SELECT * FROM fourworddb");
			while(rs.next())
			{
				
				Main.fr.l.add(rs.getString(1));
				Main.fr.h.add(rs.getString(2));
				System.out.println(Main.fr.l.getLast());
			}
		}
		catch(Exception e)
		{
					System.out.println(e.getMessage());
		}
	}

	void getdata1()
	{
		try
		{
			Main.fi.l=new LinkedList();
			Main.fi.h=new LinkedList();
			s=c.createStatement();
			rs=s.executeQuery("SELECT * FROM fiveworddb");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				Main.fi.l.add(rs.getString(1));
				Main.fi.h.add(rs.getString(2));
			}
		}
		catch(Exception e)
		{

		}

	}

	void getdata2()
	{
		try
		{
			Main.sf.l=new LinkedList();
			Main.sf.h=new LinkedList();
			s=c.createStatement();
			rs=s.executeQuery("SELECT * FROM sixworddb");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				Main.sf.l.add(rs.getString(1));
				Main.sf.h.add(rs.getString(2));
			}
		}
		catch(Exception e)
		{

		}

	}


	void getdata3()
	{
		try
		{
			Main.Sv.l=new LinkedList();
			Main.Sv.h=new LinkedList();
			s=c.createStatement();
			rs=s.executeQuery("SELECT * FROM sevenworddb");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				Main.Sv.l.add(rs.getString(1));
				Main.Sv.h.add(rs.getString(2));
			//	System.out.println(Main.Sv.l.getLast());
			}
		}
		catch(Exception e)
		{

		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JDBC();

	}

}
