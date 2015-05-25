package ba.BITCamp.ajla.Zadaca5;

public class Task3 {

	public static void main(String[] args) {
		int n = 28, sum = 0, counter = 1;

		// Finding if entered number is perfect
		while (counter <= n / 2) {
			if (n % counter == 0) {
				sum += counter;
				counter++;
			} else {
				counter++;
			}
		}

		if (n == sum) {
			System.out.println("Entered number is perfect! " + sum);
		} else {
			System.out.println("Entered number is not perfect! " + sum);
		}
	}

}
