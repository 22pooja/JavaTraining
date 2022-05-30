package com.example.demoemployeehttp;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PutMapping;


//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demohttpmethods.Student;
//import com.example.demohttpmethods.StudentRepository;

//import java.util.List;
//import java.util.Optional;

@RestController
public class MyController {
	@Autowired
	private EmployeeRepository emp;
	//@GetMapping("/students")
	// public List<Employee>getAllEmployees(){
	//return emp.findAll();
//	    	
	// @GetMapping("/student/{id}")
	//public Employee getEmployeeById(@PathVariable("id") Integer empId)
	//{
	// Optional<Student>op=stud.findById(empId);
	//Employee st=op.get();
	//return st;
	//}
//	 @PostMapping("/save")
//public Employee createEmployee(@RequestBody Employee st) {
//	return emp.save(st);
//		}
	
	
//	   @PutMapping("/updatestud/{id}")
//public boolean updateEmployee(@PathVariable(value = "id") Integer empId,
//@RequestBody Employee empDetails) throws Exception {
//boolean f=true;
//try {
//Optional<Employee> op = emp.findById(empId);
//Employee st = op.get();
//st.setName(empDetails.getName());
//final Employee updatedemp = emp.save(st);
//	} catch(Exception e) {
//	f=false;
//}
//return f;
	   

		
@DeleteMapping("/deletestud/{id}")
public boolean deleteEmployee(@PathVariable(value = "id") Integer empId,
@RequestBody Employee empDetails) throws Exception {
Optional<Employee> op = emp.findById(empId);
Employee st = op.get();
//////			 
emp.delete(st);
	return true;
}
}


	





		

	
	

