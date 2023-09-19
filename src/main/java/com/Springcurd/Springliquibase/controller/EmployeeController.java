package com.Springcurd.Springliquibase.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springcurd.Springliquibase.DTO.EmployeeDto;
import com.Springcurd.Springliquibase.model.Employee;
import com.Springcurd.Springliquibase.service.Employeeservice;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employee")
@AllArgsConstructor
public class EmployeeController {

	private Employeeservice employeeservice;
	
	@PostMapping
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
		 System.out.println("Received employeeDto: " + employeeDto);
		EmployeeDto creation=employeeservice.createEmployee(employeeDto);
		return new ResponseEntity<>(creation,HttpStatus.CREATED);
		
	}
	
	
	
}