import java.io.*;
import java.sql.*;

public class FetchData_11_{
	public static void main(String[] args) {
		

		try{
				// creating connection to the database
				Class.forName("com.mysql.cj.jdbc.Driver");

				String url = "jdbc:mysql://localhost:3306/forjdbc";
				String userName = "root";
				String password = "Shubham@123";

				Connection con = DriverManager.getConnection(url, userName, password);

				// ---connection done

				String q = "select * from table1";

				Statement stmt = con.createStatement();
				ResultSet set = stmt.executeQuery(q);

				while(set.next()){
					int id = set.getInt(1);
					String name = set.getString(2);
					String city  = set.getString(3);

					System.out.println(" | " + id + " | " + name + " | " + city + " | ");
				}

				System.out.println("\n\n data displayed...\n");
				con.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}