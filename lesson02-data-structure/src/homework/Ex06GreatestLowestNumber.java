 package homework;

import java.util.Random;
import java.util.Scanner;

/**
 * Bài 6: Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
 * Biết rằng a,b,c là số nguyên được nhập từ bàn phím và nhỏ hơn 20 [0, 20)
 * VD: Nhập a = 6
 * 	   Nhập b = “xyz” → báo lỗi, yêu cầu nhập lại
 * 	   Nhập b = 12
 * 	   Nhập c = 8
 * Số lớn nhất là 12
 * Số nhỏ nhất là 6
 */

public class Ex06GreatestLowestNumber {
	public static void main(String[] args) {
		// Input from keyboard
		Scanner sc = new Scanner(System.in);

		// Check validation for the input (a, b, c)
		String input = "";
		do {
			System.out.print("Enter a: ");

			input = sc.nextLine();
			if (checkValidNumber(input) && range(input)) {
				break;
			}
		} while (true);

		do {
			System.out.print("Enter b: ");

			input = sc.nextLine();
			if (checkValidNumber(input) && range(input)) {
				break;
			}
		} while (true);

		do {
			System.out.print("Enter c: ");

			input = sc.nextLine();
			if (checkValidNumber(input) && range(input)) {
				break;
			}
		} while (true);

		// Find out the greatest and lowest number
		int a = Integer.parseInt(input);
		int b = Integer.parseInt(input);
		int c = Integer.parseInt(input);

		// Max value
		int max = a;

		if (b > max) {
			b = max;
		}
		if (c > max) {
			c = max;
		}

		System.out.println("The greatest of the three numbers is: " + max);

		// Min value
		int min = a;

		if (b < min) {
			b = min;
		}
		if (c < min) {
			c = min;
		}

		System.out.println("The lowest of the three numbers is: " + min);

	}

	// Function for checking valid number
	private static boolean checkValidNumber(String text) {
		if (text.length() == 0) {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}

	// Check range --> [0, 20)
	private static boolean range(String input) {
		if (Integer.valueOf(input) >= 20) {
			return false;
		}
		return true;
	}

}