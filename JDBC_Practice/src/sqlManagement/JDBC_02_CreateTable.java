package sqlManagement;

import java.sql.*;

public class JDBC_02_CreateTable {
	public static void main(String[] args) {
		
		try {
			
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create connection
			String url = "jdbc:mysql://localhost:3306/eclipsejdbc";
			String username = "root";
			String password = "Shubham@123";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			if(con.isClosed()) {
				System.out.println("connection failed !");
			}else {
				
				// creating a query
				String q = "create table students(stu_id int(10) primary key auto_increment ,stu_name varchar(50) not null , stu_age int(3))";
				
				// create a statement
				Statement stmt = con.createStatement();
				
				stmt.executeUpdate(q);
				
				System.out.println("TABLE CREATED !");
				
				con.close();
				System.out.println("connection closed");
				
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
