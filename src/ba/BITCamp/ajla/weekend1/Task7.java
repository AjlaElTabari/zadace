package ba.BITCamp.ajla.weekend1;

public class Task7 {

	public static void main(String[] args) {
		int number = 5445, sum = 0, digit;
		
		digit = number % 10;
		sum += digit;
		number /= 10;
		
		digit = number % 10;
		sum += digit;
		number /= 10;
		
		digit = number % 10;
		sum += digit;
		number /= 10;
		
		digit = number % 10;
		sum += digit;
		number /= 10;
		
		System.out.printf("Suma cifara unesenog broja je %d", sum);

	}

}
