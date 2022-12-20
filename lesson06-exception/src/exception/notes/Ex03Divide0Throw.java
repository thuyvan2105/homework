package exception.notes;

/**
 * Opt3: check condition and throw exception before calling function
 * throw from function and being caught at called function
 * (Code ở một function nào đó, rồi throw nó, chỗ nào g�?i function đó thì dùng try-catch để xử lý)
 * 
 * NOTE: khi throw tại hàm main => ko có ý nghĩa
 * Hàm main là nơi bắt đầu và kết thúc của chương trình
 * Là unit nh�? nhất, là nơi máy ảo JAVA tự động g�?i
 * => ko có hàm nào có thể g�?i hàm main và bắt lỗi cho nó cả
 * => Khi đó sẽ quăng exception và dừng chương trình 
 * NHƯNG khi throw ở hàm khác ko phải hàm main thì flow sẽ khác
 * 
 * ---- TẠI SAO CẦN DÙNG THROW? -----
 * throw >> dùng ở function tự viết
 * throw >> dùng ở available functions (function của JAVA)
 * Khi viết 1 hàm ra >> hàm đó sẽ được sử dụng ở nhi�?u nơi 
 * VD: hàm devide() được g�?i ở nhi�?u nơi
 * 	  Ở C1: a, b (đã validation với b != 0) => vẫn return a/b bình thư�?ng
 *          => ko cần phải try-catch
 *    Ở C2: a, b (no validation) => khi g�?i hàm devide() có khả năng bị exception
 *          => try-catch
 *    Ở C3: a, b (no validation) >> bắt buộc ngư�?i dùng nhập và giá trị b != 0
 *                               >> Nếu b == 0 thì bị crash app (tùy vào yêu cầu của KH)
 *                               
 * Vì ko biết input như thế nào, và có thể việc try-catch trước sẽ bị thừa => chỉ cần throw
 * Nơi nào g�?i, tùy theo yêu cầu bài toán mà xử lý (validation or try-catch...)                        
 */

public class Ex03Divide0Throw {
	public static void main(String[] args) {
		// a/b >> type int, b = 0
		int a = 5;
		int b = 0;

		// call, catch >> No "try-catch" >> occur exception and crash app as normally
		try {
			System.out.println(devide(a, b));
		} catch (ArithmeticException e) { // ArithmeticException e = detailMessage (line 59)
			// e.printStackTrace(); >> chỉ hiện thị trên console
			// �?ể hiện thị message khi ứng dụng chạy (KH, tester có thể xem được)
			System.out.println("Message " + e.getMessage()); // message in line 59
		}

		System.out.println("Back to Main method");
	}

	// throw
	private static int devide(int a, int b) /*throws Exception*/ {
		if (b == 0) {
			// error first
			// Khi biết input ko hợp lệ => ném ngoại lệ ngay => cho chương trình dừng
			// Nếu đợi nó xử lý rồi mới gây ra lỗi => lỡ trong lúc nó xử lý sẽ có trư�?ng hợp
			// gây lỗi data,... => phi�?n phức hơn
			// Tại chỗ call nó , không bắt buộc catch exception (optional)
			// => Chỗ call vẫn bị exception như thư�?ng
			// Throwable >> detailMessage
			throw new ArithmeticException("-- Divide by zero /0--");
			// throw new Exception("-- Divide by zero /0--");
		}

		return a / b;
	}
	
	/*
	 * TH1: Trong function có throw new "compile exception" (VD: throw new Exception)
	 * >> Ở phần khai báo hàm >> bắt buộc throws "compile exception"
	 * >> �?ể những chỗ g�?i hàm này >> bắt buộc try-catch
	 * 
	 * TH2: Trong function có throw new "runtime exception" (VD: throw new ArithmeticException)
	 * >> Ở phần khai báo hàm >> KHÔNG bắt buộc throws
	 * >> Chỗ g�?i cũng KHÔNG bắt buộc try-catch
	 */

}
