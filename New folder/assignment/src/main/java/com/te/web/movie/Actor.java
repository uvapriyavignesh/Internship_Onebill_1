package com.te.web.movie;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

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
	@Column(name = "actor_id")
	private int actorId;
	@Column(name = "actor_name")
	private String actorName;
	@ManyToMany(cascade = CascadeType.ALL)
	// @JoinColumn(name="movie_fk")
	private List<Movie> movie;

}
