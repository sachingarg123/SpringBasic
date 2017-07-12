package com.example.spring.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
	
	@Bean
	public HelloWorldExample helloWorld(){
		return new HelloWorldExample();
	}

}
