package ch07.sec05;

public class RemoteControlExample {
	public static void main(String[] args) {

		RemoteControl rc;

		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		
		rc.setMute(true);
		rc.setMute(false);
	}
}
