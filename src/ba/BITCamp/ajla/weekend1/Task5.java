package ba.BITCamp.ajla.weekend1;

public class Task5 {

	public static void main(String[] args) {
		int a = 8, b = 52, c = 44, d = 8;
		int smallerNo1, largerNo1, smallerNo2, largerNo2, no1, no2, no3, no4;
		
		if (a < b) {
			smallerNo1 = a;
			largerNo1 = b;
		} else {
			smallerNo1 = b;
			largerNo1 = a;
		}		
		if (c < d) {
			smallerNo2 = c;
			largerNo2 = d;
		} else {
			smallerNo2 = d;
			largerNo2 = c;
		}		
		if (smallerNo1 < smallerNo2) {
			no1 = smallerNo1;
			no2 = smallerNo2;      
		} 
		else {
			no1 = smallerNo2;
			no2 = smallerNo1;
		}		
		if (largerNo1 > largerNo2) {
			no4 = largerNo1;
			no3 = largerNo2;
		} 
		else {
			no4 = largerNo2;
			no3 = largerNo1;
		}		
		if (no2 < no3) {
			System.out.printf("Uneseni brojevi poredani po velicini su: %d, %d, %d, %d.",
					no1, no2, no3, no4);
		} else {
			System.out.printf("Uneseni brojevi poredani po velicini su: %d, %d, %d, %d.",
					no1, no3, no2, no4);
		}
			
	}
}
