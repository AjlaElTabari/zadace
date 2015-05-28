package ba.BITCamp.ajla.Zadaca7;

public class Task4 {

	public static void main(String[] args) {
		//Reading info from the file
		TextIO.readFile("src/ba/BITCamp/ajla/Homework7/inputTask4.in");
		int n = TextIO.getInt();
		int requestedNo = TextIO.getInt();
		int tempRequestedNo = 0;
		boolean reqNoIsThere = false;
		
		//Checking if requested no exists in that file
		for (int i = 1; i <= n; i++) {
			tempRequestedNo = TextIO.getInt();
			if (requestedNo == tempRequestedNo) {
				reqNoIsThere = true;
				break;
			}
		}
		
		if (reqNoIsThere) {
			TextIO.put("There is your requested number in the file.");
		}
		else {
			TextIO.put("There is no requested number in the file.");
		}
	}

}
