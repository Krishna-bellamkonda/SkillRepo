package com.luv2code.SpringConfigJavaCode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring configuration file
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach tCoach = context.getBean("tennisCoach",Coach.class);
		
		// call a method on the bean
		
		System.out.println(tCoach.getDailyWorkout());
		System.out.println(tCoach.getDailyFortune());
		
		
		// close the context
		context.close();
	}
}
 