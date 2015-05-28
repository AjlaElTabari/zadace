package ba.BITCamp.ajla.Zadaca7;

public class Task3 {

	public static void main(String[] args) {
		TextIO.readFile("src/ba/BITCamp/ajla/Homework7/inputTask3.in");
		//Reading first no from file, it shows us how many numbers are in that file
		int n = TextIO.getInt();
		int numMin = TextIO.getInt();
		
		// Checking which no is the smallest in the file
		for (int i = 1; i < n; i++) {
			int numNext = TextIO.getInt();
			if (numMin > numNext) {
				numMin = numNext;
			}
		}
		TextIO.put("The smallest no in your file is: " + numMin);
	}

}
