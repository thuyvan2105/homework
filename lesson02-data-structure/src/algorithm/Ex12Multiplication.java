package algorithm;

import java.util.Scanner;

/**
 Viết chương trình để nhập nhập một số nguyên, 
 tìm kết quả phép nhân của số đó với các số từ 1 - 20 , 
 sau đó in kết quả ra màn hình.
 */

public class Ex12Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = sc.nextInt();

		multiplication(num);
	}

	private static void multiplication(int num) {
		for (int i = 1; i <= 20; i++) {
			System.out.println(num + "x" + i + "=" + num * i);
		}
	}

}
