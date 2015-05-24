package ba.BITCamp.ajla.weekend1;

public class Task9 {

	public static void main(String[] args) {
		
		int noOrig = 333,  number, sum = 0, digit;
		
		number = noOrig;	
		
		digit = number % 10;
		sum += digit;
		number /= 10;
		
		digit = number % 10;
		sum += digit;
		number /= 10;
		
		digit = number % 10;
		sum += digit;
		number /= 10;
		
		if (noOrig % sum == 0) {
			System.out.print("Uneseni broj je djeljiv sa zbirom svojih cifara.");
		}
		else {
			System.out.print("Uneseni broj nije djeljiv sa zbirom svojih cifara.");
		}

	}
}
