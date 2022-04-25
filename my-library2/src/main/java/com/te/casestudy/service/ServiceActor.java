package com.te.casestudy.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.te.casestudy.dao.CreateDb;
import com.te.casestudy.my_library.App;
@Component
//@Configuration
public class ServiceActor {
	public ServiceActor() {
		System.out.println("Servicr called .............");
	}
	@Autowired
	private CreateDb app;
	@Bean(name="service")
	public void getController(String name, String gender, String movieTitle, String movieLang, int movieYear,
			String directorName, Long directorPhoneNo, String role, float rating) {
		
		boolean nameOk, specalCheck, male = true;
		gender = gender.toLowerCase();
		nameOk = integerPresentInString(name);
		specalCheck = checkSpecal(name);
		
		if (gender.equals("male")) {
			male = true;
		} else if (gender.equals("female")) {
			male = false;
		} else {
			System.out.println("Enter valid gender male/female:");
		}
		if ((nameOk || specalCheck)) {
			// check gender===================

			// check name===================================================
			if (nameOk) {
				System.out.println(" Enter valid name !!!! without Digit");

			}

			else if (specalCheck) {
				System.out.println(" Enter valid name !!!! without specal charecter");
			}

		} else {

			boolean mn, mt, ml, mns, mts, mls, year = true;

			mt = integerPresentInString(movieTitle);
			mts = checkSpecal(movieTitle);
			ml = integerPresentInString(movieLang);
			mls = checkSpecal(movieLang);
			if (movieYear > 1900 && movieYear < 2025) {
				year = false;
			}

			if (mt || ml || year || mts || mls) {

				if (mt)
					System.out.println(" Enter valid title !!!! without Digit");
				else if (mts)
					System.out.println(" Enter valid title !!!! without specal charecter");

				if (year) {
					System.out.println("Enter valid Year!!!");
				}
				if (ml)
					System.out.println(" Enter valid language !!!! without Digit");
				if (mls)
					System.out.println(" Enter valid language !!!! without specal charecter");
			}
			// System.out.println("enter director");
			else {
				// System.out.println("enter director");
				boolean dn, dns, phonelength = true;
				dn = integerPresentInString(directorName);
				dns = checkSpecal(directorName);
				String str = directorPhoneNo.toString();
				if ((str.length()) == 10)
					phonelength = false;
				if ((dn || dns || phonelength)) {
					if (dn)
						System.out.println(" Enter valid director name !!!! without digit charecter");
					if (phonelength)
						System.out.println("Enter valid phone number");
					if (dns)
						System.out.println(" Enter valid director name !!!! without specal charecter");
				} else {
					// System.out.println("roleeee");
					boolean rol, rols;
					rol = integerPresentInString(role);
					rols = checkSpecal(role);
					if (rol || rols) {
						if (rol)
							System.out.println(" Enter valid roll !!!! without digit charecter");
						if (rols)
							System.out.println(" Enter valid roll !!!! without specal charecter");
					} else {
						boolean rat = true;
						if (rating > 0.0f && rating < 10.1f) {
							rat = false;
							
						}else {
							System.out.println("Give valid Rating !!!!!!");
						}
						if (!rat) {
							System.out.println("Congratulation All Atribute Seted Succesfully");
							System.out.println("Now Creating DataBase");
				
							app.setActor(name, male, movieTitle, movieLang, movieYear, directorName, directorPhoneNo,role, rating);
							
						}

					}

				}

			}
		}
	}

	public boolean integerPresentInString(String sample) {
		boolean check = false;
		char[] chars = sample.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : chars) {
			if (Character.isDigit(c)) {
				check = true;
				break;

			}
		}
		return check;

	}

	public boolean checkSpecal(String sample) {
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(sample);
		boolean b = m.find();

		if (b)
			return true;
		return false;
	}

}
