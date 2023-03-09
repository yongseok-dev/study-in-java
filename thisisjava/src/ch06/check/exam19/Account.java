package ch06.check.exam19;

public class Account {
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	private int balance;
	Account(){
		
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(MIN_BALANCE<=this.balance && this.balance<=MAX_BALANCE && MIN_BALANCE<=balance && balance<=MAX_BALANCE) {
			this.balance = balance;			
		}
	}
	
}
