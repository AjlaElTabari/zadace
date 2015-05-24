package ba.BITCamp.ajla.weekend1;

public class Task3 {

	public static void main(String[] args) {

		byte day1 = 13, month1 = 6, day2 = 24, month2 = 8;
		int year1 = 2019, year2 = 2018;

		if (year1 < year2) {
			System.out.print("Prvi datum je prije drugog.");
		} else if (year1 > year2) {
			System.out.print("Drugi datum je prije prvog.");
		} else if (month1 < month2) {
			System.out.print("Prvi datum je prije drugog.");
		} else if (month1 > month2) {
			System.out.print("Drugi datum je prije prvog.");
		} else if (day1 < day2) {
			System.out.print("Prvi datum je prije drugog.");
		} else if (day1 > day2) {
			System.out.print("Drugi datum je prije prvog.");
		} else if (day1 == day2) {
			System.out.println("Datumi su isti.");
		}
	}

}
