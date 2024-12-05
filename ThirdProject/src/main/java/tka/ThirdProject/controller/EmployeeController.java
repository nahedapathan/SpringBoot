package tka.ThirdProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tka.ThirdProject.model.Employee;
import tka.ThirdProject.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping("getEmp")
	public Employee getEmp()
	{
		return service.getEmp();
	}
	
	@PostMapping("insertEmp")
	public void insertEmp(@RequestBody Employee emp)
	{
		service.insertEmp(emp);
	}
}

