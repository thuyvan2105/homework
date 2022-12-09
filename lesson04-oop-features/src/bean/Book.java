package bean;

/**
 * Sách giáo khoa: Mã sách, đơn giá, nhà xuất bản, tình trạng (mới, cũ).
 * Sách tham khảo: Mã sách, đơn giá, nhà xuất bản, thuế %.
 */

public abstract class Book {
	private String id;
	private double price;
	private String publisher;
	
	public Book() {
	}

	public Book(String id, double price, String publisher) {
		this.id = id;
		this.price = price;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return id + ", " + price + ", " + publisher;
	}
	
	public abstract double getTotal();

}
