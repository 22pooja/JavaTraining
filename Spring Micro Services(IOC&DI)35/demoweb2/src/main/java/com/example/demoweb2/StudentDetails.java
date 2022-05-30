package com.example.demoweb2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDetails {
	
	private Student stud;
	
	@Autowired
	public StudentDetails(Student stud) {
		this.stud=stud;
	}
	
	void setdata() {
		stud.setId(100);
		stud.setName("abc");
	}
	void shodata() {
		System.out.println(stud.getId());
		System.out.println(stud.getName());
	}
}


