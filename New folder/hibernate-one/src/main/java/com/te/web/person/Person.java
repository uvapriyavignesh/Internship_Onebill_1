package com.te.web.person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
	@Id
	@Column(name = "person_id")
	private int personId;
	@Column(name = "person_name")
	private String personName;
	@Column(name = "personAge")
	private int person_age;

	@OneToMany (cascade = CascadeType.ALL,mappedBy = "person")
	
	private List<Address> adress;
	
	@ManyToMany (cascade = CascadeType.ALL)
	@Column(name = "ListOfCarsDrivenByDriver")
	
	private List <Course> course; 

}
