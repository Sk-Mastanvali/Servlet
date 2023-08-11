package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class RegisterForm extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		pw.println("Welcome to registration servlet.");
		
		String name = req.getParameter("user-name");
		String pswd = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String course = req.getParameter("course");
		String check = req.getParameter("check");
		
		//data saved
		if(check != null) {
		pw.println(name+" "+pswd+" "+email+" "+gender+" "+course);
		
		RequestDispatcher rd = req.getRequestDispatcher("success");
		rd.forward(req, res);
		
		}else {
			
			pw.println("Enter the Details properly.");
		
			//request dispatcher.
			RequestDispatcher rd1 = req.getRequestDispatcher("Form.html");
		
			//include
			rd1.include(req, res);
		}
	}
}
