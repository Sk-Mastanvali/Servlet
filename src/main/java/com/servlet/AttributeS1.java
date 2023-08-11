package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AttributeS1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String n1 = request.getParameter("N1");
		String n2 = request.getParameter("N2");
		
		int nn1 = Integer.parseInt(n1);
		int nn2 = Integer.parseInt(n2);
		
		int s = nn1+nn2;
		
		request.setAttribute("sum",s);
		
		//request dispatcher
		RequestDispatcher rd=request.getRequestDispatcher("AttributeS2");
		
		rd.forward(request, response);
	}

}
