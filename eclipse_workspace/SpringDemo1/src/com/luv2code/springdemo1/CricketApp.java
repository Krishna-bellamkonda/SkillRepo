package com.luv2code.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach = context.getBean("myFavCoach",CricketCoach.class);
		
		System.out.println(coach.getTeam());
		System.out.println(coach.getCoachEmail());
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}

}
