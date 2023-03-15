package ch12.sec09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("E요일");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("올해 D번째 날");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("이달 d번째날");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("S밀리초");
		System.out.println(sdf.format(now));

	}
}
