package com.ibm.rs.jersey.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TestClientSayHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client=new Client();
		WebResource resource=client.resource("http://localhost:8082/WebServiceExample/rest/welcome/service");
		String res=resource.get(String.class);
		System.out.println(res);
		
		

	}

}
