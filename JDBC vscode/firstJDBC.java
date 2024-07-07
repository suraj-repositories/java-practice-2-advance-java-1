// program for jdbc 
import java.sql.*;
class firstJDBC{
    public static void main(String[] args) {
        
        try {
            // load the driver
            Class.forName("com.mysql.jdbc.Driver"); // may use cj

            // create a connection
            String url = "jdbc:mysql://localhost:3306/forjdbc";
            String username ="root";
            String password = "Shubham@123";

            Connection con = DriverManager.getConnection(url,username,password);

            if(con.isClosed()){
                System.out.println("connection is closed..");
            }
            else{
                System.out.println("connection created ...");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}