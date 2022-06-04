package com.employees.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employees.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
