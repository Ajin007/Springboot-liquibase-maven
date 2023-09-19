package com.Springcurd.Springliquibase.service;

import org.springframework.stereotype.Service;

import com.Springcurd.Springliquibase.DTO.EmployeeDto;
import com.Springcurd.Springliquibase.Mapper.EmployeeMapperDTo;
import com.Springcurd.Springliquibase.model.Employee;
import com.Springcurd.Springliquibase.repository.EmployeeRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeserviceImpl implements Employeeservice{

	private EmployeeRepo employeerepo;
	
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeedto) {
	
		Employee Employeeprocessed=EmployeeMapperDTo.maoToEmployee(employeedto);
		Employee Employeesaved=employeerepo.save(Employeeprocessed);
		
		return EmployeeMapperDTo.mapTOEmployeeDto(Employeesaved);
	}

}
