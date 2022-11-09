package algorithm;

import java.util.Random;

/**
 * Random a number
 */

public class Ex04RandomNumber {
	public static void main(String[] args) {
		// Method 1: use class Random
		Random rd = new Random();
		
		// Random number ==> lower than n=20
		int number1 = rd.nextInt(20);
		System.out.println("Number is lower than 20: " + number1);
		
		// Random number ==> [5, 12)
		int number2 = 5 + rd.nextInt(7);
		System.out.println("Number [5, 12) is: " + number2);
		
		// Method 2: use function Math.random();
		// [0.0, 1.0) > double
		double random1 = Math.random();
		System.out.println("Number [0.0, 1.0) is: " + random1);
		
		// [5, 12) > int
		int random2 = 5 + (int) Math.floor(Math.random() * 7);
		System.out.println("Number [5, 12) is: " + random2);
		
		// Random a number with 3 digits
		String randomNum = " " + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
		System.out.println("Random a number with 3 digits --> " + randomNum);
	}

}
