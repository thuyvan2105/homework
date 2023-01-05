package localdatetime;

import java.time.Duration;
import java.time.LocalDate;

/**
 * if dateStart > dateEnd => throw Exception
 * get LocalDate of start and end 
 * get LocalTime of start and end 
 * subtract 
 * if timeEnd < timeStart
 * --> add 24 hours (1 day) for timeEnd 
 *     or duration (timeEnd - timeStart) plus 1 day
 * --> subtract 1 day from dateEnd
 */

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04Duration {
	
	private static final String pattern = "HH:mm:ss dd/MM/yyyy";
	
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		LocalDateTime start = LocalDateTime.parse("15:20:40 15/06/2018", dtf);
		LocalDateTime end = LocalDateTime.parse("20:25:45 15/08/2020", dtf);
		
		// Y M D / H m s
		// Period (LocalDate)
		// Duration (LocalTime)
		
		if (start.isAfter(end)) {
			throw new IllegalArgumentException("dateStart cannot exceed dateEnd !!!");
		}
		
		LocalDate startDate = start.toLocalDate();
		LocalDate endDate = end.toLocalDate();
		
		LocalTime startTime = start.toLocalTime();
		LocalTime endTime = end.toLocalTime();

		Duration duration = Duration.between(startTime, endTime);

		if (endTime.isBefore(startTime)) {
			duration = duration.plusDays(1);
			endDate = endDate.minusDays(1);
		}
		
		Period period = Period.between(startDate, endDate);

		System.out.println(period.getYears()         + " years   \n" +
				   		   period.getMonths()        + " months  \n" +
				           period.getDays()          + " days    \n" +
		                   duration.toHoursPart()    + " hours   \n" +
                           duration.toMinutesPart()  + " minutes \n" +
                           duration.toSecondsPart()  + " seconds");

	}

}
