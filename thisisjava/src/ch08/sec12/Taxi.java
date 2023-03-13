package ch07.sec12;

public class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	public void checkDest() {
		System.out.println("승객의 목적지를 확인합니다.");
	}
}
