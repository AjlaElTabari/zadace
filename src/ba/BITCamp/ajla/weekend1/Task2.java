package ba.BITCamp.ajla.weekend1;

public class Task2 {

	public static void main(String[] args) {
		double a = 9.4;
		if (a == 7.5) {
			System.out
					.println("Varijabla se nalazi tacno na granici oba zadata opsega.");
		} else if (a >= 5 && a < 7.5) {
			System.out.println("Varijabla se nalazi u opsegu od 5 do 7.5.");
		} else if (a > 7.5 && a <= 10) {
			System.out.println("Varijabla se nalazi u opsegu od 7.5 do 10.");
		} else {
			System.out.println("Varijabla je van zadatih opsega.");
		}

	}

}
