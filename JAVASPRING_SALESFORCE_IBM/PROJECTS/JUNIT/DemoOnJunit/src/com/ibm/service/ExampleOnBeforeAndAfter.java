package com.ibm.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExampleOnBeforeAndAfter {

	@BeforeClass
	public static void methodBeforeClass() {
		
		System.out.println("/jdbc code to create connection..preparedstatement object"
				  +"we are in beforeclass testcase");
		
	}
	
	@Before
	public void methodBefore() {
		
		System.out.println("we are in method before method-----before testcase!");
		
	}
	
	@Test
	public void methodOne() {
			
		System.out.println("we are in test case method of methodOne1 ");
		
	}
	
	@Test
	public void methodTwo() {
		
		System.out.println("we are in test case method of methodTwo2");
		
	}
	
	@After
	public void methodAfter() {
		
		System.out.println("we are in methodafter .....! after testcase");
	}
	
	@AfterClass
	public  static  void methodAfterClass() {
		
		System.out.println("to close  the connection ,prepared statment.."
				+ " filestream object");
		
		
	}
	
	
   
}
