package algorithm;

import java.util.Scanner;

/**
 * 1. Input an positive integer number ==> Check this number is Even or Odd?
 *	  + If number is a Even number     ==> print "This is even number"
 *	  + If number is a Odd number      ==> print "This is odd number"
 */

public class Ex01EvenOrOdd {
	public static void main(String[] args) {

		// Input an integer number
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = ip.nextInt();

		// Call function in Method 1
		if (isEven(n)) {
			System.out.println("This is an even number");
		} else {
			System.out.println("This is an odd number");
		}

		// Method 2: Use "Ternary operator"
		String checkNumber = n % 2 == 0 ? "This is an even number" : "This is an odd number";
		System.out.println("Result --> " + checkNumber);

	}
	// Method 1: Write a function to check a number is Even or Odd
	private static boolean isEven(int n) {
		return n % 2 == 0;
	}

}
