package com.te.casestudy.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "movie")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "movie_id")
	private int movieId;
	@Column(name = "movie_title")
	private String movieTitle;
	@Column(name = "movie_year")
	private int movieYear;
	@Column(name = "movie_language")
	private String movieLanguage;
	// @Column(name = "director_fk")
	@Autowired
	@ManyToOne(cascade = CascadeType.ALL)
	// @Column(name = "director_fk")
	private Director director;
	@Autowired
	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
	@Column(name = "movie_cast_fk")
	private List<MovieCast> movieCasts;
	@Autowired
	@OneToOne(mappedBy = "movie", cascade = CascadeType.ALL, orphanRemoval = true)
	// @Column(name="movie_rating_fk")
	private MovieRating rating;
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + ", movieYear=" + movieYear
				+ ", movieLanguage=" + movieLanguage + "]";
	}

}
