package com.example.demojpawebapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	@Autowired
	private UsersRepository usersrepo;
	@GetMapping("/")
	public String home(){
		return "index";
	}
	@PostMapping("/createuser")
	public String createUsers(@ModelAttribute Users user ) {
		usersrepo.save(user);
		return "index";
	}
	@GetMapping("/showall")
	public String show(Model model){
	List<Users>ob= usersrepo.findAll();
	model.addAttribute("users",ob);
	return "result";
	}
}
