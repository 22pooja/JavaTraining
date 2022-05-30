package com.example.demoSessionURLAssign;

//import javax.servlet.http.HttpSession;

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
	
	@GetMapping("/cart")          //it go to main.html page
	public String mainPage(@RequestParam String uname,Model model)
	{
		model.addAttribute("uname", uname);
	
	return "cart";
	}
	@GetMapping("/movie")
		public String moviePage(@RequestParam String uname,Model model)
		{
		model.addAttribute("uname",uname);
		
		return "movie";
		
	}
	@GetMapping("/sport")
	public String sportPage(@RequestParam String uname,Model model)
	{
		model.addAttribute( "uname", uname);
		return "sport";
	}
	
	
}
	



//	

