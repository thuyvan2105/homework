package exception.notes;

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

		// If input is numbers => call Integer.parseInt(ip.nextLine())
		// Validate yobAsString should be a valid number 

		String yobAsString = null;

		// Lần đầu không kiểm tra, cho nhập year of birth
		// Nếu yobAsString ko phải số => quay lại dòng 27, tiếp tục nhập lại
		do {
			System.out.print("Enter year of birth (valid number): ");
			yobAsString = ip.nextLine();
		} while (!isNumber(yobAsString));

		int yob = Integer.parseInt(yobAsString);
		int cry = Year.now().getValue();

		System.out.println("Age: " + (cry - yob));

	}

	// Kiểm tra từng ký tự trong chuỗi => dùng charAt()
	// Array => a[i]
	// String (chuỗi) => s.charAt(i)
	private static boolean isNumber(String sequence) {
		for (int index = 0; index < sequence.length(); index++) {
			char letter = sequence.charAt(index);
			// Method 1: if (letter < '0' || letter > '9'
			// Method 2: (!Character.isDigit(letter))
			// digit: 1 số ; number: dãy số
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}

}
