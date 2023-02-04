package com.luve2Code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {
		
		//spring bean config
		
		ClassPathXmlApplicationContext context= new  ClassPathXmlApplicationContext(applicationContext.xml);
		//retrive bean 
		
		Coach coach = context.getBean("theSillyCoach",Coach.class);
		//Coach coach = context.getBean("tennisCoach",Coach.class);
		
		// call method
		
		coach.getDailyWorkout();
		// close context
		coach.close();
		
	}

}
