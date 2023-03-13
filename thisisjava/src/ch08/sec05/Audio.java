package ch07.sec05;

public class Audio implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {// 추상메소드 재정의
		System.out.println("오디오를 켭니다.");
	};

	@Override
	public void turnOff() {// 추상메소드 재정의
		System.out.println("오디오를 끔니다.");
	};

	@Override
	public void setVolume(int volume) {// 추상메소드 재정의

		this.volume = volume > MAX_VOLUME ? MAX_VOLUME : volume < MIN_VOLUME ? MIN_VOLUME : volume;
		System.out.println("현재 오디오 볼륨: " + this.volume);
	};

	private int memoryVolume;

	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			this.volume = this.memoryVolume;
			System.out.println("무음을 해제합니다.");
			System.out.println("현재 오디오 볼륨: " + this.volume);
		}

	}
}
