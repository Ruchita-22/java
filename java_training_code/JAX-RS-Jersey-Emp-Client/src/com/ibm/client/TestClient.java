package com.ibm.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClientConfig clientConfig=new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client=Client.create(clientConfig);
		WebResource webResource=client.resource("http://localhost:8000//rest/getemp/details?eid=123");
		

	}

}
