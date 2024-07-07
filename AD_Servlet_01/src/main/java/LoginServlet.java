import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

// generic Servlet is a special class 
/// now you can also use the child class of genericServlet which is HttpServlet
/// child class have more than parent class 
public class LoginServlet extends HttpServlet {

	// THAT IS MORE READABLE 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		String rs = "<button> click here this was GET request HTTP";
//		resp.getWriter().write(rs);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
		dispatcher.forward(req, resp);
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String rs = "<button> click here this was POST request HTTP";
		resp.getWriter().write(rs);
	
	}
	
	// THAT IS NOT MUCH READABLE
	/*
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		HttpServletRequest request = (HttpServletRequest)req;
		String method = request.getMethod();
		
		System.out.println("this is java login servlet ......");
		String resp = "";
		
		if(method.equals("POST")) {
			resp = "<button> click in POST </button>";
		}
		else if(method.equals("GET")) {
			resp = "<button> click in GET</button>";
		}
		
		PrintWriter writer = res.getWriter();
		//writer.write("<button>Click Me</button>");
		writer.write(resp);
		
		writer.flush();
		writer.close();	
	}
	*/

}
