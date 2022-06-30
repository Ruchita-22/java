package com.demo;

public class Passanger {
	private String name;
	private Vehical vehical;
	
	public Passanger() {}

	public Passanger(String name, Vehical vehical) {
		this.name = name;
		this.vehical = vehical;
	}

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
