package com.employees.service;

import java.util.List;
import java.util.Optional;

import com.employees.entity.Employee;

public interface EmployeeService {

Employee addEmployee(Employee employee);
	
	List<Employee> listOfEmployee();
	Optional<Employee> getEmployee(Employee employee,long id);

	Employee updateEmployee(Employee employee,long id);
	
	void deleteEmployee(long id);
}
