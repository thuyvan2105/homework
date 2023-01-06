package comparable;

/**
 * compareTo override from Comparable interface
 * 
 * return positive/negative value
 * A: 65
 * B: 66
 * a: 92
 * b: 93
 * "A".compareTo("D") >> -1 => A < D
 * 
 * > 0 => 1st > 2nd 
 * = 0 => 1st = 2nd
 * < 0 => 1st < 2nd
 */

public class Ex3CompareTo {
	public static void main(String[] args) {
		// compare content: compareTo, compareTo
		String s1 = "Hello";
		String s2 = "Machine";
		String s3 = "Hello";

		System.out.println("s1, s2: " + (s1.compareTo(s2))); // -5
		System.out.println("s1, s3: " + (s1.compareTo(s3))); // 0
		System.out.println("s2, s3: " + (s2.compareTo(s3))); // 5 

		// rarely use string object
		String o1 = new String("Hello");
		String o2 = new String("Machine");
		String o3 = new String("Hello");

		System.out.println("o1, o2: " + (o1.compareTo(o2))); // -5
		System.out.println("o1, o3: " + (o1.compareTo(o3))); // 0
		System.out.println("o2, o3: " + (o2.compareTo(o3))); // 5

	}

}
