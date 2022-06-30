package com.ibm.arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("Ruchita");
		al.add("shubham");
		al.add("akashy");
		al.add("proxi");
		System.out.println(al);
		System.out.println(al.contains("shubham"));
		System.out.println(al.remove(1));
		System.out.println(al);
		System.out.println(al.indexOf("akashy"));

	}

}
