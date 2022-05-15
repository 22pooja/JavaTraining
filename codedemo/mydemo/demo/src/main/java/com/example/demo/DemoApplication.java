package com.example.demo;

import java.util.Optional;

import javax.naming.Context;
//import javax.persistence.metamodel.ListAttribute;
import javax.print.attribute.standard.PrinterMakeAndModel;
import javax.swing.Spring;

//import org.hibernate.mapping.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import antlr.collections.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
	 ApplicationContext context;
	 context= SpringApplication.run(DemoApplication.class,args);
	 studentRepository stud = context.getBean(studentRepository.class);

	 //insert

	  student st=new student(12,"mmm");
	 stud.save(st);
	 System.out.println("record saved");


	//delete

	//  student st1=new student(23,"");
	//  stud.delete(st1);
	//  System.out.println("record deleted");
	 
	//  student st2=new student(6,"sd");
	//  stud.update(st2);
	//  System.out.println("record updated");

	// List<student>studlist ;
	// studlist= findById(300);
	// for (student st3:studlist) {
	// 	System.out.println(st3.getId());
	// 	System.out.println(st3.getName());
	// }

	//update

//Optional<Student> op;
		
//		op=stud.findById(300);
//		Student st2=op.get();
//		System.out.println(st2.getId());
//		System.out.println(st2.getName());
//		st2.setName("demo123");
//		stud.save(st2);
	//delete
	// Optional<student> op;		
	// op=stud.findById(90);
	// student st2=op.get();
	// stud.delete(st2);
		
		
	// List<student>studlist;
	// 	studlist=stud.findAll();
		
	// 	for(student st3:studlist) {
	// 		System.out.println(st3.getId());
	// 		System.out.println(st3.getName());
		}

	}


