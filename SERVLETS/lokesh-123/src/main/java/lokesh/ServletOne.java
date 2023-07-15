package lokesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet1")
public class ServletOne extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String e =req.getParameter("email");
		int p =Integer.parseInt(req.getParameter("pass"));
		System.out.println(e);
		System.out.println(p);
		
		String html = "<html><body bgcolor=blue><h1>The bold</h1><br><a href=Life >Server1</a></body></html>";

			PrintWriter pw = resp.getWriter();
			pw.write(html);
		
		
		
	}
}
