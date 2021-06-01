package com.nada.service;

import java.util.List;

import com.nada.entity.ScheduleEntity;

public interface ScheduleService {

	public String addSchedule(ScheduleEntity schedule) throws Exception;
	public List<ScheduleEntity> getSchedule(String email) throws Exception;
	public  List<ScheduleEntity> getScheduleByDate(ScheduleEntity schedule) throws Exception;
	public ScheduleEntity getScheduleOne(Integer id) throws Exception;
	public String editSchedule(ScheduleEntity schedule) throws Exception;
	public String deleteSchedule(Integer scheduleid) throws Exception;
	
}
