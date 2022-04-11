package com.te.web.module;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "call")
public class Call {
	@Id
	@Column(name = "call_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int callId;
	@Column(name = "call_name")
	private String callName;
	@ManyToOne
	private SmartPhone phone;

}
