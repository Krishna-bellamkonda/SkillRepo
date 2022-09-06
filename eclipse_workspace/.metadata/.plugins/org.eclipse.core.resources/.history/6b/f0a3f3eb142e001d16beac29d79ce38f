package com.luv2code.SpringDemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach ppCoach = context.getBean("pingPongCoach",Coach.class);
		
		// call a method on the bean
		
		System.out.println(ppCoach.getDailyFortune());
		
		
		// close the context
		context.close();
	}
}
 