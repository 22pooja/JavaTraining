package com.example.demoSpringsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String home()
	{
		return "<h1>Hello World</h1>";
	}
}
