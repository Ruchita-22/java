package com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int customerId;

	private int customerRegistrationNumber;

	@Column(name="customerName")
	private String customerName1;
	private String customerAddess;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName1() {
		return customerName1;
	}

	public void setCustomerName1(String customerName1) {
		this.customerName1 = customerName1;
	}

	public String getCustomerAddess() {
		return customerAddess;
	}

	public void setCustomerAddess(String customerAddess) {
		this.customerAddess = customerAddess;
	}

	public Customer(int customerRegistrationNumber,
			String customerName1, String customerAddess) {
		super();
		this.customerRegistrationNumber = customerRegistrationNumber;
		this.customerName1 = customerName1;
		this.customerAddess = customerAddess;
	}

	public int getCustomerRegistrationNumber() {
		return customerRegistrationNumber;
	}

	public void setCustomerRegistrationNumber(int customerRegistrationNumber) {
		this.customerRegistrationNumber = customerRegistrationNumber;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId
				+ ", customerRegistrationNumber=" + customerRegistrationNumber
				+ ", customerName1=" + customerName1 + ", customerAddess="
				+ customerAddess + "]";
	}

	
}