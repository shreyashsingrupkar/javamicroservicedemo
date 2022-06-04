package com.department.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.entity.Department;
import com.department.repo.DepartmentRepo;
import com.department.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	DepartmentRepo departmentRepo;

	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		Department addDep=departmentRepo.save(department);
		return addDep;
	}

	@Override
	public List<Department> listOfDepartment() {
		// TODO Auto-generated method stub
		List<Department> l=departmentRepo.findAll();
		return l;
	}
	
	
}
