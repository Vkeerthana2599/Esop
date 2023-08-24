package com.keerthi.Esop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthi.Esop.constant.AppConstant;
import com.keerthi.Esop.dto.GrantDto;
import com.keerthi.Esop.service.GrantService;

@RestController
@RequestMapping(name=AppConstant.FORWARD_SLASH)
public class GrantController {
	
//	@Autowired
//	private GrantService  grantService;
//	
//	
//	@PostMapping(value=AppConstant.SAVE_GRANT_DETAILS)
//	public void save(List<GrantDto >dto) {
//		grantService.saveGrantDetails(dto);
//		}
//	
	
//	@GetMapping(value=AppConstant.FIND_GRANT_BY_ID)
//	public void approve(List<Long> id) {
//		grantService.grantByIdList(id);
//	}
	}
