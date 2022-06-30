package com.ibm.inhertance1;

public class TestClass {
	int y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Child c=new Child();
			c.showFromChild();
			c.show();
			System.out.println(c.s);
			//c.display();
			//System.out.println(c.str);
			System.out.println(c.x);
			//System.out.println(y);
			
	}

}



//By default all the data member and member function of the parent class are access to child class if they are not private

//if we make base class private
//Illegal modifier for the class Base; only public, abstract & final are permitted 

//if base class is final
//The type Child cannot subclass the final class Base

//Whenever the parent class and the child class both r having the same data member then this concept is known as data hiding
//and priority goes to child class
//to access the parent class variable and method we use super


