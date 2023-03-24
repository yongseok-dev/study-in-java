package ch08;

public class CarTester {
	public static void main(String[] args) {
		Car k3 = new Car("K3", "서울9900", 1660, 1500, 3640, 40, 12);
		k3.spect();
		Car k5 = new Car("K5", "서울9900", 1660, 1525, 3695, 41, 12);
		k5.spect();
		
		System.out.println(k3.getGas());
		k3.setPosition(15, 15);
		System.out.println(k3.getGas());
		
	}
}
