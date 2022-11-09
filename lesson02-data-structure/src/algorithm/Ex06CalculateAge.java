package algorithm;

import java.time.YearMonth;
import java.util.Scanner;

/**
 * Input year of birth --> calculate current age
 * Requirement:
 * + If input is valid   --> print current age
 * + If input is invalid --> request to input again with valid content
 * 						 --> display the number of incorrect entries (no more than 3 times)
 * Do_While ==> don't check condition, allow users to input at the first time
 */

public class Ex06CalculateAge {
	public static void main(String[] args) {
		
		int wrongTimes = 0;
		
		Scanner sc = new Scanner(System.in);
		
		// Check validation for input
		String preYob = "";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "): " : ": ";
			System.out.print("Please enter valid year of birth " + suffix);

			// Check input is valid or not?
			preYob = sc.nextLine();
			if (checkValidNumber(preYob)) {
				break;
			}
			
			// The number of incorrect entries are no more than 3 times
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("Sorry, you entered incorrectly more than 3 times!");
				System.exit(0); // exit program
			}

		} while (true);

		int yob = Integer.parseInt(preYob);

		// Current year
		int currentYear = YearMonth.now().getYear();

		// Calculate current age
		int age = currentYear - yob;
		System.out.println("Your current age is: " + age);

	}

	// Check input is valid number or not?
	private static boolean checkValidNumber(String input) {
		if (input.length() == 0) {
			return false;
		}

		for (int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}

}
