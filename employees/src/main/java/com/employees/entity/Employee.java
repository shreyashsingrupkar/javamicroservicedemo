package com.employees.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Table(name="employee")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     long empid;
	
	@Column(name="name")
	@NotEmpty
	@NotNull
	@Size(min=2,message="name should have at least 2 charecters")
	private String name;
	
	
	
	@NotNull
	@Min(value=0,message = "Please select positive numbers Only")
	int salary;
	
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public Employee(long empid,
			@NotEmpty @Size(min = 2, message = "name should have at least 2 charecters") String name,
			@NotNull @Min(value = 15000, message = "salary should be greater than 15000") int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
}
