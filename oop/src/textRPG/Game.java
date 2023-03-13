package textRPG;

import java.util.Scanner;

public class Game {
	private static int select;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임을 시작합니다.");
		do {
			System.out.println("1. 캐릭터 생성 2. 게임 로드 3. 게임 종료");
			select = sc.nextInt();
		} while (select < 1 && 3 < select);
		if (select == 1) {
			// 캐릭터 생성
			System.out.println("케릭터의 이름을 입력해 주세요.");
			String name;
			do {
				name = sc.nextLine();
			} while ("".equals(name));
			Character user = new Warrior(name, 120, 30);
			System.out.println(user.getName() + "의 모험이 시작됩니다.");

			Character monster = new Monster("슬라임", 60, 20, 10);
			System.out.println(monster.getName() + "(이)가 등장했습니다.");
			boolean battle = true;
			do {
				do {
					System.out.println("1. 공격한다 2. 도망간다");
					select = sc.nextInt();
				} while (select < 1 && 2 < select);
				if (select == 1) {
					user.attack(monster);
					if (monster.getHpCurrent() > 0) {
						monster.attack(user);
					}
				} else {
					battle = false;
					System.out.println("도망에 성공했습니다.");
				}
			} while (battle && monster.getHpCurrent() > 0 && user.getHpCurrent() > 0);

		} else if (select == 2) {
			// 게임 로드
		} else if (select == 3) {
			// 게임종료
		}
	}
}
