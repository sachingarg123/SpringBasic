package com.example.spring.core.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfiguration {
	
	public static void main(String arg[]){
		ApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		   
		HelloWorldExample helloWorld = ctx.getBean(HelloWorldExample.class);
		      helloWorld.setMessage("Hello World!");
		      helloWorld.getMessage();
	}

}
