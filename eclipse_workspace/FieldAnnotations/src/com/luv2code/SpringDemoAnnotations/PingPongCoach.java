package com.luv2code.SpringDemoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	
	@Autowired
	private FortuneService fortune;
	
	
	
	/*public FortuneService getFortune() {
		return fortune;
	}*/

	/*@Autowired
	public PingPongCoach(FortuneService fortune) {
		this.fortune = fortune;
	}*/




	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String getDailyFortune() {
		
		return fortune.getDailyFortune();
	}

}
