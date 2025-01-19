package com.nk.main.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nk.main.model.Employee;

@Repository
public class Employeedao {
	
	@Autowired
	SessionFactory sf;

	public void insertEmp(Employee emp) {
	     Session session=sf.openSession();
	     Transaction tx=session.beginTransaction();
	     session.save(emp);
	     tx.commit();
	     
	     session.close();
	     
	}

	public List<Employee> getAllEmp() {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("from Employee");
		List list=query.list();
		tx.commit();
		
		session.close();
		return list;
	}

	
	public void deleteEmp(int id)
	{
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Employee obj=session.get(Employee.class, id);
		session.delete(obj);
		tx.commit();
		session.close();
	}
}

