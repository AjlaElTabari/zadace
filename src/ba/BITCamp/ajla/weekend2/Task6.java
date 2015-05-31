package ba.BITCamp.ajla.weekend2;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Movie movie1 = new Movie("47 Ronin", 2013, "Carl Rinsch", 
				"Action, Adventure, Drama", 6.3, false);
		
		Movie movie2 = new Movie ("WALL-E", 2008, "Andrew Stanton", 
				"Animation, Adventure, Family", 8.4, true);
		
		System.out.println(movie1);
		System.out.println(movie2);
	}
}
