package com.luv2code.springdemo1;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach thecoach = new BaseBallCoach();
		Coach track = new TrackCoach();
		
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(track.getDailyWorkout());
	}

}
