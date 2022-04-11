package com.te.web.curd;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class Update {
	public static void updateMobile(EntityManager em, EntityTransaction et) {
		System.out.println("Enter id to update :");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		System.out.println("Enter name to update :");
		s.nextLine();
		String nextLine = s.nextLine();
		String str = "update SmartPhone set phoneName =:name where phoneId=:id";
		Query createQuery = em.createQuery(str);
		createQuery.setParameter("id", id);
		createQuery.setParameter("name", nextLine);

		// Object singleResult = createQuery.getSingleResult();
		et.begin();
		int executeUpdate = createQuery.executeUpdate();
		et.commit();
		System.out.println("Number of Rows Affected:" + executeUpdate);
	}

	public static void updatePerson(EntityManager em, EntityTransaction et) {
		System.out.println("Enter id to update :");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		System.out.println("Enter name to update :");
		s.nextLine();
		String nextLine = s.nextLine();
		String str = "update Person set phoneName =:name where phoneId=:id";
		Query createQuery = em.createQuery(str);
		createQuery.setParameter("id", id);
		createQuery.setParameter("name", nextLine);

		// Object singleResult = createQuery.getSingleResult();
		et.begin();
		int executeUpdate = createQuery.executeUpdate();
		et.commit();
		System.out.println("Number of Rows Affected:" + executeUpdate);
	}

}
