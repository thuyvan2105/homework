package ex05;

/**
 * Sách giáo khoa: Mã sách, đơn giá, nhà xuất bản, tình trạng (mới, cũ).
 * Sách tham khảo: Mã sách, đơn giá, nhà xuất bản, thuế %.
 */

public class TextBook extends Book {
	private Status status;
	
	public TextBook() {
	}

	public TextBook(String id, double price, String publisher, Status status) {
		super(id, price, publisher);
		this.status = status;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return  super.toString() + ", status: " + status;
	}
	
	@Override
	public double getSalesPrice() {
		if (Status.OLD.equals(getStatus())) {
			return getPrice() * 0.8;
		}
		return getPrice();
	}

}
