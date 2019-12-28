package com.vikas.springbootcrud.springbootcrudapi.dao;

import java.util.List;


import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vikas.springbootcrud.springbootcrudapi.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> getAllEmployee() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> employeeList = query.getResultList();
		return employeeList;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee empObj = currentSession.get(Employee.class, id);
		
		return empObj;
	}

	@Override
	public void saveEmployeeDetails(Employee emp) {
		
	 Session currentSession = entityManager.unwrap(Session.class);
	     // currentSession.save(emp);
	 currentSession.saveOrUpdate(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee empObj = currentSession.get(Employee.class, id);
        currentSession.delete(empObj);
		
	}

}
