package bean;

import java.util.Arrays;

public class Order {
	private Customer customer;
	private Book[] books;
	
	public Order() {
	}

	public Order(Customer customer, Book[] books) {
		this.customer = customer;
		this.books = books;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", books=" + Arrays.toString(books) + "]";
	}

}
