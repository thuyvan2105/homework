package utils;

import bean.Book;
import bean.Order;
import bean.ReferenceBook;
import bean.TextBook;

/**
 * Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
 * Tìm toàn bộ sách có đơn giá nhỏ hơn 50
 * Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
 */

public class BookUtils {
	
	public BookUtils() {
	}
	
	// Find all books of Nhi Dong's Publisher
	public static void findBooksWithPublisher(Book[] books) {
		for (Book book : books) {
			if ("Nhi Dong".equals(book.getPublisher())) {
				System.out.println(book);
			}
		}
	}
	
	// Find all books with unit price less than 50
	public static void findBooksWithPrice(Book[] books) {
		for (Book book : books) {
			if (book.getPrice() < 50d) {
				System.out.println(book);
			}
		}
	}
	
	// Find all textbooks with unit prices from 100 to 200 
	public static void findTextbook(Book[] books) {
		for (Book book : books) {
			if (book instanceof TextBook) {
				double price = ((TextBook) book).getPrice();
				if (price >= 100 && price <= 200) {
					System.out.println(book);
				}
			}
		}
		
	}
	
	// function - calculate total
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
