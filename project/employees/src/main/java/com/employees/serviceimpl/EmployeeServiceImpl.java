package com.employees.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employees.entity.Employee;
import com.employees.repo.EmployeeRepo;
import com.employees.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo ;

	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee addEmp=employeeRepo.save(employee);
		return addEmp;
	}

	@Override
	public List<Employee> listOfEmployee() {
		// TODO Auto-generated method stub
		List<Employee> listofEmployee = employeeRepo.findAll();
		return listofEmployee;
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		// TODO Auto-generated method stub
		employee.setEmpid(id);

		Employee updateemployee = employeeRepo.save(employee);

		return updateemployee;
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
		
	}
	
}
