package com.te.casestudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

//import com.te.casestudy.dto.Director;
import com.te.casestudy.dto.Movie;

public class MovieConfig {
	@Bean(name = "movie")
	@Primary
	public Movie beast() {
		Movie movie1 = new Movie();
		movie1.setMovieLanguage("TAMIL");
		movie1.setMovieTitle("BEAST");
		movie1.setMovieYear(2022);
		return movie1;
	}

}
