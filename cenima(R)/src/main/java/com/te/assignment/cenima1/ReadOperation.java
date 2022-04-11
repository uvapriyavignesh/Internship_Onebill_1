package com.te.assignment.cenima1;

import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.te.assignment.modules.Movie;
import com.te.assignment.modules.MovieCast;
import com.te.assignment.modules.MovieRating;
import com.te.assignment.modules.Actor;
import com.te.assignment.modules.Director;
//import com.te.assignment.modules.Integer;

public class ReadOperation {
	public static void listMovies(EntityManager em) {
		String movie = "from Movie";

		Query query = em.createQuery(movie);
		List resultList = query.getResultList();
		for (Object object : resultList) {
			Movie m1 = (Movie) object;
			System.out.println(m1.getMovieTitle());
		}

	}

	public static void actorMaxMovie(EntityManager em) {
		String movie = "select actor from MovieCast";

		Query query = em.createQuery(movie);
		List list = query.getResultList();
		List<Integer> actorid = new ArrayList<Integer>();
		for (Object object : list) {
			Actor mc = (Actor) object;
			actorid.add(mc.getActorId());

		}

		Set<Integer> s1 = new HashSet<Integer>();
//to obtain frequency
		for (Integer i : actorid) {
			if ((Collections.frequency(actorid, i)) > 1) {
				// System.out.println(i);
				s1.add(i);
				// actorid1.remove(i);

			}
		}
//System.out.println(list.size());
		for (Object object : list) {
			for (Integer integer : s1) {
				Actor mc = (Actor) object;
				if ((mc.getActorId()) == integer) {
					System.out.println(integer);
					System.out.println("-------------");
					System.out.print(" Actor name= " + mc.getActorName() + " ");
					// System.out.println(mc.getMoviecast());
					for (MovieCast sample : mc.getMoviecast()) {
						System.out.print(" Performing roll = " + sample.getRole());
						System.out.print(" in Movie Title= " + sample.getMovie().getMovieTitle());
						System.out.println(" - ");
						// break;

					}
				}

			}

		}

	}

	public static void actorMovieInbellow2000(EntityManager em) {
		String movie = "from Movie where movieYear<2000 ";

		Query query = em.createQuery(movie);
		List list = query.getResultList();

		for (Object object : list) {
			Movie m1 = (Movie) object;
			for (MovieCast ob : m1.getMovieCasts()) {
				System.out.print(" Actor=" + ob.getActor().getActorName() + " Roll=" + ob.getRole());
			}
			System.out.print(" Movie=" + m1.getMovieTitle());
			System.out.println(" Year=" + m1.getMovieYear());
		}

	}

	public static void actorMovieInAbove2000(EntityManager em) {
		String movie = "from Movie where movieYear>2000 ";

		Query query = em.createQuery(movie);
		List list = query.getResultList();

		for (Object object : list) {
			Movie m1 = (Movie) object;
			for (MovieCast ob : m1.getMovieCasts()) {
				System.out.print(" Actor=" + ob.getActor().getActorName() + " Roll=" + ob.getRole());
			}
			System.out.print(" Movie=" + m1.getMovieTitle());
			System.out.println(" Year=" + m1.getMovieYear());
		}
	}

	public static void movieAndRating(EntityManager em) {
		String movie = "from MovieRating";

		Query query = em.createQuery(movie);
		List list = query.getResultList();
		for (Object object : list) {
			MovieRating mr = (MovieRating) object;
			System.out.println(
					" Movie name=" + mr.getMovie().getMovieTitle() + " - " + " MovieReview=" + mr.getReviewStar());
		}
	}

	public static void movieMaxRating(EntityManager em) {
		String movie = "from MovieRating where reviewStar=(select max(reviewStar) from MovieRating)";

		Query query = em.createQuery(movie);
		List list = query.getResultList();
		// System.out.println(list.toString());
		/*
		 * List<Float> review = new ArrayList<Float>(); for (Object float1 : list) {
		 * MovieRating movieRating = (MovieRating) float1;
		 * review.add(movieRating.getReviewStar()); } // System.out.println(list); //
		 * System.out.println(Collections.max(review)); for (Object float1 : list) {
		 * MovieRating movieRating = (MovieRating) float1;
		 * 
		 * if (Collections.max(review) == movieRating.getReviewStar()) {
		 * System.out.println(" Movie Name=" + movieRating.getMovie().getMovieTitle() +
		 * " - " + "Rating =" + movieRating.getReviewStar()); } }
		 */
		for (Object float1 : list) {
			MovieRating movieRating = (MovieRating) float1;
			System.out.println(" Movie Name=" + movieRating.getMovie().getMovieTitle() + " - " + "Rating ="
					+ movieRating.getReviewStar());
		}
	}

	public static void directorPerformedMovie(EntityManager em, String directorName) {
		String movie = "from Director where directorName=:name";

		Query query = em.createQuery(movie);
		directorName = directorName.toUpperCase();
		query.setParameter("name", directorName);
		List list = query.getResultList();
		if (list.isEmpty()) {

			System.out.println("Data not Found !!!!!!");

		} else {
			for (Object object : list) {
				Director d1 = (Director) object;

				for (Object object2 : d1.getMovie()) {
					Movie d2 = (Movie) object2;
					System.out.print(" Director Name=" + d1.getDirectorName() + " Movie Name=");
					System.out.println(d2.getMovieTitle());

				}

			}
		}
	}

}
