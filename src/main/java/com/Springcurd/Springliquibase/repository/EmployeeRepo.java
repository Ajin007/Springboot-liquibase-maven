package com.Springcurd.Springliquibase.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.Springcurd.Springliquibase.model.Employee;

//no need to add @repository annotation and the @transactional annotation, since this will be internally available with the JPA repository package
public interface EmployeeRepo extends JpaRepository<Employee, Long> {



}
