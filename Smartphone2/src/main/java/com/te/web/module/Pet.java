package com.te.web.module;

import java.util.List;

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
@Table(name = "pet")
public class Pet {
	@Id
	@Column(name = "pet_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int petId;
	@Column(name = "pet_name")
	private String petName;
	@ManyToMany
	private List<Person> person;
	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", petName=" + petName + "]";
	}

}
