package com.le.factorydesignpattern;

public class App {
	public static void main(String[] args) {
		Map map=new Map();
		Person mapping = map.mapping("teacher");
		mapping.quality();
	}

}
