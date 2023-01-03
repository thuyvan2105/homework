package datetime;

import java.util.Calendar;

import utils.DateUtils;

/**
 * Kiểm tra xem tháng, năm bất kì có bao nhiêu ngày chủ nhật
 * 
 * Idea: 
 * + tìm ngày đầu tiên, ngày cuối cùng của tháng, năm đó 
 * + duyệt từ đầu đến cuối
 *   . cái nào có dayOfWeek == 1 (Sunday) => + 7 (vì cách 7 ngày mới đến ngày chủ nhật tiếp theo)
 *   . cái nào có dayOfWeek != 1 => + 1 (vì là ngày thường, +1 để đến ngày tiếp theo, đến ngày chủ nhật thì +7 như trên)
 * + Cộng dồn vào để được số ngày chủ nhật trong tháng, năm đó
 * 
 * getActualMaximum(Calendar.DAY_OF_MONTH) --> check tháng đó có tối đa mấy ngày
 * System.out.println(DateUtils.toString(c)); --> in tất cả các ngày trong tháng
 * theo hàm toString của class DateUtils tự tạo
 */

public class Ex04NumberOfSundaysM2 {
	public static void main(String[] args) {
		int nos = getNumberOfSundays(Calendar.OCTOBER, 2021);
		System.out.println("Number of Sundays: " + nos);
	}

	private static int getNumberOfSundays(int month, int year) {
		int nos = 0; // nos: number of Sundays
		Calendar dateStart = DateUtils.toCalendar(year, month, 1);
		Calendar dateEnd = DateUtils.toCalendar(year, month, dateStart.getActualMaximum(Calendar.DAY_OF_MONTH));

		Calendar c = dateStart;
		while (c.before(dateEnd)) {
			if (c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				c.add(Calendar.DAY_OF_MONTH, 1);
				continue;

			}
			nos++;
			c.add(Calendar.DAY_OF_MONTH, 7);

		}

		return nos;
	}

}
