package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeletDetails extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String sid = req.getParameter("id");
		Integer id = Integer.parseInt(sid);
		
		String query=" delete details where id="+id;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","123456");
			
			PreparedStatement ps = con.prepareStatement(query);
			
			int count = ps.executeUpdate();
			
			if(count == 0) {
				pw.println("No Data is Deleted. Entered ID not found.");

				RequestDispatcher rd=req.getRequestDispatcher("File.html");
				rd.include(req,res);
			}else
				pw.println("Data Deleted Saved Successfully.");
			
		}catch(Exception e) {     
			pw.println(e);
		}
		
	}
}
