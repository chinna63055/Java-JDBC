package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
/*
 * In servlets to send data from one resource to another resource we use setion traking mecanisium.
 * Section mechasium mainly helps to vallidate section of a particular user.
 * 
 * Types Of seassion tracking 
 * 1.URL recuriting 
 * 2.HTTP session
 * 3.Coohie
 * 4.HIdden form field.
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet1")
public class FirsttServ1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("pwd");
		
		System.out.println(email+"\n"+pass);
		PrintWriter pw =resp.getWriter();
		pw.write("<a href=Servlet2? email = "+email+"&pwd ="+pass+">Servlet2</a>");
	}

}

