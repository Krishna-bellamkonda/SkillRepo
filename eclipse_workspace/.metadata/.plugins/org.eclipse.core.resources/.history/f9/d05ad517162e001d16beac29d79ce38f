package com.luv2code.SpringDemoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("theSillyCoach")
public class TennisCoach implements Coach {

	private FortuneService fortune;
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortune.getDailyFortune();
	}
	
	@Autowired
	public void setFortune(FortuneService fortune) {
		System.out.println("setFortune");
		this.fortune = fortune;
	}
}
