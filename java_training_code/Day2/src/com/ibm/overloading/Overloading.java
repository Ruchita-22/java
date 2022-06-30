package com.ibm.overloading;

public class Overloading {
	
	public int add(int x,int y) {
		int sum=x+y;
		return sum;
	}
	public int add(int x,int y,int z) {
		int sum=x+y+z;
		return sum;
		
	}
	public String add(String s1,String s2) {
		String str=s1+" "+s2;
		return str;
	}
}
