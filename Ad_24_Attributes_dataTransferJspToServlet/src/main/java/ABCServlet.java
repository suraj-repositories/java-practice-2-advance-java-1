import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ABCServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ArrayList<String> nameList = new ArrayList<>();
		
		for(int i=0; i<=10 ; i++) {
			nameList.add("Name "+ i);
		}
		
		req.setAttribute("names", nameList);
		
		req.getRequestDispatcher("ABC.jsp").forward(req, resp);
		
		
	}
}
