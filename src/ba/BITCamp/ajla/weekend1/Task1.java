package ba.BITCamp.ajla.weekend1;

public class Task1 {

	public static void main(String[] args) {
		int side1 = 1, side2 = 3, side3 = 3;
		if (side1 != 0 && side2 != 0 & side3 != 0) {
			if (side1 + side2 > side3 || side2 + side3 > side1
					|| side1 + side3 > side2) {
				System.out
						.println("Moguce je konstruisati trougao sa zadanim vrijednostima stranica.");
			} else {
				System.out
						.println("konstruisati trougao sa zadanim vrijednostima stranica.");
			}
		} else {
			System.out
					.println("konstruisati trougao sa zadanim vrijednostima stranica.");
		}

	}

}
