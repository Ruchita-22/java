package com.ibm;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 */
public class PostProcessorTest {

  public void testBeanPostProcessorForAppContext() throws Exception {

    ApplicationContext ctx = new ClassPathXmlApplicationContext(
        "applicationContext.xml");


  }
  public static void main(String[] s)
  {
	  PostProcessorTest p = new PostProcessorTest();
	  
	  try {
		p.testBeanPostProcessorForAppContext();
	
	 	  
	  } catch (Exception e) {
		
			e.printStackTrace();
		}
  }
  
  
}
