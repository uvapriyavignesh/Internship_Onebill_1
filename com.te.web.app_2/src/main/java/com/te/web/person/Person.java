package com.te.web.person;

import javax.persistence.Id;

import org.hibernate.annotations.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
	@Id
	private int person_id;
	private String person_name;
	private int person_age;

}
