package com.example.swagger.api.controller;

import java.lang.System.Logger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.swagger.api.dto.EmployeeDto;
import com.example.swagger.api.dto.EmployeeUpdateDto;
import com.example.swagger.api.model.Employee;
import com.example.swagger.api.service.EmployeeService;

@RestController
@RequestMapping()
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody EmployeeUpdateDto dto)
	{
		
		return service.updateEmployee(dto);
	}
	
	@PostMapping("employee")
	public Employee insertEmployee(@RequestBody EmployeeDto dto )
	{
		return service.insertEmployee(dto);
		
	}
	
	@DeleteMapping("employee")
		public String deleteEmployee(@RequestParam int id )
		{
			return service.deleteEmployee(id);
		}
	
	@GetMapping("employee")
	public Employee selectEmployee(@RequestParam int id)
	{
		return service.getEmployee(id);
	}
	
	
	
}
