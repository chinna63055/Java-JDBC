package com.org;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GetStudentData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int sid = Integer.parseInt(req.getParameter("id"));
		String sname = req.getParameter("name");
		String sage =  req.getParameter("age");
		String sgender = req.getParameter("gender");
		
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sage);
		System.out.println(sgender);
		
		String html = "<html><body><h1>"+sname+"</h1></body></html>";
		
		System.out.println(html);
	}

}
