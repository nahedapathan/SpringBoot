package com.nk.main.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nk.main.entity.Employee;


@Repository
public class Employeedao {
	
	List<Employee> emplist=new ArrayList<Employee>();

	public Employee getEmp() {
		
		//Hibernate COde
		return new Employee(1 ,"ganesh",30000,"mumbai");
	}

	public void insertEmp(Employee emp) {
		System.out.println(emp);
	}

	public List<Employee> getAllEmp() {
		
		return emplist;
	}

	
	Employee emp;
	public void deleteEmp(int id)
	{
		emplist.forEach((obj) -> {
			if(obj.getId() == id)
			{
				emp=obj;
			}
		});
		emplist.remove(emp);
		emp=null;
	}
}
