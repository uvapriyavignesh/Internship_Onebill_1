package com.te.casestudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.casestudy.controller.ActorInput;
import com.te.casestudy.dao.CreateDb;
import com.te.casestudy.dto.Actor;
import com.te.casestudy.service.ServiceActor;
@Configuration
public class conf {
	@Bean(name = "controller")
	@Primary
	
	public ActorInput actor() {
		return new ActorInput();
	}
	@Bean(name = "service")
	@Primary
	
	public ServiceActor service() {
		return new ServiceActor();
	}
	@Bean(name = "db")
	@Primary
	
	public CreateDb createdb() {
		return new CreateDb();
	}
}
