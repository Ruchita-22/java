package com.ibm.rs.jersey.param;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/query")
public class ExampleOnQueryParamService {

	
	
	@GET
	@Path("/param")
	public String sayHello(@QueryParam("m1") String msg,@QueryParam("n1") String name){
		
		
		return msg+"   "+name+"....!";
		
		
	}
	
	
	
	
	
	
	
	
}
