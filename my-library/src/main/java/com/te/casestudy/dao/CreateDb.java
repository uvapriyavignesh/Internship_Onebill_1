package com.te.casestudy.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.casestudy.dto.Actor;




/**
 * Hello world!
 *
 */

public class CreateDb {
	
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
}
