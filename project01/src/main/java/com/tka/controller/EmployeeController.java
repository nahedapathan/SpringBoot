package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.model.Employee;
import com.tka.service.EmployeeService;

@RestController
public class EmployeeController {

	private final EmployeeService employeeservice;

	@Autowired
	public EmployeeController(EmployeeService employeeservice) {
		super();
		this.employeeservice = employeeservice;
	}
	
	@PostMapping("/insert")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeservice.saveEmployee(employee);
	}
	
	@GetMapping("/View")
	public List<Employee> getAllEmployee()
	{
		return employeeservice.getAllEmployee();
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteEmp(@PathVariable Long id)
	{
		employeeservice.deleteEmployee(id);
	}
}
