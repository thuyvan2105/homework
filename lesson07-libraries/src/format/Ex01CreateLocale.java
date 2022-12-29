package format;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01CreateLocale {
	public static void main(String[] args) {
		// default locale >> [language_country] (Ex: en_US)
		// System.out.println("default locale: " + Locale.getDefault());
		
		// change default locale
		Locale.setDefault(new Locale("da", "DK"));
		System.out.println("changed default locale: " + Locale.getDefault());

		// value --> could be number, currency,...
		double value = 12335764897.268d;

		// number
		// factory, [singleton - a class only create an object]
		NumberFormat nf = NumberFormat.getInstance(); // getInstance() = getNumberInstance()
		String fmt = nf.format(value); // return type --> String
		System.out.println("number format: " + fmt);

		// currency
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("cf format: " + cf.format(value));
		System.out.println("====================");

		// List of all locales in JAVA
		Locale[] locales = Locale.getAvailableLocales();
		System.out.println(Arrays.toString(locales));
	}

}
