package com.demo.moreannotations;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// project lombok => to auto generate getter setter ctr tostring eq hashcode without dis programmer!
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name="customer_entity")//HQL
@Table(name="customer_table")
public class Customer {
	@Id
	@Column(name="customer_Id")
	private int customerId;
	
	@Column(name="customer_Name")
	private String customerName;
	
	@Column(name="customer_Addess")
	private String customerAddess;
	
	@Temporal(TemporalType.DATE)
	private Date joinedDate;  //java.util
	private String address;
	private String description;
	@Transient
	private String impData;
	
	
	
	
	
	public Customer( String customerName, String customerAddess,
			Date joinedDate, String address, String description, String impData) {
		super();
		
		this.customerName = customerName;
		this.customerAddess = customerAddess;
		this.joinedDate = joinedDate;
		this.address = address;
		this.description = description;
		this.impData = impData;
	}

	public String getImpData() {
		return impData;
	}

	public void setImpData(String impData) {
		this.impData = impData;
	}

	
	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerAddess() {
		return customerAddess;
	}

	public void setCustomerAddess(String customerAddess) {
		this.customerAddess = customerAddess;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customerAddess == null) ? 0 : customerAddess.hashCode());
		result = prime * result
				+ ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerAddess == null) {
			if (other.customerAddess != null)
				return false;
		} else if (!customerAddess.equals(other.customerAddess))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}

	public Customer(String customerName, String customerAddess) {
		super();
		this.customerName = customerName;
		this.customerAddess = customerAddess;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName="
				+ customerName + ", customerAddess=" + customerAddess + "]";
	}

}