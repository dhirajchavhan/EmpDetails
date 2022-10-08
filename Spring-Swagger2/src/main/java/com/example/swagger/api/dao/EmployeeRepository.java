package com.example.swagger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.swagger.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
