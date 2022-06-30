package com.demo.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
// bad to use InitializingBean?
public class Foo implements InitializingBean,DisposableBean, BeanNameAware{
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

	// EJB session bean(app server) vs Spring bean (by default no power of app
	// server)

	// life cycle method => ejb => must not return anything must not acc any arg

	public void afterBeanCreated() {
		System.out
				.println("public void afterBeanCreated() using xml wala conf");
	}

	public void beforeBeanCouldDestroy() {
		System.out
				.println("public void beforeBeanCouldDestroy()  using xml wala conf");
	}

	public void afterBeanCreatedForFooOnly() {
		System.out
				.println("public void afterBeanCreatedForFooOnly() using xml wala conf");
	}

	public void beforeBeanCouldDestroyForFooOnly() {
		System.out
				.println("public void beforeBeanCouldDestroyForFooOnly()  using xml wala conf");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after property set for Foo is called.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy of Foo is called..");
	}
	@PostConstruct
	public void afterBeanCreatedUsingAnnotation(){
		System.out.println("beforeDestroyUsingAnnotation is called..");
	}
	@PreDestroy
	public void beforeDestroyUsingAnnotation(){
		System.out.println("beforeDestroyUsingAnnotation is called..");
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("bean name is:"+ arg0);
	}
}

