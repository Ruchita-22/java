package com.ibm.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculation {

	@Test //mandatory
	public void test() {
	
		
		Calculation c  = new Calculation();
		int actualOutput = c.sum(30, 20);
		
		int expectedOutput = 50;
		
		//compare expected out put with actual output using assert methods.
		
		assertEquals(expectedOutput, actualOutput);
		
		
		
	}

}
