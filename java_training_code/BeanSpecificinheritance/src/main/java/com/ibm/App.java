package com.ibm;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer customer=(Customer) applicationContext.getBean("CustomerBean");
        System.out.println(customer);

    }
}
