package com.luv2code.springdemo1;

public class TrackCoach implements Coach {

	int coachId;
	String coachName;
	int coachExp;
	
	private FortuneService fortuneservice; //object of an interface
	
	@Override
	public String toString() {
		return "TrackCoach [coachId=" + coachId + ", coachName=" + coachName + ", coachExp=" + coachExp + "]";
	}
	
	public TrackCoach(FortuneService theFortuneservice) {
		fortuneservice = theFortuneservice; 
		
	}
	public TrackCoach() {
		
	}
	
	public TrackCoach(int coachId, String coachName, int coachExp) {
		super();
		this.coachId = coachId;
		this.coachName = coachName;
		this.coachExp = coachExp;
	}

	public int getCoachId() {
		return coachId;
	}

	public void setcoachId(int coachId) {
		this.coachId = coachId;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setcoachName(String coachName) {
		this.coachName = coachName;
	}

	public int getCoachExp() {
		return coachExp;
	}

	public void setCoachExp(int coachExp) {
		this.coachExp = coachExp;
	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5k daily.";
	}

	@Override
	public String getDailyFortune() {

		return fortuneservice.getFortune();
	}

}
