package ba.BITCamp.ajla.weekend2;

public class Task4 {

	public static void main(String[] args) {
		
		TextIO.readFile("src/ba/BITCamp/ajla/weekend2/encodedFile.in");
		int n = TextIO.getInt();
		
		TextIO.writeFile("src/ba/BITCamp/ajla/weekend2/decodedFile.in");
		for (int i = 1; i <= n; i++) {
			String line = TextIO.getlnString();
			int lineLength = line.length();
			for (int j = 0; j < lineLength; j++) {
				char character = line.charAt(j);
				int asciiValue = (int)character;
				asciiValue--;
				char decodedCharacter = (char)asciiValue;
				TextIO.put(decodedCharacter);
			}
			TextIO.putln();
		}
	}
}
