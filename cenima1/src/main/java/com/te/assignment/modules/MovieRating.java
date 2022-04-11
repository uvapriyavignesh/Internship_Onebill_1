package com.te.assignment.modules;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie_rating")
public class MovieRating {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "movie_review_id")
	private int movieReviewId;
	@Column(name = "movie_review_star")
	private float reviewStar;
	@OneToOne
	private Movie movie;

}
