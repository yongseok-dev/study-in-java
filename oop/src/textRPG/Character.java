package textRPG;

public class Character {
	//게임 시작 시 캐릭터 생성을 제공
	//캐릭터의 이름, 직업, 레벨, 경험치, 체력, 마나 등의 스탯을 설정
	String name;
	String job;
	int level;
	int ex;
	int hpMax;
	int mpMax;
	int hpCurrent;
	int mpCurrent;
	int ap;

	Character(String name){
		this.name = name;
		this.level = 1;
		this.hpMax = 100;
		this.mpMax = 100;
		this.hpCurrent = 100;
		this.mpCurrent = 100;
		this.ex = 0;
	}
	public void attack(Character c) {};
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getEx() {
		return ex;
	}

	public void setEx(int ex) {
		this.ex = ex;
	}

	public int getHpMax() {
		return hpMax;
	}

	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}

	public int getMpMax() {
		return mpMax;
	}

	public void setMpMax(int mpMax) {
		this.mpMax = mpMax;
	}

	public int getHpCurrent() {
		return hpCurrent;
	}

	public void setHpCurrent(int hpCurrent) {
		this.hpCurrent = hpCurrent;
	}

	public int getMpCurrent() {
		return mpCurrent;
	}

	public void setMpCurrent(int mpCurrent) {
		this.mpCurrent = mpCurrent;
	}

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}
}
