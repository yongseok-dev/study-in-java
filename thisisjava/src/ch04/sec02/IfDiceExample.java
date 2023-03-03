package ch04.sec02;

public class IfDiceExample {

	public static void main(String[] args) {
		int diceNumber = (int) (Math.random()*6+1);
		
		System.out.printf("%d번이 나왔습니다.",diceNumber);
		//음... 필요한 것만 하도록 하자!
	}

}
