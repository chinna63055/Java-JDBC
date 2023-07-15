import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Servlet1")
public class ServletOne extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("pwd");
		
		System.out.println(email);
		System.out.println(pass);
		
		HttpSession hs1 = req.getSession();
		hs1.setAttribute("email", email);
		hs1.setAttribute("pwd", pass);
		
		PrintWriter pw = resp.getWriter();
		pw.write("<a href=Servlet2 >Servlet2</a>");
		
	}
}
