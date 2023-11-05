package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

//@Component("thatSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// define my init method
//	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff() method");
	}
	
	// define my destroy method
//	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff() method");
	}
	
//  define constructor to show constructor injection
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
//  define a setter method to show setter injection
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside setFortuneService() method");
//		fortuneService = theFortuneService;
//	}
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
//		fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyworkout() {
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
