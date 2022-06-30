package com.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoWithSpring {

	public static void main(String[] args) {

		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig2.class);
		
		Passanger passanger=ctx.getBean("getPassanger",Passanger.class);
		passanger.travel();
		//passanger.travel();
	}

}
