package com.demo.lifecycle;

import org.springframework.beans.factory.BeanNameAware;

public class MyBeanNameAware implements BeanNameAware{
	@Override
	public void setBeanName(String name) {
		System.out.println("bean name is :xxxxxxxxxxxxxx"+ name);
	}

}
