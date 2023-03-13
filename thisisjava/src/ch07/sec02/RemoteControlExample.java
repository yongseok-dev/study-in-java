package ch07.sec02;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
//		rc = new RemoteControl();//Cannot instantiate the type RemoteControl
		rc = new Television();
		rc.turnOn();
		
		RemoteControl rcAudio = new Audio();//새로생성
		rcAudio.turnOn();
		
		rc = new Audio();//교체
		rc.turnOn();
		
		Audio audio = new Audio();//Audio로 생성
		audio.turnOn();
		
	}
}
