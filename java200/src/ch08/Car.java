package ch08;

/*
 * 이름
 * 번호
 * 
 * 폭
 * 높이
 * 길이
 * 
 * 위치 x,y
 * 탱크용량
 * 남은연료
 * 연비
 * 
 * */
public class Car {
	String name;
	String number;
	int wdith;
	int heigth;
	int length;
	double positionX;
	double positionY;
	double maxGas;
	double gas;
	double efficiency;

	Car(String name, String number, int wdith,int heigth, int length, double maxGas, double efficiency) {
		this.name = name;
		this.number = number;
		this.wdith = wdith;
		this.heigth = heigth;
		this.length = length;
		this.maxGas = maxGas;
		this.efficiency = efficiency;
		this.positionX = 0;
		this.positionY = 0;
		this.gas = maxGas/2;
	}

//get위치
	public double getPositionX() {
		return positionX;
	}

	public double getPositionY() {
		return positionY;
	}

//get남은 연료
	public double getGas() {
		return gas;
	}

	public void setGas(double gas) {
		if(gas>maxGas) {
			System.out.println("연료 최대치를 초과합니다.");
		}else if(gas<0)
		{
			System.out.println("연료가 부족합니다.");
		}else {
			this.gas = gas;			
		}
	}

	// get 사양
	public void spect() {
		System.out.println("이름: "+this.name);
		System.out.println("번호: "+this.number);
		System.out.println("전폭: "+this.wdith+"mm");
		System.out.println("전고: "+this.heigth+"mm");
		System.out.println("전장: "+this.length+"mm");
		System.out.println("탱크: "+this.maxGas+"ℓ");
		System.out.println("연비: "+this.efficiency+"km/ℓ");
	}

	// setPosition
	public void setPosition(double x, double y) {
		double dx= (x-positionX);
		double dy= (y-positionY);
		setGas(getGas()-Math.sqrt(dx*dx+dy*dy)/efficiency);
	}
}
