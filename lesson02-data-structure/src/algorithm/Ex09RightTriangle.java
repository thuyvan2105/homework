package algorithm;

import java.util.Scanner;

/**
 * Viết chương trình cho phép nhập vào 3 số
 * Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.
 */

public class Ex09RightTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");

		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();

		if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
			System.out.println("This is a right triangle!");
		} else {
			System.out.println("This is not a right triangle!");
		}

	}

}
