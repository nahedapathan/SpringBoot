package com.nk.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nk.main.entity.Employee;
import com.nk.main.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping("/getEmp")
	public Employee getEmp()
	{
		return service.getEmp();
	}
	
	@PostMapping("/insertEmp")
	public void insertEmp(@RequestBody Employee emp)
	{
		service.insertEmp(emp);
	}
	
	@GetMapping("getallemp")
	public List<Employee> getAllEmp()
	{
		List<Employee> allEmp=service.getAllEmp();
		return allEmp;
	}
	
	public void deleteEmp(@PathVariable int id)
	{
		service.deleteEmp(id);
	}
}
