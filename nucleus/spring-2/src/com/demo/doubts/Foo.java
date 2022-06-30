package com.demo.doubts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
// bad to use InitializingBean?
public class Foo {
	private String fooVal;
	private String anotherFooVal;

	public String getFooVal() {
		return fooVal;
	}

	public Foo(){
		System.out.println("ctr of foo is called...");
	}
	public void setFooVal(String fooVal) {
		this.fooVal = fooVal;
	}

	public String getAnotherFooVal() {
		return anotherFooVal;
	}

	public void setAnotherFooVal(String anotherFooVal) {
		this.anotherFooVal = anotherFooVal;
	}

	
	@PostConstruct
	public void afterBeanCreatedUsingAnnotation(){
		System.out.println("afterBeanCreatedUsingAnnotation of foo is called..");
	}
	@PreDestroy
	public void beforeDestroyUsingAnnotation(){
		System.out.println("beforeDestroyUsingAnnotation of foo is called..");
	}

}

