package com.le.singleton;

public class Sample {

	private static Sample a1;
	private Sample() {
		
		
	}
	public static Sample needObject() {
		if (a1==null){
			a1= new Sample();
			return a1;
		}
		return a1;
	}

}
