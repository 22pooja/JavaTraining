package com.example.demowebsession;

import javax.servlet.http.HttpSession;

//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;

//import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/main")          //it go to main.html page
	public String goToMain(@RequestParam String uname,HttpSession session)
	{
		session.setAttribute("fname", uname);
	
	return "main";
	}
	@GetMapping("/movie")
		public String goToMovie(HttpSession session,Model model)
		{
		model.addAttribute("fname",session.getAttribute("fname"));
		String n =(String)session.getAttribute("fname");
		System.out.println("name of user" +n);
		return "movie";
		
	}
	@GetMapping("/sport")
	public String goToSport()
	{
		return "sport";
	}
	
	
}
	



//	

