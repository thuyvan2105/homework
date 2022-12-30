package datetime;

import java.util.Calendar;

/**
 * Lấy thông tin thời gian với timezone
 * Ngày, tháng, năm
 * Giờ (12-24), phút, giây
 * Thứ ngày, tuần trong tháng, năm
 * Ngày đầu tiên trong tuần với locale
 * Kiểm tra năm hiện tại có phải năm nhuận không 
 * Ngày đầu tiên của tuần hiện tại 
 * Các ngày trong tuần, tháng, năm hiện tại 
 * => Epoch time
 * 
 * JAVA07
 * Date: ngày tháng năm - giờ phút giây
 * Calendar: ngày tháng năm - giờ phút giây + hàm xử lý
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
 */

public class Ex01Timezone {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // runtime -> GregorianCalendar
		// System.out.println(c); => call toString to print (but print all info)
		// ↓
		// get day, month, year --> syntax: c.get(value which need to get)
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		System.out.println("DMY: " + (day + "/" + month + "/" + year));
		
		int hour = c.get(Calendar.HOUR); // Clock 12
		int hourOfDay = c.get(Calendar.HOUR_OF_DAY); // Clock 24
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("H12MS: " + (hour + ":" + minute + ":" + second));
		System.out.println("H24MS: " + (hourOfDay + ":" + minute + ":" + second));
		
		
		
		
	}

}
