package algorithm;

import java.util.Scanner;

/**
 * Find out level of students: getLevel(float point): String
 * BAD(<5), MEDIUM[5, 6.4], PRETTY_GOOD[6.5, 7.9], GOOD[>=8]
 */

public class Ex02LevelOfStudents {
	public static void main(String[] args) {
		// Input point
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your point: ");
		float point = sc.nextFloat();
		
		// Check level of point: BAD? MEDIUM? PRETTY_GOOD? GOOD?
		// Method 1: if else if
		String output = "";
		if (point < 5f) {
			output = "BAD";
		} else if (point <= 6.4f) {
			output = "MEDIUM";
		} else if (point <= 7.9f) {
			output = "PRETTY_GOOD";
		} else {
			output = "GOOD";
		}
		System.out.println("Level of point (1): " + output); // result of method 1
		System.out.println("Level of point (2): " + getLevel(point)); // result of method 2
		
	}
	
	// Method 2: Write a function to check level of point
	// dont't need to use "else" because of having "return"
	// return ==> return value and exit 
	private static String getLevel(float point) {
		if (point < 5f) {
			return "BAD";
		}
		if (point <= 6.4f) {
			return "MEDIUM";
		}
		if (point <= 7.9f) {
			return "PRETTY_GOOD";
		}
		return "GOOD";
	}

}
