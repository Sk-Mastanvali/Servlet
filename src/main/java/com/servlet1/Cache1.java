package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cache1 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("name");
		pw.println("<h3>Hello, "+name +" welcome to the cache servlet 1</h3>");
		pw.println("<h3><a href='cache2'>Go to 2nd Cache.</a></h3>");
		
		//creating cookie
		Cookie c = new Cookie("user_name",name);
		res.addCookie(c);
	}
}
