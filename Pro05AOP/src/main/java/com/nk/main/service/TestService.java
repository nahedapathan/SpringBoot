package com.nk.main.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	public void withraw()
	{
		System.out.println("PAyment withdraw Successfull.......");
		
	}
	
	public void deposit()
	{
		System.out.println("payment deposit called......");
	}
}
