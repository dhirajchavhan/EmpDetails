package com.example.swagger.api.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swagger.api.dao.EmployeeDetailsRepository;
import com.example.swagger.api.dao.EmployeeRepository;
import com.example.swagger.api.dto.EmployeeDto;
import com.example.swagger.api.dto.EmployeeUpdateDto;
import com.example.swagger.api.model.Employee;
import com.example.swagger.api.model.EmployeeDetails;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired 
	private EmployeeDetailsRepository detailsRepository;
	
		
	public EmployeeDetails insertEmployeeDetails(Date dateOfJoining, Date lastDate,String Status)
	{
		EmployeeDetails details =new EmployeeDetails();
		
		details.setDateOfJoining(dateOfJoining);
		details.setLastWorkingDay(lastDate);
		details.setStatus(Status);
		
		return detailsRepository.save(details);
	
	}
	public EmployeeDetails updateEmployeeDetails(Date dateOfJoining, Date lastDate,String Status,int id)
	{
		EmployeeDetails details = detailsRepository.findById(id).get();
				
		details.setDateOfJoining(dateOfJoining);
		details.setLastWorkingDay(lastDate);
		details.setStatus(Status);
		
		return detailsRepository.save(details);
	
	}
	
	public Employee insertEmployee(EmployeeDto dto)
	{
		Employee employee = new Employee();
		Date joiningDate=dto.getDateOfJoining();
		Date lastDate=dto.getLastWorkingDay();
		String status =dto.getStatus();
		
		employee.setFirstName(dto.getFirstName());
		employee.setLastName(dto.getLastName());
		employee.setEmailId(dto.getEmailId());
		employee.setMobileNo(dto.getMobileNo());
		employee.setAllContactNo(dto.getAllContactNo());
		employee.setEmployeeDetailsId(insertEmployeeDetails(joiningDate, lastDate, status));
		
		return employeeRepository.save(employee);
		
	}
	
	public Employee updateEmployee(EmployeeUpdateDto dto)
	{
	Employee employee =	employeeRepository.findById(dto.getEid()).get();
	
	Date joiningDate=dto.getDateOfJoining();
	Date lastDate=dto.getLastWorkingDay();
	String status =dto.getStatus();
	
	int detailsId = employee.getEmployeeDetailsId().getEid();
	
	
	employee.setFirstName(dto.getFirstName());
	employee.setLastName(dto.getLastName());
	employee.setEmailId(dto.getEmailId());
	employee.setMobileNo(dto.getMobileNo());
	employee.setAllContactNo(dto.getAllContactNo());
	
	employee.setEmployeeDetailsId(updateEmployeeDetails(joiningDate, lastDate, status,detailsId));

	
	return employeeRepository.save(employee);
	}
	
	
	
	public String deleteEmployee(int id)
	{		
		
		try
		{
			
//	detailsRepository.delete(employeeRepository.findById(id).get().getEmployeeDetailsId());
	employeeRepository.deleteById(id);
	return "Employee deleted successfully";
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return "unable to delete employee";
		
		}
	
	}
	
	
	public Employee getEmployee(int id)
	{
		return employeeRepository.findById(id).get();
	}
	
}
