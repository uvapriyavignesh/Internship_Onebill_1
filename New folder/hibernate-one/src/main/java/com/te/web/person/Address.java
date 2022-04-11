package com.te.web.person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="adderss")
public class Address {
	@Id
	@Column(name="address_id")
	private int aId;
	@Column(name="address_lan0")
	private String lan0;
	@Column(name="address_lan1")
	private String lan1;
	@Column(name="pin")
	private int pinCode;
	
	@ManyToOne
	//@JoinColumn (name="person_fk")
	private Person person;
	

}
