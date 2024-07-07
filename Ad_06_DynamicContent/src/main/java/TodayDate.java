import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TodayDate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Date date = new Date();
		
		
		PrintWriter writer = resp.getWriter();
		writer.write("DATE SERVLET : " + date
				+ "\n Month : " + date.getMonth() +
				"\n Date : " + date.getDate() );
		
		
		writer.flush();		// to send response to the client
		
		writer.close();			// closing the resource
	}
}
