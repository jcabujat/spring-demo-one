package com.jcabujat.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	private String[] fortunes;
	
	public HappyFortuneService() {
		fortunes = new String[]{"Today is your lucky day!",
				"You've got a bad luck today, try again tomorrow.",
				"You have neutral fortune today."};
	}
	
	@Override
	public String getFortune() {
		Random random = new Random();
		int number = random.nextInt(3);
		return fortunes[number];
	}

}
