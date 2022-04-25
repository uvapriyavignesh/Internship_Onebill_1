package com.te.casestudy.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import com.te.casestudy.dto.Actor;

@Configuration
@Import({ MovieConfig.class, DirectorConfig.class, MovieCasteConfig.class, MovieRatingConfig.class })
public class AllConfig {
	@Bean(name = "actor")
	@Primary
	
	public Actor actor() {

		Actor a1 = new Actor();
		a1.setActorName("lingesh");
		a1.setMale(true);
		return a1;
	}

	

	

}
