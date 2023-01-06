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
 * 4. Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
 */

public class Ex05StartEndWithReplace {
	public static void main(String[] args) {
		String s = "STK123";
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
		
	}

}
