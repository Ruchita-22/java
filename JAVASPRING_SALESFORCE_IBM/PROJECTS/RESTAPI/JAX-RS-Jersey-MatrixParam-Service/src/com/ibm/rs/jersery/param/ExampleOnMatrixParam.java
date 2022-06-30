package com.ibm.rs.jersery.param;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("/matrix")
public class ExampleOnMatrixParam {

	@GET
	@Path("/param")
	public String sayHello(@MatrixParam("m1") String msg,@MatrixParam("n1") String name) {
		
		return msg+" "+name+" ....!";
		
		
	}
	
	
	
	
}
