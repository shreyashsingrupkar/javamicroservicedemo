package com.employees.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employees.entity.Employee;
import com.employees.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping(value="/createemployee")
	ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee) {

		Employee e = employeeService.addEmployee(employee);

		return new ResponseEntity<Employee>(e,HttpStatus.CREATED);

	}
	@GetMapping(value = "/listofemployee")
	ResponseEntity<List<Employee>> listofEmployee() {

		List<Employee> listofemp = employeeService.listOfEmployee();

		return new ResponseEntity<List<Employee>>( listofemp,HttpStatus.FOUND);

	}

	@PutMapping(value = "/updateemployee/{id}")
	ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable long id) {

		Employee e=employeeService.updateEmployee(employee, id);
		return new ResponseEntity<Employee>(e,HttpStatus.FOUND);

	}
	
	
	@DeleteMapping(value = "/deleteemployee/{id}")
	ResponseEntity<String> deleteEmployeeById(@PathVariable Long id) {
	
		employeeService.deleteEmployee(id);
		
		return new ResponseEntity<String>("deleted employee "+id,HttpStatus.CREATED);
		
		
		
	}
}
