package com.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	long dpid;
	String name;
	public long getDpid() {
		return dpid;
	}
	public void setDpid(long dpid) {
		this.dpid = dpid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
