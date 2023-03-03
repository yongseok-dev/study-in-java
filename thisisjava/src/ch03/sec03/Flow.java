package ch03.sec03;

public class Flow {

	public static void main(String[] args) {
		// over
		byte var1=125;
		for(int i=0;i<5;i++) {
			var1++;
			System.out.println("var1: "+var1);
		}
		//under
		byte var2=-125;
		for(int i=0;i<5;i++) {
			var2--;
			System.out.println("var2: "+var2);
		}
		
		int x=1000000;
		int y=1000000;
		System.out.println(x*y);
		System.out.println((x*y)+1);
	}

}
