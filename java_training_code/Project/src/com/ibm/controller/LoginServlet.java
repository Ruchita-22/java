package com.ibm.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection conn;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		
		// establish a connection 
				ServletContext application=getServletContext();
				String driver=application.getInitParameter("driver");
				String url=application.getInitParameter("url");
				String username=application.getInitParameter("username");
				String password=application.getInitParameter("password");
				
			
		try {
			
			Class c = Class.forName(driver);
			conn=DriverManager.getConnection(url,username,password);
			System.out.println("connection establish");
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}



	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s=request.getParameter("btn");
		System.out.println(s);
		if(s.equals("LOGIN")) {
			System.out.println("enter into login");
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			Boolean b=false;
			try {
				Statement statement=conn.createStatement();
				String sql="select * from authorization where username = '"+username+"' and password = '"+password+"'"; 
				b=statement.execute(sql);
				System.out.println(b);
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(b==true) {
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("welcome.html");
				requestDispatcher.include(request, response);
			}
			
			
		}
		else if(s.equals("SignUp")){
			System.out.println("Signup");
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("signUp.html");
			requestDispatcher.include(request, response);
			
		}
		
		
	}

}
