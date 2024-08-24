package com.analysis.knowledge.service.Impl;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.analysis.knowledge.entiry.Employee;
import com.analysis.knowledge.repository.EmployeeRepository;
import com.analysis.knowledge.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger logger = LogManager.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAllEmployees() {
		
		List<Employee> employees = null;
		try {
			logger.info("In FindAll Try","try");
			employees = employeeRepository.findAll();
		} catch (Exception e) {
			logger.info("In Exception",e);
			throw e;
		}
		logger.info("After Try","try");
		return employees;
	}

	@Override
	public Employee findEmployeeById(int id) {
		try {
			 Optional<Employee> optionalEmployee = employeeRepository.findById(id);
			 logger.info("In FindById Try","try");
		        if (optionalEmployee.isPresent()) {
		            return optionalEmployee.get();
		        } else {
		            throw new RuntimeException("Employee not found with id: " + id);
		        }
		} catch (Exception e) {
			logger.info("In Exception",e);
			throw e;
		}
	}

	 @Override
	  public Employee saveOrUpdateEmployee(Employee employee) {
		 try {
			 logger.info("In saveEmployee Try","try");
	    return employeeRepository.save(employee);
		 }catch (Exception e) {
				logger.info("In Exception",e);
				throw e;
			}
	  }

	@Override
	public String deleteEmployee(int id) {
		String status = null;
		try {
			 Optional<Employee> optionalEmployee = employeeRepository.findById(id);
			 logger.info("In deleteById Try","try");
		        if (optionalEmployee.isPresent()) {
		        	employeeRepository.deleteById(id);
		        	status="Employee Deleted Successfully";
		        	return status;
		        } else {
		        	status="Employee not found with id: "+id;
		        	return status;
		        }
		} catch (Exception e) {
			logger.info("In Exception",e);
			throw e;
		}
	}

}
