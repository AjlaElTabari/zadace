package ba.BITCamp.ajla.Zadaca5;

public class Task1 {

	public static void main(String[] args) {

		int n = 50;

		int counter = 0;

		// Counting how many times entered number could be divided before it reaches 0
		while ((n / 2) > 0) {
			counter++;
			n /= 2;
		}

		System.out.print(counter);

	}

}
