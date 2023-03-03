package ch04.sec02;

public class CoinExample {

	public static void main(String[] args) {
		int coin = (int) (Math.random()*2);
		System.out.printf("(%d)%s면 입니다.\n",coin,coin==1?"앞":"뒤");
		
		if(coin==1) {
			System.out.printf("앞면 입니다.");			
		}else {
			System.out.printf("뒷면 입니다.");			
		}
	}

}
