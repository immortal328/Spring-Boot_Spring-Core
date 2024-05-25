package ap.immortal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ap.immortal.interfaces.Coach;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	private Coach mycoach;
	
	
	//Constructor Injection
	/*@Autowired
	public RestController(Coach coach) {
		mycoach = coach;		
	}*/
	
	//Setter Injection
	@Autowired
	void setCoach(Coach coach) {
		mycoach = coach;
	}
	
	//Field Injection
	/*@Autowired
	private Coach mycoach;*/
	
	@GetMapping("/")
	String get() {
		return "Hello Spring Core..";
	}
	
	@GetMapping("/dailyWorkout")
	public String getWorkout(Coach coach) {
		return mycoach.getDailyWorkout();
	}

}
