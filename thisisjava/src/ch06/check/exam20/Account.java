package ch06.check.exam20;

public class Account {
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	private int id;
	private String name;
	private String accountNumber;
	private int balance;
	private boolean used = false;

	// 계좌생성
	Account(int id, String name, String accountNumber, int balance) {
		this.id = id;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.used = true;
	}

	// 계좌정보
	public String getName() {
		return name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public boolean isUsed() {
		return used;
	}

	// 예금
	public void setInBalance(int balance) {
		if (MIN_BALANCE <= this.balance && this.balance <= MAX_BALANCE && MIN_BALANCE <= balance
				&& balance <= MAX_BALANCE) {
			this.balance += balance;
		}
	}

	// 출금
	public void setOutBalance(int balance) {
		if (MIN_BALANCE <= this.balance && this.balance <= MAX_BALANCE && MIN_BALANCE <= balance
				&& balance <= MAX_BALANCE) {
			this.balance -= balance;
		}
	}

}
