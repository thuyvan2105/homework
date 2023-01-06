package comparable;

/**
 * String đã override lại hàm equals 
 * --> sử dụng hàm của chính nó (ko dùng của Object)
 * --> Không so sánh địa chỉ ô nhớ 
 * --> So sánh value (độ dài của length)
 */

public class Ex2Equals {
	public static void main(String[] args) {
		// compare content: equals, compareTo
		String s1 = "Hello";
		String s2 = "Machine";
		String s3 = "Hello";

		System.out.println("s1, s2: " + (s1.equals(s2))); // F
		System.out.println("s1, s3: " + (s1.equals(s3))); // T
		System.out.println("s2, s3: " + (s2.equals(s3))); // F

		// rarely use string object
		String o1 = new String("Hello");
		String o2 = new String("Machine");
		String o3 = new String("Hello");

		System.out.println("o1, o2: " + (o1.equals(o2))); // F
		System.out.println("o1, o3: " + (o1.equals(o3))); // T
		System.out.println("o2, o3: " + (o2.equals(o3))); // F

	}

}
