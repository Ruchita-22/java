package com.ibm.servletExample;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, res);
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		// establish a connection 
		ServletContext application=getServletContext();
		String driver=application.getInitParameter("driver");
		String url=application.getInitParameter("url");
		String username=application.getInitParameter("username");
		String password=application.getInitParameter("password");
		try {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,username, password);
		}catch (Exception e) {
			System.out.println(e);
		}		
		 
		System.out.println("conection establish");
		
		String firstName=req.getParameter("fname");
		String LastName=req.getParameter("lname");
		String gender=req.getParameter("gender");
		String hobbies[]=req.getParameterValues("Hobbies");
		System.out.println(gender);
		
		//System.out.println(firstName);
		out.println("<html><body style='background-color:#bef9fb' >");
		
		out.println("<h1 style='color:#ed5588'>"+firstName+" "+LastName+"</h1>");
		out.println("<h2>Gender:"+gender);
		out.println("Hobbies:");
		/*for(String s :hobbies) {
			out.println(s);
		}*/
		out.println("</h2>");
		out.println("</html></body>");
	}


}
