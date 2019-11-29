package com.tyss.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {

	public void init() throws ServletException {

		System.out.println("init method");

	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empName = req.getParameter("empName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		System.out.println("form service method");
		System.out.println("form extra line of code");

		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("company-name");

		ServletConfig config = getServletConfig();
		String batchName = config.getInitParameter("batch-name");


		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println(empName);
		out.println("</h1>");

		out.println("<h1>");
		out.println(email);
		out.println("</h1>");

		out.println("<h1>");
		out.println(password);
		out.println("</h1>");

		out.println("<h2>");
		out.println(companyName);
		out.println("</h2>");

		out.println("<h2>");
		out.println(batchName);
		out.println("</h2>");


		out.println("</body>");
		out.println("</html>");

	}//end of doGet()

	@Override
	public void destroy() {

		System.out.println("destroy method");
	}


}//end of FormServlet
