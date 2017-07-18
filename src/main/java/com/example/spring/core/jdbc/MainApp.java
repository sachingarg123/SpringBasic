package com.example.spring.core.jdbc;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext(
				"C:/Users/Sachin Garg/workspace/springSample/springSample/src/Spring.xml");

	      StudentJDBCTemplate studentJDBCTemplate = 
	         (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
	      
/*	      System.out.println("------Records Creation--------" );
	      studentJDBCTemplate.create("Zara", 11);
	      studentJDBCTemplate.create("Nuha", 2);
	      studentJDBCTemplate.create("Ayan", 15);

	      System.out.println("------Listing Multiple Records--------" );
	      List<Student> students = studentJDBCTemplate.listStudents();
	      
	      for (Student record : students) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.println(", Age : " + record.getAge());
	      }

	      System.out.println("----Updating Record with ID = 2 -----" );
	      studentJDBCTemplate.update(2, 20);

	      System.out.println("----Listing Record with ID = 2 -----" );
	      Student student = studentJDBCTemplate.getStudent(2);
	      System.out.print("ID : " + student.getId() );
	      System.out.print(", Name : " + student.getName() );
	      System.out.println(", Age : " + student.getAge());*/
	      
	      System.out.println("------Records creation--------" );
	      studentJDBCTemplate.create("Zara", 11, 99, 2010);
	      studentJDBCTemplate.create("Nuha", 20, 97, 2010);
	      studentJDBCTemplate.create("Ayan", 25, 100, 2011);

	      System.out.println("------Listing all the records--------" );
	      List<StudentMarks> studentMarks = studentJDBCTemplate.listStudentsWithMarks();
	      
	      for (StudentMarks record : studentMarks) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.print(", Marks : " + record.getMarks());
	         System.out.print(", Year : " + record.getYear());
	         System.out.println(", Age : " + record.getAge());
	      }
	}

}
