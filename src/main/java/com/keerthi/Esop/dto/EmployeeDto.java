package com.keerthi.Esop.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class EmployeeDto implements Serializable{
	
	private long id;
	
	private long employeeNumber;
	
	private String band;
	
	private String designation;
	
	private Date employeeStartDate;
	
	private boolean isActive;
	
}
