package com.nk.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nk.main.dao.Employeedao;
import com.nk.main.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	Employeedao dao;

	
	public void insertEmp(Employee emp) {
		dao.insertEmp(emp);
	}

	public List<Employee> getAllEmp() {
		
		List<Employee> allemp=dao.getAllEmp();
		return allemp;
	}

	public void deleteEmp(int id)
	{
		dao.deleteEmp(id);
	}

}

