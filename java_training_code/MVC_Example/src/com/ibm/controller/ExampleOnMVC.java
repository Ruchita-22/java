package com.ibm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.dao.EmployeeDao;
import com.ibm.model.persistence.Employee;

public class ExampleOnMVC extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String fatherName=request.getParameter("fatherName");
		String motherName=request.getParameter("motherName");
		
		Employee employee=new Employee();
		employee.setFirstname(firstname);
		employee.setLastname(lastname);
		employee.setFatherName(fatherName);
		employee.setMotherName(motherName);
		System.out.println(employee);
		EmployeeDao employeeDao=new EmployeeDao();
		employeeDao.save(employee);
		System.out.println("operation completed");
		
		
		
		
		
		
		
		
		
	}
}
