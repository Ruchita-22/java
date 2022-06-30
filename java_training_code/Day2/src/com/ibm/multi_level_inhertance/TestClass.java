package com.ibm.multi_level_inhertance;

public class TestClass {
	int y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Child1 c=new Child1();
			c.showFromChild1();
			c.showFromChild();
			c.show();
			c.display();
			//(Base).c.display();
			
			
			
			System.out.println(c.str);
			System.out.println(c.x);
			//System.out.println(y);
			
	}

}
