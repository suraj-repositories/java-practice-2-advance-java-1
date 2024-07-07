import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycle extends HttpServlet{

	static {
		System.out.println("1. Loading class ...");
	}
	
	{		// instance initialization block 
		System.out.println("2. Creating Object...");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("3. init method zero parameter");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		System.out.println("4. init method servlet config");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);	// it internally call do get method
		System.out.println("5. Service method called ...");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("6. do get method called ");
		
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.write("<hr><h1>check console of eclipse</h1><hr>");
		writer.flush();
		writer.close();
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("7. last : distroy method ");
		super.destroy();
	}
	
}
