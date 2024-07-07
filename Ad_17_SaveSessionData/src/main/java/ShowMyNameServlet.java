import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowMyNameServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();			// to get session id object (which information is saved on request)
		
		String name = (String)session.getAttribute("userName");		// getting the attribute by using key of that attribute
																	// a unique key give by the session 
		
		resp.getWriter().write("Your name is : " + name);
		
		
	}
	
}
