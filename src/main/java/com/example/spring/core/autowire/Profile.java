package com.example.spring.core.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	
	@Autowired
	@Qualifier("student1")
	private Student student;
	
	public Profile(){
		System.out.println("Inside Contructer");
	}
	
	public void printName(){
		System.out.println("Student Name is"+student.getName());
	}
	
	public void printAge(){
		System.out.println("Student Age is"+student.getAge());
	}

}
