package ch07;

import userType.UserType;

public class MentalArithmetic {
	static int makeNumber(int size) {
		return (int) (Math.random() * (Math.pow(10, size) - Math.pow(10, size - 1)) + Math.pow(10, size - 1));
	}
	static char choiceSign() {
		return Math.random()>0.5?'+':'-';
	}
	static boolean ploblem() {
		int x = makeNumber(3);
		int y = makeNumber(3);
		int z = makeNumber(3);
		char a = choiceSign();
		char b = choiceSign();
		int answer = x+(a=='+'?y:-y)+(b=='+'?z:-z);
		if(UserType.i(x+" "+a+" "+y+" "+b+" "+z+" = ")==answer) {
			return true;			
		};
		return false;			
	}
	public static void main(String[] args) {
		int user = 2;
		do {
			if(ploblem()) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("틀렸습니다!");
			}
			while (user>1) {
				user = UserType.i("다시 한 번?<Yes...1/No...0>", "0+");
			}
		} while (user==1);
	}
}
