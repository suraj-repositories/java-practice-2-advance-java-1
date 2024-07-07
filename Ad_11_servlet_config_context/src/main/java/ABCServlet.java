import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ABCServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Servlet config : " + getServletConfig());
		System.out.println("Servlet context : " + getServletContext());
		
		
		PrintWriter writer = resp.getWriter();
		writer.write("ABC SERVLET");
		
		writer.flush();
		writer.close();
	}
}
