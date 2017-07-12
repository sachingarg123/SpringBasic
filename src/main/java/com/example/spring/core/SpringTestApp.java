package com.example.spring.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.spring.core.aop.Student;
import com.example.spring.core.autowire.Profile;
import com.example.spring.core.di.TextEditor;
import com.example.spring.core.event.CustomEventPublisher;
import com.example.spring.core.event.SampleClass;

public class SpringTestApp {

	public static void main(String[] args) {
		// ClassPathXmlApplicationContext is load all beans in the application
		AbstractApplicationContext context = new FileSystemXmlApplicationContext(
				"C:/Users/sachin/workspace/springSample/src/Spring.xml");
		// this step is used to get required bean using getBean() method of the
		// created context
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.getMessage();
		helloWorld.setMessage("I m Singleton");

		HelloWorld helloWorld1 = (HelloWorld) context.getBean("helloWorld");
		helloWorld1.getMessage();
		helloWorld1.getMessage1();
		context.registerShutdownHook();

		// Constructer Injection

		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		textEditor.spellCheck();

		DataSource dataSource = (DataSource) context.getBean("dataSource");
		System.out.println("DataSource driver name is" + dataSource.getDriverClassName());

		Profile profile = (Profile) context.getBean("profile");
		profile.printAge();
		profile.printName();

		context.start();
		SampleClass sampleClass = (SampleClass) context.getBean("sampleclass");
		sampleClass.getMessage();
		/* context.stop(); */

		// To run custom event
		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");

		cvp.publish();

		// AOP
		
		
		      
		      
		      Student student = (Student) context.getBean("student");
		      student.getName();
		      student.getAge();
		      student.printThrowException();
		   

	}

}
