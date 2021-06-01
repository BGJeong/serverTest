package com.nada.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="nada_schedule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer scheduleid;
	
	@NotNull
	@Column(name="scheduleemail")
	private String scheduleemail;
	
	@NotNull
	@Column(name="scheduleheader")
	private String scheduleheader;

	@Column(name="schedulecontent")
	private String schedulecontent;
	
	@NotNull
	@Column(name="scheduledate")
	private String scheduledate;
}


