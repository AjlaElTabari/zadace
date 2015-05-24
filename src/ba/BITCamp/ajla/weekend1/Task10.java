package ba.BITCamp.ajla.weekend1;

public class Task10 {

	public static void main(String[] args) {

		int a = 1, b = 4, c = 6, d = 4, givenNo = 5;

		int result = (int) (a * Math.pow(givenNo, 3) + b * Math.pow(givenNo, 2)
				+ c * givenNo + d);

		if (result == 0) {
			System.out
					.printf("Zadati broj x = %d je potencijalno rjesenje kubne jednacine: %d*%d^3 + %d*%d^2 + %d*%d + %d = 0",
							givenNo, a, givenNo, b, givenNo, c, givenNo, d);
		} else {
			System.out
					.printf("Zadati broj x = %d nije potencijalno rjesenje kubne jednacine: %d*%d^3 + %d*%d^2 + %d*%d + %d = 0",
							givenNo, a, givenNo, b, givenNo, c, givenNo, d);
		}

	}

}
