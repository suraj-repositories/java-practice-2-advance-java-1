import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("service method");
		
		
		PrintWriter writer = res.getWriter();
		writer.write("<button> LoginServlet > Service_Method </button>");
		
		writer.flush();
		writer.close();
	}

}
