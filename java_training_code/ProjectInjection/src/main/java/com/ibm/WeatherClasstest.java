package com.ibm;

import java.util.GregorianCalendar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WeatherClasstest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		WeatherService ws =(WeatherService) ctx.getBean("weatherService");
		Double high = ws.getHistoricalHigh(new GregorianCalendar(2004, 0, 1).getTime());
		System.out.println("High was:"+high);  
		System.out.println("hello");
		
	}

}
