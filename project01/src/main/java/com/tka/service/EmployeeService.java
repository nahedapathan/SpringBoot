package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.model.Employee;
import com.tka.repository.EmployeeRepository;

@Service
public class EmployeeService {

	
	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	public Employee saveEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	public List<Employee> getAllEmployee()
	{
		return employeeRepository.findAll();
	}
	
	public void deleteEmployee(Long id)
	{
		employeeRepository.deleteById(id);
	}
	
	
	
	
}
