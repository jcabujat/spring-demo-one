package com.jcabujat.springdemo;

public class ChessCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public ChessCoach() {
		System.out.println("Creating chess coach");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice basic king and pawn endgame";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void printEmailAndTeam() {
		System.out.println(emailAddress + ": " + team);
	}

}
