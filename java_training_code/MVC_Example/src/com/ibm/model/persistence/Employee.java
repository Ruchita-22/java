package com.ibm.model.persistence;

public class Employee {
	String firstname;
	String lastname;
	String fatherName;
	String motherName;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String firstname, String lastname, String fatherName, String motherName) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	@Override
	public String toString() {
		return "Employeee [firstname=" + firstname + ", lastname=" + lastname + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + "]";
	}
	
	
	

}
