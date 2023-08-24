package com.keerthi.Esop.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class GrantDto implements Serializable{
	private long id;
	

	private long employeeNumber;

	private long numberOfCounts;

	private String band;

	private double grantPrice;
	
	private String allocationStatus; 

	private String grantApproved;

	private boolean accepted;

	private Date acceptedDate;

	private String lockInStatus;

	private String fequency;

	private String vestingTenure;

}
