package com.demo.doubts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
	
		AbstractApplicationContext ctx=
				new ClassPathXmlApplicationContext("doubts.xml");
		
		ctx.registerShutdownHook();
		/*
		 * ctr of foo is called...
		afterBeanCreatedUsingAnnotation of foo is called..
		afterBeanCreatedUsingAnnotation for bar is called..
		anotherFooVal value
		beforeDestroyUsingAnnotation for bar is called..
		beforeDestroyUsingAnnotation of foo is called..

		 */
		Foo foo=ctx.getBean("f", Foo.class);
		Bar bar=ctx.getBean("b", Bar.class);
		
		System.out.println(foo.getAnotherFooVal());
		//System.out.println(bar.getAnotherbarVal());
		
	}

}
