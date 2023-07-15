package com.org;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GetCarData extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("cid"));
		String name = req.getParameter("cname");
		String color = req.getParameter("ccolor");
		double price = Double.parseDouble(req.getParameter("cprice"));
		
		System.out.println("ID = "+id);
		System.out.println("NAME IS "+name);
		System.out.println("Color is "+color);
		System.out.println("Price is "+price);
	}

}
