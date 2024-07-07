import java.sql.*;
// for more detail see the fourth video of jdbc



public class CreateTable{
    public static void main(String[] args) {
        
        System.out.println("---");

        try {
            // load the driver
            Class.forName("com.mysql.jdbc.Driver"); // may use cj

            // create a connection
            String url = "jdbc:mysql://localhost:3306/forjdbc";
            String username ="root";
            String password = "Shubham@123";

            Connection con = DriverManager.getConnection(url,username,password);

            // CREATE a query
            String q = "create table table1(tID int(20) primary key auto_increment ,tName varchar(20) not null , tCity varchar(400))";


            // create a statement
           Statement stmt =  con.createStatement();  

           stmt.executeUpdate(q);

           System.out.println("Table Created.....");

           con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}