package tka.ThirdProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tka.ThirdProject.dao.EmployeeDao;
import tka.ThirdProject.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public Employee getEmp()
	{
		return dao.getEmp();
	}
	
	public void insertEmp(Employee emp)
	{
		dao.insertEmp(emp);
	}
	
}
