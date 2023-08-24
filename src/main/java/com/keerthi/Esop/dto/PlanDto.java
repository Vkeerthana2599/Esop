package com.keerthi.Esop.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data

public class PlanDto implements Serializable{
 private long id;
 
 private String planYear;
 
 private Date planStartDate;
 
 private Date planEndDate;
 
 private boolean isCurrentPaln;
}
