package exception.notes;

import java.util.Arrays;

public class Ex04NullPointerException {
	public static void main(String[] args) {
		// int[] a = null; >> NullPointerException (NPE)

		int[] a = { 1, 2, 3 };
		test(a);
		System.out.println(Arrays.toString(a));

	}

	// array is an object 
	// store data in HEAP memory
	private static void test(int[] a) {
		// NPE
		a[0] = 5;
		a[1] = 10;

		// ArrayIndexOutOfBoundsException
		// a[3] = 20;

	}

}
