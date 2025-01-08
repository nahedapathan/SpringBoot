package com.nk.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nk.main.entity.Student;

@RestController
public class StudentController {

	@GetMapping("/welcome")
	public String greeting()
	{
		return "Welcome to Student Data";
	}
	
	@GetMapping("getList")
	public List<String> getList()
	{
		List<String> list=new ArrayList<String>();
		list.add("st1");
		list.add("str2");
		list.add("str3");
		
		return list;
	}
	
	@GetMapping("getStud")
	public Student getStudent()
	{
		return new Student(1,"Naheda",'A',"pune");
	}
	
	@GetMapping("/getAllStd")
	public List<Student> getAllStudent()
	{
		Student std1=new Student(1,"Naheda",'A',"Pune");
		Student std2=new Student(2,"priya",'A',"Pune");
		Student std3=new Student(3,"preeti",'A',"Pune");
		
		List<Student> allStd=new ArrayList<Student>();
		allStd.add(std1);
		allStd.add(std2);
		allStd.add(std3);
		
		return allStd;
	}
	
	@PostMapping("insert")
	public void insertData(@RequestBody String str)
	{
		System.out.println(str);
	}
	
	@PostMapping("insertdata")
	public void insertValue(@RequestBody Student std)
	{
		System.out.println(std);
	}
	
	@PostMapping("m1/{id}")
	public void m1(@PathVariable int id)
	{
		System.out.println(id);
	}
}
