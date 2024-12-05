package com.nk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {

	@GetMapping("/welcome")
	public String hello()
	{
		return "Welcome to Naheda World";
	}
}
