package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Cache2 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		//gettting cookies
		Cookie[] cookies = req.getCookies();
		
		boolean f = false;
		String name="";
		if(cookies  == null)
			pw.println("<h1>You are a New-User..First give your details.</h1>");
		else {
			for(Cookie c : cookies) {
				String tname = c.getName();
				if(tname.equals("user_name")) {
					f = true;
					name = c.getValue(); 
				}
				
			}
			//String name = req.getParameter("name");
			if(f)
				pw.println("<h3>Hello, "+name +" welcome to servlet 2nd component.</h3>");
		}
	}
}
