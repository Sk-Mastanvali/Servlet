package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertDetails extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("mail");
		String number = req.getParameter("num");
		String country = req.getParameter("country");
		
		try {
		String query="insert into Details values (id_seq.nextval,?,?,?,?)";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","123456");
		//Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432","Build_bot","123456"
		
			PreparedStatement ps = con.prepareStatement(query);
			//ps.setString(1, id);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, number);
			ps.setString(4, country);
			
			int count = ps.executeUpdate();
			
			if(count == 0) {
				pw.println("No Data is Saved.");
				
			}
			else
				pw.println("Data Saved Successfully.");
			
			
			}catch(Exception e) {
			pw.println(e);
		}

	}
}