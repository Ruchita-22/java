package com.ibm.re.jersey.employee.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.ibm.model.Employee;
import com.ibm.utils.DbUtils;







@Path("/getemp")
public class EmployeeDetailService {
	
	int eno;
	String ename;
	int sal;
	Employee employee= new Employee();
	@GET
	@Produces("application/json")
	@Path("/details")
	public Employee getEmployeeDetails(@QueryParam("eid") int eid) {
		
		Connection connection=DbUtils.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("select * from emp1 where eno=?");
			preparedStatement.setInt(0, eid);
			ResultSet rs=preparedStatement.executeQuery();
			if(rs.next()) {
				eno=rs.getInt(1);
				ename=rs.getString(2);
				sal=rs.getInt(3);
				employee.setEno(eno);	
				employee.setEname(ename);
				employee.setSal(sal);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
		
	}

}
//Ctrl+shift+o
