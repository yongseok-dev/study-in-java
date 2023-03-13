package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
	@Override
	public void turnOn() {// 추상메소드 재정의
		System.out.println("TV를 켭니다.");
	};

	@Override
	public void turnOff() {// 추상메소드 재정의
		System.out.println("TV를 끔니다.");
	};

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
