package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02LocalTime {
	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		System.out.println("start: " + start);

		LocalTime end = start.plusHours(2)
							 .plusMinutes(4)
							 .plusSeconds(6);
		
		System.out.println("end: " + end);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("start format: " + dtf.format(start));
		System.out.println("end format: " + dtf.format(end));
		
		// Time Range --> Duration
		Duration duration = Duration.between(start, end);
		System.out.println("Duration: " + duration); // PT2H4M6S
		System.out.println(duration.toHoursPart()    + " hours\n" +
				           duration.toMinutesPart()  + " minutes\n" +
				           duration.toSecondsPart()  + " seconds");

	}

}
