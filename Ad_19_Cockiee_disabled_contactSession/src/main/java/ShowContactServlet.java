import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowContactServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		HashMap<String, String> contacts = (HashMap<String, String>)session.getAttribute("contact");
		
		Set<String> names = contacts.keySet();
		
		PrintWriter writer =  resp.getWriter();
		writer.write("<table border='1'>");
		writer.write("<tr>");
		writer.write("<th> Name </th>");
		
		writer.write("<th> Phone Number </th>");
		writer.write("</tr>");
		
		for(String name : names) {
			String number = contacts.get(name);
			writer.write("<tr>");
			writer.write("<td>"+ name +"</td>");
			
			writer.write("<td>"+ number +"</td>");
			writer.write("</tr>");
			
		}
		
		writer.write("</table>");
		
	}
	
}
