package com.demo.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;

public class MyApplicationContextAware implements ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		//
		System.out.println("MyApplicationContextAware... called");
		if(context instanceof AbstractApplicationContext){
			((AbstractApplicationContext) context).registerShutdownHook();
		}
	}

}
