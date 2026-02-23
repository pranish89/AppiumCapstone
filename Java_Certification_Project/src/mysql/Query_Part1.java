package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query_Part1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url ="jdbc:mysql://localhost:3306/edureka";
		String username ="root";
		String password ="Nisha@123";
		String query1 = "select Directors from edureka.movies where title='A Walk to Remember'";
		String query2 = "select title from edureka.movies where Title_type='Documentary'";
		String query3 = "select * from edureka.movies where Title_type='Documentary' and Year=2000";
		String query4 = "select title from edureka.movies where Directors ='Steven Spielberg'";
		String query5 = "select title from edureka.movies where Directors ='Steven Spielberg' and Year=2012";

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection(url,username,password);
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query1);
		
		//Find out the name of Director who directed movie A Walk to Remember
		
		System.out.println("******************************* Query1 **********************************");
		
		while (rs.next()) {
			
			String Director = rs.getString("Directors");
			System.out.println("The Director who directed the movie A Walk to Remember " +Director);
			
		}
		
		//List down the names of all the documentary movies
		
		rs=st.executeQuery(query2);
		System.out.println("******************************* Query2 **********************************");
		System.out.println("Documentary Type movies are :");
		while (rs.next()) {
			
			String title = rs.getString("Title");
			System.out.println(title);
			
		}
		
		//List down the names of all documentary movies released in 2000
		
		rs=st.executeQuery(query3);
		System.out.println("******************************* Query3 **********************************");
		System.out.println("Documentary Type movies released in year 2000 :");
		while (rs.next()) {
			
			String title = rs.getString("Title");
			System.out.println(title);
			
		}	
		
		//Find out the names of all movies directed by Steven Spielberg
		
		rs=st.executeQuery(query4);
		System.out.println("******************************* Query4 **********************************");
		System.out.println("Names of all movies directed by Steven Spielberg:");
		while (rs.next()) {
			
			String title = rs.getString("Title");
			System.out.println(title);
			
		}
		
		//Find out the names of all movies directed by Steven Spielberg and were released in 2012

		rs=st.executeQuery(query5);
		System.out.println("******************************* Query5 **********************************");
		System.out.println("Names of all movies directed by Steven Spielberg and were released in 2012:");
		while (rs.next()) {
			
			String title = rs.getString("Title");
			System.out.println(title);
			
		}	
		
		
	}

}
