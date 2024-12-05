package tka.ThirdProject.dao;

import org.springframework.stereotype.Repository;

import tka.ThirdProject.model.Employee;

@Repository
public class EmployeeDao {

	public Employee getEmp()
	{
		//hibernate code
		return new Employee(1,"ganesh",30000,"mumbai");
		
	}
	
	public void insertEmp(Employee emp)
	{
		System.out.println(emp);
	}
}
