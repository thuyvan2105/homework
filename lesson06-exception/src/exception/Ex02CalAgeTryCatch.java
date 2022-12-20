package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter year of birth => calculate current age
 * Opt 2: Try-catch
 * + Đặt đoạn mã có khả năng xảy ra ngoại lệ trong khối Try
 *   Hoặc đặt toàn bộ đoạn mã mình muốn vào, dòng nào bị lỗi ở Try sẽ nhảy vào Catch
 *   Cơ chế: vẫn chạy bình thường, ai lỗi thì nhảy vào Catch
 *   (Không phải kiểu kiểm tra từng dòng xem có bị exception ko)
 * + Thông báo hoặc xử lý exception ở Catch 
 * + Sau đó sẽ trở về chương trình, tiếp tục bình thường
 */

public class Ex02CalAgeTryCatch {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		int yob = 0;
		try {
			System.out.print("Enter year of birth: ");
			yob = Integer.parseInt(ip.nextLine());
			int cry = Year.now().getValue();
			System.out.println("Age: " + (cry - yob));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.println("Back to Main method");

	}

}
