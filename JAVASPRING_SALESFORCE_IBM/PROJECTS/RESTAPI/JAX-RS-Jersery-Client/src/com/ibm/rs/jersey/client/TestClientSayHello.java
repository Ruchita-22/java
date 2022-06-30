package com.ibm.rs.jersey.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TestClientSayHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Client   c = new Client();
		
  WebResource resource1= c.resource("http://localhost:8000/DemoOnRestFULWSUsing"
  		+ "JerseryIMP"
  		+ "/rest/welcome/service");
		
      //based on  return type and based on http method
  
      String res  =    resource1.get(String.class);
		
		
		System.out.println(res);
		

	}

}
