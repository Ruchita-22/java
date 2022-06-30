package com.ibm.rs.jersey.param;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/query")
public class ExampleOnQueryparamService {
	
	@GET
	@Path("/param")
	public String  sayHello(@QueryParam ("m1")String msg,@QueryParam("n1")String name) {
		return msg+" : "+name;
		
	}
}

//http://localhost:8082/JAx-Rs-Jersery-QueryString-DemoService/rest/query/param?m1=hello&n1=ruchita