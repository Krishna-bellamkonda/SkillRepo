package com.luv2code.SpringConfigJavaCode;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is a saaad day!";
	}

}
