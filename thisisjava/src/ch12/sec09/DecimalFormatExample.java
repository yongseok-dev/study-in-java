package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 123456.78;
		System.out.println(num);
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));

		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000");
		System.out.println(df.format(num));
	}
}
