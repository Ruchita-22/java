package com.ibm.rs.jersery;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/welcome")
public class Welcome {
	@GET
	@Path("/service")
	public String sayHello() {
		return "Welcome to Restful webservice";
		
		
	}
}
