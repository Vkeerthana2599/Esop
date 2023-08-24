package com.keerthi.Esop.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.keerthi.Esop.constant.AppConstant;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name=AppConstant.GRANT)
@Data

public class Grant {
	@Id
	@Column(name = "id")
	private long id;

	@Column(name = "employee_number")
	private long employeeNumber;

	@Column(name = "number_of_counts")
	private long numberOfCounts;

	@Column(name = "band")
	private String band;

	@Column(name = "grant_price")
	private double grantPrice;

	@Column(name = "grant_approved")
	private String grantApproved;

	@Column(name = "allocation_status")
	private String allocationStatus;

	@Column(name = "accepted")
	private boolean accepted;

	@Column(name = "accepted_date")
	private Date acceptedDate;

	@Column(name = "lock_in_status")
	private String lockInStatus;

	@Column(name = "frequency")
	private String frequency;

	@Column(name = "vesting_tenure")
	private String vestingTenure;
	

}
