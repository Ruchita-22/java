package com.controllers;

import org.hibernate.validator.constraints.NotEmpty;

//DTO vs form bean
//validation jsr 303: hibearnate validator

public class UserUi {
	@NotEmpty
	private String name;
	@NotEmpty(message="password can not be empty")
	private String password;
	
	public UserUi(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public UserUi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
