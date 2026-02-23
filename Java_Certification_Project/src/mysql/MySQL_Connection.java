package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url ="jdbc:mysql://localhost:3306/edureka";
		String username ="root";
		String password ="Nisha@123";
		String query = "select * from edureka.movies";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection(url,username,password);
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		while (rs.next())
		{
			String title=rs.getString("Title");
			System.out.println("Title " +title);
		}
		
		st.close();
		con.close();
		
	}

}
