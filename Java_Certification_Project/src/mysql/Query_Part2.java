package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query_Part2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url ="jdbc:mysql://localhost:3306/edureka";
		String username ="root";
		String password ="Nisha@123";
		String query6 = "select max(count) as max from (select year,count(*) as count from edureka.movies group by year order by count desc) as t";
		String query7 = "select title from edureka.movies where Genres like '%romance%'";
		String query8 = "select title,Directors from edureka.movies where Genres like '%romance%'order by IMDB_votes desc limit 10";
		String query9 = " select title,max(Runtime_mins) as max from edureka.movies where Genres like '%thriller%' and Year>2005 group by title order by max desc limit 1";
		String query10 = "select distinct(title),trim(avg(IMDb_Rating)) as Average from edureka.movies where IMDb_Rating is not null group by title";
		String query11 = "select * into\r\n"
				+ " outfile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/dump.txt'\r\n"
				+ "fields terminated by  ','\r\n"
				+ "enclosed by '\"'\r\n"
				+ "lines terminated by \"\\n\"\r\n"
				+ "from edureka.movies";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection(url,username,password);
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query6);
		
		//Find out the year in which maximum number of movies were released

		
		System.out.println("******************************* Query6 **********************************");
		
		while (rs.next()) {
			
			String max = rs.getString("max");
			System.out.println("The year in which maximum number of movies were released " +max);
			
		}
		
		//Find out the movie names which belongs to Genre 'romance'
		
		 rs = st.executeQuery(query7);
		
		System.out.println("******************************* Query7 **********************************");
		System.out.println("Movies names which belongs to Genre romance ");

		while (rs.next()) {
			
			String title = rs.getString("Title");
			System.out.println(title);
			
		}
		
		//Find out the top 10 movies with Genre 'romance' which got highest number of votes IMDB
		
		 rs = st.executeQuery(query8);
			
			System.out.println("******************************* Query8 **********************************");
			System.out.println("Top 10 movies with Genre 'romance' and got highest IMDB rating");

			while (rs.next()) {
				
				String title = rs.getString("Title");
				String Director = rs.getString("Directors");
				System.out.println("Movie name " +title +" and the Director is " +Director);
				
			}
			
			//Find out the movie with Genre 'thriller' which have the highest runtime and released after 2005
			
			 rs = st.executeQuery(query9);
				
				System.out.println("******************************* Query9 **********************************");
				System.out.println("Movie with Genre 'thriller' which have the highest runtime and released after 2005");

				while (rs.next()) {
					
					String title = rs.getString("Title");
					String max = rs.getString("max");
					System.out.println("Movie name " +title +" and the max runtime in mins is " +max);
					
				}
				
				//Find out average IMDb rating for movies (While calculating average exclude the movies for which IMDb rating is not known)
			
				rs = st.executeQuery(query10);
				
				System.out.println("******************************* Query10 **********************************");
				System.out.println("Average IMDb rating for movies");

				while (rs.next()) {
					
					String title = rs.getString("Title");
					String Average = rs.getString("Average");
					System.out.println("Movie name " +title +" and the Average IMDB Rating is " +Average);
					
				}
				
				//Download the movie dataset (movies.txt) from here
				
				rs = st.executeQuery(query11);
				
				System.out.println("******************************* Query11 **********************************");
				System.out.println("Download the movie dataset (movies.txt) from here");

		
	}

}
