package com.te.web.com.te.web.app_2;

import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;

import com.te.web.person.Person;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   
  public static void main(String[] args) {
	    System.out.println("hai hello");
        EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("PU01");
        EntityManager entityManager =entityManagerFactor.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        Person person=new Person();
        person.setPerson_id(1);
        person.setPerson_name("ravi");
        person.setPerson_age(67);
       
        
        entityTransaction.begin();
        entityManager.persist(person);
        //entityManager.persist(person1);
        entityTransaction.commit();
	
}
/*
 * public void shouldAnswerWithTrue() { assertTrue( true );
 * 
 * }
 */
}
