package ex07;

import java.util.Arrays;

/**
 * Viết hàm tạo dữ liệu sách cho cửa hàng. (3 SGK + 2 STK)
 * Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
 * Tìm toàn bộ sách có đơn giá nhỏ hơn 50
 * Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
 * Khách hàng mua 1 cuốn sách giáo khoa, 1 cuốn sách tham khảo. 
 * Viết hàm tính tổng tiền mà khách hàng phải thanh toán. Biết rằng:
 * Sách giáo khoa - TextBook: Giảm 30% với sách cũ
 * Sách tham khảo - ReferBook: Thành tiền = đơn giá * (1 + % thuế)
 */

public class App {
	public static void main(String[] args) {
		Book[] books = getBooks();

		// Find all books of "Nhi Dong" publisher
		Book[] pub = filter(books, book -> "Nhi Dong".equals(book.getPublisher()));
		;
		// Find all books which have price < 50
		Book[] pr = filter(books, book -> book.getPrice() < 50);
		// Find all books which have price 100-200
		Book[] price = filter(books, book -> book.getPrice() >= 100 && book.getPrice() <= 200);

		// Create order
		Customer customer = new Customer("KH01", "Tran Thuy Van", 123456789, "Da Nang");
		Order order = new Order(customer,
				new BookDetail[] { new BookDetail(books[0], 1), new BookDetail(books[4], 1) });

		System.out.println("----- All books of \"Nhi Dong\" publisher -----");
		System.out.println(Arrays.toString(pub));
		System.out.println("----- All books which have price less than 50 -----");
		System.out.println(Arrays.toString(pr));
		System.out.println("----- All books which have price from 100 to 200 -----");
		System.out.println(Arrays.toString(price));
		System.out.println("----- Total of money -----");
		System.out.println(getTotal(order));

	}

	// Create objects
	private static Book[] getBooks() {
		Textbook tb1 = new Textbook("SGK01", 45, "Nhi Dong", Status.OLD);
		Textbook tb2 = new Textbook("SGK02", 145, "Fahasa", Status.NEW);
		Textbook tb3 = new Textbook("SGK03", 200, "Thai Ha", Status.NEW);

		ReferenceBook rb1 = new ReferenceBook("STK04", 300, "Tien Phong", 1.5d);
		ReferenceBook rb2 = new ReferenceBook("STK05", 400, "Nhi Dong", 2d);

		return new Book[] { tb1, tb2, tb3, rb1, rb2 };
	}

	// Find all books with given conditions
	private static Book[] filter(Book[] books, Condition condition) {
		Book[] result = new Book[books.length];
		int index = 0;
		for (Book book : books) {
			if (condition.check(book)) {
				result[index++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}

	// Calculate total of money
	private static double getTotal(Order order) {
		double totalOfMoney = 0;
		BookDetail[] bookDetails = order.getBookDetails();
		for (BookDetail bookDetail : bookDetails) {
			Book book = bookDetail.getBook();
			totalOfMoney += book.getSalesPrice();
		}

		return totalOfMoney;

	}

}
