package ch03.check;

public class Ex5 {
	public static void main(String[] args) {
		
	double area = (5+10)*7/2.0;
	System.out.println(area);
	area = (5+10)*7*1.0/2;
	System.out.println(area);
	area = (double)(5+10)*7/2;
	System.out.println(area);
	area = (double)((5+10)*7/2);
	System.out.println(area);
	}
}
