package immutable;

import static utils.JvmUtils.*;

/**
 * Recommendation --> String literal 
 * Why called Immutable?
 * --> Vì String là Immutable nên dù là String Literal hay String Object
 *     không thể thay đổi giá trị ban đầu trên HEAP, mà tạo ra ô nhớ mới
 *     VD: "Home" --> nếu chưa có ô nhớ nào mang giá trị "Home" thì sẽ tạo mới
 *     chứ không update giá trị ban đầu
 */

public class Ex03WhyCalledImmutable {
	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Student";
		
		System.out.println("===== Before =====");
		hash("s1 hash", s1);
		hash("s2 hash", s2);
		
		// Cannot change original String HEAP value --> Immutable
		// Reassign to new String memory
		s1 = "Home";
		
		System.out.println("===== After =====");
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		hash("s1 hash", s1);
		hash("s2 hash", s2);
				
	}

}
