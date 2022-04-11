package com.te.web.movie;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "director")
public class Director {
	@Id
	@Column(name = "director_id")
	private int directorID;
	@Column(name = "director_name")
	private String directorName;
	@OneToMany(mappedBy = "director")
	private List<Movie> movies;

}
