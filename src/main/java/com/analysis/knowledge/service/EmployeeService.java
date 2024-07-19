package com.analysis.knowledge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.analysis.knowledge.entiry.Employee;

@Service
public interface EmployeeService {

	List<Employee> findAllEmployees();

	Employee findEmployeeById(int id);

	Employee saveOrUpdateEmployee(Employee employee);

	String deleteEmployee(int id);
}
