package com.Springcurd.Springliquibase.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
	
	
	private Long id;
	
	private String firstname;
	
	private String lastname;
	
	private String email;

}
