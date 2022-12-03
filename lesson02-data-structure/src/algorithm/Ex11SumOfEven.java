package algorithm;

import java.util.Scanner;

/**
 * Viết chương trình cho phép nhập vào một số nguyên dương n
 * tính tổng tất cả số chẵn trong khoảng từ 0 - n.
 */

public class Ex11SumOfEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a positive number: ");
		int number = sc.nextInt();

		System.out.println("Sum --> " + sumOfEven(number));

	}

	private static int sumOfEven(int number) {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
}
