package datetime;

/**
 * HH:mm:ss   --> HH = hour of day (24h) 
 * hh:mm:ss   --> hh = hour (12h)
 * hh:mm:ss a --> a = PM
 * dd/MM/yyyy'T'HH:mm:ss --> 03/01/2023T20:47:44 
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02SimpleDateFormat {

	private static final String PATTERN = "dd/MM/yyyy'T'hh:mm:ss a";

	public static void main(String[] args) {
		// current time
		long current = System.currentTimeMillis();
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		System.out.println("date: " + date);
		System.out.println("c: " + c);
		System.out.println("current time millis: " + current);

		// Date --> String
		DateFormat df = new SimpleDateFormat(PATTERN);
		String value = df.format(date);
		System.out.println("ddMMyyyy (Date) : " + value);

		// Calendar --> String
		value = df.format(c.getTime()); // .getTime(); --> convert from Calendar to Date 
		System.out.println("ddMMyyyy (Calendar) : " + value);

	}

}
