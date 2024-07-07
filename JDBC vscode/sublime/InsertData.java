import java.sql.*;

class InsertData{
	public static void main(String[] args) {
		
		try{

			Class.forName("com.mysql.jdbc.Driver");
 
			// creating a connection
			String url = "jdbc:mysql://localhost:3306/forjdbc";
			String userName = "root";
			String password = "Shubham@123";

			Connection con = DriverManager.getConnection(url,userName,password);


			// create a query ---- dynamic query also known as parameterized query
			String q = "insert into table1(tName,tCity) values (?,?)";

			// get the PreparedStatement object 

			PreparedStatement pstmt = con.prepareStatement(q);

			// set the values to query

			pstmt.setString(1,"Adarsh Vishwakarma");
			pstmt.setString(2,"Kanpur");

			pstmt.executeUpdate();  // do not pass the query while useing prepared statement


			System.out.println("Data inserted.....");

			con.close();



		}catch(Exception e){
			e.printStackTrace();
			
		}

	}
}