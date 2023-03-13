package textRPG;

public class Warrior extends Character {
	Warrior(String name, int hpMax, int ap) {
		super(name);
		this.job = "전사";
		this.ap = ap;
		this.hpMax = hpMax;
		this.hpCurrent = hpMax;
	}

	public void attack(Character c) {
		int hpCurrent = c.getHpCurrent() - this.ap;
		c.setHpCurrent(hpCurrent);
		if (c.getHpCurrent() > 0) {
			System.out.printf("%s(이)가 %s(을)를 공격! (%s의 체력: %d/%d) %n", this.name, c.getName(), c.getName(), c.getHpCurrent(),
					c.getHpMax());
		} else {
			System.out.printf("%s(이)가 %s을(를) 제거했습니다.!%n", this.name, c.getName());
			int ex = this.getEx() + c.getEx();
			this.setEx(ex);
			System.out.println("경험치를 얻었습니다. +" + c.getEx());
		}
	}
}