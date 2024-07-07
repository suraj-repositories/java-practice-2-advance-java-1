import java.sql.*;
import java.io.*;

class ImageInsert{
	public static void main(String[] args) {
		
		try{

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/forjdbc", "root", "Shubham@123");

			String q = "insert into images(pic) values(?)";

			PreparedStatement pstmt = con.prepareStatement(q);

			// pstmt.setString(1,"value");
			FileInputStream fis = new FileInputStream("calcIcon.jpg");


			pstmt.setBinaryStream(1, fis, fis.available());

			pstmt.executeUpdate();

			System.out.println("done....");

			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}