package homework;

import java.util.Scanner;

import utils.InputUtils;

/**
 * Bài 8: Viết chương trình (hàm) kiểm tra số nguyên N có phải là số nguyên tố hay không
 * Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
 * (tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
 * VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
 * 			  = 4   → false
 * 			  = 7   → true
 */

public class Ex08Prime {
	public static void main(String[] args) {
		int number = InputUtils.input("Enter N>0", 5);

		// Check whether the input number is Multiple of Two or not. And then print
		// result
		String result = isPrime(number) ? " is Prime number" : " is not Prime number";
		System.out.println(number + result);

	}

	// Function for checking whether the input number is Prime or not
	private static boolean isPrime(int n) {
		// 0, 1 are not prime
		if (n < 2) {
			return false;
		}

		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				return false;
			}
			
		}
		return true;
	}

}