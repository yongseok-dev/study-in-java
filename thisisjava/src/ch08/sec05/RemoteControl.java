package ch07.sec05;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	void turnOn();//추상메소드
	void turnOff();//추상메소드
	void setVolume(int vloume);//추상메소드
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음을 해제합니다.");
		}
	}
}
