package com.te.casestudy.my_library;

import java.util.ArrayList;
import java.util.List;

import javax.tools.Diagnostic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.casestudy.config.Singleton;
import com.te.casestudy.dao.CreateDb;
import com.te.casestudy.dto.Actor;
import com.te.casestudy.dto.Director;
import com.te.casestudy.dto.Movie;
import com.te.casestudy.dto.MovieCast;
import com.te.casestudy.dto.MovieRating;
import com.te.casestudy.service.ServiceActor;


/**
 * Hello world!
 *
 */
public class App {
	

	public static ApplicationContext main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				com.te.casestudy.config.AllConfig.class);

	    //Object bean = applicationContext.getBean("service");
	    //ServiceActor s1=(ServiceActor)bean;
	    return applicationContext;
		// System.out.println(a1.getMoviecast());

		// com.te.casestudy.dao.App.createDb(a1);
		// System.out.println(Singleton.getObject());

	}

	
}
