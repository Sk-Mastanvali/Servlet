package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AttributeS2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		int nn1 = Integer.parseInt(request.getParameter("N1"));
		int nn2 = Integer.parseInt(request.getParameter("N2"));
		
		int p = nn1*nn2;
		
		int sum = (int)request.getAttribute("sum");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<h4>The sum of given numbers ::</h4>"+ sum);
		pw.println("<h4>The product of given numbers ::</h4>"+p);
	}
}
