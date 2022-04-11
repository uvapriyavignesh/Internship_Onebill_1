package com.le.prototypepattern;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Details d1=new Details(1,"raj",78,23456);
		Details clone = (Details)d1.clone();
        System.out.println(d1);
        clone.seteId(2);
        System.out.println(clone);
	}

}
