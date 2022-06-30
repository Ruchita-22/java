package com.ibm;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 */
public class BeanInitializationLogger implements BeanPostProcessor {

  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    return bean;
  }

  public Object postProcessAfterInitialization(Object bean, String beanName)
      throws BeansException {
    
    System.out.println("Bean '" + beanName + "' initialized");
    return bean;
  }
}
