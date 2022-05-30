package com.employees.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employees.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
