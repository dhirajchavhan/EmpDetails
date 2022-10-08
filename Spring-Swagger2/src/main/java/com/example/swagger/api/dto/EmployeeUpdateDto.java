package com.example.swagger.api.dto;

import java.util.Date;

public class EmployeeUpdateDto {
	
	private int eid;
private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private String mobileNo;
	
	private String allContactNo;
	
	private Date dateOfJoining;
	
	private Date lastWorkingDay;
	
	private String status;

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

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getLastWorkingDay() {
		return lastWorkingDay;
	}

	public void setLastWorkingDay(Date lastWorkingDay) {
		this.lastWorkingDay = lastWorkingDay;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
