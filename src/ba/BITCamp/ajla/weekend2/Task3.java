package ba.BITCamp.ajla.weekend2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Asking user to enter desired no
		System.out.println("Enter the number ");
		System.out.println();
		int n = input.nextInt();

		// Preventing exceptions
		if(n > 65) {
			System.out.println("For number larger then 65, n! is too large, and java cannot print it");
			System.exit(0);
		}
		// Calculating factorial of entered number
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}

		// Removing zeros from driven result
		String factorialString = factorial + "", factroialWithoutZeros = "";
		int factorialStringLength = factorialString.length();

		for (int i = 0; i < factorialStringLength; i++) {
			char character = factorialString.charAt(i);
			if (character != '0') {
				factroialWithoutZeros += character;
			}
		}
		
		// Printing only two last digit of driven number
		int digit = factroialWithoutZeros.length();
		System.out.println(factroialWithoutZeros.substring(digit-2, digit));
		input.close();
	}
}
