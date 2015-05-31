package ba.BITCamp.ajla.weekend2;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
/*// UNCOMMENT THIS PART OF CODE IF YOU WANT TO CALL getNextOddNumber(int num) method
		System.out.println("Enter the number");
		int num = input.nextInt();
		System.out.println("Next odd number is " + getNextOddNumber(num));*/

/*// UNCOMMENT THIS PART OF CODE IF YOU WANT TO CALL getAreaOfCircle(int diameter) method
		System.out.println("Enter the diameter of the circle");
		int diameter = input.nextInt();
		double areaOfCircle = getAreaOfCircle(diameter);
		System.out.printf("Area of circle defined with entered diameter is %.2f", areaOfCircle);*/
		
/*// UNCOMMENT THIS PART OF CODE IF YOU WANT TO CALL isInRange(int start, int finish, int n) method
		System.out.println("Enter starting number for your range");
		int start = input.nextInt();
		System.out.println("Enter finishing number for your range");
		int finish = input.nextInt();
		System.out.println("Enter the control number");
		int n = input.nextInt();
		System.out.println(isInRange(start, finish, n));*/
		
		input.close();
	}

	public static int getNextOddNumber(int num) {
		do {
			num++;
		} while (num % 2 == 0);
		return num;
	}
	
	public static double getAreaOfCircle(int diameter) {
		double circleArea = Math.pow(diameter/2, 2) * Math.PI;
		return circleArea;
	}
	
	public static boolean isInRange(int start, int finish, int n) {
		if (n > start && n < finish) {
			return true;
		} else {
			return false;
		}
	}
}
