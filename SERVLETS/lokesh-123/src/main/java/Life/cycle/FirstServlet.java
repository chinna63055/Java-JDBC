package Life.cycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Life")
public class FirstServlet implements Servlet {
	static
	{
		System.out.println("Initilization");
		
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Inti method is executed");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service method is executed");
		PrintWriter pw =res.getWriter();
		pw.write("Hello My friend");
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("Destroy");
	}

}
