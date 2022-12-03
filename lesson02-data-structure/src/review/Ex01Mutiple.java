package review;

import java.util.Scanner;

// Anh Quyền sửa
//regular expression --> biểu thức chính quy
// [0-9] --> 1 ký tự từ 0 đến 9
// [0-9]+ --> 1 hoặc nhiều kí tự từ 0 đến 9
// abc --> F
// 12x5 --> F
// 123 --> T
// [0-9]* or [0-9]{0,} --> từ 0 đến dương vô cùng
// {1,} --> 1 kí tự

public class Ex01Mutiple {
	public static void main(String[] args) {
		int wrongTimes = 0;

		Scanner sc = new Scanner(System.in);

		String text = "";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + ") : " : ": ";
			System.out.print("Enter N (N>0) " + suffix);

			text = sc.nextLine();
			if (text.matches("[1-9][0-9]{0,}") || text.matches("[0][0-9]{1,}")) {
				break;
			}

			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println(
						"Sorry, you entered incorrectly more than specified times! " + "\nPlease try again later!");
				System.exit(0);
			}
		} while (true);

		int n = Integer.parseInt(text);

		if (isEven(n)) {
			System.out.println(n + "is an even number!");
		} else {
			System.out.println(n + "is an odd number!");
		}
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

}
