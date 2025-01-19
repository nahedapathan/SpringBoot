package com.nk.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nk.main.model.Student;
import com.nk.main.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentrepository;
	
	//insert student data
	public Student saveStudent(Student student)
	{
		return studentrepository.save(student);
	}
	
	
	//read student data
	public List<Student> getAllStudent()
	{
		return studentrepository.findAll();
	}
	
	//update student data
	public void updateStudent(Student s,int id)
	{
		Optional<Student> existingStudent=studentrepository.findById(id);
		if(existingStudent.isPresent())
		{
			Student newStudent=existingStudent.get();
			newStudent.setName(s.getName());
			newStudent.setEmail(s.getEmail());
			
			studentrepository.save(newStudent);
		}
		else
		{
			throw new RuntimeException("not found");
		}
	}
	
	public String deleteStudent(int id)
	{
		studentrepository.deleteById(id);
		return "Deleted Successfully";
	}
	
	

}


















