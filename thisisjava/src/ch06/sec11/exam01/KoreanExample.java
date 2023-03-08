package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("900101-1234567","감자채");
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k1);

//		k1.ssn="000000-0000000";//Unresolved compilation problem: 
		System.out.println(k1.ssn);
		
		k1.name="감자";
		System.out.println(k1.name);
	}

}
