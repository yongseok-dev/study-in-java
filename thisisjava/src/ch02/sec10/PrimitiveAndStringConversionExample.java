package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// 문자열 타입변환
		String str = "10";
		System.out.println("String->byte");
		System.out.println(Byte.parseByte(str));

		str = "200";
		System.out.println("String->short");
		System.out.println(Short.parseShort(str));
		
		str = "300000";
		System.out.println("String->int");
		System.out.println(Integer.parseInt(str));
		
		str = "4000000000";
		System.out.println("String->long");
		System.out.println(Long.parseLong(str));
		
		str = "12.345";
		System.out.println("String->float");
		System.out.println(Float.parseFloat(str));
		
		str = "12.345";
		System.out.println("String->double");
		System.out.println(Double.parseDouble(str));
		
		str = "true";
		System.out.println("String->boolean");
		System.out.println(Boolean.parseBoolean(str));
		
		System.out.println("String.valueOf(기본형)");
		
	}

}
