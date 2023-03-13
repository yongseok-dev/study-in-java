package ch08.sec02;

public class Audio implements RemoteControl{
	@Override
	public void turnOn() {//추상메소드 재정의
		System.out.println("오디오를 켭니다.");
	};
}
