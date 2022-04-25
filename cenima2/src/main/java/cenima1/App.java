package cenima1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import javax.persistence.Query;



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

		// ReadOperation.directorPerformedMovie(entityManager,"nelso");
		// Update.udateReviewByDirector(entityManager, entityTransaction,"NELSOn",2);
		// ReadOperation.actorMaxMovie(entityManager);
		// ReadOperation.actorMovieInbellow2000(entityManager);
		// ReadOperation.actorMovieInAbove2000(entityManager);
		// ReadOperation.movieAndRating(entityManager);
		// ReadOperation.movieMaxRating(entityManager);
		// Update.udateReviewByDirector(entityManager, entityTransaction, "Nelson", 9);
		boolean exit = false;
		do {
			System.out.println(
					"1. Find movies Directed by Director \n2.A Actors perform more than one movie \n3.Movie released before 2000 \n4.Movie released After 2015 \n5.Movies & reviews \n6.Update rating Directed by Particular Director \n7.High rating Movie \n8.exit \n Enter your choice");
			Scanner s = new Scanner(System.in);
			int key = s.nextInt();

			switch (key) {
			case 1:
				System.out.println(" Enter Director Name :");
				s.nextLine();
				String name = s.nextLine();
				ReadOperation.directorPerformedMovie(entityManager, name);
				break;
			case 2:
				ReadOperation.actorMaxMovie(entityManager);
				break;
			case 3:
				ReadOperation.actorMovieInbellow2000(entityManager);
				break;
			case 4:
				ReadOperation.actorMovieInAbove2000(entityManager);
				break;
			case 5:
				ReadOperation.movieAndRating(entityManager);
				break;
			case 6:
				System.out.println(" Enter Director Name to update review :");
				s.nextLine();
				String name1 = s.nextLine();
				System.out.println(" Enter Review or Rating:");
				float rating = s.nextInt();
				Update.udateReviewByDirector(entityManager, entityTransaction, name1, rating);
				break;
			case 7:
				ReadOperation.movieMaxRating(entityManager);
				break;
			case 8:
				System.out.println("Exit Succesfully");
				exit = true;
				break;

			default:
				break;
			}
		} while (!exit);
	}

}
