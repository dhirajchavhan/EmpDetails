package com.example.swagger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.swagger.api.model.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer> {

}
