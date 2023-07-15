import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/*
 * Here Web xml file can be avoided by user
 */

@WebServlet("/lin")
public class Validatelogin extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("pwd");
		
		String html1 = "<html><body><marquee> <h1> LOGIN SUCCESS </h1></marquee></body></html>";
		String html2 = "<html><body><h1> LOGIN FAILED </h1></body></html>";
		
		PrintWriter pw = res.getWriter();
		
		if(email.equals("Chinnalokeshreddy78@gmail.com") && password.equals("2518"))
			pw.write(html1);
		else
			pw.write(html2);

	}

}
