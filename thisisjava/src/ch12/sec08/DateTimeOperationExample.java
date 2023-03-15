package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		System.out.println("현재시간: "+ now.format(dtf));
		
		LocalDateTime r1 = now.plusYears(1);
		System.out.println("r1: "+ r1.format(dtf));
		LocalDateTime r2 = now.minusMonths(2);
		System.out.println("r2: "+ r2.format(dtf));
		LocalDateTime r3 = now.plusDays(2);
		System.out.println("r3: "+ r3.format(dtf));
		
	}
}
