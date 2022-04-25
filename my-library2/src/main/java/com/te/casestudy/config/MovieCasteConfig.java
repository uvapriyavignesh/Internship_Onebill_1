package com.te.casestudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.te.casestudy.dto.Director;
import com.te.casestudy.dto.MovieCast;

public class MovieCasteConfig {
	@Bean(name = "cast")
	@Primary
	public MovieCast herocast() {

		return new MovieCast();
	}

}
