package com.analysis.knowledge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.analysis.knowledge.entiry.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
