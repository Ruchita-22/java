package com.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoWithSpring {

	public static void main(String[] args) {

		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("beans-2.xml");
		
		Passanger passanger=ctx.getBean("p",Passanger.class);
	
		
		passanger.travel();
	}

}
