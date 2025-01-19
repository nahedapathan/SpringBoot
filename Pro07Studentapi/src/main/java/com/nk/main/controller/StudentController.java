package com.nk.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nk.main.model.Student;
import com.nk.main.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	//insert student
	@PostMapping
	public Student addStudent(@RequestBody Student student)
	{
		return studentservice.saveStudent(student);
	}
	
	//read data
	@GetMapping
	public List<Student> getAllStudent()
	{
		return studentservice.getAllStudent();
	}
	
	@PutMapping("/update/{id}")
	public String updateStudent(@PathVariable int id,@RequestBody Student s)
	{
		studentservice.updateStudent(s, id);
		return "Product Updated";
	}
	
	@DeleteMapping("/delete")
	public String deleteStudent(@RequestParam int id)
	{
		return studentservice.deleteStudent(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
