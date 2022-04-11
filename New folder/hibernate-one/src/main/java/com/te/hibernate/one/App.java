package com.te.hibernate.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.web.person.Address;
import com.te.web.person.Course;
import com.te.web.person.Person;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		System.out.println("hai hello");
		EntityManagerFactory entityManagerFactor = Persistence.createEntityManagerFactory("db1");
		EntityManager entityManager = entityManagerFactor.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		// Person person=new Person();
		Address adress = new Address();
		adress.setAId(1);
		adress.setLan0("1");
		adress.setLan1("1");
		adress.setPinCode(1234);
		Address adress1 = new Address();
		adress1.setAId(2);
		adress1.setLan0("2");
		adress1.setLan1("2");
		adress1.setPinCode(34);

		Person person1 = new Person();
		person1.setPersonId(1);
		person1.setPerson_age(78);
		person1.setPersonName("raj");
		Course c1=new Course();
		c1.setCourseId(1);
		c1.setCorseName("java");
		Course c2=new Course();
		c2.setCourseId(2);
		c2.setCorseName("c");
		Course c3=new Course();
		c3.setCourseId(3);
		c3.setCorseName("c++");
		Person person2 = new Person();
		person2.setPersonId(2);
		person2.setPerson_age(68);
		person2.setPersonName("abi");
		Person person3 = new Person();
		person3.setPersonId(3);
		person3.setPerson_age(18);
		person3.setPersonName("bala");
		Address adress2 = new Address();
		adress2.setAId(3);
		adress2.setLan0("3");
		adress2.setLan1("3");
		adress2.setPinCode(14);
		
			
		adress.setPerson(person1);
		adress1.setPerson(person2);
		adress2.setPerson(person3);
		
		
		ArrayList<Address> test=new ArrayList<Address>();
		test.add(adress);
		test.add(adress1);
		person1.setAdress(test);
		ArrayList<Address> test1=new ArrayList<Address>();
		test1.add(adress1);
		test1.add(adress2);
		person2.setAdress(test1);
		ArrayList<Address> test3=new ArrayList<Address>();
		test3.add(adress1);
		
		person3.setAdress(test3);
		ArrayList<Course> cs1=new ArrayList<Course>();
		cs1.add(c1);
		cs1.add(c3);
		person1.setCourse(cs1);
		ArrayList<Course> cs2=new ArrayList<Course>();
		cs2.add(c1);
		
		person2.setCourse(cs2);
		ArrayList<Course> cs3=new ArrayList<Course>();
		cs3.add(c1);
		cs3.add(c2);
		cs3.add(c3);
		person3.setCourse(cs3);
		
		
		ArrayList<Person> ps1=new ArrayList<Person>();
		ps1.add(person1);
		ps1.add(person3);
		c1.setPerson(ps1);
		ArrayList<Person> ps2=new ArrayList<Person>();
		ps2.add(person1);
		
		c2.setPerson(ps2);
		ArrayList<Person> ps3=new ArrayList<Person>();
		ps3.add(person1);
		ps3.add(person2);
		ps3.add(person3);
		c3.setPerson(ps3);

		entityTransaction.begin();
		// entityManager.persist(person);
		entityManager.persist(person1);
		//entityManager.persist(adress);
		entityTransaction.commit();
	}

}
