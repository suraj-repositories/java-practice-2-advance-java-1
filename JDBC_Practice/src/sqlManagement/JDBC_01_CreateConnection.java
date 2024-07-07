package sqlManagement;

import java.sql.*;



public class JDBC_01_CreateConnection {
	
	public static void main(String args[])  {
		
		try {
			// Load the driver using forName method of Class class
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				
			// Create a connection
			String url = "jdbc:mysql://localhost:3306/eclipsejdbc";
			String userName = "root";
			String password = "Shubham@123";
			
			Connection con = DriverManager.getConnection(url,userName,password);
			
			if(con.isClosed()) {
				System.out.println("unable to connect !");
			}
			else {
				System.out.println("connection created...");
				
				//  ready to perform database related tasks or 
				
				System.out.println("\ncloseing the connection...");
				con.close();	// at last close the connection
				System.out.println("done !");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
