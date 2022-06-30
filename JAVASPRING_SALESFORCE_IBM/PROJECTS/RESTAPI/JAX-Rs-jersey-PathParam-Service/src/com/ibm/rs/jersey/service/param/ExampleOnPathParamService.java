package com.ibm.rs.jersey.service.param;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/abc")
public class ExampleOnPathParamService {

	@GET
@Path("/param/{m1}/{n1}")
public String sayHello(@PathParam("m1") String msg,@PathParam("n1") String name) {
	
 return msg+" "+name+" ....!";
	
	
}
	
	
	
	
	
}
