package ch06.check.exam18;

public class ShopService {
	//field
	private static ShopService singleton = new ShopService();
	//constructor
	private ShopService() {
		
	}
	//get
	static public ShopService instance() {
		return singleton;
	}
}
