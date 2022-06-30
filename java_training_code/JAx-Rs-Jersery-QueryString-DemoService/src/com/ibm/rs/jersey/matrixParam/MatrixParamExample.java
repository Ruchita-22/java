package com.ibm.rs.jersey.matrixParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/query")
public class MatrixParamExample {
	@GET
	@Path("/matrixparam")
	public String  sayHello(@QueryParam ("m1")String msg,@QueryParam("n1")String name) {
		return msg+" : "+name;
		
	}
}
//http://localhost:8082/JAx-Rs-Jersery-QueryString-DemoService/rest/query/matrixparam;m1=hello;n1=ruchita
