package com.WebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webApp {
	
	@GetMapping("/get")
	public String getvalue() {
		return "It is only when we take chances that our lives improve. "
				+ "The initial and the most difficult risk "
				+ "we need to take is to become honest."
				+ "So,Be Honest";
	}

}
