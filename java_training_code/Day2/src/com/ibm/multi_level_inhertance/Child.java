package com.ibm.multi_level_inhertance;

public class Child extends Base {
	int x=5;
	public void showFromChild() {
		System.out.println("show from child class");
		
	}
	public void display() {
		System.out.println("display of base class");
		super.display();
	}

}
