package com.vikas.springbootcrud.springbootcrudapi.dao;

import java.util.List;

import com.vikas.springbootcrud.springbootcrudapi.model.Employee;

public interface EmployeeDao {
	
	List<Employee> getAllEmployee();
	Employee getEmployeeById(int id);
	//void saveEmployeeDetails();
    void deleteEmployee(int id);
	void saveEmployeeDetails(Employee emp);

}
