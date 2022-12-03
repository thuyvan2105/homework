package algorithm;

import java.util.Scanner;

/**
 * Viết chương trình cho phép người dùng nhập vào mã số sinh viên
 * Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
 * Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9.
 * (Sử dụng biểu thức chính quy để ràng buộc định dạng)
 */

public class Ex10RegularExpression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your student's ID: ");
		String text = sc.nextLine();

		if (text.matches("B\\d{7}")) {
			System.out.println("Valid student's ID");
		} else {
			System.out.println("Invalid student's ID");
		}
	}

}
