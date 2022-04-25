package com.te.casestudy.config;

import com.te.casestudy.dto.Actor;

public class Singleton {
	private Singleton() {
		
	}
	private static Actor a1;

	public static Actor needObject(String name, boolean male) {
		if (a1 == null) {
			a1 = new Actor();
			a1.setActorName(name);
			a1.setMale(male);
			return a1;
		}
		return a1;
	}

	public static Actor getObject() {
		return a1; 
	}
}
