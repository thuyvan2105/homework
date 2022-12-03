package array;

import java.util.Arrays;

/**
 * Method 2
 * Tìm những phần tử lẻ trong mảng số nguyên
 * Input (parameter): Mảng 
 * Output (return type): Mảng số lẻ
 */

public class Ex01FindOddMethod2 {
	public static void main(String[] args) {
		int[] numbers = { 1, 7, 6, 12, 21, 5, 40 };
		int[] oddNumbers = findOddNumbers(numbers);
		System.out.println("Array of odd numbers --> " + Arrays.toString(oddNumbers));

	}

	// Function -> check Odd numbers
	private static int[] findOddNumbers(int[] elements) {
		int[] oddElements = new int[elements.length];
		int count = 0;
		for (int element : elements) {
			if (element % 2 != 0) {
				oddElements[count] = element;
				count++;
			}
		}

		// Copy to a new array
		return Arrays.copyOfRange(oddElements, 0, count);

	}

}
