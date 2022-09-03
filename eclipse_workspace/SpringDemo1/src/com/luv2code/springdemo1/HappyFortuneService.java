package com.luv2code.springdemo1;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] arr= {"Today is your lucky day :)","Luck favors to those who dare","Luck is for gamblers not athelets"};
		
		Random r = new Random();
		return arr[r.nextInt(arr.length)];
	}

}
