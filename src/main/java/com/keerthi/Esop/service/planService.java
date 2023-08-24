package com.keerthi.Esop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.Esop.entity.Plan;
import com.keerthi.Esop.repository.PlanRepository;

@Service
public class planService {

	@Autowired
	private PlanRepository planRepository;
	
	public void save(Plan plan) {
		planRepository.save(plan);
	}
}
