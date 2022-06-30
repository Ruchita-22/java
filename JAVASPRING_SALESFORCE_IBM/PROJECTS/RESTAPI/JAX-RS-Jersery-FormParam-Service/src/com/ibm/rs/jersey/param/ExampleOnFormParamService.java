package com.ibm.rs.jersey.param;


import javax.ws.rs.FormParam;

import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/form")

public class ExampleOnFormParamService {

	@POST
	@Path("/param") 
	public String empDetails(@FormParam("eno") String eno,
			                @FormParam("ena") String ename,
			                @FormParam("esal") String esal) {
		
		return "ENO :"+eno+" "+"ENmame: "+ename+" "+"Esal "+esal;
		
		
		
	}
	
	
	
	
	
}
