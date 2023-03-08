package ch06.sec08.exam03;

public class Car {
	int gas;

	void setGas(int gas) {
		this.gas = gas;
	}
	int getGas() {
		return this.gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(this.gas>0) {
				System.out.printf("달립니다.(gas잔량: %d)%n",this.gas);
				gas--;
			}else {
				System.out.printf("멈춥니다.(gas잔량: %d)%n",this.gas);
				return;
			}
		}
	}
}
