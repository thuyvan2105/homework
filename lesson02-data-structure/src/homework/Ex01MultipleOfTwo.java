package homework;

import java.util.Scanner;

import utils.InputUtils;

/**
 * Bài 1: Viết chương trình (hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
 * Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối đa 5 lần)
 * VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
 *		      = 4   → true
 *	          = 6   → true
 * 			  = 7   → false
 */

public class Ex01MultipleOfTwo {
	public static void main(String[] args) {
		int number = InputUtils.input("Enter N>0", 5);
		
		// Check whether the input number is Multiple of Two or not. And then print result
		String result = isMultipleOfTwo(number) ? " is multiple of two" : " is not multiple of two";
		System.out.println(number + result);

	}

	// Function for checking whether the input number is Multiple of Two or not
	private static boolean isMultipleOfTwo(int n) {
		return n % 2 == 0;
	}

}