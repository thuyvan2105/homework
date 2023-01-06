package immutable;

/**
 * Which one we will use in reality, between String Literal and String Object?
 * --> String Literal
 * To save memory >> solve performance issue
 *
 */

public class Ex02Usage {

	private static int COUNT = 100000;

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		for (int i = 1; i <= COUNT; i++) {
			// Took 5ms
			String s1 = "Welcome";
			String s2 = "Welcome";
			String s3 = "Student";

			/*
			 * took ~50ms 
			 * String o1 = new String("Welcome"); 
			 * String o2 = new String("Welcome"); 
			 * String o3 = new String("Student");
			 */
		}

		long end = System.currentTimeMillis();
		System.out.println("duration: " + (end - start));

	}

}
