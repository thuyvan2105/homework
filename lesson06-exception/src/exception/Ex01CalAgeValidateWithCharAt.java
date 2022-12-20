package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter year of birth => calculate current age
 * Opt1: Validate before handling
 * Using .charAt() to check input is number or not
 */

public class Ex01CalAgeValidateWithCharAt {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String yobAsString = null;

		do {
			System.out.print("Enter year of birth (valid number): ");
			yobAsString = ip.nextLine();
		} while (!isNumber(yobAsString));

		int yob = Integer.parseInt(yobAsString);
		int cry = Year.now().getValue();

		System.out.println("Age: " + (cry - yob));

	}

	private static boolean isNumber(String sequence) {
		for (int index = 0; index < sequence.length(); index++) {
			char letter = sequence.charAt(index);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}

}
