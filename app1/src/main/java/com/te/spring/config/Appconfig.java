package com.te.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import com.te.spring.module.Address;
import com.te.spring.module.Student;
@Configuration
public class Appconfig {
	@Bean(name="student1")
	public Student setStudent() {
		Student student=new Student();
		student.setsId(1);
		student.setsAge(23);
		student.setsName("raj");
		return student;
	}
	@Bean(name="address")
	public Address setAdress() {
		Address address=new Address();
		address.setId(1);
		address.setCity("salem");
		address.setState("tamilnadu");
		return address;
	}

}
