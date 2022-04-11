package com.le.factorydesignpattern;

public class Map {
	public Person mapping(String a) {
		if (a == "teacher") {
			return new Teacher();
		} else if (a == "student") {
			return new Student();

		} else if (a == "parent") {
			return new Parents();
		} else {
			System.out.println("Enter valid input!!!!!!");
		}
		return null;
	}

}
