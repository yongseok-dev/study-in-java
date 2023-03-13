package ch08.sec08;

public class MultiInterfaceImplExample {
	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();

//		Searchable sc = new SmartTelevision();//가능
		Searchable sc = (Searchable) rc; //기존 스마트 TV를 가지고 다형성 구현 가능
		sc.search("http://test.com");
	}
}
