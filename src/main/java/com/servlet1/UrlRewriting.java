package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlRewriting extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("name");
		pw.println("<h3>Hello, "+name +" welcome to the Url re-writtiing 1</h3>");
		//pw.println("<h3><a href='url2?user="+name+"'>Go to 2nd Cache.</a></h3>");
		
		//Hidden form field.
		pw.println(
				"<form action='url2'>"
				+"<input type='hidden' name='user' value='"+name +"' />"
				+"<button type='submit'>Go to 2nd page</button>"
				);
	}
  
}
