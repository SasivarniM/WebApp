package com.WebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webApp {
	
	@GetMapping("/get")
	public String getvalue() {
		return "Hello";
	}

}
