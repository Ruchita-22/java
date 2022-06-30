package com.bankapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages={"com.bankapp.*"})
@PropertySource("classpath:db.properties")
public class AppConfig {

	@Autowired
	private Environment env;
	
	private Connection con;
	
	private DataSource ds;
	@Bean
	@Scope(value = "singleton")
	public DataSource getDataSource(){
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		bds.setUrl(env.getProperty("jdbc.url"));
		bds.setUsername(env.getProperty("jdbc.username"));
		bds.setPassword(env.getProperty("jdbc.password"));
		return bds;
	}
}
