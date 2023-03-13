package textRPG;

public class Monster extends Character {
	// 체력, 공격력, 공격

	Monster(String name, int hpMax, int ap, int ex) {
		super(name);
		this.job = "몬스터";
		this.ap = ap;
		this.hpMax = hpMax;
		this.hpCurrent = hpMax;
		this.ex = ex;
	}

	public void attack(Character c) {
		int hpCurrent = c.getHpCurrent() - this.ap;
		c.setHpCurrent(hpCurrent);
		if (c.getHpCurrent() > 0) {
			System.out.printf("%s(이)가 %s(을)를 공격! (%s의 체력: %d/%d) %n", this.name, c.getName(), c.getName(), c.getHpCurrent(),
					c.getHpMax());
		} else {
			System.out.printf("%s의 공격에 의해 %s(이)가 죽임당했습니다.!%n", this.name, c.getName());
		}

	}
}
