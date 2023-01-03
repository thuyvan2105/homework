package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Tìm khoảng thời gian 2 người quen nhau với TimeUnit
 * [Years - Months] - Days - Hours + Minutes + Seconds
 * 
 * Cách 1: 
 *  + Đổi ngày bắt đầu và thời gian hiện tại sang Milliseconds
 *  + Đối từ Milliseconds sang Days - Hours + Minutes + Seconds
 *  --> Vấn đề: ko thể đổi sang [Years - Months]
 *      . Vì tháng thì có tháng 28,29,30,31 ngày
 *      . Năm thì lại có năm nhuận năm không
 */

public class Ex05TimeUnit {
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(2020, Calendar.FEBRUARY, 22, 19, 15, 0);
		
		Calendar now = Calendar.getInstance();
		
		long startInMis = start.getTimeInMillis();
		long nowInMis = now.getTimeInMillis();
		
		long duration = nowInMis - startInMis;
		
		// duration / 1000 / 60 / 60 / 24 >> ms -> days
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(seconds);
		
		String result = days + " days\n"
					  + hours + " hours\n"
					  + minutes + " minutes\n"
					  + seconds + " seconds\n";
		System.out.println(result);

	}

}
