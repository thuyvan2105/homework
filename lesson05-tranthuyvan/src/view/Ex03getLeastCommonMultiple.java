package view;

/**
 * Cho mảng A gồm n phần tử (2 < n < 20). Ak = [1, 10]
 * Tìm bội chung nhỏ nhất của các phần tử trong mảng
 * VD1: Ak = [2, 3] >> BCNN = 6
 * VD2: Ak = [2, 3, 4] >> BCNN = 12
 * Method signature: int getLeastCommonMultiple(….)
 * 
 * BCNN => Least Common Multiple (lcm)
 * UCLN => Greatest Common Divisor (gcd)
 */

public class Ex03getLeastCommonMultiple {
	public static void main(String[] args) {
		int[] numbers = { 2, 3, 4, 5 };

		System.out.println("Least Common Multiple --> " + getLeastCommonMultiple(numbers));

	}

	// Find Greatest Common Divisor (gcd) of 2 numbers
	// First, find Least Common Multiple
	// From gcd => find lcm

	private static int findGCD(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	private static int findLCM(int a, int b) {
		return (a * b) / findGCD(a, b);
	}

	// Find Greatest Common Divisor (gcd) of array (from gcd of 2 numbers)
	private static int getLeastCommonMultiple(int[] numbers) {
		int length = numbers.length;

		if (length == 0) {
			System.out.println("At least one element is required!!!");
			return Integer.MAX_VALUE;
		}

		if (length == 1) {
			System.out.println("This array has only one element.");
			return numbers[0];
		}

		int result = findLCM(numbers[0], numbers[1]);
		for (int i = 2; i < length; i++) {
			result = findLCM(result, numbers[i]);
		}
		return result;
	}

}
