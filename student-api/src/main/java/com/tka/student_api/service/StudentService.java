package com.tka.student_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.student_api.entity.Student;
import com.tka.student_api.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudent(Student student)
	{
		return studentRepository.save(student);
	}
	
	public List<Student> getAllStudent()
	{
		return studentRepository.findAll();
		
	}
	
	public void updateStudent(Student s,int id)
	{
		Optional<Student> existingProd=studentRepository.findById(id);
		if(existingProd.isPresent())
		{
			Student newStu=existingProd.get();
			newStu.setName(s.getName());
			newStu.setEmail(s.getEmail());
			
			studentRepository.save(newStu);
		}
		else
		{
			throw new RuntimeException("not found");
		}
	}
	
	public String deleteStudent(int id)
	{
		studentRepository.deleteById(id);
		return "Deleted Successfully";
	}
	
}
