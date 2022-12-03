 package homework;

import java.util.Random;
import java.util.Scanner;

import utils.InputUtils;

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
		int a = InputUtils.input("Enter a>0", 5);
		int b = InputUtils.input("Enter b>0", 5);
		int c = InputUtils.input("Enter c>0", 5);

		// Max value
		if (a >= b && a >= c) {
			System.out.println(a + " is the greatest number");
		} else if (b >= c && b >= a) {
			System.out.println(b + " is the greatest number");
		} else {
			System.out.println(c + " is the greatest number");
		}

		// Minimum value
		if (a <= b && a <= c) {
			System.out.println(a + " is the lowest number");
		} else if (b <= c && b <= a) {
			System.out.println(b + " is the lowest number");
		} else {
			System.out.println(c + " is the lowest number");
		}

	}

	// Check range --> [0, 20)
	private static boolean range(String input) {
		if (Integer.valueOf(input) < 20) {
			return false;
		}
		return true;
	}

}