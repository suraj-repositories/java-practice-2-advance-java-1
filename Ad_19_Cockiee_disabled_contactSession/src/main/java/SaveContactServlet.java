import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SaveContactServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String number = req.getParameter("number");
		
		HttpSession session =  req.getSession();
		
		HashMap<String, String> contact = (HashMap<String, String>)session.getAttribute("contact");
		
		if(contact==null) {
			contact = new HashMap<>();
		}
		
		contact.put(name, number);
				
		
		session.setAttribute("contact", contact);		// setting the attributes key=contact   value=contactOBJECT  -
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
