package ch13.sec02.exam1;

public class GenericExample {
	public static void main(String[] args) {
		
		Product <Tv,String> product1 = new Product();
		product1.setKind(new Tv());
		product1.setModel("smartTV");
		System.out.println(product1.getKind().getClass());
		System.out.println(product1.toString());
		
		Product <Car,String> product2 = new Product();
		product2.setKind(new Car());
		product2.setModel("AI Car");
		System.out.println(product2.getKind().getClass());
		System.out.println(product2.toString());
	}
}
