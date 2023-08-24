package com.keerthi.Esop.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.keerthi.Esop.constant.AppConstant;

import lombok.Data;
@Data
@Entity
@Table(name=AppConstant.FORWARD_SLASH)
public class Plan {
	@Id
	@Column(name="id")
	 private long id;
	 
	@Column(name="plan_year")
	 private String planYear;
	 
	@Column(name="plan_start_date")
	 private Date planStartDate;
	
	@Column(name="plan_end_date") 
	 private Date planEndDate;
	
	@Column(name="is_current_plan") 
	 private boolean isCurrentPlan;

}
