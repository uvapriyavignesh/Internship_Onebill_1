package com.te.web.curd;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.web.module.Call;
import com.te.web.module.Person;
import com.te.web.module.Pet;
import com.te.web.module.SmartPhone;

public class Display {
	public static void displayMobile(String persistenceDbName) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceDbName);
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		String str = "from SmartPhone ";
		Query createQuery = entityManager.createQuery(str);
		List resultList = createQuery.getResultList();
		System.out.println("----------------------------------------------");
		for (Object object : resultList) {
			SmartPhone s = (SmartPhone) object;
			System.out.println(s);

		}
		System.out.println("----------------------------------------------");
	}

	public static void displayperson(String persistenceDbName) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceDbName);
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		String str = "from Person ";
		Query createQuery = entityManager.createQuery(str);
		List resultList = createQuery.getResultList();
		System.out.println("----------------------------------------------");
		for (Object object : resultList) {
			Person s = (Person) object;
			System.out.println(s);

		}
		System.out.println("----------------------------------------------");
	}

	public static void displaypet(String persistenceDbName) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceDbName);
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		String str = "from Pet ";
		Query createQuery = entityManager.createQuery(str);
		List resultList = createQuery.getResultList();
		System.out.println("----------------------------------------------");
		for (Object object : resultList) {
			Pet s = (Pet) object;
			System.out.println(s);

		}
		System.out.println("----------------------------------------------");
	}

	public static void displaycall(String persistenceDbName) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceDbName);
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		String str = "from Call ";
		Query createQuery = entityManager.createQuery(str);
		List resultList = createQuery.getResultList();
		System.out.println("----------------------------------------------");
		for (Object object : resultList) {
			Call s = (Call) object;
			System.out.println(s);

		}
		System.out.println("----------------------------------------------");
	}
}