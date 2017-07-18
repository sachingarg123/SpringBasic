package com.example.spring.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/*@ComponentScan("com.example.spring.core.configuration")*/
public class HelloWorldConfig {
	
	@Bean
	public HelloWorldExampleWithComponent helloWorldComponent(){
		return new HelloWorldExampleWithComponent();
	}
	
	@Bean
	public HelloWorldExample helloWorld(HelloWorldExampleWithComponent helloWorldComponent){
		HelloWorldExample hello = new HelloWorldExample();
		hello.setHelloWorldComponent(helloWorldComponent());
		return hello;
	}

}
