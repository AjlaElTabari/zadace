package ba.BITCamp.ajla.weekend1;

public class Task12 {

	public static void main(String[] args) {

		double radius = 5.43, volumen;

		volumen = 4 / 3 * (Math.pow(radius, 3) * Math.PI);

		if (volumen >= 5.964 && volumen <= 6.064) {
			System.out.print("Lopta zadatih dimenzija je prilicno kvalitetna.");
		} else {
			System.out.println("Lopta zadatih dimenzija nije kvalitetna.");
		}

	}

}
