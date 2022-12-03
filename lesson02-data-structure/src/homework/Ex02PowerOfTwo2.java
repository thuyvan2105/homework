package homework;

import java.util.Scanner;

import utils.InputUtils;

import static java.lang.Math.*;

/**
 * Bài 2: Viết chương trình (hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không
 * Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
 * (tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
 * VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
 * 			  = 4   → true
 * 			  = 6   → false
 * 			  = 8   → true
 * 			  = 9   → false
 */

public class Ex02PowerOfTwo2 {
	public static void main(String[] args) {
		int number = InputUtils.input("Enter N>0", 5);
		
		// Check whether the input number is Multiple of Two or not. And then print result
		String result = isPowerOfTwo(number) ? " is power of two" : " is not power of two";
		System.out.println(number + result);

	}

	// Function for checking whether the input number is Power of Two or not
	private static boolean isPowerOfTwo(int n) {
		if (n == 0) {
			return false; // because 0 is not power of 2 >> of course
		}
		double base = log(n) / log(2);
		return ceil(base) == floor(base);

	}

}
