package com.department.service;

import java.util.List;

import com.department.entity.Department;

public interface DepartmentService {

	Department addDepartment(Department department );
	List<Department> listOfDepartment();
	
	
}
