package com.ibm.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExampleOnBeforeAndAfter {
	
	@BeforeClass
	public void methodBeforeClass() {
		System.out.println("agb");
	}
	
	@Before
	public void methodBefore()
	{
		System.out.println("we are in the test case before method");	
	}

	@Test
	public void methodOne() 
	{
System.out.println("we are in the test case method of method1");	
}


	@Test
	public void methodTwo()
	{
		System.out.println("we are in the test case method of method2");
	}

	@After
public void methodAfter()
{
	System.out.println("we are in the methodafter ");
}
	
	@AfterClass
	public void methodAfterClass() {
		System.out.println("to close the connection , prepare statement..."+"filestream object");
		
	}
	
	//@AfterClass ----it is only used with static method
	
}

