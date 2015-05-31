package ba.BITCamp.ajla.weekend2;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Asking user to enter url link in specified format
		System.out
				.println("Enter URL link in following format: www.example.com?name=Ime&surname=Prezime");
		String url = input.next();
		String name = "";
		String lastName = "";

		int urlLength = url.length();

		// Iterating through the url address finding name and lastname
		for (int i = 0; i < urlLength; i++) {
			if (url.charAt(i) == '=' && name.length() == 0) {
				i++;
				while (url.charAt(i) != '&') {
					name += url.charAt(i);
					i++;
				}
			} else if (url.charAt(i) == '=') {
				i++;
				while (i < urlLength) {
					lastName += url.charAt(i);
					i++;
				}
			}
		}

		System.out.println("Name: " + name + " " + lastName);

		input.close();
	}

}
