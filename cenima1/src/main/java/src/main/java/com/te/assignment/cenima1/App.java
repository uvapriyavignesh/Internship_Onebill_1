package src.main.java.com.te.assignment.cenima1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import src.main.java.com.te.assignment.modules.Actor;
import src.main.java.com.te.assignment.modules.Director;
import src.main.java.com.te.assignment.modules.*;



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

		System.out.println("1---------------------------------------");

		Actor a1 = new Actor();
		a1.setActorName("VIJAY");
		a1.setMale(true);

		Actor a2 = new Actor();
		a2.setActorName("POOJA");
		a2.setMale(false);

		Director director1 = new Director();
		director1.setDirectorName("NELSON");
		director1.setDirectorPhoneno(9123456780l);

		Movie movie1 = new Movie();
		movie1.setMovieLanguage("TAMIL");
		movie1.setMovieTitle("BEAST");
		movie1.setMovieYear(2022);

		MovieCast cast1 = new MovieCast();
		cast1.setRole("HERO");
		cast1.setActor(a1);

		MovieCast cast2 = new MovieCast();
		cast2.setRole("HEROIEN");
		cast2.setActor(a2);

		MovieRating rating1 = new MovieRating();
		rating1.setReviewStar(4.5f);

		cast2.setMovie(movie1);
		cast1.setMovie(movie1);

		List l1 = new ArrayList();
		l1.add(cast1);
		a1.setMoviecast(l1);
		List l2 = new ArrayList();
		l2.add(cast2);
		a2.setMoviecast(l2);

		List<MovieCast> castList = new ArrayList<MovieCast>();
		castList.add(cast1);
		castList.add(cast2);

		movie1.setMovieCasts(castList);
		movie1.setDirector(director1);
		movie1.setRating(rating1);

		rating1.setMovie(movie1);

		System.out.println("1---------------------------------------");

		Actor aa1 = new Actor();
		aa1.setActorName("YASH");
		aa1.setMale(true);

		Actor aa2 = new Actor();
		aa2.setActorName("LILY");
		aa2.setMale(false);

		Director director11 = new Director();
		director11.setDirectorName("NEEL");
		director11.setDirectorPhoneno(6789054321l);

		Movie movie11 = new Movie();
		movie11.setMovieLanguage("TAMIL");
		movie11.setMovieTitle("KGF2");
		movie11.setMovieYear(1994);

		MovieCast cast11 = new MovieCast();
		cast11.setRole("HERO");
		cast11.setActor(aa1);

		MovieCast cast22 = new MovieCast();
		cast22.setRole("HEROIEN");
		cast22.setActor(aa2);

		MovieRating rating11 = new MovieRating();
		rating11.setReviewStar(4.9f);

		cast22.setMovie(movie11);
		cast11.setMovie(movie11);

		List l3 = new ArrayList();
		l3.add(cast11);
		aa1.setMoviecast(l3);
		List l4 = new ArrayList();
		l4.add(cast22);
		aa2.setMoviecast(l4);

		List<MovieCast> castList1 = new ArrayList<MovieCast>();
		castList1.add(cast11);
		castList1.add(cast22);

		movie11.setMovieCasts(castList1);
		movie11.setDirector(director11);
		movie11.setRating(rating11);

		rating11.setMovie(movie11);

		System.out.println("1---------------------------------------");

		Actor aa11 = new Actor();
		aa11.setActorName("VADIVEL");
		aa11.setMale(true);

		MovieCast cast111 = new MovieCast();
		cast111.setRole("COMEDY");
		cast111.setActor(aa11);

		MovieCast cast112 = new MovieCast();
		cast112.setRole("COMEDY");
		cast112.setActor(aa11);

		cast111.setMovie(movie11);
		cast112.setMovie(movie1);
		List l5 = new ArrayList();
		l5.add(cast111);
		l5.add(cast112);

		aa11.setMoviecast(l5);
		// aa2.setMoviecast(cast112);

		castList1.add(cast111);
		castList.add(cast112);

		movie11.setMovieCasts(castList1);
		movie1.setMovieCasts(castList);
		movie11.setDirector(director11);
		movie11.setRating(rating11);

		rating11.setMovie(movie11);

		entityTransaction.begin();
		entityManager.persist(a1);
		entityManager.persist(aa1);
		entityTransaction.commit();

	}
}
