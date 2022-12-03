package com.spring.springdatarest.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.springdatarest.domain.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer>{

}
