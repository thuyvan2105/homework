package review;

import java.util.Random;

public class Ex04SumOfFactorial {

	private static Random rd = new Random();

	public static void main(String[] args) {
		int a = random(10, 11);
		int b = random(10, 11);
		int c = random(10, 11);

		int sum = fact(a) + fact(b) + fact(c);
		System.out.println("sum factorial of " + a + ", " + b + ", " + c + " --> " + sum);
	}

	// [10, 20]
	private static int random(int inclusiveStart, int inclusiveEnd) {

		return inclusiveStart + rd.nextInt(inclusiveEnd - inclusiveStart + 1);
	}

	private static int fact(int n) {
		int f = 1;
		while (n > 1) {
			f *= n--;
		}
		return f;
	}

}
