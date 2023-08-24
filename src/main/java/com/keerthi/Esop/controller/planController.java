package com.keerthi.Esop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.keerthi.Esop.constant.AppConstant;
import com.keerthi.Esop.entity.Plan;
import com.keerthi.Esop.repository.PlanRepository;
import com.keerthi.Esop.service.planService;

@Controller
public class planController {
	
	@Autowired
	private planService planService;
	
@PostMapping(name = "SAVE_PLAN")
	public void save(@RequestBody  Plan plan) {
		planService.save(plan);
	}
}
 