package com.nada.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="nada_calllog")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CallLogEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer callid;
	
	@Column(name="callemail")
	private String callemail;
	
	@Column(name="callnumber")
	private String callnumber;
	
	@Column(name="calltype")
	private String calltype;
	
	@Column(name="calldate")
	private String calldate;
	
	@Column(name="callduration")
	private Integer callduration;
	
	@Column(name="callname")
	private String callname;
}


