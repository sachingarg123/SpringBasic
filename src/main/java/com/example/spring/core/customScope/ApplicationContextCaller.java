package com.example.spring.core.customScope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationContextCaller {
	
	public static void main(String[] args) {
		  ConfigurableApplicationContext applicationContext = new FileSystemXmlApplicationContext(
					"C:/Users/Sachin Garg/workspace/springSample/springSample/src/Spring.xml");
		  ExampleBean myBean = applicationContext.getBean(ExampleBean.class);
		  System.out.println(myBean.getName());
		  System.out.println("All registered Scopes are : ");
		  for(String scope : applicationContext.getBeanFactory().getRegisteredScopeNames()){
		   System.out.println(scope);
		  }
		  applicationContext.close();
		 }

}
