package com.demo.doubts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bar {
	private String barVal;
	private String anotherbarVal;

	private Foo foo;
	
	public Foo getFoo() {
		return foo;
	}

	public void setFoo(Foo foo) {
		this.foo = foo;
	}

	public String getBarVal() {
		return barVal;
	}

	public void setBarVal(String barVal) {
		this.barVal = barVal;
	}

	public String getAnotherbarVal() {
		return anotherbarVal;
	}

	public void setAnotherbarVal(String anotherbarVal) {
		this.anotherbarVal = anotherbarVal;
	}


	@PostConstruct
	public void afterBeanCreatedUsingAnnotation(){
		System.out.println("afterBeanCreatedUsingAnnotation for bar is called..");
	}
	@PreDestroy
	public void beforeDestroyUsingAnnotation(){
		System.out.println("beforeDestroyUsingAnnotation for bar is called..");
	}
}
