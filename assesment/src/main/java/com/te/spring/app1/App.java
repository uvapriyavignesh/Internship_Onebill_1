package com.te.spring.app1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.module.Earth;
import com.te.spring.module.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean-config.xml");
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(com.te.spring.config.Appconfig.class);
        Earth bean = (Earth)applicationContext.getBean("earth");
        //Student bean3 = (Student)applicationContext.getBean("s3");
        System.out.println(bean);
        //System.out.println(bean3);
    }
}
