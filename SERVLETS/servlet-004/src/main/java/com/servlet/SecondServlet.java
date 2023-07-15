package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet2")
public class SecondServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("pwd");
		
		System.out.println(email+"\n"+pass);
		PrintWriter pw =resp.getWriter();
		pw.write("<a href=Servlet3>Servlet3</a>");
		
		// if we write like this we will get same
		//
		// pw.write("<a href=Servlet3? email = "+email+"&pwd ="+pass+">Servlet3</a>");
		
	}

}

