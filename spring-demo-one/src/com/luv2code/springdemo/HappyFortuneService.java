package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	public HappyFortuneService() {
		System.out.println("Inside no-arg constructor - HappyFortuneService.HappyFortuneService()");
	}
	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
