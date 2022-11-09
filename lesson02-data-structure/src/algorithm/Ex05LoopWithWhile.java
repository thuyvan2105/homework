package algorithm;

/**
 * Print elements which are lower than n (n is a positive integer)
 */

public class Ex05LoopWithWhile {
	public static void main(String[] args) {
		int n = 20;

		// While
		int i = 0;
		while (i < n) {
			System.out.print(" " + i);
			i++;
		}

		System.out.println("\n=========================");

		// While (true)
		int j = 0;
		while (true) {
			System.out.print(" " + j);
			j++;

			if (j == n) {
				break;
			}
		}

	}

}
