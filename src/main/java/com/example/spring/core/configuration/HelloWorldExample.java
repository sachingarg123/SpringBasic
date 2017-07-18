package com.example.spring.core.configuration;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldExample {
	
	private String message;
	private HelloWorldExampleWithComponent helloWorldComponent;
	
	public void setMessage(String message){
		this.message=message;
	}
	
	public void getMessage(){
		System.out.println("Your Message"+ message);
	}

	public HelloWorldExampleWithComponent getHelloWorldComponent() {
		System.out.println("inside setHelloWorldComponent");
		return helloWorldComponent;
	}

	public void setHelloWorldComponent(HelloWorldExampleWithComponent helloWorldComponent) {
		this.helloWorldComponent = helloWorldComponent;
		System.out.println("inside setHelloWorldComponent");
	}

}
