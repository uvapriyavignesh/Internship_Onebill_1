package com.te.casestudy.controller;

import org.springframework.context.ApplicationContext;

import com.te.casestudy.my_library.App;
import com.te.casestudy.service.ServiceActor;

public class test {
	public static void main(String[] args) {
		App a1= new App();
		ApplicationContext applicationContext = App.main(null);
		Object bean = applicationContext.getBean("service");
	    ServiceActor s1=(ServiceActor)bean;
		ActorInput  ai=new ActorInput();
		ai.main(null, s1);
 	}
}
