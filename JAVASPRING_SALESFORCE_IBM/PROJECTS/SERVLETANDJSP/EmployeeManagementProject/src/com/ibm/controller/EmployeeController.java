package com.ibm.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.dao.EmployeeDao;
import com.ibm.model.Employee;


public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
      //get the form values 
		
	String fname = 	request.getParameter("fn");
	String lname = 	request.getParameter("ln");
	String fthname = 	request.getParameter("fn1");
	String mthname = 	request.getParameter("mn");
	
		
	//create a object for javabeans and store form values inside settter methods
	
	Employee e = new Employee();
	
	e.setFname(fname);
	e.setLname(lname);
	e.setFthname(fthname);
	e.setMthname(mthname);
	
	
	//create a object for Dao class and call save method .
	
	EmployeeDao edao = new EmployeeDao();
	
	try {
		
		edao.save(e);
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
		
		
		
	}

}
