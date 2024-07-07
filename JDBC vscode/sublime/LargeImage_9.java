
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;

class ConnectionProvider {
    
    public static Connection con ;
    
    public static Connection getConnection(){
        
            try{
                if(con == null) {
                    
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/forjdbc","root","Shubham@123");
                    
                    
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
        return con;
    }
    
}


public class LargeImage_9 {

    public static void main(String[] args) {
       
        try{
            
            Connection c = ConnectionProvider.getConnection();
            
            String q = "insert into images(pic) values(?)";
            
            PreparedStatement pstmt = c.prepareStatement(q);
            
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            
            File file = jfc.getSelectedFile();
            
            FileInputStream fis = new FileInputStream(file);
            
            pstmt.setBinaryStream(1,fis,fis.available());
            
            pstmt.executeUpdate();
            
//            System.out.println("Image inserted to database.........");
                
            JOptionPane.showMessageDialog(null, "Success");
            
            c.close();
            System.out.println("Connection closed ...");
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
