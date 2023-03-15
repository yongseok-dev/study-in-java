package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		LocalDateTime startDT = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
		System.out.println(startDT);
		LocalDateTime endDT = LocalDateTime.of(2021, 12, 31, 0, 0, 0);
		System.out.println(endDT);
		
		if(startDT.isBefore(endDT)) {
			System.out.println("진행중입니다.");
		}else if(startDT.isEqual(endDT)) {
			System.out.println("종료합니다.");
		}else if(startDT.isAfter(endDT)) {
			System.out.println("종료했습니다.");
		}
		long remainYear = startDT.until(endDT,ChronoUnit.YEARS);
		long remainMonth = startDT.until(endDT,ChronoUnit.MONTHS);
		long remainDay = startDT.until(endDT,ChronoUnit.DAYS);
		long remainHours = startDT.until(endDT,ChronoUnit.HOURS);
		long remainMinute = startDT.until(endDT,ChronoUnit.MINUTES);
		long remainSecond = startDT.until(endDT,ChronoUnit.SECONDS);
		
		System.out.println(remainYear);
		System.out.println(remainMonth);
		System.out.println(remainDay);
		System.out.println(remainHours);
		System.out.println(remainMinute);
		System.out.println(remainSecond);
	}
}
