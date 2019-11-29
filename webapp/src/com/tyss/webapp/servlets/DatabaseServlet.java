package com.tyss.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatabaseServlet extends HttpServlet  {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		String empid = req.getParameter("empid");
		int emp_id = Integer.valueOf(empid);
		//Connection conn = null;
		//PreparedStatement pstmt = null;
		//ResultSet rs = null;
		try {
			//Driver driver = new Driver();
		
			Class.forName("com.mysql.jdbc.Driver");
			
			//DriverManager.registerDriver(driver);
			String url =  "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			Connection conn = DriverManager.getConnection(url);
			String sql = "select * from employee_info";
			Statement pstmt = conn.createStatement();
			
			ResultSet rs = pstmt.executeQuery(sql);
			out.println("<table border=1 width=50% height=50%>");
			out.println("<tr><th>EmpId</th><th>EmpName</th><th>Salary</th><th>Gender</th>");
			while(rs.next()) {
				int empid1 = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				out.println("<tr><td>" + empid + "</td><td>" + sal + "</td><td>"+name+"</td><td>"+gender+"</td></tr>");
				out.println("</table>");
				out.println("</body></html>");
			}
			conn.close();
			}catch(SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
}

		


