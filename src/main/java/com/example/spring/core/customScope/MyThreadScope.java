package com.example.spring.core.customScope;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class MyThreadScope implements Scope {
	
	private final ThreadLocal<Object> myThreadScope = new ThreadLocal<Object>() {
		  protected Map<String, Object> initialValue() {
		   System.out.println("initialize ThreadLocal");
		   return new HashMap<String, Object>();
		  }
		 };

	public Object get(String name, ObjectFactory<?> objectFactory) {
		Map<String, Object> scope = (Map<String, Object>) myThreadScope.get();
		  System.out.println("getting object from scope.");
		  Object object = scope.get(name);
		  if(object == null) {
		   object = objectFactory.getObject();
		   scope.put(name, object);
		  }
		  return object;
	}

	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void registerDestructionCallback(String arg0, Runnable arg1) {
		// TODO Auto-generated method stub

	}

	public Object remove(String name) {
		System.out.println("removing object from scope.");
		  @SuppressWarnings("unchecked")
		  Map<String, Object> scope = (Map<String, Object>) myThreadScope.get();
		  return scope.remove(name);
	}

	public Object resolveContextualObject(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
