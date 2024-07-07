import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GenerateFakeCredit extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");  		// setting the type of response content
		// visit on "mime type" to see the list of content type's available
		
		Random random = new Random();
		PrintWriter writer = resp.getWriter();
		
		writer.write("<hr><h1>Fake Credit Card Numbers -</h1><hr><br>");
		writer.write("<ol>");
		
		for(int i=0; i<20; i++) {
			
			String CardNumber = (random.nextFloat()+"").substring(2,6) + "-" +
								(random.nextFloat()+"").substring(2,6) + "-" +
								(random.nextFloat()+"").substring(2,6) + "-" +
								(random.nextFloat()+"").substring(2,6) ;
			
			writer.write("<li>"+ CardNumber +"</li>");
		}
		
		writer.write("</ol>");
		
		writer.flush();	// to send response to the client
		writer.close();
	}
}
