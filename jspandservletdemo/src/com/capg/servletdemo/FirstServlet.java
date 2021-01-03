package com.capg.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
 //doGet
 //doPost
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String firstName = req.getParameter("fname");
//		String lastName = req.getParameter("lname");
//		String fullName = firstName + lastName;
//		System.out.println("my name is "+fullName);
//		doPost(req, resp);
//	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName = req.getParameter("fname");
		String lastName = req.getParameter("lname");
		String fullName = firstName + lastName;
//		System.out.println("my name is "+fullName);
//		PrintWriter writer = resp.getWriter();
//		writer.println("my name is "+fullName);
//		writer.println("<html><body><h1>my name is "+fullName+ "</h1></body></html>");
//		resp.sendRedirect("http://www.facebook.com");
//		resp.sendRedirect("test.html");
		
		req.setAttribute("name", fullName);
		RequestDispatcher requestdispatcher = req.getRequestDispatcher("/output.jsp");
		requestdispatcher.forward(req, resp);
		}
}
