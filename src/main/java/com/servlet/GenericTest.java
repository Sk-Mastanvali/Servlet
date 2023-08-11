package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericTest extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("This is servlet using Generic Abstract-class implementing Servlet Interface.");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h1>Welcome to generic servlet class</h1>");
	}
}
