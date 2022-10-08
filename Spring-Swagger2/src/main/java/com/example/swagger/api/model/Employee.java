package com.example.swagger.api.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = -1388765317520368482L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private String mobileNo;
	
	private String allContactNo;
	
	@OneToOne
	private EmployeeDetails employeeDetailsId;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAllContactNo() {
		return allContactNo;
	}

	public void setAllContactNo(String allContactNo) {
		this.allContactNo = allContactNo;
	}

	public EmployeeDetails getEmployeeDetailsId() {
		return employeeDetailsId;
	}

	public void setEmployeeDetailsId(EmployeeDetails employeeDetailsId) {
		this.employeeDetailsId = employeeDetailsId;
	}
	
	

	
	}
