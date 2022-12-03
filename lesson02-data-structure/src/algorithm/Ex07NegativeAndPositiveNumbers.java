package algorithm;

import java.util.Scanner;

/**
 * Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta 
 * nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
 * Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.
 */

public class Ex07NegativeAndPositiveNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		int number = sc.nextInt();

		if (number >= 0) {
			System.out.println("This is a positive number!");
		} else {
			System.out.println("This is a negative number!");
		}
	}

}
