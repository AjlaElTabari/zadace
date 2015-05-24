package ba.BITCamp.ajla.weekend1;

public class Task4 {

	public static void main(String[] args) {
		
		byte day = 5, month = 7;

		// January 20 - February 18 is Aquarius
		if (day >= 20 && month == 1 || day <= 18 && month == 2) {
			System.out.print("Vi ste vodolija.");
		}
		// February 19 - March 20 is Pisces
		if (day >= 19 && month == 2 || day <= 20 && month == 3) {
			System.out.print("Vi ste riba.");
		}
		// March 21 - April 19 is Aries
		if (day >= 21 && month == 3 || day <= 19 && month == 4) {
			System.out.print("Vi ste ovan.");
		}
		// April 20 - May 20 is Taurus
		if (day >= 20 && month == 4 || day <= 20 && month == 5) {
			System.out.print("Vi ste bik.");
		}
		// May 21 - June 20 is Gemini
		if (day >= 21 && month == 5 || day <= 20 && month == 6) {
			System.out.print("Vi ste blizanac.");
		}
		// June 21 - July 22 is Cancer
		if (day >= 21 && month == 6 || day <= 22 && month == 7) {
			System.out.print("Vi ste rak.");
		}
		// July 23 - August 22 is Leo
		if (day >= 23 && month == 7 || day <= 22 && month == 8) {
			System.out.print("Vi ste lav.");
		}
		// August 23 - September 22 is Virgo
		if (day >= 23 && month == 8 || day <= 22 && month == 9) {
			System.out.print("Vi ste djevica.");
		}
		// September 23 - October 22 is Libra
		if (day >= 23 && month == 9 || day <= 22 && month == 10) {
			System.out.print("Vi ste vaga.");
		}
		// October 23 - November 21 is Scorpio
		if (day >= 23 && month == 10 || day <= 21 && month == 11) {
			System.out.print("Vi ste skorpija.");
		}
		// November 22 - December 21 is Sagittarius
		if (day >= 22 && month == 11 || day <= 21 && month == 12) {
			System.out.print("Vi ste strijelac.");
		}
		// December 22 - January 19 is Capricorn
		if (day >= 22 && month == 12 || day <= 19 && month == 1) {
			System.out.print("Vi ste jarac.");
		}

	}
}
