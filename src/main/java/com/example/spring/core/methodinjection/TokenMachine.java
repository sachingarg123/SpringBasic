package com.example.spring.core.methodinjection;

public abstract class TokenMachine {
	
	public void findToken(){
		  System.out.println("Token has been generated "+generateToken());
		 }
		 public abstract Token generateToken();

}
