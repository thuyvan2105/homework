package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter year of birth => calculate current age
 * Opt1: Validate before handling
 * Using .match() to check input is number or not
 */

public class Ex01CalAgeValidateWithMatch {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String yobAsString = enterYear();

		int yob = Integer.parseInt(yobAsString);
		int cry = Year.now().getValue();

		System.out.println("Age: " + (cry - yob));

	}

	private static String enterYear() {
		String yobAsString = null;

		do {
			System.out.print("Enter year of birth (valid number): ");
			yobAsString = ip.nextLine();
		} while (!yobAsString.matches("\\d+"));
		return yobAsString;
	}

}
