package com.nk.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nk.main.service.CalculatorService;

@RestController
public class CalculatorController {

	public final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		super();
		this.calculatorService = calculatorService;
	}
	
	@GetMapping("/add")
	public String add(@RequestParam int a,@RequestParam int b)
	{
		int result=calculatorService.add(a,b);
		
		return "Result of Addition :"+result;
	}
	
	@GetMapping("/subtract")
	public String subtract(@RequestParam int a,@RequestParam int b)
	{
		int result=calculatorService.subtract(a,b);
		
		return "Result of Subtraction :"+result;
	}
	
	
}
