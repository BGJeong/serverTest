package com.nada.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nada.entity.ScheduleEntity;

public interface ScheduleRepository extends JpaRepository<ScheduleEntity, Integer>{
	List<ScheduleEntity> findByscheduleemail(String email);
	ScheduleEntity findByscheduleid(Integer scheduleid);
    @Query(value = "select * from nada_schedule where scheduleDate between (?1) and (?2)"+" and scheduleEmail = (?3)",nativeQuery=true)
	List<ScheduleEntity> findByDate(String d1,String d2,String email);
}
