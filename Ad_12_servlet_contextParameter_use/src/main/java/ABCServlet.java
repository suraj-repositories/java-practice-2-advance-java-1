import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ABCServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext context = getServletContext();
		
		
		PrintWriter writer = resp.getWriter();
		writer.write("ABC SERVLET  ");
		
		writer.write(" Shop Name : " + context.getInitParameter("store_name"));
		
		writer.flush();
		writer.close();
	}
}
