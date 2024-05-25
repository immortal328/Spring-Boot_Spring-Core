package ap.immortal.comman;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ap.immortal.interfaces.Coach;

@Component
//@Qualifier("cricketCoach")
public class CricketCoach implements Coach  {

	@Override
	public String getDailyWorkout() {
		return "Bolwe fast as much as much you can...";
	}
}
