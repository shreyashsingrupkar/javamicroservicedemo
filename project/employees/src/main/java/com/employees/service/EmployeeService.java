package com.employees.service;

import java.util.List;

import com.employees.entity.Employee;

public interface EmployeeService {

Employee addEmployee(Employee employee);
	
	List<Employee> listOfEmployee();
	
	Employee updateEmployee(Employee employee,long id);
	
	void deleteEmployee(long id);
}
