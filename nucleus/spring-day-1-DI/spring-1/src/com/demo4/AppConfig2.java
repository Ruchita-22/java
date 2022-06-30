package com.demo4;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.demo4")
public class AppConfig2 {

	@Bean(autowire=Autowire.BY_NAME)
	public Passanger getPassanger(){
		Passanger passanger=new Passanger();
		passanger.setName("raja");
		//passanger.setVehical( getVehical());
		return passanger;
	}
	
	@Bean(autowire=Autowire.BY_TYPE)
	public Vehical vehical(){
		Vehical vehical=new Car();
		return vehical;
	}
}
