package com.vikas.springbootcrud.springbootcrudapi.service;

import java.util.List;

import com.vikas.springbootcrud.springbootcrudapi.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
	Employee getEmployeeById(int id);
	void saveEmployeeDetails(Employee emp);
    void deleteEmployee(int id);
}
