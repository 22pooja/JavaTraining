package com.example.crudapp;

//import static org.mockito.ArgumentMatchers.anyList;

//import java.util.Iterator;
//import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import antlr.collections.List;

@SpringBootApplication
public class CrudappApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context= SpringApplication.run(CrudappApplication.class, args);
		StudentRepository stud;
		stud = context.getBean(StudentRepository.class);
		
		//insert
	Student st1= new Student(25,"ddd");
	stud .save(st1);
		
	System.out.println("Record Saved");
		
		// update
		
//		Optional<Student>op;
//		op=stud.findById(25);
//		Student st2=op.get();
//	System.out.println(st2.getId());
//	System.out.println(st2.getName());
//	st2.setName("demo123");
//	stud.save(st2);
//	
		// delete
		
		//Optional<Student>op;
//		Optional<Student>op;          //take optional from java.util package
//		op=stud.findById(25);
//		Student st2=op.get();
//	stud.delete(st2);
//	List<Student>studlist;
//	
//	studlist=stud.findAll();
//	
//		for(Student st3:studlist) {
//			System.out.println(st3.getId());
//			System.out.println(st3.getName());
		}
		

	
	
		
	}


