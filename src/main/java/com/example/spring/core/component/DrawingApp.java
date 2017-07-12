package com.example.spring.core.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/sachin/workspace/springSample/src/Spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		System.out.println(context.getMessage("greeting", null, "Default Greeting", null));
		Circle circle = (Circle)context.getBean("circle");
		circle.draw();
	}

}
