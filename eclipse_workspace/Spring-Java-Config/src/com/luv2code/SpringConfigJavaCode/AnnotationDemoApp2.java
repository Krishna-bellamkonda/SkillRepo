package com.luv2code.SpringConfigJavaCode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp2 {

	public static void main(String[] args) {
		// read spring configuration file
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		SwimCoach swCoach = context.getBean("swimCoach",SwimCoach.class);
		
		// call a method on the bean
		
		System.out.println(swCoach.getDailyWorkout());
		System.out.println(swCoach.getDailyFortune());
		System.out.println(swCoach.getEmail());
		System.out.println(swCoach.getTeam());
		
		// close the context
		context.close();
	}
}
 