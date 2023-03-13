package ch07.sec06;

public class RemoteControlExample {
	public static void main(String[] args) {

		RemoteControl rc;

		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		
		rc.setMute(true);
		rc.setMute(false);
		System.out.println();
		
		RemoteControl.changeBattery();
		//구현 객체가 불필요하다.
	}
}
