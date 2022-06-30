package com.ibm.rs.jsersey.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/cal")
public class CalculationService {

	@GET
	@Path("/service")
	
	public void calculate(@QueryParam("num1") int a,@QueryParam("num2") int b) {
		
    
		int c=a+b;
		
		System.err.println("sum of two numbers is :"+ c);
		
      
	}
	
	
	
	
	
	
	
}
