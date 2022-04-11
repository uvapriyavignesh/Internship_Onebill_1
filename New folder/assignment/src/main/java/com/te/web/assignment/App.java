package com.te.web.assignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.web.movie.Actor;
import com.te.web.movie.Director;
import com.te.web.movie.Movie;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		//String str="delete from Movie where movieID=:id";
		String str="update Movie set movieName=:name where movieID=:id";
		Query createQuery = entityManager.createQuery(str);
		createQuery.setParameter("id", 2);
		createQuery.setParameter("name", "Doctor");
		
		//Movie singleResult = (Movie)createQuery.getSingleResult();
		/*
		 * System.out.println("---------------------------------------------------");
		 * System.out.println(singleResult.getMovieID());
		 * System.out.println(singleResult.getMovieName());
		 */
		entityTransaction.begin();
		int value=createQuery.executeUpdate();
		entityTransaction.commit();
		System.out.println("---------------------------------------------------"+value);
		
		
		/*
		 * Movie m1 = new Movie(); m1.setMovieID(1); m1.setMovieName("KGF2");
		 * 
		 * Movie m2 = new Movie(); m2.setMovieID(2); m2.setMovieName("BEAST");
		 * 
		 * Director d1 = new Director(); d1.setDirectorID(1);
		 * d1.setDirectorName("SANKER");
		 * 
		 * m1.setDirector(d1); m2.setDirector(d1);
		 * 
		 * List<Movie> ml = new ArrayList<Movie>(); ml.add(m1); ml.add(m2);
		 * d1.setMovies(ml);
		 * 
		 * Actor a1 = new Actor(); a1.setActorId(1); a1.setActorName("VIJAY");
		 * 
		 * Actor a2 = new Actor(); a2.setActorId(2); a2.setActorName("yash");
		 * 
		 * List<Actor> al = new ArrayList<Actor>(); al.add(a1); al.add(a2);
		 * 
		 * m1.setActor(al); m2.setActor(al); a1.setMovie(ml); a2.setMovie(ml);
		 * 
		 * entityTransaction.begin(); entityManager.persist(m1); //
		 * entityManager.persist(d1); entityTransaction.commit();
		 */
	}
}
