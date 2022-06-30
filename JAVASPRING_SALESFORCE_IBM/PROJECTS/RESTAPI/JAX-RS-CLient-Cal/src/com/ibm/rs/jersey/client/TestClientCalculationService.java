package com.ibm.rs.jersey.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TestClientCalculationService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Client c = new Client();
	
	WebResource res = c.resource("http://localhost:8000/JAX-RS-Service-Cal/rest/cal/service"
			+ "?num1=30&num2=30");
	
	Integer result =(Integer) res.get(Integer.class);
	
	System.out.println("Sum of two number is "+result);
	
		
		
		
		
	}

}
