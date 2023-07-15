import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class AddServlet extends HttpServlet {
		
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String fname = req.getParameter("one");
		String lname = req.getParameter("two");
		
		System.out.println("Hello Good Morning "+fname+" "+lname);
		System.out.println("Thanks For Visiting this site");
		
		
		super.service(req, res);
	}
}
