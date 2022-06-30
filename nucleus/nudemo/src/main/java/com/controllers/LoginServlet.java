package com.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//head first servlet jsp=> stuts 1
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		UserUi userUi=new UserUi(name, password);
		if(!name.equals("raj")){
			request.setAttribute("userUi", userUi);
			request.setAttribute("loggingMsg", "login failed");
		}
			
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
		
	}

}














