package ba.BITCamp.ajla.Zadaca7;

public class Task5 {

	public static void main(String[] args) {
		// Reading decimal no from the file
		TextIO.readFile("src/ba/BITCamp/ajla/Homework7/decimalTask5.in");
		int decimalNo = TextIO.getInt();
		String binary = "";
		// Converting it into binary
		while (decimalNo > 0) {
			int rem = decimalNo % 2;
			binary = rem + binary;
			decimalNo = decimalNo / 2;
		}
		// Writing binary result into another file
		TextIO.writeFile("src/ba/BITCamp/ajla/Homework7/binaryTask5.out");
		TextIO.put(binary);
	}

}
