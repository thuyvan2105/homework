package format;

/**
 * phần nguyên:#,### cách nhau bởi dấu phẩy 
 * (ngăn cách phần bên trái và bên phải 3 chữ số bởi dấu phẩy)
 * VD: 569,324
 * 
 * phần thập phân: #.### cách nhau bởi dấu chấm
 * VD: 569324.235
 * 
 * Đối với # => ko có thì ko xuất hiện 
 * VD: #.##### => 569324.2346
 * Đối với 0 => ko có thì tự động thêm số 0 vào 
 * VD: #.00000 => 569324.23460
 * 
 * Kết hợp --> #,###.### --> 569,324.235
 * #.###,### ---> ERORR!!!
 */

import java.text.DecimalFormat;

public class Ex02DecimalFormat {

	private static final String PATTERN = "#,###.###";

	public static void main(String[] args) {
		double value = 569324.2346d;

		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df format: " + df.format(value));

	}

}
