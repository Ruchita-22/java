package com.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoWithSpring {

	public static void main(String[] args) {

		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Passanger passanger=ctx.getBean("p",Passanger.class);
	
		
		passanger.travel();
	}

}
