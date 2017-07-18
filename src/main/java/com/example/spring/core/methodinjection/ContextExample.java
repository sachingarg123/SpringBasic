package com.example.spring.core.methodinjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ContextExample {
	
	 public static void main(String[] args) {
		  ConfigurableApplicationContext context = new FileSystemXmlApplicationContext(
					"C:/Users/Sachin Garg/workspace/springSample/springSample/src/Spring.xml");
		  TokenMachine machine = context.getBean(TokenMachine.class);
		  machine.findToken();
		  machine = context.getBean(TokenMachine.class);
		  machine.findToken();
		  context.close();
		 }

}
