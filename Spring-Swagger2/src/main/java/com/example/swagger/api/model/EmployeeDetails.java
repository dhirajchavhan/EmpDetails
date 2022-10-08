package com.example.swagger.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Employee_Details")
public class EmployeeDetails {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	
	private Date dateOfJoining;
	
	private Date lastWorkingDay;
	
	private String status;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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
