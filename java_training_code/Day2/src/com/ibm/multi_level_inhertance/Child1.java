package com.ibm.multi_level_inhertance;

public class Child1 extends Child{
	int t=23;
	public void showFromChild1() {
		System.out.println("show from child1");
	}
	public void display() {
		
		System.out.println("display of base class1");
		super.display();
	}

}
