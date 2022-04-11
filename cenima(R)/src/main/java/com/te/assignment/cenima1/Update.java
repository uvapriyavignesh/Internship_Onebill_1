package com.te.assignment.cenima1;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.te.assignment.modules.MovieRating;

public class Update {
	public static void udateReviewByDirector(EntityManager em, EntityTransaction et, String directorName,
			float rating) {
		String query = "update MovieRating set reviewStar=:rating where movie =( from Movie where director=(from Director where directorName=:director_name ) )";
		directorName = directorName.toUpperCase();
		// Query q1=em.createQuery(query);
		et.begin();
		Query q1 = em.createQuery(query);
		q1.setParameter("director_name", directorName);
		q1.setParameter("rating", rating);
		int status = q1.executeUpdate();
		System.out.println(status + " Row Affected");
		et.commit();

	}

}
