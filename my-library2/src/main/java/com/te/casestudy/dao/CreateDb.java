package com.te.casestudy.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.te.casestudy.dto.Actor;
import com.te.casestudy.dto.Director;
import com.te.casestudy.dto.Movie;
import com.te.casestudy.dto.MovieCast;
import com.te.casestudy.dto.MovieRating;




/**
 * Hello world!
 *
 */
@Component
//@Configuration
public class CreateDb {
	@Autowired
	private Actor actor;
	@Autowired
	private Director director;
	@Autowired
	private Movie movie;
	@Autowired
	private MovieCast movieCast;
	@Autowired
	private MovieRating movieRating;
	
	public void  createDb(Actor a1)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db_library");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		//com.te.casestudy.my_library.App.getBean()
	   
		entityTransaction.begin();
		
		entityManager.persist(a1);
		entityTransaction.commit();
	}
	public void setActor(String name, boolean male, String movieTitle, String movieLang, int movieYear,
			String directorName, Long directorPhoneNo, String role, float rating) {
		
		actor.setActorName(name);
		actor.setMale(male);
		
		
		
		director.setDirectorName(directorName);
		director.setDirectorPhoneno(directorPhoneNo);
		//System.out.println(director);
		
		
		movie.setMovieTitle(movieTitle);
		movie.setMovieLanguage(movieLang);
		movie.setMovieYear(movieYear);
		//System.out.println(movie);
		
		
		
		movieCast.setRole(role);
		//System.out.println(movieCast);
		
		
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
		
		
		createDb(actor);
		
		
		
	}

}
