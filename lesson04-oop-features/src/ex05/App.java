package ex05;

public class App {
	public static void main(String[] args) {
		Book[] books = getBooks();

		Customer customer = new Customer("A123", "Tran Thuy Van", 123456789, "abcd");

		Order order = new Order(customer,
				new BookDetail[] { new BookDetail(books[0], 1), new BookDetail(books[4], 1) });

		// tính tổng tiền mà khách hàng phải thanh toán
		System.out.println("----- Total -----");
		System.out.println(getTotal(order));

		System.out.println("\n ==================== \n");

		// In bill
		// System.out.println("Order Detail --> " + order);
		export(order, getTotal(order));

	}

	// Viết hàm tạo dữ liệu sách cho cửa hàng (3 SGK, 2 STK)
	private static Book[] getBooks() {
		TextBook tb1 = new TextBook("SGK01", 45, "Nhi Dong", Status.OLD);
		TextBook tb2 = new TextBook("SGK02", 100, "Thai Ha", Status.NEW);
		TextBook tb3 = new TextBook("SGK03", 150, "Nhi Dong", Status.NEW);

		ReferenceBook rb1 = new ReferenceBook("STK01", 250, "Fahasa", 5);
		ReferenceBook rb2 = new ReferenceBook("STK02", 90, "Nhi Dong", 2);

		return new Book[] { tb1, tb2, tb3, rb1, rb2 };
	}
	// Order order = new Order(customer,
	// new BookDetail[] { new BookDetail(books[0], 1), new BookDetail(books[4], 1)
	// });

	public static double getTotal(Order order) {

		double total = 0;
		BookDetail[] bookDetails = order.getBookDetails();
		for (BookDetail bookDetail : bookDetails) {
			Book book = bookDetail.getBook(); // books[0] -> tb1, books[4] -> rb2

			total += book.getSalesPrice();

		}

		return total;
	}

	public static void export(Order order, double totalOfMoney) {
		System.out.println(order.getCustomer());
		System.out.println("=====================");
		BookDetail[] bookDetails = order.getBookDetails();
		for (BookDetail bookDetail : bookDetails) {
			System.out.println(bookDetail.getBook() + " --> " + bookDetail.getQuantity());
		}
		System.out.println("=====================");
		System.out.println("Total of money --> " + totalOfMoney);
	}

}
