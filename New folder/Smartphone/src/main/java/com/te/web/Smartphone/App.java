package com.te.web.Smartphone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.web.module.Call;
import com.te.web.module.Person;
import com.te.web.module.Pet;
import com.te.web.module.SmartPhone;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		SmartPhone s1 = new SmartPhone();
		// s1.setPhoneId(1);
		s1.setPhoneName("NOKIA");

		Person p1 = new Person();
		p1.setPersonName("arun");

		s1.setPerson(p1);
		p1.setPhone(s1);
		
		Pet pet1=new Pet();
		pet1.setPetName("dog");
		
		Pet pet2=new Pet();
		pet2.setPetName("cat");
		
		List <Pet> pl=new ArrayList<Pet>();
		pl.add(pet1);
		pl.add(pet2);
		
		p1.setPet(pl);
		List <Person> pel=new ArrayList<Person>();
		pel.add(p1);
		
		pet1.setPerson(pel);
		
		
		Call c1 =new Call();
		c1.setCallName("call0");
		
		Call c2 =new Call();
		c2.setCallName("call1");
		
		List<Call> cl=new ArrayList<Call>();
		cl.add(c1);
		cl.add(c2);
		
		s1.setCall(cl);
		c1.setPhone(s1);
		c2.setPhone(s1);
		entityTransaction.begin();
		entityManager.persist(s1);
		//entityManager.persist(s2);
		//entityManager.persist(s2);

		entityTransaction.commit();

	}
}
