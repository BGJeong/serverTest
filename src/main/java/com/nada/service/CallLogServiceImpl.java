package com.nada.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nada.entity.CallLogEntity;
import com.nada.repository.CallLogRepository;

@Service
public class CallLogServiceImpl implements CallLogService {

	@Autowired
	CallLogRepository callLogRepo;
	
	public String addCallLog(CallLogEntity callLog){
		CallLogEntity callLogEntity = callLogRepo.save(callLog);
		if(callLogEntity != null) {
			return "success";
		}
		return "fail";
	}

}
