
// invalidate is used to delete the session or expire the session 
// when the session is expire you are a new user for those web-site

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InvalidateSessionServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");	// setting the type of response
		
		HttpSession httpSession = req.getSession();		// it gives the session object
		
		httpSession.invalidate(); 		// to invalidate or destroy the session
		
		PrintWriter writer = resp.getWriter();
		writer.write("Now session is invalidated");
		writer.write("<h3>Now you are new user</h3>");
		
	}
}
