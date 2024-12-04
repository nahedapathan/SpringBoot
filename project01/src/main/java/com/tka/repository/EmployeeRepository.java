package com.tka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

	
}
