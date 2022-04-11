package com.le.singleton;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sample s1= Sample.needObject();
        Sample s2= Sample.needObject();
        //Sample s2=new Sample();
        System.out.println(s1);
        System.out.println(s2);
	}

}
