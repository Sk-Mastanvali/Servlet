//package
package com.servlet;

import javax.servlet.*;	//servlet api
import java.io.*;				//io api
import java.util.*;			//utility api

public class  DateApp extends GenericServlet{ 
	
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException {
		//set response content type
		res.setContentType("text/html");

		//get printer stream obj from response obj
		PrintWriter pw = res.getWriter();

		//write request processiing logic
		Date d=new Date();

		//write generated output to response obj using printwriter stream
		pw.println("<h1>Date and time is :: " +d+"</h1>");

		//close the stream
		pw.close();
	}//service method
}//classs
