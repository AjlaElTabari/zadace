package ba.BITCamp.ajla.weekend1;

public class Task8 {

	public static void main(String[] args) {

		int x = 3, y = 4, z = 6;
		double distance3D;

		distance3D = Math
				.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

		System.out
				.printf("Udaljenost tacke date unesenim koordinatama od koordinatnog pocetka je: %.2f",
						distance3D);

	}

}
