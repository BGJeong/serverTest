package com.nada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nada.entity.CallLogEntity;
import com.nada.service.CallLogServiceImpl;

@RestController
@RequestMapping("/api")
public class CallLogController {

	@Autowired
	CallLogServiceImpl callLogServiceImpl;
	
	@PostMapping("/addCallLog")
	public String addCallLog(CallLogEntity callLog) {
		return callLogServiceImpl.addCallLog(callLog);
	}
}
