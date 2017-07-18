package com.example.spring.core.configuration;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldExampleWithComponent {
	
private String message;
	
	public void setMessage(String message){
		this.message=message;
	}
	
	public void getMessage(){
		System.out.println("Your Message"+ message);
	}

}
