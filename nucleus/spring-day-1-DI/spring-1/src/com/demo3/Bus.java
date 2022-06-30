package com.demo3;

import org.springframework.stereotype.Component;

@Component(value="bus")
public class Bus implements Vehical{

	@Override
	public void move() {
		System.out.println("moving in a bus");
	}

}
