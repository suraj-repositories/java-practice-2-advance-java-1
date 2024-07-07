import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

// USEING GENERIC SERVLET CLASS 

public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("service method");
		
		System.out.println(req instanceof HttpServletRequest);	// checking req is an object (instance) of the particular class(interface)
		
		HttpServletRequest request = (HttpServletRequest)req;	// type casting the request to child class(interface)  
		
		System.out.println("Request method : " + request.getMethod());		// to print the type of request	
		
		PrintWriter writer = res.getWriter();	// creating a writer to write something in client view
		if(request.getMethod().equals("POST")) {
			writer.write("<button>POST</button>");	
		}
		else if(request.getMethod().equals("GET")) {
			writer.write("<button>GET</button>");	
		}
		
		
		
		
		writer.flush();
		writer.close();
	}

}
