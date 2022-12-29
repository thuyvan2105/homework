package format;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex01DefaultLocale {
	public static void main(String[] args) {
		// value --> could be number, currency,...
		double value = 12335764897.268d;

		// create locale
		Locale locale = new Locale("da", "DK");

		// number
		// factory, [singleton - a class only create an object]
		NumberFormat nf = NumberFormat.getInstance(locale);
		String fmt = nf.format(value); // return type --> String
		System.out.println("number format: " + fmt);

		// currency
		NumberFormat cf = NumberFormat.getCurrencyInstance(locale);
		System.out.println("cf format: " + cf.format(value));
		System.out.println("====================");

	}

}
