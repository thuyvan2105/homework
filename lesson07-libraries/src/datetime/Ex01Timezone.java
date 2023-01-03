package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Lấy thông tin thời gian với timezone
 * Ngày, tháng, năm
 * Giờ (12-24), phút, giây
 * Thứ ngày (Monday,...)
 * Tuần trong tháng, tuần trong năm
 * Thứ của ngày đầu tiên trong tuần với locale
 * + Vietnam, US >> FirstDayOfWeek = Sunday >> 1
 * + France      >> FirstDayOfWeek = Monday >> 2
 * Ngày đầu tiên của tuần hiện tại
 * + Today: 3.1
 * + US     >> FirstDayOfWeek = Sunday = 1 >> FirstWeekday = 1st 
 * + France >> FirstDayOfWeek = Monday = 2 >> FirstWeekday = 2nd
 * Kiểm tra năm hiện tại có phải năm nhuận không (leap-year)
 * Ngày đầu tiên của tuần hiện tại 
 * Các ngày trong tuần, tháng, năm hiện tại 
 * => Epoch time
 * 
 * JAVA07
 * Date: ngày tháng năm - giờ phút giây (chỉ lưu trữ data)
 * Calendar: ngày tháng năm - giờ phút giây + hàm xử lý (vừa lưu trữ, vừa support function xử lý bài toán)
 * 
 * Calendar c1 = Calendar.getInstance(); // 627185331
 * Calendar c2 = Calendar.getInstance(); // 706277948
 * => Mã hash khác nhau 
 * => ko phải singleton (singleton chỉ tạo ra 1 đối tượng)
 * => mà là factory pattern => get object from "Calendar" factory
 * 
 * GregorianCalendar : dương lịch
 * epoch time (unix time): gốc tọa độ thời gian => Midnight 01.01.1970 time = 0
 * time=1672411044425 (ms) -> time in milliseconds (from epoch time to now)
 * can convert epoch to human-readable date (now)
 * 
 * ICT: Indochina time (giờ Đông Dương)
 * 
 */

public class Ex01Timezone {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // runtime -> GregorianCalendar (today: 3/1)

		/* set time
		c.set(Calendar.DAY_OF_MONTH, 20); // 20/1
		c.set(Calendar.YEAR, 2022); // 20/1/2022 */

		System.out.println(c); // call toString to print (but print all info)

		// get day, month, year --> syntax: c.get(value which need to get)
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		System.out.println("DMY: " + (day + "/" + month + "/" + year));

		int hour = c.get(Calendar.HOUR); // Clock 12
		int hourOfDay = c.get(Calendar.HOUR_OF_DAY); // Clock 24
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String ap = c.get(Calendar.AM_PM) == 1 ? "PM" : "AM";
		System.out.println("H12MS: " + (hour + ":" + minute + ":" + second + " " + ap));
		System.out.println("H24MS: " + (hourOfDay + ":" + minute + ":" + second));

		// Day of week
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayOfWeek: " + dayOfWeek); // 3 (Tues)
		
		/* Requirement: Day of week
		 * 1 - Sunday
		 * 2 - Monday
		 * ...
		 * 7 - Saturday
		 */
		
		// Method 1: Array
		String[] dayOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		System.out.println("dayOfWeekAsString: " + dayOfWeeks[dayOfWeek - 1]);
		
		// Method 2: Enumeration
		DayOfWeek[] dayOfWeekEnum = DayOfWeek.values();
		System.out.println("dayOfWeekAsEnum: " + dayOfWeekEnum[dayOfWeek - 1]);
		
		// Week of month, week of year
		int weekOfMonth = c.get(Calendar.WEEK_OF_MONTH);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Week of month: " + weekOfMonth);
		System.out.println("Week of year: " + weekOfYear);
		
		// The first day of week --> depend on locale
		System.out.println("default locale: " + Locale.getDefault());
		System.out.println("firstWeekDay: " + c.getFirstDayOfWeek());
		
		/* Requirement: 
		 * input  = today
		 * output = the first current weekday 
		 */
		// first day of week = today + first weekday (thứ = 1 or 2 ) - current weekday (thứ hiện tại)
		// today (3.1.2022_Tuesday[3]_3rd)
		// first day of week (Sunday[1]_???)
		// => ??? = 3 (3rd) + 1 - 3 = 1st
		// Note: sử dụng phép tính của JAVA, ko dùng (+) phép toán, tránh trường hợp ngoại lệ 
		 
		Calendar firstDayOfWeek = Calendar.getInstance(); // today
		firstDayOfWeek.setTimeInMillis(c.getTimeInMillis()); // // Lấy giá trị từ c rồi gán vào cho biến firstDayOfWeek
		
		
		firstDayOfWeek.add(Calendar.DAY_OF_MONTH, firstDayOfWeek.getFirstDayOfWeek() - firstDayOfWeek.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week: " + firstDayOfWeek);

		// leap-year
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("is leap-year: " + calendar.isLeapYear(2023));
		
		System.out.println("========================================");
		
		Date date = new Date(); // = Calendar.getInstance();
		System.out.println("date: " + date); // Tue Jan 03 19:53:15 ICT 2023
		
		

	}

}
