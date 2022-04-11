package com.te.web.Smartphone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.web.curd.Display;
import com.te.web.curd.Update;
import com.te.web.module.Call;
import com.te.web.module.Person;
import com.te.web.module.Pet;
import com.te.web.module.SmartPhone;

/**
 * Hello world!
 *
 */
public class App {
	private static final String Object = null;

	public static void main(String[] args) {
		System.out.println("Hello World!");
		String persisDbName = "db2";

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		/*
		 * SmartPhone s1 = new SmartPhone(); // s1.setPhoneId(1);
		 * s1.setPhoneName("NOKIA");
		 * 
		 * Person p1 = new Person(); p1.setPersonName("arun");
		 * 
		 * s1.setPerson(p1); p1.setPhone(s1);
		 * 
		 * Pet pet1=new Pet(); pet1.setPetName("dog");
		 * 
		 * Pet pet2=new Pet(); pet2.setPetName("cat");
		 * 
		 * List <Pet> pl=new ArrayList<Pet>(); pl.add(pet1); pl.add(pet2);
		 * 
		 * p1.setPet(pl); List <Person> pel=new ArrayList<Person>(); pel.add(p1);
		 * 
		 * pet1.setPerson(pel);
		 * 
		 * 
		 * Call c1 =new Call(); c1.setCallName("call0");
		 * 
		 * Call c2 =new Call(); c2.setCallName("call1");
		 * 
		 * List<Call> cl=new ArrayList<Call>(); cl.add(c1); cl.add(c2);
		 * 
		 * s1.setCall(cl); c1.setPhone(s1); c2.setPhone(s1);
		 */
		/*
		 * entityTransaction.begin(); entityManager.persist(s1);
		 * //entityManager.persist(s2); //entityManager.persist(s2);
		 * 
		 * entityTransaction.commit();
		 */
		Scanner s = new Scanner(System.in);
		boolean ex = true;
		do {
			System.out.println(" 1.Display Tables\n 2.Update values \n 10.Exit");
			int chose = s.nextInt();

			switch (chose) {
			case 1:
				System.out.println(
						" 1.Display Phone Tables \n 2.Display Person Table\n 3.Display Pet Table\n 4.Display Call Table");
				int a = s.nextInt();
				switch (a) {
				case 1:
					Display.displayMobile(persisDbName);
					break;
				case 2:
					Display.displayperson(persisDbName);
					break;
				case 3:
					Display.displaypet(persisDbName);
					break;
				case 4:
					Display.displaycall(persisDbName);
					break;
				default:
					break;
				}

				break;
				
			case 2:
				System.out.println(
						" 1.Update Phone Tables \n 2.Update Person Table\n 3.Update Pet Table\n 4.Update Call Table");
				int a1 = s.nextInt();
				switch (a1) {
				case 1:
					Update.updateMobile(entityManager, entityTransaction);
					break;
				case 2:
					//Display.displayperson(persisDbName);
					break;
				case 3:
					//Display.displaypet(persisDbName);
					break;
				case 4:
					//Display.displaycall(persisDbName);
					break;
				default:
					break;
				}
				break;
			case 10:
				ex = false;
				break;
			default:
				System.out.println("WARNING!!!!! \n Enter valid input");
				break;
			}
		} while (ex);
	}
}
