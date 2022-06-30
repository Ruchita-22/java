package com.ibm.rs.jersey.param;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/form")
public class ExampleOnFormParamService {
	@POST
	@Path("/param")
	
	public String empDetails(@FormParam("eno") String eno, @FormParam("ename") String ename, @FormParam("esal") String esal) {
		return "ENO:"+eno+" "+"EName:"+ename+" "+"ESal:"+esal;
		
	}
}
