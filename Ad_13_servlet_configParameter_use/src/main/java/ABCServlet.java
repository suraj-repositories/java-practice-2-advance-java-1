import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ABCServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// HERE the config initialize parameter is not available because it is config 
		ServletConfig config = getServletConfig();
		
		
		PrintWriter writer = resp.getWriter();
		writer.write("ABC SERVLET  ");
		
		writer.write(" Value : " + config.getInitParameter("key_name")); // passing the key and gaining the value
		
		writer.flush();
		writer.close();
	}
}
