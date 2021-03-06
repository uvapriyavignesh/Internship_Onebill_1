package com.te.casestudy.dto;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "actor")
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "actor_id")
	private int actorId;
	@Column(name = "actor_name")
	private String actorName;
	@Column(name = "actor_male")
	private boolean male;
	@Autowired
	@OneToMany(mappedBy = "actor", cascade = CascadeType.ALL)
	//@Qualifier("herocast")
	//@Qualifier("heroiencast")
	
	private List<MovieCast> moviecast;
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", male=" + male + "]";
	}
}
