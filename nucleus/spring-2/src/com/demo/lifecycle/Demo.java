package com.demo.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * ctr of foo is called...
		after property set for Foo is called.
		public void afterBeanCreated() using xml wala conf
		anotherFooVal value
		destroy of Foo is called..
		public void beforeBeanCouldDestroy()  using xml wala conf

		 */
		AbstractApplicationContext ctx=
				new ClassPathXmlApplicationContext("beans.xml");
		
		Foo foo=ctx.getBean("f", Foo.class);
		//Bar bar=ctx.getBean("b", Bar.class);
		
		System.out.println(foo.getAnotherFooVal());
		//System.out.println(bar.getAnotherbarVal());
		
	}

}
