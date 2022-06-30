package com.demo.composite;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class CustomerKey implements Serializable{
	private static final long serialVersionUID = -4336329019606358832L;
	private int customerId;
	private String customerRegistrationId;
	
	
	public CustomerKey(int customerId, String customerRegistrationId) {
		this.customerId = customerId;
		this.customerRegistrationId = customerRegistrationId;
	}

	//must
	//public CustomerKey() {}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerRegistrationId() {
		return customerRegistrationId;
	}

	public void setCustomerRegistrationId(String customerRegistrationId) {
		this.customerRegistrationId = customerRegistrationId;
	}
	
	
	
}