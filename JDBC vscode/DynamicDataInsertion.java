// data insertion in database 
// BY user input

import java.sql.*;
import java.io.*;

class DynamicDataInsertion{
	public static void main(String[] args) {
		try{

			Class.forName("com.mysql.cj.jdbc.Driver");

			// creating a connection

			String url = "jdbc:mysql://localhost:3306/forjdbc";
			String userName = "root";
			String password = "Shubham@123";

			Connection con = DriverManager.getConnection(url,userName,password);

			// create a query

			String q = "insert into table1(tName , tCity) values (?, ?)";

			// get the PerparedStatement object 
			PreparedStatement pstmt = con.prepareStatement(q);

			// taking user input 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter Name : ");
			String name = br.readLine();

			System.out.print("Enter your city : ");
			String city = br.readLine();


			// setting the value to the query
			pstmt.setString(1, name);
			pstmt.setString(2, city);

			pstmt.executeUpdate();


			System.out.println("\n Data inserted...");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}