package ba.BITCamp.ajla.Zadaca5;

public class Task2 {

	public static void main(String[] args) {
		int n = 20;
		int sum = 0;
		int counter = 0;

		// Calculating sum of even numbers from 0 to n
		while (counter < n) {
			sum += counter;
			counter += 2;
		}

		System.out.print(sum);
	}

}
