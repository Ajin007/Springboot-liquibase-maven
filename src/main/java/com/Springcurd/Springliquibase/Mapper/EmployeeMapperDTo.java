package com.Springcurd.Springliquibase.Mapper;

import com.Springcurd.Springliquibase.DTO.EmployeeDto;
import com.Springcurd.Springliquibase.model.Employee;

public class EmployeeMapperDTo {
	
	public static EmployeeDto mapTOEmployeeDto(Employee employee) {
		return new EmployeeDto(employee.getId(),employee.getFirstname(),employee.getLastname(),employee.getEmail());
	}
	
	public static Employee maoToEmployee(EmployeeDto employeedto) {
		return new Employee(employeedto.getId(),employeedto.getFirstname(),employeedto.getLastname(),employeedto.getEmail());
		
	}

}
