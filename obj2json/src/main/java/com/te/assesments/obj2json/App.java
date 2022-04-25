package com.te.assesments.obj2json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.te.assesments.dto.Student;

import jdk.jfr.events.FileWriteEvent;

import com.te.assesments.dto.Address;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
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
		/*
		 * String str="{\r\n" + "  \"sId\" : 1,\r\n" + "  \"sName\" : \"ABU\",\r\n" +
		 * "  \"sAge\" : 23,\r\n" + "  \"adress\" : {\r\n" + "    \"id\" : 1,\r\n" +
		 * "    \"city\" : \"salem\",\r\n" + "    \"state\" : \"Tamilnadu\"\r\n" +
		 * "  },\r\n" + "  \"mark\" : {\r\n" + "    \"Social\" : 83,\r\n" +
		 * "    \"English\" : 67,\r\n" + "    \"Maths\" : 99,\r\n" +
		 * "    \"Science\" : 79,\r\n" + "    \"Tamil\" : 89\r\n" + "  }\r\n" + "}";
		 */
        ObjectMapper mapper=new ObjectMapper();
       
//        System.out.println(readValue);
         FileWriter name = new FileWriter("test.json");
         //Student readValue = mapper.readValue(name,Student.class);
         //System.out.println(readValue);
        //String writeValueAsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        //System.out.println(writeValueAsString);
         mapper.writerWithDefaultPrettyPrinter().writeValue(name,student);
    }
}
