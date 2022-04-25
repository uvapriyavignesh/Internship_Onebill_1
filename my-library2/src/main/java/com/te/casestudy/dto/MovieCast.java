package com.te.casestudy.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie_caste")
public class MovieCast {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "moviecast_id")
	private int movieCastId;
	@Column(name = "role")
	private String role;
	@Autowired
	@ManyToOne(cascade = CascadeType.ALL)
	private Actor actor;
	@Autowired
	@ManyToOne(cascade = CascadeType.ALL)
	private Movie movie;
	@Override
	public String toString() {
		return "MovieCast [movieCastId=" + movieCastId + ", role=" + role + "]";
	}
}
