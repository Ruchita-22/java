package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoWithSpring {

	public static void main(String[] args) {

		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("beans.xml");
		
		Passanger passanger=ctx.getBean("p",Passanger.class);
		//passanger.travel();
	}

}
