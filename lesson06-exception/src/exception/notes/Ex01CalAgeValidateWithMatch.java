package exception.notes;

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

		// If input is numbers => call Integer.parseInt(ip.nextLine())
		// Validate yobAsString should be a valid number >> match()

		String yobAsString = enterYear();

		int yob = Integer.parseInt(yobAsString);
		int cry = Year.now().getValue();

		System.out.println("Age: " + (cry - yob));

	}

	private static String enterYear() {
		String yobAsString = null;

		// Lần đầu kh�?i kiểm tra, cho nhập year of birth
		// Nếu yobAsString ko phải số => quay lại dòng 27, tiếp tục nhập lại
		do {
			System.out.print("Enter year of birth (valid number): ");
			yobAsString = ip.nextLine();
		} while (!yobAsString.matches("\\d+")); // = !isNumber(yobAsString)
		return yobAsString;
	}

}
