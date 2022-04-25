package com.te.casestudy.controller;

import java.util.Scanner;

import com.te.casestudy.config.Singleton;
import com.te.casestudy.service.ServiceActor;

public class ActorInput {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		//boolean male = true;
		System.out.println(" Enter the Actor name:");

		String actorName = s.nextLine();
		System.out.println(" Enter Actor gender :");
		String actorGender = s.nextLine();
		actorGender = actorGender.toLowerCase();
		
		// ====================================================================
		
		System.out.println(" Enter movie title :");
		String title = s.nextLine();
		System.out.println(" Enter movie year :");
		int year = s.nextInt();
		System.out.println(" Enter movie languange :");
		s.nextLine();
		String lang = s.nextLine();
		// ======================================================================
		System.out.println(" Enter the director name:");
		// Scanner s= new Scanner(System.in);
		//s.nextLine();
		String directorName = s.nextLine();
		System.out.println(" Enter Director phone no :");
		long phoneNo = s.nextLong();
		// =======================================================================
		System.out.println(" Enter the roll of actor:");
		// Scanner s= new Scanner(System.in);
		s.nextLine();
		String roll = s.nextLine();
		// =====================================================================
		System.out.println(" Enter the rating of movie:");
		Scanner s1= new Scanner(System.in);
		float rating = s1.nextFloat();
		
		
		
		ServiceActor sa= new ServiceActor();
		sa.getController(actorName, actorGender, title, lang, year, directorName, phoneNo, roll, rating);
	}

}
