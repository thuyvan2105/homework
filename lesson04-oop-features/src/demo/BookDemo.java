package demo;

import bean.Book;
import bean.Customer;
import bean.Order;
import bean.ReferenceBook;
import bean.TextBook;
import utils.BookUtils;

/**
 * Viết hàm tạo dữ liệu sách cho cửa hàng.
- Tạo 3 đối tượng Sách Giáo Khoa
- Tạo 2 đối tượng Sách Tham Khảo
- Lưu danh sách các đối tượng vào mảng một chiều duy nhất
 */

public class BookDemo {
	public static void main(String[] args) {
		Book[] books = getBooks();
		
		Customer customer = new Customer("A123", "Tran Thuy Van", 123456789, "abcd");
		Book[] b = {books[0], books[4]};
		Order order = new Order(customer, b);
		
		System.out.println("----- Total price -----");
		System.out.println("Order --> " + getTotal(order));
		
	}
	
	private static Book[] getBooks() {
		TextBook tb1 = new TextBook("SGK01", 45, "Nhi Dong", false);
		TextBook tb2 = new TextBook("SGK02", 100, "Thai Ha", true);
		TextBook tb3 = new TextBook("SGK03", 150, "Nhi Dong", true);

		ReferenceBook rb1 = new ReferenceBook("STK01", 250, "Fahasa", 5);
		ReferenceBook rb2 = new ReferenceBook("STK02", 90, "Nhi Dong", 2);

		return new Book[] { tb1, tb2, tb3, rb1, rb2 };
	}
	
	public static double getTotal(Order order) {
		double total = 0;
		Book[] books = order.getBooks();
		for (Book book : books) {
			if (book instanceof TextBook) {
				TextBook textbook = (TextBook) book;
				double p1 = textbook.getTotal();
				total += p1;
			} else if (book instanceof ReferenceBook) {
				ReferenceBook ref = (ReferenceBook) book;
				double p2 = ref.getTotal();
				total += p2;
			}
		}
		return total;
	}

}
