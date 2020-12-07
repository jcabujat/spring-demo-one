package com.jcabujat.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String[] args) {
		// load the spring config. file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from spring container
		ChessCoach theCoach = context.getBean("myChessCoach", ChessCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		theCoach.printEmailAndTeam();
		
		// close the context
		context.close();
	}

}
