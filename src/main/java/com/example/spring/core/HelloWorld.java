package com.example.spring.core;


import java.awt.List;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class HelloWorld {

	private String message;
	private String message1;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void setMessage1(String message) {
		this.message1 = message;
	}

	public void getMessage1() {
		System.out.println("Your Message : " + message1);
	}

	@PostConstruct
	public void init() {
		System.out.println("bean is initialized");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("bean will destroy now");
	}

}
