package array;

import java.util.Arrays;

/**
 * Tìm tên bắt đầu bằng chữ "P"
 */

public class Ex02FindString {
	public static void main(String[] args) {
		String[] students = {"Peter", "Mary", "Anna", "Patrick", "Penny"};
		System.out.println(Arrays.toString(findStudents(students)));
	}
	
	private static String[] findStudents(String[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		for (String element : elements) {
			if (element.startsWith("P")) {
				result[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

}
