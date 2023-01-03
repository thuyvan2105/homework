package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Calendar dateStart = Calendar.getInstance(); 
 * dateStart.set(year, month, 1); 
 * Calendar dateEnd = Calendar.getInstance(); 
 * dateEnd.set(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH)); 
 * 
 * --> Problem: duplicate code --> create class utils --> create function
 */

import java.util.Calendar;

public class DateUtils {
	private DateUtils() {

	}

	public static Calendar toCalendar(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day);
		return calendar;
	}
	
	// should check case c == null, c != null
	public static String toString(Calendar c) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyyy");
		return df.format(c.getTime());
	}

}
