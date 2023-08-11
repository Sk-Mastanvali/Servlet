package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class HttpServ extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		System.out.println("This is get Method.");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<h1>This is Get Method of My-Servlet.</h1>");
	}
}
