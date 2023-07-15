package Cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/c2")
public class Servlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie arr[] = req.getCookies();
		for(Cookie c:arr)
		{
			
			System.out.println(c.getValue());
			/*
			 * 11B82F065DB4166961FE2619749448DC //
				Lokesh
				22
			 */
		}

	}

}
