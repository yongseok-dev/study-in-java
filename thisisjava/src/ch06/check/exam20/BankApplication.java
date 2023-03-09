package ch06.check.exam20;

import java.util.Scanner;

public class BankApplication {
	static Account[] account = new Account[100];
	static int accountId = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int select = 0;
		do {
			do {
				menu();
				String type = sc.nextLine().replaceAll("[^1-5]", "");
				if (!"".equals(type)) {
					select = Integer.parseInt(type);
				} else {
					System.out.println("올바른 정수값을 입력해주세요");
				}
			} while (!(0 < select && select <= 5));

			if (1 == select) {
				System.out.println("-------------");
				System.out.println("계좌생성");
				System.out.println("-------------");
				System.out.print("계좌번호> ");
				String accountNumber = sc.nextLine();
				System.out.print("계좌주> ");
				String name = sc.nextLine();
				int balance = userIntegerInput("초기입금");
				
				account[accountId] = new Account(accountId, name, accountNumber, balance);
				if (!account[accountId].isUsed()) {
					System.out.println("결과: 계좌가 생성에 실패하였습니다.");
					continue;
				}
				accountId++;
				System.out.println("결과: 계좌가 생성되었습니다. ");

			} else if (2 == select) {
				System.out.println("-------------");
				System.out.println("계좌목록");
				System.out.println("-------------");
				if (accountId == 0) {
					System.out.println("등록된 계좌가 없습니다.");
					continue;
				}
				
				for (int i = 0; i < accountId; i++) {
					if (account[i].isUsed()) {
						System.out.println(account[i].getAccountNumber() + "	" + account[i].getBalance() + "	"
								+ account[i].getName());
					}
				}

			} else if (3 == select) {
				System.out.println("-------------");
				System.out.println("예금");
				System.out.println("-------------");

				int id = findAccountId();
				if (id == -1) {
					System.out.println("등록된 계좌가 없습니다.");
					continue;
				}
				int balance = userIntegerInput("예금");
				
				account[id].setInBalance(balance);

			} else if (4 == select) {
				System.out.println("-------------");
				System.out.println("출금");
				System.out.println("-------------");

				int id = findAccountId();
				if (id == -1) {
					System.out.println("등록된 계좌가 없습니다.");
					continue;
				}
				int balance = userIntegerInput("출금");
				
				account[id].setOutBalance(balance);

			}
		} while (select != 5);
		System.out.println("프로그램 종료");
	}

	private static void menu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------------");
		System.out.print("선택> ");
	}

	private static int findAccountId() {
		int id = -1;
		System.out.print("계좌번호: ");
		String accountNumber = sc.nextLine();
		for (int i = 0; i < accountId; i++) {
			if (account[i].getAccountNumber().equals(accountNumber)) {
				id = i;
				break;
			}
		}
		return id;
	}

	private static int userIntegerInput(String category) {
		System.out.print(category + "액: ");
		int balance = 0;
		do {
			String type = sc.nextLine().replaceAll("[^0-9]", "");
			if (!"".equals(type)) {
				balance = Integer.parseInt(type);
			} else {
				System.out.println("올바른 " + category + "액을 입력해주세요");
			}
		} while (!(balance > 0));
		return balance;
	}
}
