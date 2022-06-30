package com.ibm.calculator.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class CalculatorService {
	@GET
	@Path("/sum")
	public int sum(@QueryParam("num1")int a,@QueryParam("num2")int b) {
		int result=a+b;
		return result;
	}

}
//