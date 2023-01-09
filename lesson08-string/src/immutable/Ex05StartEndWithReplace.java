package immutable;

/**
 * 1. Kiểm tra kí tự, chuỗi bắt đầu, kết thúc trong chuỗi s có phải là s1 không
 * 2. Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s 
 * 3. Loại bỏ các khoảng trắng thừa của chuỗi s3
 * --> trim() (from JAVA9) : loại bỏ khoảng trắng ở đầu và cuối
 * --> strip() (from JAVA11) : loại bỏ khoảng trắng ở đầu và cuối
 *     + stripLeading
 *     + stripTrailing
 *     
 *  REGEX:
 *  \s    : space 
 *  ' '   : space
 *  +     : 1 or N character(s)
 *  {1,} : 1 or N character(s)
 *  {a, b}: from a to b character 
 * 4. Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 4
 * --> substring(): cắt chuỗi
 * 5. Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 * --> contains()
 */

public class Ex05StartEndWithReplace {
	public static void main(String[] args) {
		String s = "STK123STK";
		String s1 = "STK";
		String s2 = "SGK";
		String s3 = "    Welcome     to     our class   ";
		
		// 1
		System.out.println("start with STK: " + s.startsWith(s1));
		System.out.println("end with STK: " + s.endsWith(s1));
		
		// 2
		// nature: never update original string value in HEAP
		System.out.println("After replacing: " + s.replace(s1, s2));
		
		// 3
		// replace versus replaceAll
		// replace 1 or N spaces by space
		System.out.println("Remove extra space: " + s3.trim().replaceAll("[\\s]+", " "));
		
		// 4
		String s4 = s.substring(4);
		System.out.println("s4 substring: " + s4); // 23STK
		
		String s5 = s.substring(0, 5);
		System.out.println("s5 substring first five characters: " + s5); // STK12
		
		// 5
		System.out.println("s contains s1 ? --> " + s.contains(s1));
		System.out.println("s contains s1 ? --> " + s.contains(s2));

	}

}
