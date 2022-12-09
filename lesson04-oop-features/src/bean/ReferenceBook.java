package bean;

/**
 * Sách giáo khoa: Mã sách, đơn giá, nhà xuất bản, tình trạng (mới, cũ).
 * Sách tham khảo: Mã sách, đơn giá, nhà xuất bản, thuế %.
 */

public class ReferenceBook extends Book {
	private double tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String id, double price, String publisher, double tax) {
		super(id, price, publisher);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Reference book: " + tax + ", " + super.toString();
	}
	
	@Override
	public double getTotal() {
		return getPrice() * getTax() / 100;
	}

}
