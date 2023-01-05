package localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * LocalDate 
   --> LocalDate date = LocalDate.now(); // current date, month, year
   + Set month and year 
   --> LocalDate date = LocalDate.now().withMonth(int).withYear(int)
  
 * LocalTime
 * LocalDateTime 
 * DateTimeFormatter
 */

public class Ex01LocalDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now()
								  .withMonth(8)
								  .withYear(2022);		
		System.out.println("date: " + date); // 2023-01-04 => 2022-08-04
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatted = dtf.format(date);
		System.out.println("formatted: " + formatted);
		
		LocalDate anotherDate = LocalDate.of(2022, 9, 5);
		
		// Time Range: -> Period 2022-08-04 -> 2022-09-05
		Period period = Period.between(date, anotherDate);
		System.out.println("Period: " + period); // P1M1D => Period-1 month-1 day
		System.out.println(period.getYears()  + " years\n" +
						   period.getMonths() + " months\n" +
						   period.getDays()   + " days");
		
	}

}
