package ba.BITCamp.ajla.Zadaca7;

public class Task2 {

	public static void main(String[] args) {
		TextIO.readFile("src/ba/BITCamp/ajla/Homework7/inputTask2.in");
		// setting sum to 1 because we don't need to count escape character -1 into our sum
		int sum = 1;
		int numFromFile = 0;
		
		// Calculating sum of all numbers from the file
		do {
			numFromFile = TextIO.getInt();
			sum += numFromFile;
		}
		while (numFromFile != -1);
	
		TextIO.put(sum);

	}

}
