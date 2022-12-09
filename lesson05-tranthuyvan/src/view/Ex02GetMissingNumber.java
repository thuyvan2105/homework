package view;

/**
 * Cho mảng A gồm n-1 phần tử, giá trị của phần tử thứ k, Ak = [1, n].
 * Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.
 * VD1: n = 6, Ak = [3, 2, 1, 6, 5]
 * Phần tử cần tìm có giá trị: 4
 * VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10]
 * Phần tử cần tìm có giá trị: 8
 * Method signature: int getMissingNumber(…)
 */

public class Ex02GetMissingNumber {
	public static void main(String[] args) {
		int[] numbers = {3, 7, 9, 2, 1, 6, 5, 4, 10};
		System.out.println("Missing number --> " + getMissingNumber(numbers));
	}
	
	private static int getMissingNumber(int[] numbers) {
		// Step 1: Find max element (n)
		// n = numbers.length + 1 => n = 10
		int n = numbers.length + 1;

		// Step 2: Calculate sum of array which has full of elements (1-10)
		int sum = n * (n + 1) / 2; // 55

		// Step 3: Calculate sum of array which has a missing number (1-10, except 8)
		int sumOfElements = 0;
		for (int number : numbers) {
			sumOfElements += number;
		}
		return sum - sumOfElements;

	}

}
