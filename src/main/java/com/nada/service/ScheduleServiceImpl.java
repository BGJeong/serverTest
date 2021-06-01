package com.nada.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nada.entity.ScheduleEntity;
import com.nada.repository.ScheduleRepository;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	ScheduleRepository scheduleRepo;
	
	public String addSchedule(ScheduleEntity schedule){
		ScheduleEntity scheduleEntity = scheduleRepo.save(schedule);
		if(scheduleEntity != null) {
			return "success";
		}
		return "fail";
	}
	
	public List<ScheduleEntity> getSchedule(String scheduleemail){
		List<ScheduleEntity> scheduleEntity = scheduleRepo.findByscheduleemail(scheduleemail);
		if(scheduleEntity != null) {
			return scheduleEntity;
		}
		return null;
		
	}
	public List<ScheduleEntity> getScheduleByDate(ScheduleEntity schedule){
		String se = schedule.getScheduleemail();
		String dt = schedule.getScheduledate();
		String realdt1 = dt.split(" ")[0]+" "+"00:00:00";
		String realdt2 = dt.split(" ")[0]+" "+"23:59:59";
		List<ScheduleEntity> s = scheduleRepo.findByDate(realdt1,realdt2,se);
		
		if(s != null) {
			return s;
		}
		return null;
	}
	public ScheduleEntity getScheduleOne(Integer scheduleid) {
		ScheduleEntity scheduleEntity = scheduleRepo.findByscheduleid(scheduleid);
		if(scheduleEntity != null){
			return scheduleEntity;
		} 
		return null;
	}
	
	public String editSchedule(ScheduleEntity schedule){
		ScheduleEntity scheduleEntity = scheduleRepo.findByscheduleid(schedule.getScheduleid());
		if(scheduleEntity != null){
			scheduleEntity.setScheduleheader(schedule.getScheduleheader());
			scheduleEntity.setSchedulecontent(schedule.getSchedulecontent());
			scheduleEntity.setScheduledate(schedule.getScheduledate());
			
			if(scheduleRepo.save(scheduleEntity) != null){
				return "success";
			} else
				return "fail";
		}
		return "getFail";
	}
	
	public String deleteSchedule(Integer scheduleid) {
		scheduleRepo.deleteById(scheduleid);
		return "success";
	}

}
