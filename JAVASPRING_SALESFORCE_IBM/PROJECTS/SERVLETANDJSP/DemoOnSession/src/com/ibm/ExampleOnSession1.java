package com.ibm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ExampleOnSession1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       response.setContentType("text/html");
		
		String uname = request.getParameter("un");
       String password = request.getParameter("pwd");
       
       HttpSession session = request.getSession(true);
         
       System.out.println(session.getId());
         
         session.setAttribute("username",uname);
         
         PrintWriter out = response.getWriter();
         
         //out.println("we are in HttpSesion1 Example");*/
         
    /* RequestDispatcher rd  = request.getRequestDispatcher("es2"); 
     rd.include(request,response);
       */
         
         ServletContext  application = getServletContext();
         
         Integer totaluser =(Integer)application.getAttribute("total");
         Integer currentuser =(Integer)application.getAttribute("current");
         
         
         out.println("Totaluser Logged In :"+totaluser+"<br>");
         out.println("CurrentUser Logged IN :"+currentuser);
         
         
         out.println("<a href='es2'>Click Here to Logout</a>");
         
    		
		
	}

}
