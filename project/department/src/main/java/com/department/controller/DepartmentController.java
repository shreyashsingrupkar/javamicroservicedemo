package com.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.entity.Department;
import com.department.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping(value="/createdepartment")
	Department createDepartment(@RequestBody Department department) {
		Department d=departmentService.addDepartment(department);
		return d;
	}
	
	@GetMapping(value="/getdepartment")
	List<Department> getAllDepartment(){
		List<Department> l=departmentService.listOfDepartment();
		return l;
	}
}
