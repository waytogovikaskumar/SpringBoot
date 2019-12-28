package com.vikas.springbootcrud.springbootcrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vikas.springbootcrud.springbootcrudapi.dao.EmployeeDao;
import com.vikas.springbootcrud.springbootcrudapi.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
 
	@Transactional
	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeDao.getAllEmployee();
	} 
	@Transactional
	@Override
	public Employee getEmployeeById(int id) {
		
		return employeeDao.getEmployeeById(id);
		
	}

	@Transactional
	@Override
	public void saveEmployeeDetails(Employee emp) {
		employeeDao.saveEmployeeDetails(emp);
	} 
	
	@Transactional
	@Override
	public void deleteEmployee(int id) {
		 employeeDao.deleteEmployee(id);
	}
	

}
