
// once you visit on any site a session is created 
// is new is used to check the session is new or not 
// that means you are visiting on that site first time but in second time you are not new 

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDemoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");	// setting the type of response
		
		PrintWriter writer = resp.getWriter();
		writer.write("<h2>This is handled by session demo servlet :</h2> <br>");
		
		
		HttpSession httpSession = req.getSession();
		boolean isNew = httpSession.isNew();
		
		
		writer.write("<h2>Session is new : </h2>" + isNew);
		
	}
	
}
