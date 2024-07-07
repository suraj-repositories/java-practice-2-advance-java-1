import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// USEING GENERIC SERVLET CLASS 

public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String content = "<button> GET METHOD </button>";
		resp.getWriter().write(content);
		
		JOptionPane.showMessageDialog(null, "GET REQUEST");
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String content = "<button> POST MEHTOD </button>";
		resp.getWriter().write(content);
		
		JOptionPane.showMessageDialog(null, "POST REQUEST");
	}

}
