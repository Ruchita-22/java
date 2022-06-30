package com.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="p")//<bean id="p" class="com.demo.Passanger">
public class Passanger {
	
	@Value(value="raja")//<property name="name" value="raja"/>
	private String name;
	
	@Autowired
	@Qualifier(value="car")
	private Vehical vehical;

	public String getName() {
		return name;
	}

	public Vehical getVehical() {
		return vehical;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void travel() {
		System.out.println("passager: " + name);
		vehical.move();
	}
}
