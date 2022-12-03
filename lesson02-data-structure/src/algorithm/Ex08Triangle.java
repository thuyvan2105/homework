package algorithm;

import java.util.Scanner;

/**
 * Viết chương trình cho phép nhập vào 3 số thực
 * Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
 */

public class Ex08Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input 3 float numbers: ");

		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();

		if (a + b > c && b + c > a && c + a > b) {
			System.out.println("They are 3 sides of a triangle!");
		} else {
			System.out.println("They are not 3 sides of a triangle!");
		}
	}

}
