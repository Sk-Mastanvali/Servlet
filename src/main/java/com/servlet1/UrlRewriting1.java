package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlRewriting1 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h2 Style='color:red;'>Welcomoe to url Rewriter page-2</h2>");
		
		//url :: fetch
		String name = req.getParameter("user");
		pw.println("<h2 Style='color:red;'>Welcomoe to url Rewriter page-2  "+name + " </h2>");
		
		
		
	}
}
