package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 10;
		byte byteValue = (byte) intValue;
		System.out.println("int -> byte: " +intValue +"->"+ byteValue);
		intValue = 103029770;
		byteValue = (byte) intValue;
		System.out.println("int -> byte: " +intValue +"->"+ byteValue);
	
		long longValue = 300;
		intValue = (int) longValue;
		System.out.println("long -> int: " + longValue+"->"+ intValue);
		longValue = 990000000000000L;
		intValue = (int) longValue;
		System.out.println("long -> int: " + longValue+"->"+ intValue);
		
		intValue = 65;
		char charValue = (char) intValue;
		System.out.println("int -> char: " + intValue+"->"+charValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println("double -> int: " + doubleValue+"->"+ intValue);
		
		
	}

}
