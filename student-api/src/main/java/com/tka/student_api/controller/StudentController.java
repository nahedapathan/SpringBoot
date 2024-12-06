package com.tka.student_api.controller;

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

import com.tka.student_api.entity.Student;
import com.tka.student_api.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
	private StudentService studentservice;
	
    //insert
    @PostMapping
	public Student addStudent(@RequestBody Student student)
	{
		return studentservice.saveStudent(student);
	}
    
    //read
    @GetMapping
    public List<Student> getAllStudent()
    {
    	return studentservice.getAllStudent();
    }
    //update
    
    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable int id,@RequestBody Student s)
    {
    	studentservice.updateStudent(s, id);
    	return "ProductUpdated";
    }
    
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam int id)
    {
    	return studentservice.deleteStudent(id);
    }
}
