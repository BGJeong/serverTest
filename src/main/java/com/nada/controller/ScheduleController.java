package com.nada.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nada.entity.ScheduleEntity;
import com.nada.service.ScheduleServiceImpl;

@RestController
@RequestMapping("/api")
public class ScheduleController {

	@Autowired
	ScheduleServiceImpl scheduleServiceImpl;
	
	@PostMapping("/addSchedule")
	public String addSchedule(ScheduleEntity schedule) {
		return scheduleServiceImpl.addSchedule(schedule);
	}
	
	@GetMapping("/getSchedule/{scheduleemail}")
	public List<ScheduleEntity> getSchedule(@PathVariable(value="scheduleemail") String scheduleemail) {
		System.out.println(scheduleemail);
		return scheduleServiceImpl.getSchedule(scheduleemail);
	}
	@PostMapping("/getScheduleByDate")
	public List<ScheduleEntity> getScheduleByDate(ScheduleEntity schedule){
		return scheduleServiceImpl.getScheduleByDate(schedule);
	}

	
	@GetMapping("/getScheduleOne/{scheduleid}")
	public ScheduleEntity getScheduleOne(@PathVariable(value="scheduleid") Integer scheduleid){
		return scheduleServiceImpl.getScheduleOne(scheduleid);
	}
	
	@PostMapping("/editSchedule")
	public String editSchedule(ScheduleEntity schedule){
		return scheduleServiceImpl.editSchedule(schedule);
	}
	
	@GetMapping("/deleteSchedule/{scheduleid}")
	public String deleteSchedule(@PathVariable(value="scheduleid") Integer scheduleid){
		return scheduleServiceImpl.deleteSchedule(scheduleid);
	}
}
