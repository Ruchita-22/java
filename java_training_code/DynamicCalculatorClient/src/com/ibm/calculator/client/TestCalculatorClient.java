package com.ibm.calculator.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TestCalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client=new Client();
		WebResource resource=client.resource("http://localhost:8082/DynamicCalculatorService/rest/hello/sum?num1=3&num2=9");
		Integer res=resource.get(Integer.class);
		System.out.println(res);

	}

}
