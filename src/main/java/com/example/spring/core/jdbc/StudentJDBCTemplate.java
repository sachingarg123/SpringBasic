package com.example.spring.core.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentJDBCTemplate implements StudentDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	/*private PlatformTransactionManager transactionManager;*/
	//private SimpleJdbcCall jdbcCall;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		//this.jdbcCall =  new SimpleJdbcCall(dataSource).withProcedureName("getRecord");

	}
	
	/* public void setTransactionManager(PlatformTransactionManager transactionManager) {
	      this.transactionManager = transactionManager;
	   }*/
/*
	public void create(String name, Integer age) {
		String SQL = "insert into Student (name, age) values (?, ?)";
		jdbcTemplateObject.update(SQL, name, age);
		System.out.println("Created Record Name = " + name + " Age = " + age);
		return;

	}*/

	public Student getStudent(Integer id) {
		String SQL = "select * from Student where id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new StudentMapper());
		return student;
	}
	//for using procedure
	/*public Student getStudent(Integer id) {
	      SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
	      Map<String, Object> out = jdbcCall.execute(in);

	      Student student = new Student();
	      student.setId(id);
	      student.setName((String) out.get("out_name"));
	      student.setAge((String) out.get("out_age"));
	      return student;
	   }*/

	public List<Student> listStudents() {
		String SQL = "select * from Student";
	      List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
	      return students;
	}

	public void delete(Integer id) {
		String SQL = "delete from Student where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	      return;
	}

	public void update(Integer id, Integer age) {
		 String SQL = "update Student set age = ? where id = ?";
	      jdbcTemplateObject.update(SQL, age, id);
	      System.out.println("Updated Record with ID = " + id );
	      return;

	}

	public void create(String name, Integer age, Integer marks, Integer year) {
		/*TransactionDefinition def = new DefaultTransactionDefinition();
	      TransactionStatus status = transactionManager.getTransaction(def);*/

	      try {
	         String SQL1 = "insert into Student (name, age) values (?, ?)";
	         jdbcTemplateObject.update( SQL1, name, age);

	         // Get the latest student id to be used in Marks table
	         String SQL2 = "select max(id) from Student";
	         StudentMarks studentmark = jdbcTemplateObject.queryForObject(SQL2, new StudentMarksMapper());
	         Integer sid = studentmark.getSid();

	         String SQL3 = "insert into Marks(sid, marks, year) " + "values (?, ?, ?)";
	         jdbcTemplateObject.update( SQL3, sid, marks, year);

	         System.out.println("Created Name = " + name + ", Age = " + age);
	         /*transactionManager.commit(status);*/
	      } 
	      catch (DataAccessException e) {
	         System.out.println("Error in creating record, rolling back");
	         /*transactionManager.rollback(status);*/
	         throw e;
	      }
	      return;
		
	}

	public List<StudentMarks> listStudentsWithMarks() {
		 String SQL = "select * from Student, Marks where Student.id=Marks.sid";
	      List <StudentMarks> studentMarks = jdbcTemplateObject.query(SQL, 
	         new StudentMarksMapper());
	      
	      return studentMarks;
	}

}
