package com.employees.globalexception;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.employees.customexception.EmployeeNotFoundException;
import com.employees.status.Status;


@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Object> messageHandledModules(EmployeeNotFoundException ex){
	
		Status exceptionMassege=new Status();
		exceptionMassege.setMessage("Employee Not Found");
		ResponseEntity<Object> entity=new ResponseEntity<>(exceptionMassege,HttpStatus.NOT_FOUND);
		return entity;
	}
	
	
}
