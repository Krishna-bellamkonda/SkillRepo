package com.luv2code.springdemo1;

public class CricketCoach implements Coach {

	String team;
	String coachEmail;
	
	public String getCoachEmail() {
		return coachEmail;
	}

	public void setCoachEmail(String coachEmail) {
		this.coachEmail = coachEmail;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	private FortuneService fortuneService;
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Work on your form for 2 hrs daily.";
	}

	@Override
	public String getDailyFortune() {
		return "Boy! "+fortuneService.getFortune();
	}

}
