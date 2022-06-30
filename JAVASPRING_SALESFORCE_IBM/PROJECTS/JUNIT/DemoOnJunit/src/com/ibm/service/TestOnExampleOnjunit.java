package com.ibm.service;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestOnExampleOnjunit {

	@Test
	public void test() {
		
		ExampleOnJunit e = new ExampleOnJunit();
		
	int actualOutput[]= e.methodOne();
	int expectedOutput[] = {1,2,3,4,5};

	
	Assert.assertArrayEquals(expectedOutput,actualOutput);
	
	
	
		
	}

}
