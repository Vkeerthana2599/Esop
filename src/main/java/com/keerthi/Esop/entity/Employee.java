package com.keerthi.Esop.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.keerthi.Esop.constant.AppConstant;

import lombok.Data;
@Entity
@Table(name=AppConstant.FORWARD_SLASHES)
@Data
public class Employee implements Serializable{
	
	
	
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="employee_number")
	private long employeeNumber;
	
	@Column(name="band")
	private String band;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="employee_start_date")
	private Date employeeStartDate;
	
	@Column(name="is_active")
	private boolean isActive;

}
 