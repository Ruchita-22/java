package com.nu.customerapp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.nu.customerapp.model.persistance.ConnectionFactory;
import com.nu.customerapp.model.persistance.Employee;
import com.nu.customerapp.model.persistance.EmployeeDao;
import com.nu.customerapp.model.persistance.EmployeeDaoImp;
import com.nu.customerapp.model.persistance.EmployeeDaoUsingHibernate;
import com.nu.customerapp.model.persistance.exceptions.DaoException;

public class Main {

	public static void main(String[] args) {

		//Spring
		Connection connection = ConnectionFactory.getConnection();

		//we dnot need hard worker => we need lazy people : bill gate
		
		//Design as per interface
		
		EmployeeDao dao = new EmployeeDaoUsingHibernate();

		List<Employee> employees = dao.getAllEmployee();

		for (Employee employee : employees)
			System.out.println(employee);

		// add a new record
		Employee employee = new Employee(3334, "rajesh", 5555);
		 try {
			 
			dao.addEmployee(employee);
			
		} catch (DaoException e) {
			e.printStackTrace();
		}

		/*employee.setEmployeeName("rajesh kumar");
		// update
		// dao.updateEmployee(employee);
		dao.deleteEmployee(employee.getEmployeeId());*/
	}

}


















