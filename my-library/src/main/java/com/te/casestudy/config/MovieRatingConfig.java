package com.te.casestudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

//import com.te.casestudy.dto.MovieCast;
import com.te.casestudy.dto.MovieRating;

public class MovieRatingConfig {
	@Bean(name = "rating")
	@Primary
	public MovieRating beastRating() {
		MovieRating rating11 = new MovieRating();
		rating11.setReviewStar(4.9f);
		return rating11;
	}

}
