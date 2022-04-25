package com.te.casestudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.te.casestudy.dto.Actor;

@Configuration
@Import({ MovieConfig.class, DirectorConfig.class, MovieCasteConfig.class, MovieRatingConfig.class, conf.class })
public class AllConfig {
	@Bean(name = "actor")
	@Primary

	public Actor actor() {

		return new Actor();
	}

}
