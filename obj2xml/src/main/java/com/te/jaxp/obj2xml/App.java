package com.te.jaxp.obj2xml;

import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.te.jaxp.dto.Address;
import com.te.jaxp.dto.Student;

/**
 * Hello world!
 *
 */
public class App {
	private static final String Student = null;

	public static void main(String[] args) throws JAXBException {
		System.out.println("Hello World!");
		
		Address add=new Address();
		add.setId(1);
		add.setCity("salem");
		add.setState("Tamilnadu");

		Student student = new Student();
		student.setsId(1);
		student.setsAge(23);
		student.setsName("ABU");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Tamil", 89);
		map.put("English", 67);
		map.put("Maths", 99);
		map.put("Science", 79);
		map.put("Social", 83);
         
		
		student.setAdress(add);
		student.setMark(map);
//
//		JAXBContext context = JAXBContext.newInstance(Student.class);
//		Marshaller marshaller = context.createMarshaller();
//		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//		StringWriter handler = new StringWriter();
//
//		File file = new File("src/main/java/test.xml");
//		marshaller.marshal(student, file);

		/*
		 * JAXBContext jax=JAXBContext.newInstance(Student.class); Unmarshaller
		 * unm=jax.createUnmarshaller(); Student student=(Student)unm.unmarshal(file);
		 * 
		 * // //
		 * 
		 * System.out.println(student);
		 */
	}
}
