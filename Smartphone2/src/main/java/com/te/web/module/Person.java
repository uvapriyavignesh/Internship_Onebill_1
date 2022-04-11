package com.te.web.module;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "person")
public class Person {
	@Id
	@Column(name = "person_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personId;
	@Column(name = "person_name")
	private String personName;
	@OneToOne
	private SmartPhone phone;
	
	@ManyToMany(mappedBy = "person",cascade = CascadeType.ALL)
	private List<Pet> pet;

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}


}
