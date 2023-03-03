package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x=5;
		double y=0.0;
		double z=x/y;
		System.out.println(z+", isInfinite:"+ Double.isInfinite(z));
		System.out.println(z+", isNaN:"+ Double.isNaN(z));
	
//		System.out.println(5/0); // / by zero
		
	}

}
