import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ABCServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<String> nameList = new ArrayList<>();
		ArrayList<String> session_names = new ArrayList<>();
		
		for(int i=0; i<=10 ; i++) {
			nameList.add("Name "+ i);
			session_names.add("Session_name : "+i);
		}
		
		req.setAttribute("names", nameList);		// setting attribute to request object
		
		HttpSession session =  req.getSession();
		session.setAttribute("session_name", session_names); 	// setting attribute to session 
		
		req.getRequestDispatcher("abc.jsp").forward(req, resp);

	}
}
