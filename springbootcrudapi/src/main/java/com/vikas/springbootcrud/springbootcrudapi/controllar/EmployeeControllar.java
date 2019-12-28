package com.vikas.springbootcrud.springbootcrudapi.controllar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikas.springbootcrud.springbootcrudapi.model.Employee;
import com.vikas.springbootcrud.springbootcrudapi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeControllar {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
	// List<Employee>	list =employeeService.getAllEmployee();
		return employeeService.getAllEmployee();
		
	}

	@PostMapping("/employee")
	public Employee save(@RequestBody Employee empObj) {
		employeeService.saveEmployeeDetails(empObj);
		return empObj;
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmpById(@PathVariable int id) {
		
	Employee empObj	= employeeService.getEmployeeById(id);
		
		if(empObj == null) {
			
			throw new RuntimeException("Employee with id "+id+" is not found");
			
		}
		return empObj;
		
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployeeDetails(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "Employee has been deleted with id:" +id;
		
	}
	
	@PutMapping("/employee")
	public Employee updateEmpDetails(@RequestBody Employee empObj) {
		employeeService.saveEmployeeDetails(empObj);
		return empObj;
		
	}
}
