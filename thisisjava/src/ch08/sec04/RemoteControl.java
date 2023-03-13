package ch08.sec04;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	public void turnOn();//추상메소드
	public void turnOff();//추상메소드
	public void setVolume(int vloume);//추상메소드
}
