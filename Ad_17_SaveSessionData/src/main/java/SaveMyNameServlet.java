import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SaveMyNameServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();		// to get session id object (which information is saved on request)
		
		session.setAttribute("userName", req.getParameter("username"));		//(getting the userName stored in req) and creqting an Attribute with key value pair
		
		PrintWriter writer = resp.getWriter();
		writer.write("user Name saved by saveMyName servlet !");
		
		writer.flush();
		writer.close();

	}
	
}
