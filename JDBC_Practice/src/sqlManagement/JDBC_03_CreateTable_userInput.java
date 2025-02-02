package sqlManagement;

import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;

public class JDBC_03_CreateTable_userInput {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			// creating connection 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipsejdbc", "root", "Shubham@123");
			
			if(con.isClosed()) {
				System.out.println("connection not created !");
			}
			
			else {
				
				
				
				Scanner sc = new Scanner(System.in);
				
				String tableName;
				System.out.print("Table name : ");
				tableName = sc.next();
				
				String q = "create table "+ tableName +"(";
				
				System.out.print("enter number of columns : ");
				int numOfColumns = sc.nextInt();
				
				System.out.println("Enter "+ numOfColumns +" column names :-");
				
				ArrayList<String> columns = new ArrayList<String>();	
				
				
				for(int i=0; i<numOfColumns ; i++) {
					String x = sc.next();
					columns.add(x);
				}
				
				for(int i=0; i<numOfColumns ; i++) {
					 q = q + columns.get(i) + " varchar(25)";
					 
					 if(i == numOfColumns-1) {
						 break;
					 }
					
					 q = q +" , ";
				}
				
				q = q + ")";
				
				
				// create a statement
				Statement stmt = con.createStatement();
				
				stmt.executeUpdate(q);
				
				System.out.println("TABLE CREATED !");
				
				con.close();
				System.out.println("connection closed");
				
				
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
