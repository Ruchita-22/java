package com.demo2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="car")
@Qualifier(value="car")
public class Car implements Vehical{
	@Override
	public void move() {
		System.out.println("moving in a car");
	}

	
}
