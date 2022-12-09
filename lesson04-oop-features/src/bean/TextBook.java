package bean;

/**
 * Sách giáo khoa: Mã sách, đơn giá, nhà xuất bản, tình trạng (mới, cũ).
 * Sách tham khảo: Mã sách, đơn giá, nhà xuất bản, thuế %.
 */

public class TextBook extends Book {
	private boolean status;
	
	public TextBook() {
	}

	public TextBook(String id, double price, String publisher, boolean status) {
		super(id, price, publisher);
		this.status = status;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Text book: " + status + ", " + super.toString();
	}
	
	@Override
	public double getTotal() {
		if (!status) {
			return getPrice() * 0.9;
		}
		return getPrice();
	}

}
