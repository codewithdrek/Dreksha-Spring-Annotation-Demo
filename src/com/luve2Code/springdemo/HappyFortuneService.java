package com.luve2Code.springdemo;

@component
public class HappyFortuneService implements FortuneService
{

	@Override
	public String getDailyFortune() {
		return "Today is ur lucky day";
	}

	
	
}
