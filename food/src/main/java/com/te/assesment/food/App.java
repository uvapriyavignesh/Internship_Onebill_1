package com.te.assesment.food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				com.te.assesment.foodconfig.AllConfig.class);
		Object bean = applicationContext.getBean("selectfood");
		System.out.println(bean);
	}
}
