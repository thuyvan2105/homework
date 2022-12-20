package exception.notes;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter year of birth => calculate current age
 * Opt 2: Try-catch
 * + �?ặt đoạn mã có khả năng xảy ra ngoại lệ trong khối Try
 *   Hoặc đặt toàn bộ đoạn mã mình muốn vào, dòng nào bị lỗi ở Try sẽ nhảy vào Catch
 *   Cơ chế: vẫn chạy bình thư�?ng, ai lỗi thì nhảy vào Catch
 *   (Không phải kiểu kiểm tra từng dòng xem có bị exception ko)
 * + Thông báo hoặc xử lý exception ở Catch 
 * + Sau đó sẽ trở v�? chương trình, tiếp tục bình thư�?ng
 */

public class Ex02CalAgeTryCatch {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		int yob = 0;
		try {
			// block scope
			// NumberFormatException
			// Nếu yob được nhập đúng => sẽ xuống tiếp 30, 31
			// Nếu nhập sai (ko phải số) => sẽ xuống catch, ko nhảy vào 30,31
			System.out.print("Enter year of birth: ");
			yob = Integer.parseInt(ip.nextLine());
			int cry = Year.now().getValue();
			System.out.println("Age: " + (cry - yob));
		} catch (NumberFormatException e) {
			e.printStackTrace(); // JVM tự động g�?i để in ra lỗi
		}
		
		System.out.println("Back to Main method");
		
	}

}
