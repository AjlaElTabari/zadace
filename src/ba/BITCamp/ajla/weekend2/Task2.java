package ba.BITCamp.ajla.weekend2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Asking user to enter series of brackets that needs to be checked
		System.out.println("Enter series of curly brackets ");
		String bracketSeries = input.nextLine();
		
		// Declaring counters for opened and closed brackets
		int openBrackets = 0, closedBrackets = 0, bracketSeriesSize = 0;
		
		bracketSeriesSize = bracketSeries.length();
		
		// counting opened and closed  brackets
		for (int i = 0; i < bracketSeriesSize; i++) {
			char bit = bracketSeries.charAt(i);
			if (bit == '{') {
				openBrackets++;
			}
			else if (bit == '}') {
				closedBrackets++;
			}
		}
		
		// Checking if number of opened and closed brackets are matching
		if (openBrackets == closedBrackets) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		input.close();
	}
}
