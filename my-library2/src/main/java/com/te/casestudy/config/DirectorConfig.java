package com.te.casestudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.te.casestudy.dto.Actor;
import com.te.casestudy.dto.Director;

public class DirectorConfig {
	@Bean(name = "director")
	@Primary
	public Director nelson() {

		return new Director();

	}

}
