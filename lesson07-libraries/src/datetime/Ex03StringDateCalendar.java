package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03StringDateCalendar {

	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat(PATTERN);
		// Date - String >> df.format

		// String - Date >> df.parse
		Date date = null;
		try {
			date = df.parse("25/10/2018 16:30:20"); // block scope
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println("date: " + date);

		// Date - Calendar
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println("c: " + c);
	}

}
