package com.nk.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nk.main.service.TestService;

@RestController
@EnableAspectJAutoProxy
public class TestController {

	@Autowired
	TestService service;
	
	@RequestMapping("withdraw")
	public void withdraw()
	{
		service.withraw();
	}
	
	@RequestMapping("deposit")
	public void deposit()
	{
		service.deposit();
	}
}
