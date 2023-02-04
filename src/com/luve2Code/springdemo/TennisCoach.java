package com.luve2Code.springdemo;

@Component("theSillyCoach") //: explicit ID
//@Component // java use default ID tennisCoach
public class TennisCoach implements Coach{

	
	private FortuneService fortuneService;
	//Default Bean ID TennisCoach :: tennisCoach
	
	@Override
	public String getDailyWorkout() {
		return "Get workout daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	
	
	
	}

//Bean of TennisCoach in applicationContext.xml not needed?