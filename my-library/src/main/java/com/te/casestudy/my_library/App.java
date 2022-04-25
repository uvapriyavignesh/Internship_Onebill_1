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


/**
 * Hello world!
 *
 */
public class App {
	public static ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
			com.te.casestudy.config.AllConfig.class);

	public static void main(String[] args) {
		System.out.println("Hello World!");

	
		// System.out.println(a1.getMoviecast());

		// com.te.casestudy.dao.App.createDb(a1);
		// System.out.println(Singleton.getObject());

	}

	public static void setActor(String name, boolean male, String movieTitle, String movieLang, int movieYear,
			String directorName, Long directorPhoneNo, String role, float rating) {
		Object bean = applicationContext.getBean("actor");
		Actor actor=(Actor)bean;
		actor.setActorName(name);
		actor.setMale(male);
		
		
		Object dire = applicationContext.getBean("director");
		Director director=(Director)dire;
		director.setDirectorName(directorName);
		director.setDirectorPhoneno(directorPhoneNo);
		//System.out.println(director);
		
		Object mov = applicationContext.getBean("movie");
		Movie movie=(Movie)mov;
		movie.setMovieTitle(movieTitle);
		movie.setMovieLanguage(movieLang);
		movie.setMovieYear(movieYear);
		//System.out.println(movie);
		
		
		Object cast = applicationContext.getBean("cast");
		MovieCast movieCast=(MovieCast)cast;
		movieCast.setRole(role);
		//System.out.println(movieCast);
		
		Object rate = applicationContext.getBean("rating");
		MovieRating movieRating=(MovieRating)rate;
		movieRating.setReviewStar(rating);
		//System.out.println(movieRating);
		
		
		//ACTOR
		List<MovieCast> mc=new ArrayList<MovieCast>();
		mc.add(movieCast);
		actor.setMoviecast(mc);
		
		//director
		List<Movie> m1=new ArrayList<Movie>();
		m1.add(movie);
		director.setMovie(m1);
		
		//movie
		movie.setDirector(director);
		movie.setMovieCasts(mc);
		movie.setRating(movieRating);
		
		
		//moviecast
		movieCast.setActor(actor);
		movieCast.setMovie(movie);
        
		
		//rating
		movieRating.setMovie(movie);
		
		CreateDb writingInDb= new CreateDb();
		writingInDb.createDb(actor);
		
		
		
	}

}
