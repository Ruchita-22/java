package com.ibm.rs.jersey.employeeservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.ibm.model.Employee;
import com.ibm.utils.DBUtils;

@Path("/getEmp")
public class EmployeeDetailService {
      
	int eno;
	String ename;
	int sal;
	 
	Employee e = new Employee();
		
	@GET
	@Produces("application/json")
	@Path("/Details")
	public Employee getEmpDetails(@QueryParam("eid") int eid ) {
		
		
		Connection con = DBUtils.getConnect();
		
	 try {
	PreparedStatement pstmt =  con.prepareStatement("select * from emp where eno=?");
	
	pstmt.setInt(1,eid);
	
	ResultSet rs = pstmt.executeQuery();
	 
	if(rs.next()) {
		
	   eno= rs.getInt(1);
	   ename=rs.getString(2);
	   sal= rs.getInt(3);
		
	   e.setEno(eno);
	   e.setEname(ename);
	   e.setSal(sal);
	   
		
	}	 
	 
	 
	 } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		return e;
		
	}
	
	
	
	
	
	
	@POST
	@Path("/storeEmpRecord")
	@Consumes("application/json")

	public Response createEmployeeObject(Employee e) {
		
	   int eno = e.getEno();
	   String ename = e.getEname();
	   int sal = e.getSal();
	   int record=0;
	   Response res;
	   
	   Connection con = DBUtils.getConnect();
	PreparedStatement pstmt;
	try {
		pstmt = con.prepareStatement("insert into emp values(?,?,?) ");
		pstmt.setInt(1,eno);
		pstmt.setString(2,ename);
		pstmt.setInt(3,sal);
		
		record = pstmt.executeUpdate();
		
		
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		if(record>0) {
			
		 res = Response.status(200).entity("Record is inserted ..!").build();
			
			
		}else {
			
			
	     res= Response.status(201).entity("Rcord inserted is failed").build();
	     
	    	
		}
		
		
		return res;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
