package com.ibm.model;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class TestClientForCreateEMployee {

	
	public static void main(String[] args) {
		
		
		ClientConfig cc = new DefaultClientConfig();
		cc.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
		
		Client c = Client.create(cc);
		
		
		WebResource resource1 = c.resource("http://localhost:8000/"
				+ "JAX-RS-Jersey-EMp-produces-service/rest/getEmp/storeEmpRecord");
		
		Employee e = new Employee();
		e.setEno(1006);
		e.setEname("samba");
		e.setSal(40000);
		
		ClientResponse res = resource1.type("application/json").
				                         post(ClientResponse.class,e);
	     int s = res.getStatus();
	     
	     String s1  = res.getEntity(String.class);
	     
	     System.out.println(s +" "+s1);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
