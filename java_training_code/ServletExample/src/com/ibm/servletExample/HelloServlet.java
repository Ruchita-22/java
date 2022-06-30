package com.ibm.servletExample;



import java.awt.image.RescaleOp;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xpath.internal.operations.Bool;


public class HelloServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, res);
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();	
		String firstName=req.getParameter("fname");
		String LastName=req.getParameter("lname");
		String gender=req.getParameter("gender");
		String hobbies[]=req.getParameterValues("Hobbies");
		System.out.println(firstName);
		System.out.println(LastName);
		
		// establish a connection 
		ServletContext application=getServletContext();
		String driver=application.getInitParameter("driver");
		String url=application.getInitParameter("url");
		String username=application.getInitParameter("username");
		String password=application.getInitParameter("password");
	
				
		try {
			Class c=Class.forName(driver);
			Connection connection = DriverManager.getConnection(url,username, password);
			System.out.println("conection establish");
			Statement statement=connection.createStatement();
			//String sql="insert into employee(firstName,LastName) values("+firstName+","+LastName+","+gender+","+hobbies+")";
		//	String sql="insert into employee(firstName,LastName) values("+firstName+","+LastName+")";
			String sql="insert into employee values ('"+firstName+"','"+LastName+"','"+gender+"','"+hobbies+"')";
			int b=statement.executeUpdate(sql);
			
			System.out.println(b);
			
		}catch (Exception e) {
			System.out.println(e);
		}		
		 
		
		
		
		
		
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
