package com.nk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//internally request mapping
@RestController
public class PractiseController {
  
	@GetMapping("/welcome")
	public String hello()
	{
		return "Hello ,Welcome to my Project";
	}
}
