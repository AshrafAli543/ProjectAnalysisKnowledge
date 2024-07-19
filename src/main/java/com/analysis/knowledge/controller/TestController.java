package com.analysis.knowledge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.analysis.knowledge.entiry.Employee;
import com.analysis.knowledge.service.EmployeeService;

@RestController
public class TestController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}
	
	@GetMapping("/helloName/{name}")
	public String getHelloName(@PathVariable String name) {
		return "Hello " + name;
	}
	
	@GetMapping("/allEmployees")
	public List<Employee> getAllEmployees() {
		
		List<Employee> employeesList = employeeService.findAllEmployees();
		
		return employeesList;
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		
		Employee employee = employeeService.findEmployeeById(id);
		
		return employee;
	}
	
	@PostMapping("/employee-save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveOrUpdateEmployee(employee);
		
	}
	@PutMapping("/employee-update")
	public Employee UpdateEmployee(@RequestBody Employee employee) {
		return employeeService.saveOrUpdateEmployee(employee);
		
	}
	
	@DeleteMapping("/employee-delete/{id}")
	public String UpdateEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
		
	}

}
