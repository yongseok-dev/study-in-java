package ch07.sec04;

public class Television implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {// 추상메소드 재정의
		System.out.println("TV를 켭니다.");
	};

	@Override
	public void turnOff() {// 추상메소드 재정의
		System.out.println("TV를 끔니다.");
	};

	@Override
	public void setVolume(int volume) {// 추상메소드 재정의

		this.volume = volume > MAX_VOLUME ? MAX_VOLUME : volume < MIN_VOLUME ? MIN_VOLUME : volume;
		System.out.println("현재 TV 볼륨: "+this.volume);
	};
}
