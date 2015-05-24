package ba.BITCamp.ajla.weekend1;

public class Task11 {

	public static void main(String[] args) {

		int startingHours = 2, startingMinutes = 43, flightDurationHours = 3, flightDurationMinutes = 19;

		int flightDuration = flightDurationHours * 60 + flightDurationMinutes;

		int endingMinutes = startingMinutes + flightDuration;
		int endingHours = startingHours + endingMinutes / 60;

		endingMinutes = endingMinutes % 60;

		System.out.printf("Avion stize u %02d:%02dh.", endingHours,
				endingMinutes);

	}

}
