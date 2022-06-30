package com.ibm.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculation {

	@Test
	public void test() {
		/*Calculation c = new Calculation();
		int actualOutput=c.sum(30, 20);
		int expectedOutput=50;
		//compare expected output with actualOutput
		assertEquals(expectedOutput,actualOutput);
		*/
		
		
		
		Calculation c = new Calculation();
		int[] actualOutput=c.doit(20);
		int expectedOutput[]= {1,2,3,4,5};
		//compare expected output with actualOutput
		assertArrayEquals(expectedOutput,actualOutput);
		
		
		
		
		}

}
