
import java.io.*;
import java.sql.*;

public class UpdateData_10_{
	public static void main(String[] args) {
		

		try{

			// creating a connection ----------

			Class.forName("com.mysql.cj.jdbc.Driver");	// loading the driver

			String url = "jdbc:mysql://localhost:3306/forjdbc";
			String userName = "root";
			String password = "Shubham@123";

			Connection con = DriverManager.getConnection(url, userName, password);

			// -------- done ----------connection created

			String q = "update table1 set tName=?, tCity=? where tID=?";

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Student ID : ");
			int id = Integer.parseInt(br.readLine());

			System.out.println("Enter Name : ");
			String name = br.readLine();

			System.out.println("Enter your new City : ");
			String city = br.readLine();

			PreparedStatement pstmt = con.prepareStatement(q);

			pstmt.setString(1, name);
			pstmt.setString(2, city);

			pstmt.setInt(3, id);

			pstmt.executeUpdate();

			System.out.println("\n\n.......... done ..........\n");
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}


	}
}