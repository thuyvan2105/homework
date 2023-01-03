package datetime;

import java.util.Calendar;

import utils.DateUtils;

/**
 * Kiểm tra xem tháng, năm bất kì có bao nhiêu ngày chủ nhật
 * 
 * Idea: 
 * + tìm ngày đầu tiên, ngày cuối cùng của tháng, năm đó 
 * + duyệt từ đầu đến cuối, cái nào có dayOfWeek == 1 (Sunday) => Lấy ra
 * + Cộng dồn vào để được số ngày chủ nhật trong tháng, năm đó
 * 
 * getActualMaximum(Calendar.DAY_OF_MONTH) --> check tháng đó có tối đa mấy ngày
 * System.out.println(DateUtils.toString(c)); --> in tất cả các ngày trong tháng
 * theo hàm toString của class DateUtils tự tạo
 */

public class Ex04NumberOfSundaysM1 {
	public static void main(String[] args) {
		int nos = getNumberOfSundays(Calendar.OCTOBER, 2021);
		System.out.println("Number of Sundays: " + nos);
	}

	private static int getNumberOfSundays(int month, int year) {
		int nos = 0; // nos: number of Sundays
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));

		for (Calendar c = dateStart; c.before(dateEnd); c.add(Calendar.DAY_OF_MONTH, 1)) {
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				nos++;
			}

		}

		return nos;
	}

}
