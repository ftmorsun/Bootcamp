package day16Lists;

import java.time.*;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.Clock;

public class Date01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock cl= Clock.systemUTC(); 

		LocalDate currentDate01=LocalDate.now(cl);
		System.out.println(currentDate01.plusMonths(4));
		
		//Local Time
		LocalTime currentTime01=LocalTime.now();
		System.out.println(currentTime01.plusHours(2).plusMinutes(45).plusSeconds(11));
		

		//Local date and time
		LocalDateTime cur=LocalDateTime.now();
		System.out.println(cur);
		
		DateTimeFormatter dtf01= DateTimeFormatter.ofPattern("dd/MMM/yy");
		System.out.println(dtf01.format(currentDate01.plusDays(11)));
	}

}
