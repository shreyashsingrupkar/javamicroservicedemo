package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping(value="/createemployee")
	Employee createEmployee(@RequestBody Employee employee) {

		Employee e = employeeService.addEmployee(employee);

		return e;

	}
	@GetMapping(value = "/listofemployee")
	List<Employee> listofEmployee() {

		List<Employee> listofemp = employeeService.listOfEmployee();

		return listofemp;

	}

	@PutMapping(value = "/updateemployee/{id}")
	Employee updateEmployee(@RequestBody Employee employee, @PathVariable long id) {

		employeeService.updateEmployee(employee, id);
		return employee;

	}
	
	
	@DeleteMapping(value = "/deleteemployee/{id}")
	String deleteEmployeeById(@PathVariable Long id) {
	
		employeeService.deleteEmployee(id);
		
		return "deleted employee "+id;
		
		
		
	}
	
}
