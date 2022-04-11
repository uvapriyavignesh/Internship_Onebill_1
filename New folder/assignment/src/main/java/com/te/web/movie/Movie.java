package com.te.web.movie;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie")
public class Movie {
	@Id
	@Column(name = "movie_id")
	private int movieID;
	@Column(name = "movie_name")
	private String movieName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dir_fk")
	private Director director;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "movie")
	// @JoinTable(name ="A_M_mapping" ,
	// joinColumns=@JoinColumn(name="movie_fk"),inverseJoinColumns =
	// @JoinColumn(name="actor_fk"))

	private List<Actor> actor;

}
