package com.ibm.client;

import com.ibm.model.Employee;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class TesClient1 {

	public static void main(String[] args) {


		 ClientConfig config = new DefaultClientConfig();
		 config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
		 
		 Client c  = Client.create(config);
		 
		 
     WebResource resource = c.resource("http://localhost:8000/JAX-RS-Jersey-EMp-produces-service/rest/getEmp/Details?eid=1001");
		 
		 
	Employee e =resource.accept("application/json").get(Employee.class);
	
	System.out.println("Employeee Details");
	System.out.println(e.getEno());
	System.out.println(e.getEname());
	System.out.println(e.getSal());
	
	
	
	
		
		
		

	}

}
