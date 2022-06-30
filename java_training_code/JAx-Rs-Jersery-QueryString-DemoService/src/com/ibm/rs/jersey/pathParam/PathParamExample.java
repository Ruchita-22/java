package com.ibm.rs.jersey.pathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/query")
public class PathParamExample {

	@GET
	@Path("/pathparam/{m1}/{n1}")
	public String  sayHello(@PathParam ("m1")String msg,@PathParam("n1")String name) {
		return msg+" : "+name;
		
	}
	
}

//http://localhost:8082/JAx-Rs-Jersery-QueryString-DemoService/rest/query/pathparam/hello/ruchita