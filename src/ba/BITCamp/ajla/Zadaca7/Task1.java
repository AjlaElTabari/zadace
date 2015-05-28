package ba.BITCamp.ajla.Zadaca7;

public class Task1 {

	public static void main(String[] args) {
		// Reading minimum and maximum value from the file
		TextIO.readFile("src/ba/BITCamp/ajla/Homework7/inputTask1.in");
		int min = TextIO.getInt();
		int max = TextIO.getInt();
	
		// Writing every number between those numbers
		for (int i = min; i < max; i++) {
			TextIO.putln(i);
		}
	}

}
