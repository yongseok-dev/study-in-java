package ch06.check.exam18;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService a = ShopService.getInstance();
		ShopService b = ShopService.getInstance();

		System.out.println(a == b);
		if (a == b) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}

	}

}
