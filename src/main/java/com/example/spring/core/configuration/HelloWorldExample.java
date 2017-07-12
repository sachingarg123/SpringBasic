package com.example.spring.core.configuration;

public class HelloWorldExample {
	
	private String message;
	
	public void setMessage(String message){
		this.message=message;
	}
	
	public void getMessage(){
		System.out.println("Your Message"+ message);
	}

}
