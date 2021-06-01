package com.nada.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nada.entity.CallLogEntity;
import com.nada.entity.ScheduleEntity;

public interface CallLogRepository extends JpaRepository<CallLogEntity, Integer>{

}
