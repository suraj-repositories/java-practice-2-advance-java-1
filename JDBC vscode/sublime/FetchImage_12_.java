import java.io.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.imageio.*;
import java.awt.*;



public class FetchImage_12_ extends JFrame implements ActionListener{

	 JButton button ;
	 JTextField jft;
	 JLabel label ;

	FetchImage_12_(){
		this.setSize(500,500);
		this.setLayout(null);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// creating a panel

		jft = new JTextField();
		jft.setBounds(20,20,180,60);

		button = new JButton("Show Image");
		button.setBounds(220,20,140,60);
		button.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(50,50,380,100);
		panel.setBackground(Color.yellow);
		panel.add(jft);
		panel.add(button);

	    label = new JLabel();
	    label.setLayout(null);

		
		this.add(label);
		this.add(panel);
		//this.setLocationRelativeTo(null);  	// for center align
		this.setVisible(true);
	}

	public static void main(String[] args) {

		new FetchImage_12_();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button){
			
			try{

			// taking input
			String str = jft.getText().trim();
			int id = Integer.parseInt(str);

			System.out.println("creaing connection...");
			

			//---------------------------creating connection----------------------			
				Class.forName("com.mysql.cj.jdbc.Driver");

				String url = "jdbc:mysql://localhost:3306/forjdbc";
				String userName = "root";
				String password = "Shubham@123";

				Connection con = DriverManager.getConnection(url, userName, password);

			//---------------------------creating connection----------------------
			  

			 // DISPLAY THE IMAGE TO SWING 
			   ImageIcon icon = Helper.getImageById(id, con);
			   if(icon == null){
			   	JOptionPane.showMessageDialog(null, "No image here");
			   }


			   label.setIcon(icon);
			   label.setBounds(50,200,400,400);


			con.close();
			System.out.println("---Connection closed---");

		}catch(Exception gooooo){
			gooooo.printStackTrace();
		}

		}
		
	}


}


class Helper{
	

	/* TO SELECT THE DATA FROM DATABASE */
	public static ImageIcon getImageById(int id, Connection con){
		 ImageIcon icon = null;

		 try{

		 	String q = "select pic from images where id=?";

		 	PreparedStatement pstmt = con.prepareStatement(q);
		 	pstmt.setInt(1, id);

		 	ResultSet set = pstmt.executeQuery();

		 	if(set.next()){
		 		Blob b = set.getBlob("pic");

		 		InputStream is = b.getBinaryStream();
		 		Image image = ImageIO.read(is);
		 		icon = new ImageIcon(image);

		 	}


		 }
		 catch(Exception e){
		 	e.printStackTrace();
		 }

		 return icon;
	}
}